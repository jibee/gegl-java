package com.jibee.gegl.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

/** Filter meta data
 * 
 * @author jibee
 *
 */
@Retention(RUNTIME)
public @interface GeglFilterOp {
	String license();

	boolean opencl();

	boolean position_dependant();

	String[] categories();
}
