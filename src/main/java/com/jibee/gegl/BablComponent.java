package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;

public class BablComponent  extends Babl<BablComponent>{

	protected BablComponent(TypedPointer<BablComponent> impl) {
		super(impl);
	}

	/**
	 * babl_component:
	 *
	 * Returns the babl object representing the color component given by
	 * name such as for example "R", "cyan" or "CIE L".
	 * 
	 * @param name color component name, such as "R", "cyan" or "CIE L".
	 */

	public BablComponent(String name)
	{
		this(BablAPI.INSTANCE.babl_component(name));
	}
	
}
