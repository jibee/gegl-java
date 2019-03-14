package com.jibee.gegl;

/** Input Pad
 * 
 * @author jibee
 *
 */
public class InputPad extends Pad{

	/** Constructor
	 * 
	 * @param sink Filter relative to this pad
	 * @param padName name of the pad
	 */
	public InputPad(GeglFilter sink, String padName) {
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
