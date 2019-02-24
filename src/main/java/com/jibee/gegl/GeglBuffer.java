package com.jibee.gegl;

import org.gstreamer.GObject;

import com.jibee.gegl.priv.GeglRectangle;

public class GeglBuffer extends GObject {

	public GeglBuffer(Initializer init) {
		super(init);
	}
	public byte[] getContents()
	{
		GeglRectangle extent = getExtent();
		byte[] dest=new byte[extent.width*extent.height*4];
		int rowstride = 0;  // Auto rowstride
		int repeat_mode = 0;// ABYSS=NONE, but not explicitely declared
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_get(this, extent, 1.0, getFormat(), dest, rowstride, repeat_mode);
		return dest;
	}
	
	public GeglRectangle getExtent()
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_get_extent(this);
	}
	public BablFormat getFormat()
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_get_format(this);
	}
}

