package com.jibee.gegl;


public class Gegl {
	static
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_init(null, null);
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_config().set("application-license", "GPL3");
	}
	
	protected void finalize() throws Throwable {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_exit();
	};

	public static GeglNode newNode() {
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_new();
	}

	public static GeglColor makeColor(String string) {
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_color_new(string);
	}

}
