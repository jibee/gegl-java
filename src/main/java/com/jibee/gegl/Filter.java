package com.jibee.gegl;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface Filter {
	String license();

	boolean opencl();

	boolean position_dependant();

	String[] categories();
}
