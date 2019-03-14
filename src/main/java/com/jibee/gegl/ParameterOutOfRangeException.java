package com.jibee.gegl;

/**
 * Exception thrown when a parameter is outside of its allowed range
 * 
 * 
 */
public class ParameterOutOfRangeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4439927736919303239L;

	/** Constructor
	 * 
	 * @param value value provided
	 * @param l lower end of the range allowed
	 * @param h higher end of the range allowed
	 */
	public ParameterOutOfRangeException(int value, int l, int h) {
		// TODO Auto-generated constructor stub
	}

	/** Constructor
	 * 
	 * @param value value provided
	 * @param l lower end of the range allowed
	 * @param h higher end of the range allowed
	 */
	public ParameterOutOfRangeException(double value, double l, double h) {
		// TODO Auto-generated constructor stub
	}

}
