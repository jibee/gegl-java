package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;

public class BablType  extends Babl<BablType>{

	protected BablType(TypedPointer<BablType> impl) {
		super(impl);
	}
	/**
	 * Constructs the babl object representing the data type given by name
	 * such as for example "u8", "u16" or "float".
	 *
	 * @param name name of the data type
	 * 
	 */
	public BablType(String name) {
		this(BablAPI.INSTANCE.babl_type(name));
	}

}
