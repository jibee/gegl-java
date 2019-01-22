package com.jibee.gegl.priv;

import java.util.HashMap;

import org.gstreamer.lowlevel.OurGTypeMapper;

import com.jibee.gegl.Babl;
import com.jibee.gegl.BablComponent;
import com.jibee.gegl.BablFish;
import com.jibee.gegl.BablFormat;
import com.jibee.gegl.BablModel;
import com.jibee.gegl.BablSampling;
import com.jibee.gegl.BablType;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

/** Babl native library interface
 * 
 * @author jibee
 *
 */
public interface BablAPI extends Library{
	/** Static instance of the Babl API
	 * 
	 */
	BablAPI INSTANCE = (BablAPI)Native.loadLibrary("babl-0.1", BablAPI.class,new HashMap<String, Object>() {
		private static final long serialVersionUID = -519802782965295903L;

		{
			put(Library.OPTION_TYPE_MAPPER, new OurGTypeMapper());
		}});

	/**
	 * babl_init:
	 *
	 * Initializes the babl library.
	 */
	void         babl_init      ();

	/**
	 * babl_exit:
	 *
	 * Deinitializes the babl library and frees any resources used when
	 * matched with the number of calls to babl_init().
	 */
	void         babl_exit      ();
	/**
	 * babl_type:
	 *
	 * @param name name of the data type
	 * @return Returns the babl object representing the data type given by name
	 * such as for example "u8", "u16" or "float".
	 */
	TypedPointer<BablType> babl_type      (String name);

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
	TypedPointer<BablSampling> babl_sampling  (int horizontal,
	                             int vertical);

	/**
	 * babl_component:
	 *
	 * Returns the babl object representing the color component given by
	 * name such as for example "R", "cyan" or "CIE L".
	 * 
	 * @param name color component name, such as "R", "cyan" or "CIE L".
	 * @return babl color component
	 */
	TypedPointer<BablComponent> babl_component (String name);

	/**
	 * babl_model:
	 *
	 * Returns the babl object representing the color model given by @name
	 * such as for example "RGB", "CMYK" or "CIE Lab".
	 * 
	 * @param name color model name
	 * @return color model object
	 */
	TypedPointer<BablModel> babl_model     (String name);


	/**
	 * babl_format:
	 *
	 * Returns the babl object representing the color format given by
	 * name such as for example "RGB u8", "CMYK float" or "CIE Lab u16".
	 * @param name color format name
	 */
	TypedPointer<BablFormat> babl_format    (String name);

	/**
	 * babl_fish:
	 *
	 *  Create a babl fish capable of converting from source_format to
	 *  destination_format, source and destination can be either strings
	 *  with the names of the formats or Babl-format objects.
	 *  
	 *  @param source_format source format, either a {@link BablFormat} or a string
	 *  @param destination_format destination format, either a {@link BablFormat} or a string
	 *  
	 *  @return bablfish converter
	 */
	TypedPointer<BablFish> babl_fish      (Object source_format,
	                             Object destination_format);

	/**
	 * babl_process:
	 *
	 *  Process n pixels from source to destination using babl_fish,
	 *  returns number of pixels converted.
	 */
	int         babl_process   (TypedPointer<BablFish> babl_fish,
	                             Pointer source,
	                             Pointer destination,
	                             int n);


	/**
	 * babl_get_name:
	 *
	 * Returns a string describing a babl object.
	 * @param babl pointer to the babl object
	 * @return description of the bable object.
	 */
	@SuppressWarnings("rawtypes")
	String babl_get_name                     (TypedPointer<? extends Babl> babl);

	/**
	 * babl_format_has_alpha:
	 *
	 * Returns whether the @format has an alpha channel.
	 */
	int          babl_format_has_alpha             (TypedPointer<BablFormat> format);

	/**
	 * babl_format_get_bytes_per_pixel:
	 *
	 * Returns the bytes per pixel for a babl color format.
	 */
	int          babl_format_get_bytes_per_pixel   (TypedPointer<BablFormat> implementation);

	/**
	 * babl_format_get_model:
	 *
	 * @return the model used for constructing the format.
	 */
	TypedPointer<BablModel> babl_format_get_model             (TypedPointer<BablFormat> format);

	/**
	 * babl_format_get_n_components:
	 *
	 * Returns the number of components for the given @format.
	 */
	int          babl_format_get_n_components      (TypedPointer<BablFormat> format);

	/**
	 * babl_format_get_type:
	 *
	 * Returns the type in the given @format for the given
	 * @component_index.
	 */
	TypedPointer<BablType>  babl_format_get_type              (TypedPointer<BablFormat> format,
	                                                int         component_index);


