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
	public GeglFilter connectTo(InputPad sink)
	{
		return getFilter().connectTo(getName(), sink);
	}
}
