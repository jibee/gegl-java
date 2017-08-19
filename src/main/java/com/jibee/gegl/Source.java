package com.jibee.gegl;

/** Filter with a standard output pad
 * 
 * @author jibee
 *
 */

public interface Source extends iFilter {
	/** Obtains the standard output pad
	 * 
	 * @return
	 */
	OutputPad Output();
}
