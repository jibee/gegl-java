package com.jibee.gegl;

import com.jibee.gegl.priv.BablAPI;
import com.jibee.gegl.priv.TypedPointer;

/** Mapping of the Native Babl pointer type.
 * 
 * TODO create sub-types for the various usages of the Babl type
 * 
 * @author jibee
 *
 */
public class Babl<T extends Babl>{
	private TypedPointer<T> m_implementation;
	static
	{
	//	BablAPI.INSTANCE.babl_init();
	}
	protected Babl(TypedPointer<T> impl) {
		m_implementation=impl;
	}
	/** Create a Babl Format object for the given format descriptor
	 * 
	 * @param string
	 * @return
	 */
	public static BablFormat format(String string) {
		BablAPI.INSTANCE.babl_init();
		return new BablFormat(BablAPI.INSTANCE.babl_format(string));
	}
	/** Obtains the underlying pointer
	 * 
	 * @return
	 */
	public TypedPointer<T> getPointer() {
		return m_implementation;
	}
	
	public String getName()
	{
		return BablAPI.INSTANCE.babl_get_name(getPointer());
	}
}