	/**
	 * babl_type_new:
	 *
	 * Defines a new data type in babl. A data type that babl can have in
	 * its buffers requires conversions to and from "double" to be
	 * registered before passing sanity.
	 *
	 *     babl_type_new       (const char *name,
	 *                          "bits",     int bits,
	 *                          ["min_val", double min_val,]
	 *                          ["max_val", double max_val,]
	 *                          NULL);
	 */
	/*
	TypedPointer<Babl>  babl_type_new (Pointer first_arg,
	                            ...) BABL_ARG_NULL_TERMINATED;
*/
	/**
	 * babl_component_new:
	 *
	 * Defines a new color component with babl.
	 *
	 *     babl_component_new  (const char *name,
	 *                          NULL);
	 */
	/*
	TypedPointer<Babl>  babl_component_new  (Pointer first_arg, ...) BABL_ARG_NULL_TERMINATED;
*/
	/**
	 * babl_model_new:
	 *
	 * Defines a new color model in babl. If no name is provided a name is
	 * generated by concatenating the name of all the involved components.
	 *
	 *     babl_model_new      (["name", const char *name,]
	 *                          BablComponent *component1,
	 *                          [BablComponent *componentN, ...]
	 *                          NULL);
	 */
	/*
	TypedPointer<Babl>  babl_model_new (Pointer first_arg,
	                            ...) BABL_ARG_NULL_TERMINATED;
*/
	/**
	 * babl_format_new:
	 *
	 * Defines a new pixel format in babl. Provided BablType and|or
	 * BablSampling is valid for the following components as well. If no
	 * name is provided a (long) descriptive name is used.
	 *
	 *     babl_format_new     (["name", const char *name,]
	 *                          BablModel          *model,
	 *                          [BablType           *type,]
	 *                          [BablSampling,      *sampling,]
	 *                          BablComponent      *component1,
	 *                          [[BablType           *type,]
	 *                           [BablSampling       *sampling,]
	 *                           BablComponent      *componentN,
	 *                           ...]
	 *                          ["planar",]
	 *                          NULL);
	 */
	/*
	TypedPointer<Babl>  babl_format_new (Pointer first_arg,
	                              ...) BABL_ARG_NULL_TERMINATED;
*/
	/*
	 * babl_format_n:
	 *
	 * Defines a new pixel format in babl. With the specified data storage
	 * type and the given number of components. At the moment behavior of
	 * conversions are only well defined to other babl_format_n derived formats
	 * with the same number of components.
	 */
	TypedPointer<BablFormat> 
	babl_format_n (TypedPointer<BablType> type,
	               int   components);

	/**
	 * babl_format_is_format_n:
	 *
	 * Returns whether the @format is a format_n type.
	 */
	int babl_format_is_format_n (TypedPointer<BablFormat> format);

	/**
	 * babl_conversion_new:
	 *
	 * Defines a new conversion between either two formats, two models or
	 * two types in babl.
	 *
	 *     babl_conversion_new (<BablFormat *source, BablFormat *destination|
	 *                          BablModel  *source, BablModel  *destination|
	 *                          BablType   *source, BablType   *destination>,
	 *                          <"linear"|"planar">, <BablFuncLinear | BablFuncPlanar> conv_func,
	 *                          NULL);
	 */
	/*
	TypedPointer<Babl>  babl_conversion_new (Pointer first_arg,
	                                  ...) BABL_ARG_NULL_TERMINATED;

*/
	/**
	 * babl_new_palette:
	 *
	 * create a new palette based format, name is optional pass in NULL to get
	 * an anonymous format. If you pass in with_alpha the format also gets
	 * an 8bit alpha channel. Returns the BablModel of the color model. If
	 * you pass in the same name the previous formats will be provided
	 * again.
	 */
	TypedPointer<BablFormat> babl_new_palette (String name,
	                              Pointer format_u8,
	                              Pointer format_u8_with_alpha);

	/**
	 * babl_format_is_palette:
	 *
	 * check whether a format is a palette backed format.
	 * 
	 * @param format format to check
	 * @return zero if the format is backed by a palette, non-zero otherwise
	 */
	int   babl_format_is_palette   (TypedPointer<BablFormat> format);

	/**
	 * babl_palette_set_palette:
	 *
	 * Assign a palette to a palette format, the data is a single span of pixels
	 * representing the colors of the palette.
	 */
	void  babl_palette_set_palette (TypedPointer<BablFormat>        babl,
	                                TypedPointer<BablFormat>        format,
	                                Pointer data,
	                                int                count);

	/**
	 * babl_palette_reset:
	 *
	 * reset a palette to initial state, frees up some caches that optimize
	 * conversions.
	 */
	void  babl_palette_reset       (TypedPointer<BablFormat>        babl);



	/**
	 * babl_set_user_data: (skip)
	 *
	 * associate a data pointer with a format/model, this data can be accessed and
	 * used from the conversion functions, encoding color profiles, palettes or
	 * similar with the data, perhaps this should be made internal API, not
	 * accesible at all from
	 */
	@SuppressWarnings("rawtypes")
	void   babl_set_user_data     (TypedPointer<Babl> babl, Pointer data);

	/**
	 * babl_get_user_data: (skip)
	 *
	 * Get data set with babl_set_user_data
	 */
	@SuppressWarnings("rawtypes")
	Pointer babl_get_user_data     (TypedPointer<Babl> babl);


}
