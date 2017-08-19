package com.jibee.gegl;

/** Filter with a standard input pad
 * 
 * @author jibee
 *
 */
public interface Sink extends iFilter{
	/** Obtains the standard input pad
	 * 
	 * @return
	 */
	InputPad Input();
}
