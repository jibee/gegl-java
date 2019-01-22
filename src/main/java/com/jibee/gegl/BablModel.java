package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;

/** Color model
 * 
 *
 */
public class BablModel  extends Babl<BablModel>{

	/**
	 * 
	 * @param impl
	 */
	protected BablModel(TypedPointer<BablModel> impl) {
		super(impl);
	}
	/**
	 * babl_model:
	 *
	 * Returns the babl object representing the color model given by @name
	 * such as for example "RGB", "CMYK" or "CIE Lab".
	 * 
	 * @param name color model name
	 */
	public BablModel(String name)
	{
		this(BablAPI.INSTANCE.babl_model(name));
	}
}
