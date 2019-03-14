package com.jibee.gegl;

/** Output pad
 * 
 * @author jibee
 *
 */
public class OutputPad extends Pad{
	/** Constructor
	 * 
	/** Constructor
	 * 
	 * @param f Filter this pad belongs to
	 * @param n Name of the pad
	 */
	public OutputPad(GeglFilter f, String n)
	{
		super(f, n);
	}
	/** Connects the pad onto a sink
	 * 
	 * @param sink input pad to connect this output to
	 * @return the filter on the receiving end of this pad
	 * 
	 */
	public GeglFilter connectTo(InputPad sink)
	{
		return getFilter().connectTo(getName(), sink);
	}
}
