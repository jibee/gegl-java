package com.jibee.deratiseur.processor;

import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Base64.Encoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jibee.deratiseur.web.model.IImage.RenderSize;
import com.jibee.deratiseur.web.model.persistance.Original;
import com.jibee.deratiseur.web.model.persistance.Render;
import com.jibee.deratiseur.web.model.persistance.Render.RenderStatus;
import com.jibee.deratiseur.web.model.persistance.Render.StorageEngine;
import com.jibee.gegl.Gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;
import com.jibee.gegl.filters.gegl.Crop;
import com.jibee.gegl.filters.gegl.DcrawLoad;
import com.jibee.gegl.filters.gegl.JpgLoad;
import com.jibee.gegl.filters.gegl.JpgSave;
import com.jibee.gegl.filters.gegl.PngSave;
import com.jibee.gegl.filters.gegl.RawLoad;
import com.jibee.gegl.filters.gegl.ScaleSize;
import com.jibee.gegl.filters.gegl.Text;
import com.jibee.gegl.filters.gegl.Translate;
import com.jibee.gegl.filters.svg.SrcOver;

import lombok.Value;

public class ImageRenderer {
	private static final ImageRenderer instance = new ImageRenderer();
	private static SecureRandom m_prng;
	private static MessageDigest m_sha;
	private static final Logger logger = LoggerFactory.getLogger(ImageRenderer.class);
	static
	{
		try {
			m_prng = SecureRandom.getInstance("SHA1PRNG");
			m_sha = MessageDigest.getInstance("SHA-1");
			instance.setForceRescale(false);
		} catch (NoSuchAlgorithmException e) {
		}
	}

	public static ImageRenderer instance()
	{
		return instance;
	}
	private boolean m_forceRescale;
	boolean getForceRescale()
	{
		return m_forceRescale;
	}
	void setForceRescale(boolean value)
	{
		m_forceRescale = value;
	}

	public synchronized void render(Render r) {
		r.setMimeType("image/jpg");
		String extension;
		switch(r.getMimeType())
		{
		case "image/png":
			extension = "png";
			break;
		case "image/jpg":
		case "image/jpeg":
			extension = "jpg";
			break;
		default:
			return;
		}
		File temp;
		try {
			temp = File.createTempFile("img", "."+extension);
		} catch (IOException e1) {
			r.setStatus(RenderStatus.Failed);
			return;
		}
		String output_file = temp.getAbsolutePath();
		r.setStorage(StorageEngine.FileSystem);
		r.setLocalAddress(temp.getAbsolutePath());

		r.calculateTargetDimensions();
		Original o = r.getImage().getImage().getOriginal();
		String filename = o.getPath();
		
		GeglNode rootNode = com.jibee.gegl.Gegl.newNode();
		OutputPad loader = null;

		if(filename.toLowerCase().endsWith(".jpg"))
			loader = new JpgLoad(rootNode).setPath(filename).Output();
		else if(filename.toLowerCase().endsWith(".cr2")||filename.toLowerCase().endsWith(".nef"))
		{
			RawLoad rr = new RawLoad(rootNode).setPath(filename);
			loader = rr.Output();
		}
		else
		{
			logger.error("No input filter for {}", filename);
			return;
		}
		Text text = new Text(rootNode);
		try {
			text.setSize(40);
			text.setColor(Gegl.makeColor("rgb(1.0,1.0,1.0)"));
			text.setString("Deratiseur");
		} catch (ParameterOutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Source previous = text;
		for(int i = 1; i<5; ++i)
		{
			Translate t = new Translate(rootNode).setX(400*i).setY(400*i);
			text.connectTo(t);
			SrcOver sub_over = new SrcOver(rootNode);
			previous.Output().connectTo(sub_over.Input());
			t.Output().connectTo(sub_over.Aux());
			previous=sub_over;
		}

		SrcOver over = new SrcOver(rootNode);
		ScaleSize scaler = new ScaleSize(rootNode);
		scaler.setX(r.getWidth());
		scaler.setY(r.getHeight());
		Crop crop = new Crop(rootNode);
		crop.setWidth(r.getWidth());
		crop.setHeight(r.getHeight());
		GeglFilter saver = null;
		switch(extension)
		{
		case "png":
			saver = new PngSave(rootNode).setPath(output_file);
			break;
		default:
		case "jpg":
			saver = new JpgSave(rootNode).setPath(output_file);
			break;
		}
		loader.connectTo(over.Input());
		if(r.getRenderProfile()!=RenderSize.FullResolution || m_forceRescale)
		{
			over.connectTo(scaler);
			scaler.connectTo(saver);
		}
		else
		{
			over.connectTo(saver);
		}
//		crop.connectTo(saver);

		previous.Output().connectTo(over.Aux());
		saver.process();
		r.setStatus(RenderStatus.Succeeded);
	}

	public String getUniqueIdentifier()
	{
		//generate a random number
		String randomNum = new Integer(m_prng.nextInt()).toString();
		byte[] result =  m_sha.digest(randomNum.getBytes());
		Encoder encoder = Base64.getUrlEncoder();
		return encoder.encodeToString(result);
	}

}
