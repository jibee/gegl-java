package com.jibee.gegl;

import lombok.Data;

/** Representation of a input or output pad to chain GeglFilters
 * 
 * @author jibee
 * @param <T> type of the underlying filter
 *
 */
@Data
public class Pad<T extends GeglFilter> {
	/** The filter this pad belongs to
	 * 
	 */
	private final T filter;
	/** The name of the pad in the filter
	 * 
	 */
	private final String name;

	/** Constructor
	 * 
	 * @param f Filter this pad belongs to
	 * @param n Name of the pad
	 */
	public Pad(T f, String n) {
		filter=f;
		name=n;
	}

}
