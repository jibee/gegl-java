package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;

/** Mapping of the Native Babl pointer type.
 * 
 * Note there are sub-types for the various usages of the Babl type
 * 
 * @author jibee
 * @param <T> the exact subtype of Babl inferred
 *
 */
@SuppressWarnings("rawtypes")
public class Babl<T extends Babl>{
	private TypedPointer<T> m_implementation;
	static
	{
	//	BablAPI.INSTANCE.babl_init();
	}
	/** Constructor
	 * 
	 * @param impl implementation pointer
	 */
	protected Babl(TypedPointer<T> impl) {
		m_implementation=impl;
	}
	/** Obtains the underlying pointer
	 * 
	 * @return
	 */
	public TypedPointer<T> getPointer() {
		return m_implementation;
	}

	/**
	 * Returns a string describing the object.
	 * 
	 * @return Returns a string describing the object.
	 */
	public String getName()
	{
		return BablAPI.INSTANCE.babl_get_name(getPointer());
	}
}
