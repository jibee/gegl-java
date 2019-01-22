package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;
import com.sun.jna.Pointer;

public class BablFish extends Babl<BablFish> {

	protected BablFish(TypedPointer<BablFish> impl) {
		super(impl);
	}

	/**
	 * babl_fish:
	 *
	 *  Create a babl fish capable of converting from source_format to
	 *  destination_format, source and destination can be either strings
	 *  with the names of the formats or Babl-format objects.
	 */
	public BablFish(BablFormat source_format, BablFormat destination_format)
	{
		this(BablAPI.INSTANCE.babl_fish(source_format.getPointer(), destination_format.getPointer()));
	}
	/**
	 * babl_fish:
	 *
	 *  Create a babl fish capable of converting from source_format to
	 *  destination_format, source and destination can be either strings
	 *  with the names of the formats or Babl-format objects.
	 */
	public BablFish(String source_format, BablFormat destination_format)
	{
		this(BablAPI.INSTANCE.babl_fish(source_format, destination_format.getPointer()));
	}
	/**
	 * babl_fish:
	 *
	 *  Create a babl fish capable of converting from source_format to
	 *  destination_format, source and destination can be either strings
	 *  with the names of the formats or Babl-format objects.
	 */
	public BablFish(BablFormat source_format, String destination_format)
	{
		this(BablAPI.INSTANCE.babl_fish(source_format.getPointer(), destination_format));
	}
	/**
	 * babl_fish:
	 *
	 *  Create a babl fish capable of converting from source_format to
	 *  destination_format, source and destination can be either strings
	 *  with the names of the formats or Babl-format objects.
	 */
	public BablFish(String source_format, String destination_format)
	{
		this(BablAPI.INSTANCE.babl_fish(source_format, destination_format));
	}
	/**
	 * babl_process:
	 *
	 *  Process n pixels from source to destination using babl_fish,
	 *  returns number of pixels converted.
	 */

	public int process(Pointer source, Pointer destination, int n)
	{
		return BablAPI.INSTANCE.babl_process(getPointer(), source, destination, n);
	}
	
}
