package com.jibee.gegl;

import org.gstreamer.GObject;

import com.jibee.gegl.priv.Gegl;
import com.jibee.gegl.priv.GeglRectangle;

public class GeglNode extends GObject
{
	
	public GeglNode(Initializer init) {
		super(init);
		// TODO Auto-generated constructor stub
	}
	
	public byte[] blit(double scale, GeglRectangle roi, Babl format)
	{
		int size;
		size = format.getBytePerPixel() * roi.width * roi.height;
		byte[] buf = new byte[size];
		Gegl.INSTANCE.gegl_node_blit(this, scale, roi, format.getPointer(), buf, 0, 0);
		return buf;
	}
	public byte[] blit()
	{
		GeglRectangle rectangle = getBoundingBox();
		Babl format = Babl.format("RGB u8");
		return blit(1.0, rectangle, format);
	}

	public GeglRectangle getBoundingBox() {
		return Gegl.INSTANCE.gegl_node_get_bounding_box(this);
	}
	
	
	

}
