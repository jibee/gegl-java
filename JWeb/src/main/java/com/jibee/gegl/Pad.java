package com.jibee.gegl;

public class Pad {
	private GeglFilter m_source;
	private String m_padname;

	public Pad(GeglFilter filter, String padName) {
		m_source=filter;
		m_padname=padName;
	}

}
