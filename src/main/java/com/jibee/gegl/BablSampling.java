package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;

public class BablSampling extends Babl<BablSampling>{

	protected BablSampling(TypedPointer<BablSampling> impl) {
		super(impl);
	}
	/**
	 * babl_sampling:
	 *
	 * Returns the babl object representing the @horizontal and @vertical
	 * sampling such as for example 2, 2 for the chroma components in
	 * YCbCr.
	 * 
	 * @param horizontal number of samples covered in the horizontal direction
	 * @param vertical number of samples covered in the vertical direction
	 * @return sampling babl object
	 * 
	 * 
	 */
	public BablSampling(int horizontal, int vertical)
	{
		this(BablAPI.INSTANCE.babl_sampling(horizontal, vertical));
	}

}
