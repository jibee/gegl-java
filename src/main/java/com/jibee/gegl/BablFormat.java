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


}
