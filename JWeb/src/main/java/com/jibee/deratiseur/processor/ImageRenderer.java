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

import com.jibee.deratiseur.web.model.persistance.Render;
import com.jibee.deratiseur.web.model.persistance.Render.RenderStatus;
import com.jibee.deratiseur.web.model.persistance.Render.StorageEngine;
import com.jibee.gegl.Gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.filters.gegl.DcrawLoad;
import com.jibee.gegl.filters.gegl.JpgLoad;
import com.jibee.gegl.filters.gegl.JpgSave;
import com.jibee.gegl.filters.gegl.Text;
import com.jibee.gegl.filters.gegl.Translate;
import com.jibee.gegl.filters.svg.SrcOver;

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
		} catch (NoSuchAlgorithmException e) {
		}
	}
	
	public static ImageRenderer instance()
	{
		return instance;
	}

	public synchronized void render(Render r) {
		GeglNode rootNode = com.jibee.gegl.Gegl.newNode();
		File temp;
		try {
			temp = File.createTempFile("img", ".jpg");
		} catch (IOException e1) {
			r.setStatus(RenderStatus.Failed);
			return;
		}
		String output_file = temp.getAbsolutePath();
		r.setStorage(StorageEngine.FileSystem);
		r.setLocalAddress(temp.getAbsolutePath());
		
		String filename = r.getImage().getImage().getOriginal().getPath();
		
		GeglFilter loader = null;
		
		if(filename.toLowerCase().endsWith(".jpg"))
			loader = new JpgLoad(rootNode).setPath(filename);
		else if(filename.toLowerCase().endsWith(".cr2"))
			loader = new DcrawLoad(rootNode).setPath(filename);
		else
		{
			logger.error("No input filter for {}", filename);
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
		GeglFilter previous = text;
		for(int i = 0; i<3; ++i)
		{
			Translate t = new Translate(rootNode).setX(400).setY(400);
			text.connectTo(t);
			SrcOver sub_over = new SrcOver(rootNode);
			
		}
		
		SrcOver over = new SrcOver(rootNode);
		JpgSave saver = new JpgSave(rootNode).setPath(output_file);
		loader.connectTo(over).connectTo(saver);

		text.connectTo(over, "output", "aux");
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
