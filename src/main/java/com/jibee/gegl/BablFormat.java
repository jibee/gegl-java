package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;

public class BablFormat extends Babl<BablFormat>{

	public BablFormat(TypedPointer<BablFormat> ptr) {
		super(ptr);
	}
	/**
	 * babl_format:
	 *
	 * Returns the babl object representing the color format given by
	 * name such as for example "RGB u8", "CMYK float" or "CIE Lab u16".
	 * 
	 * @param name color format name
	 */
	public BablFormat(String name)
	{
		this(BablAPI.INSTANCE.babl_format(name));
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

	/**
	 * babl_format_has_alpha:
	 *
	 * Returns whether the @format has an alpha channel.
	 */
	boolean has_alpha()
	{
		return 0 != BablAPI.INSTANCE.babl_format_has_alpha(getPointer());
	}

	/**
	 * babl_format_get_bytes_per_pixel:
	 *
	 * Returns the bytes per pixel for a babl color format.
	 */
	int          babl_format_get_bytes_per_pixel()
	{
		return BablAPI.INSTANCE.babl_format_get_bytes_per_pixel(getPointer());
	}

	/**
	 * babl_format_get_model:
	 *
	 * @return the model used for constructing the format.
	 */
	BablModel get_model()
	{
		return new BablModel(BablAPI.INSTANCE.babl_format_get_model(getPointer()));
	}

	/**
	 * babl_format_get_n_components:
	 *
	 * Returns the number of components for the given @format.
	 */
	int get_n_components()
	{
		return BablAPI.INSTANCE.babl_format_get_bytes_per_pixel(getPointer());
	}

	/**
	 * babl_format_get_type:
	 *
	 * Returns the type in the given @format for the given
	 * @component_index.
	 */
	BablType babl_format_get_type(int component_index)
	{
		return new BablType(BablAPI.INSTANCE.babl_format_get_type(getPointer(), component_index));
	}


}
