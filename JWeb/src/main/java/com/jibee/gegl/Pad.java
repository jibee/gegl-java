package com.jibee.gegl;

import lombok.Data;

@Data
public class Pad {
	private final GeglFilter filter;
	private final String name;

	
	public Pad(GeglFilter f, String n) {
		filter=f;
		name=n;
	}

}
