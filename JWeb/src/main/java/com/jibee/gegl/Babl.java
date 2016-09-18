package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;
import com.sun.jna.Pointer;

public class Babl{
	private TypedPointer<Babl> m_implementation;
	static
	{
	//	BablAPI.INSTANCE.babl_init();
	}
	private Babl(TypedPointer<Babl> impl) {
		m_implementation=impl;
	}
	public static Babl format(String string) {
		BablAPI.INSTANCE.babl_init();
		return new Babl(BablAPI.INSTANCE.babl_format(string));
	}
	public int getBytePerPixel() {
		return BablAPI.INSTANCE.babl_format_get_bytes_per_pixel(m_implementation);
	}
	public TypedPointer<Babl> getPointer() {
		return m_implementation;
	}
}
