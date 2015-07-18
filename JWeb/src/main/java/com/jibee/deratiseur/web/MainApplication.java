package com.jibee.deratiseur.web;

import com.jibee.gegl.priv.Gegl;
import com.jibee.gegl.GeglNode;

import eu.webtoolkit.jwt.WApplication;
import eu.webtoolkit.jwt.WEnvironment;


public class MainApplication extends WApplication {

	public MainApplication(WEnvironment env) {
		super(env);

		Gegl g = Gegl.INSTANCE;
		// jna.library.path
		g.gegl_init(null, null);
		g.gegl_config().set("application-license", "GPL3");

		
		GeglNode gegl = g.gegl_node_new();
		GeglNode display    = g.gegl_node_create_child (gegl, "gegl:display");
		GeglNode crop       = g.gegl_node_new_child (gegl,
				"operation", "gegl:crop",
				"width", 512.0,
				"height", 384.0,
				null);
		GeglNode over       = g.gegl_node_new_child (gegl,
				"operation", "gegl:over",
				null);
		GeglNode text       = g.gegl_node_new_child (gegl,
				"operation", "gegl:text",
				"size", 10.0,
				"color", g.gegl_color_new("rgb(1.0,1.0,1.0)"),
				null);
		GeglNode mandelbrot = g.gegl_node_new_child (gegl,
				"operation", "gegl:fractal-explorer",
				"shiftx", -256.0,
				null);

		g.gegl_node_link_many (mandelbrot, over, crop, display, null);
		g.gegl_node_connect_to (text, "output",  over, "aux");

		g.gegl_exit();
		// TODO Auto-generated constructor stub
	}

}
