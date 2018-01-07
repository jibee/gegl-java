package com.jibee.gegl;

import com.jibee.gegl.priv.GeglRectangle;

public class Gegl {
	static
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_init(null, null);
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_config().set("application-license", "GPL3");
	}

	@Override
	protected void finalize() throws Throwable {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_exit();
	};

	public static GeglNode newNode() {
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_new();
	}

	public static GeglNode fromXml(String text)
	{
		return fromXml("/");
	}
	public static GeglNode fromXml(String text, String path_base)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_new_from_xml(text, path_base);
	}

	public static GeglColor makeColor(String string) {
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_color_new(string);
	}

	public static GeglBuffer newBuffer(GeglRectangle extent, Babl format)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_new(extent, format.getPointer());
	}
}
