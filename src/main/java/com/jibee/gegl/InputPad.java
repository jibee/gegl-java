package com.jibee.gegl;

/** Input Pad
 * 
 * @author jibee
 * @param <T> type of the underlying filter
 *
 */
public class InputPad<T extends GeglFilter> extends Pad<T>{

	/** Constructor
	 * 
	 * @param sink Filter relative to this pad
	 * @param padName name of the pad
	 */
	public InputPad(T sink, String padName) {
		super(sink, padName);
	}
	/** Disconnects this pad from input
	 * 
	 */
	public void disconnect()
	{
		getFilter().disconnect(this.getName());
	}
}
