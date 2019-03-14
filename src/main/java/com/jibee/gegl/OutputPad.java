package com.jibee.gegl;

/** Output pad
 * 
 * @author jibee
 * @param <T> type of the underlying filter
 *
 */
public class OutputPad<T extends GeglFilter> extends Pad<T>{
	/** Constructor
	 * 
	/** Constructor
	 * 
	 * @param f Filter this pad belongs to
	 * @param n Name of the pad
	 */
	public OutputPad(T f, String n)
	{
		super(f, n);
	}
	/** Connects the pad onto a sink
	 * 
	 * @param sink input pad to connect this output to
	 * @return the filter on the receiving end of this pad
	 * 
	 */
	public <Y extends GeglFilter> Y connectTo(InputPad<Y> sink)
	{
		getFilter().connectTo(getName(), sink);
		return sink.getFilter();
	}
}
