package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;

/**
 * Babl data format
 *
 */
public class BablFormat extends Babl<BablFormat>{
	/**
	 * Constructor
	 * @param ptr
	 */
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
	 * Returns the babl object representing the color format given by
	 * name such as for example "RGB u8", "CMYK float" or "CIE Lab u16".
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
	 * @return Returns whether the @format has an alpha channel.
	 */
	public boolean hasAlpha()
	{
		return 0 != BablAPI.INSTANCE.babl_format_has_alpha(getPointer());
	}

	/**
	 * babl_format_get_bytes_per_pixel:
	 *
	 * @return Returns the bytes per pixel for a babl color format.
	 */
	public int getBytesPerPixel()
	{
		return BablAPI.INSTANCE.babl_format_get_bytes_per_pixel(getPointer());
	}

	/**
	 * babl_format_get_model:
	 *
	 * @return the model used for constructing the format.
	 */
	public BablModel getModel()
	{
		return new BablModel(BablAPI.INSTANCE.babl_format_get_model(getPointer()));
	}

	/**
	 * babl_format_get_n_components:
	 * 
	 *
	 * @return Returns the number of components for the given @format.
	 */
	public int componentLength()
	{
		return BablAPI.INSTANCE.babl_format_get_bytes_per_pixel(getPointer());
	}

	/**
	 * babl_format_get_type:
	 *
	 * @param component_index index of the component queried
	 *
	 * @return Returns the type in the given @format for the given
	 * @component_index.
	 */
	public BablType getType(int component_index)
	{
		return new BablType(BablAPI.INSTANCE.babl_format_get_type(getPointer(), component_index));
	}


}
