package com.jibee.deratiseur.web;

import com.jibee.gegl.Gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.filters.gegl.JpgLoad;
import com.jibee.gegl.filters.gegl.JpgSave;
import com.jibee.gegl.filters.gegl.Text;
import com.jibee.gegl.filters.gegl.Translate;
import com.jibee.gegl.filters.svg.SrcOver;

import eu.webtoolkit.jwt.Signal1;
import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WFileResource;
import eu.webtoolkit.jwt.WFileUpload;
import eu.webtoolkit.jwt.WImage;
import eu.webtoolkit.jwt.WPushButton;
import eu.webtoolkit.jwt.WTemplate;
import eu.webtoolkit.jwt.Signal;
import eu.webtoolkit.jwt.Signal.Listener;

public class ProcessorTest extends WTemplate {
	private static final CharSequence TEMPLATE = 
			"<div class='commands'>${fileupload}</div>"+
			"<div class='exif_info'>${exif_info}</div>"+
			"<div class='result_picture'>${result}</div>";
	private WFileUpload m_fileupload;

	public ProcessorTest() {
		this(null);
	}
	public ProcessorTest(WContainerWidget parent)
	{
		super(TEMPLATE, parent);
		WContainerWidget interactions = new WContainerWidget();
		m_fileupload = new WFileUpload(interactions);
		WPushButton uploadButton = new WPushButton("Upload", interactions);
		uploadButton.clicked().addListener(this, new Signal.Listener() {
			public void trigger() {
				m_fileupload.upload();
			}
		});
		
		m_fileupload.uploaded().addListener(this, new Signal.Listener() {
			public void trigger() {
				processUpload();					
			}
		});
		m_fileupload.fileTooLarge().addListener(this, new Signal1.Listener<Long>() {
			
			public void trigger(Long arg) {
				bindString("exif_info", "File too large "+arg);
			}
		});
		bindWidget("fileupload", interactions);
		/*
		
		GeglNode rootNode = com.jibee.gegl.Gegl.newNode();
		Display display = new Display(rootNode);

		Crop crop = new Crop(rootNode)
			.setWidth(512)
			.setHeight(384);
		
		SrcOver over = new SrcOver(rootNode);

		Text text = new Text(rootNode);
		try {
				text.setSize(10);
				text.setColor(Gegl.makeColor("rgb(1.0,1.0,1.0)"));
		} catch (ParameterOutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GeglFilter mandelbrot = new FractalExplorer(rootNode).setShiftx(-256.0);

		mandelbrot.connectTo(over).connectTo(crop).connectTo(display);
		text.connectTo(over, "output", "aux");
		*/
		
	}
	protected void processUpload() {
		String filename = m_fileupload.getSpoolFileName();
		GeglNode rootNode = com.jibee.gegl.Gegl.newNode();
		String output_file = "/tmp/plop.jpg";
		
		JpgLoad loader = new JpgLoad(rootNode).setPath(filename);
		
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
		
		WFileResource resource = new WFileResource("image/jpg", output_file);
		WImage image_display = new WImage(resource, "image display");
		bindWidget("result", image_display);
	}
}
