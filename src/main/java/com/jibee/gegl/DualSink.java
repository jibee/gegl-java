package com.jibee.gegl;

/** Sink with an additional, side entry
 * 
 * @author jibee
 *
 */
public interface DualSink extends Sink{
	/** Side entry to the sink
	 * 
	 * @return
	 */
	InputPad Aux();
}
