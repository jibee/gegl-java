package com.jibee.gegl;

import com.jibee.gegl.priv.GeglRectangle;

/** Filter public operations. This interface is implemented by concrete GEGL filters and
 * virtual series of filters
 * 
 * @author jibee
 *
 */
public interface iFilter {
	/** Connects this filter's output to the receiver's input
	 * 
	 * @param receiver
	 * @return the receiver filter
	 */
	public <T extends iFilter> T connectTo(T receiver);
	/** Connects this filter's designated output to the receiver's designated input
	 * 
	 * @param receiver receiving filter
	 * @param outputPadName name of the output pad in the filter
	 * @param inputPadName name of the input pad in the receiving filter
	 * @return the receiver filter
	 */
	public <T extends iFilter> T connectTo(T receiver, String outputPadName, String inputPadName);
	/** Connects this filter's designated output to the input pad
	 * 
	 * @param outputPadName name of the output pad in the filter
	 * @param pad input pad in the receiving filter
	 * @return the receiver filter
	 */
	public iFilter connectTo(String outputPadName, InputPad<?> pad);
	/** Processes the filter chain until this filter. For example, for a Save
	 * type of filter this will process the filter chain and save the resulting
	 * image
	 */
	public void process();
	/** Processes the filter chain until this filter and returns the image as a RGB
	 * data array.
	 * @return resulting image as a data array, with each layer interleaved (i.e. [R, G, B, R, G, B, ...])
	 */
	public byte[] blit();
	/** Processes the filter chain until this filter and returns the image as a
	 * data array.
	 * 
	 * @param format_str Requestest output format string; this is a Babl-specific format string
	 * such as RGB, sRGB, CIE Lab ...
	 * 
	 * @return resulting image as a data array, with each layer interleaved (i.e. [R, G, B, R, G, B, ...])
	 */
	public byte[] blit(String format_str);
	/** Processes the filter chain until this filter and returns the image as a RGB
	 * data array.
	 * @return resulting image as a data array, with each layer interleaved (i.e. [R, G, B, R, G, B, ...])
	 */
	public float[] blit_float();
	/** Processes the filter chain until this filter and returns the image as a
	 * data array.
	 * 
	 * @param format_str Requestest output format string; this is a Babl-specific format string
	 * such as RGB, sRGB, CIE Lab ...
	 * 
	 * @return resulting image as a data array, with each layer interleaved (i.e. [R, G, B, R, G, B, ...])
	 */
	public float[] blit_float(String format_str);
	/** Processes the filter chain until this filter and returns the image as a RGB
	 * data array.
	 * @return resulting image as a data array, with each layer interleaved (i.e. [R, G, B, R, G, B, ...])
	 */
	public short[] blit_short();
	/** Processes the filter chain until this filter and returns the image as a
	 * data array.
	 * 
	 * @param format_str Requestest output format string; this is a Babl-specific format string
	 * such as RGB, sRGB, CIE Lab ...
	 * 
	 * @return resulting image as a data array, with each layer interleaved (i.e. [R, G, B, R, G, B, ...])
	 */
	public short[] blit_short(String format_str);
	/** Determines the size of the image resulting of the filters process, using the bounding box therof
	 * 
	 * @return
	 */
	public GeglRectangle getBoundingBox();
}
