package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;

public class BablFormat extends Babl<BablFormat>{

	public BablFormat(TypedPointer<BablFormat> ptr) {
		super(ptr);
	}
	
	/** Obtains the number of bytes per pixel in this format
	 * 
	 * @return
	 */
	public int getBytePerPixel() {
		return BablAPI.INSTANCE.babl_format_get_bytes_per_pixel(getPointer());
	}

	/** Create a Babl Format object for the given format descriptor
	 * 
	 * @param string
	 * @return
	 */
	public static BablFormat of(String string) {
		BablAPI.INSTANCE.babl_init();
		return new BablFormat(BablAPI.INSTANCE.babl_format(string));
	}


}
