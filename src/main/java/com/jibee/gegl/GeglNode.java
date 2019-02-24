package com.jibee.gegl;

import org.gstreamer.GObject;

import com.jibee.gegl.priv.Gegl;
import com.jibee.gegl.priv.GeglRectangle;

/**
 * Representation of a Node in the GEGL graph.
 * 
 * @author jibee
 *
 */
public class GeglNode extends GObject
{
	/** Constructor
	 * 
	 * note this constructor was to be deliberately kept private as it is called by the
	 * GObject type mapper
	 * 
	 * @param init
	 */
	public GeglNode(Initializer init) {
		super(init);
	}
	
	/** Releases a reference to this node, if necessary frees the memory held
	 */
	public void release()
	{
		this.unref();
	}
	/** Obtains the image data as a byte array.
	 * 
	 * @param scale scaling factor
	 * @param roi region of interest
	 * @param format Pixel format to return
	 * @return
	 */
	public byte[] blit(double scale, GeglRectangle roi, BablFormat format)
	{
		int size;
		size = format.getBytePerPixel() * roi.width * roi.height;
		byte[] buf = new byte[size];
		Gegl.INSTANCE.gegl_node_blit(this, scale, roi, format.getPointer(), buf, 0, 0);
		return buf;
	}
	/** Obtains the image data as a byte array.
	 * 
	 * @return returns the three RGB layers interleaved i.e. [R, G, B, R, G, B, ...]
	 */
	public byte[] blit()
	{
		return blit("RGB");
	}
	/** Obtains the image data as a byte array.
	 * @param format_str Requestest output format string; this is a Babl-specific format string
	 * such as RGB, sRGB, CIE Lab ...
	 * 
	 * @return returns the color component layers interleaved i.e. [R, G, B, R, G, B, ...]
	 */
	public byte[] blit(String format_str)
	{
		GeglRectangle rectangle = getBoundingBox();
		BablFormat format = BablFormat.of(format_str+" u8");
		return blit(1.0, rectangle, format);
	}
	/** Obtains the image data as a float array.
	 * 
	 * @return returns the three RGB layers interleaved i.e. [R, G, B, R, G, B, ...]
	 */
	public float[] blit_float()
	{
		return blit_float("RGB");
	}
	/** Obtains the image data as a float array.
	 * 
	 * @param format_str Requestest output format string; this is a Babl-specific format string
	 * such as RGB, sRGB, CIE Lab ...
	 * 
	 * @return returns the color component layers interleaved i.e. [R, G, B, R, G, B, ...]
	 */
	public float[] blit_float(String format_str)
	{
		GeglRectangle rectangle = getBoundingBox();
		BablFormat format = BablFormat.of(format_str+" float");
		byte[] stream = blit(1.0, rectangle, format);
		return byte_to_float(stream);
	}
	
	private static final int FLOAT_LEN = 4;
	
	private static float[] byte_to_float(byte[] stream)
	{
		float[] retval = new float[stream.length / FLOAT_LEN];
		
		for(int i = 0; i<retval.length; ++i)
		{
			retval[i] = byte_to_float(stream, i * FLOAT_LEN);
		}
		return retval;
	}
	
	private static float byte_to_float(byte[] stream, int position)
	{
		byte a = stream[position + 0];
		byte b = stream[position + 1];
		byte c = stream[position + 2];
		byte d = stream[position + 3];
		return Float.intBitsToFloat(a + b << 8 + c << 16 + d << 24);
	}
	
	/** Obtains the image data as a array of shorts.
	 * 
	 * @return returns the three RGB layers interleaved i.e. [R, G, B, R, G, B, ...]
	 */
	public short[] blit_short()
	{
		return blit_short("RGB");
	}
	/** Obtains the image data as a array of shorts.
	 * 
	 * @param format_str Requestest output format string; this is a Babl-specific format string
	 * such as RGB, sRGB, CIE Lab ...
	 * 
	 * @return returns the three RGB layers interleaved i.e. [R, G, B, R, G, B, ...]
	 */
	public short[] blit_short(String format_str)
	{
		GeglRectangle rectangle = getBoundingBox();
		BablFormat format = BablFormat.of(format_str+" u16");
		byte[] stream = blit(1.0, rectangle, format);
		return byte_to_short(stream);
	}

	private static final int SHORT_LEN = 2;
	
	private static short[] byte_to_short(byte[] stream)
	{
		short[] retval = new short[stream.length / SHORT_LEN];
		
		for(int i = 0; i<retval.length; ++i)
		{
			retval[i] = byte_to_short(stream, i * SHORT_LEN);
		}
		return retval;
	}
	private static short byte_to_short(byte[] stream, int position)
	{
		byte a = stream[position + 0];
		byte b = stream[position + 1];
		return (short) (a + b << 8);
	}

	/** Image bounding box
	 * 
	 * @return
	 */
	public GeglRectangle getBoundingBox() {
		return Gegl.INSTANCE.gegl_node_get_bounding_box(this);
	}
	
	/** Returns the XML description of the filter sequence leading to this node
	 * 
	 * @return
	 */
	public String asXML()
	{
		return asXML("/");
	}
	/** Returns the XML description of the filter sequence leading to this node,
	 * assuming all files are relative to the given base
	 * @param path_base base path for linked files
	 * 
	 * @return
	 */
	public String asXML(String path_base)
	{
		return Gegl.INSTANCE.gegl_node_to_xml(this, path_base);
	}
	
	/**
	 * gegl_node_disconnect
	 * @param input_pad the input pad to disconnect 
	 * @return Returns TRUE if a connection was broken
	 *
	 * Disconnects node connected to @input_pad of @node (if any).
	 *
	 */
	public boolean disconnect(String input_pad)
	{
		return Gegl.INSTANCE.gegl_node_disconnect(this, input_pad);
	}
	
	
	
}
