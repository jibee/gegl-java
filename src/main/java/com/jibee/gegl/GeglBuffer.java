package com.jibee.gegl;

import org.gstreamer.GObject;

import com.jibee.gegl.priv.GeglRectangle;
import com.jibee.gegl.priv.GeglSamplerType;
import com.jibee.gegl.priv.Gegl.GDestroyNotify;
import com.jibee.gegl.priv.Gegl.GeglAbyssPolicy;
import com.jibee.gegl.priv.Gegl.GeglMatrix2;
import com.jibee.gegl.priv.Gegl.GeglSampler;
import com.jibee.gegl.priv.Gegl.GeglTileBackend;
import com.sun.jna.Pointer;

/***
 * GeglBuffer:
 *
 * GeglBuffer is the API used by GEGL for storing and retrieving raster data.
 * GeglBuffer heavily relies on babl for translation and description of
 * different pixel formats.
 *
 * Internally GeglBuffer currently uses a tiled mipmap pyramid structure that
 * can be swapped to disk. In the future GeglBuffer might also support a linear
 * backend, a GPU memory backend and a network backend for buffers.
 */
public class GeglBuffer extends GObject {

	/** Internal constructor
	 * 
	 * @param init internal pointer
	 */
	public GeglBuffer(Initializer init) {
		super(init);
	}

	/**
	 * gegl_buffer_new: (skip)
	 * @param extent the geometry of the buffer (origin, width and height) a
	 * GeglRectangle.
	 * @param format the Babl pixel format to be used, create one with babl_format("RGBA
	 * u8") and similar.
	 *
	 * Create a new GeglBuffer of a given format with a given extent. It is
	 * possible to pass in NULL for both extent and format, a NULL extent creates
	 * an empty buffer and a NULL format makes the buffer default to "RGBA float".
	 * 
	 * @return a new GeglBuffer
	 */
	public static GeglBuffer of(GeglRectangle extent, BablFormat format)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_new(extent, format.getPointer());
	}

	/**
	 * gegl_buffer_new_for_backend:
	 * @param extent the geometry of the buffer (origin, width and height) a
	 * GeglRectangle.
	 * @param backend an instance of a GeglTileBackend subclass.
	 *
	 * Create a new GeglBuffer from a backend, if NULL is passed in the extent of
	 * the buffer will be inherited from the extent of the backend.
	 *
	 * @return a GeglBuffer, that holds a reference to the provided backend.
	 */
	public static GeglBuffer of(GeglRectangle extent, GeglTileBackend backend)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_new_for_backend(extent, backend);
	}

	/** Obtains the contents of the buffer
	 * 
	 * @return
	 */
	public byte[] getContents()
	{
		GeglRectangle extent = getExtent();
		byte[] dest=new byte[extent.width*extent.height*4];
		int rowstride = 0;  // Auto rowstride
		int repeat_mode = 0;// ABYSS=NONE, but not explicitely declared
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_get(this, extent, 1.0, getFormat(), dest, rowstride, repeat_mode);
		return dest;
	}

	/**
	 * gegl_buffer_add_handler:
	 * @buffer: a #GeglBuffer
	 * @param handler a #GeglTileHandler
	 *
	 * Add a new tile handler in the existing chain of tile handler of a GeglBuffer.
	 */
	public void addHandler(GeglTileHandler handler)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_add_handler(this, handler.getPointer());		
	}

	/**
	 * gegl_buffer_remove_handler:
	 * @param handler a #GeglTileHandler
	 *
	 * Remove the provided tile handler in the existing chain of tile handler of a GeglBuffer.
	 */
	public void removeHandler(GeglTileHandler handler)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_remove_handler(this, handler.getPointer());
	}

	/**
	 * gegl_buffer_open:
	 * @param path the path to a gegl buffer on disk.
	 *
	 * Open an existing on-disk GeglBuffer, this buffer is opened in a monitored
	 * state so multiple instances of gegl can share the same buffer. Sets on
	 * one buffer are reflected in the other.
	 *
	 * @return (transfer full): a GeglBuffer object.
	 */
	public static GeglBuffer open(String path)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_open(path);		
	}		

	/**
	 * gegl_buffer_save:
	 * @buffer: (transfer none): a #GeglBuffer.
	 * @param path the path where the gegl buffer will be saved, any writable GIO uri is valid.
	 * @param roi the region of interest to write, this is the tiles that will be collected and
	 * written to disk.
	 *
	 * Write a GeglBuffer to a file.
	 */
	public void save(String path, GeglRectangle roi)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_save(this, path, roi);
	}

	/**
	 * gegl_buffer_load:
	 * @param path the path to a gegl buffer on disk.
	 *
	 * Loads an existing GeglBuffer from disk, if it has previously been saved with
	 * gegl_buffer_save it should be possible to open through any GIO transport, buffers
	 * that have been used as swap needs random access to be opened.
	 *
	 * @return (transfer full): a #GeglBuffer object.
	 */
	public static GeglBuffer load(String path)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_load(path);
	}

	/**
	 * gegl_buffer_flush:
	 *
	 * Flushes all unsaved data to disk, this is not neccesary for shared
	 * geglbuffers opened with gegl_buffer_open since they auto-sync on writes.
	 */
	public void flush()
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_flush(this);
	}	


	/**
	 * gegl_buffer_create_sub_buffer:
	 * @param extent (transfer none): coordinates of new buffer.
	 *
	 * Create a new sub GeglBuffer, that is a view on a larger buffer.
	 *
	 * @return (transfer full): the new sub buffer
	 */
	public GeglBuffer createSubBuffer(GeglRectangle extent)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_create_sub_buffer(this, extent);
	}

	/**
	 * gegl_buffer_get_extent:
	 *
	 * @return a GeglRectangle structure defining the geometry of a
	 * specific GeglBuffer, this is also the default width/height of buffers passed
	 * in to gegl_buffer_set and gegl_buffer_get (with a scale of 1.0 at least).
	 */
	public GeglRectangle getExtent()
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_get_extent(this);
	}

	/**
	 * gegl_buffer_set_abyss:
	 * @param abyss new abyss.
	 *
	 * Changes the size and position of the abyss rectangle of a buffer.
	 *
	 * @return TRUE if the change of abyss was succesful.
	 */
	public boolean setAbyss(GeglRectangle abyss)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_set_abyss(this, abyss);
	}

	/**
	 * gegl_buffer_get_x:
	 *
	 * @return Evaluates to the X coordinate of the upper left corner of the buffer's extent.
	 */
	public int getX()
	{
		return getExtent().x;
	}

	/**
	 * gegl_buffer_get_y:
	 *
	 * @return Evaluates to the Y coordinate of the upper left corner of the buffer's extent.
	 */
	public int getY()
	{
		return getExtent().y;
	}
	
	/**
	 * gegl_buffer_get_pixel_count:
	 *
	 * @return the number of pixels of the extent of the buffer.
	 */
	public int getPixelCount()
	{
		return (getWidth() * getHeight());
	}
	/** Buffer width
	 * 
	 * @return the buffer width
	 */
	public int getWidth()
	{
		return getExtent().width;
	}
	/** Buffer height
	 * 
	 * @return the buffer height
	 */
	public int getHeight()
	{
		return getExtent().height;
	}
	/**
	 * gegl_buffer_get: (skip)
	 * @param buffer the buffer to retrieve data from.
	 * @param rect the coordinates we want to retrieve data from, and width/height of
	 * destination buffer, if NULL equal to the extent of the buffer. The
	 * coordinates and dimensions are after scale has been applied.
	 * @param scale sampling scale, 1.0 = pixel for pixel 2.0 = magnify, 0.5 scale down.
	 * @param format the BablFormat to store in the linear buffer @dest.
	 * @param dest the memory destination for a linear buffer for the pixels, the size needed
	 * depends on the requested BablFormat.
	 * @param rowstride rowstride in bytes, or GEGL_AUTO_ROWSTRIDE to compute the
	 * rowstride based on the width and bytes per pixel for the specified format.
	 * @param repeat_mode how requests outside the buffer extent are handled.
	 * Valid values: GEGL_ABYSS_NONE (abyss pixels are zeroed), GEGL_ABYSS_WHITE
	 * (abyss pixels are white), GEGL_ABYSS_BLACK (abyss pixels are black),
	 * GEGL_ABYSS_CLAMP (coordinates are clamped to the abyss rectangle),
	 * GEGL_ABYSS_LOOP (buffer contents are tiled if outside of the abyss rectangle).
	 *
	 * Fetch a rectangular linear buffer of pixel data from the GeglBuffer, the
	 * data is converted to the desired BablFormat, if the BablFormat stored and
	 * fetched is the same this amounts to a series of memcpy's aligned to demux
	 * the tile structure into a linear buffer.
	 */
	public void get               (GeglRectangle rect,
			double              scale,
			BablFormat format,
			byte[]             dest,
			int                 rowstride,
			int      repeat_mode)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_get(
				this,
				rect,
				scale,
				format,
				dest,
				rowstride,
				repeat_mode);
	}

	/**
	 * gegl_buffer_set: (skip)
	 * @param rect the coordinates we want to change the data of and the width/height of
	 * the linear buffer being set, scale specifies the scaling factor applied to
	 * the data when setting.
	 * @param scale_level the scale level being set, 0 = 1:1 = default = base mipmap level,
	 * 1 = 1:2, 2=1:4, 3=1:8 ..
	 * @param format the babl_format the linear buffer src.
	 * @param src linear buffer of image data to be stored in buffer.
	 * @param rowstride rowstride in bytes, or GEGL_AUTO_ROWSTRIDE to compute the
	 * rowstride based on the width and bytes per pixel for the specified format.
	 *
	 * Store a linear raster buffer into the GeglBuffer.
	 */
	public void set(GeglRectangle rect,
			int                 scale_level,
			BablFormat          format,
			Pointer src,
			int                 rowstride)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_set(this,
				rect,
				scale_level,
				format,
				src,
				rowstride);
	}


	/**
	 * gegl_buffer_set_color:
	 * @param rect a rectangular region to fill with a color.
	 * @param color the GeglColor to fill with.
	 *
	 * Sets the region covered by rect to the specified color.
	 */
	public void setColor(
			GeglRectangle rect,
			GeglColor           color)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_set_color(this, rect, color);
	}


	/**
	 * gegl_buffer_set_pattern:
	 * @param rect the region of @buffer to fill
	 * @param pattern a #GeglBuffer to be repeated as a pattern
	 * @param x_offset where the pattern starts horizontally
	 * @param y_offset where the pattern starts vertical
	 *
	 * Fill a region with a repeating pattern. Offsets parameters are
	 * relative to the origin (0, 0) and not to the rectangle. So be carefull
	 * about the origin of @pattern and @buffer extents.
	 */
	public void setPattern(
			GeglRectangle rect,
			GeglBuffer          pattern,
			int                 x_offset,
			int                 y_offset)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_set_pattern(this, rect, pattern, x_offset, y_offset);
	}


	/**
	 * gegl_buffer_get_format: (skip)
	 * @param buffer a #GeglBuffer
	 *
	 * Get the babl format of the buffer, this might not be the format the buffer
	 * was originally created with, you need to use gegl_buffer_set_format (buf,
	 * NULL); to retireve the original format (potentially having save away the
	 * original format of the buffer to re-set it.)
	 *
	 * @return the babl format used for storing pixels in the buffer.
	 *
	 */
	public BablFormat getFormat()
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_get_format(this);
	}


	/**
	 * gegl_buffer_set_format: (skip)
	 * @param format the new babl format, must have same bpp as original format.
	 *
	 * Set the babl format of the buffer, setting the babl format of the buffer
	 * requires the new format to have exactly the same bytes per pixel as the
	 * original format. If NULL is passed in the format of the buffer is reset to
	 * the original format.
	 *
	 * @return the new babl format or NULL if it the passed in buffer was
	 * incompatible (then the original format is still used).
	 */
	public BablFormat setFormat        (
			BablFormat format)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_set_format(this, format);
	}

	/**
	 * gegl_buffer_clear:
	 * @param roi a rectangular region
	 *
	 * Clears the provided rectangular region by setting all the associated memory
	 * to 0
	 */
	public void clear(GeglRectangle roi)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_clear(this, roi);
	}

	/**
	 * gegl_buffer_set_extent:
	 * @param extent new extent.
	 *
	 * Changes the size and position that is considered active in a buffer, this
	 * operation is valid on any buffer, reads on subbuffers outside the master
	 * buffer's extent are at the moment undefined.
	 *
	 * @return Returns TRUE if the change of extent was succesful.
	 */
	public boolean setExtent(GeglRectangle extent)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_set_extent(this, extent);
	}



	/**
	 * gegl_buffer_copy:
	 * @param src_rect source rectangle (or NULL to copy entire source buffer)
	 * @param repeat_mode the abyss policy to be using if src_rect is outside src's extent.
	 * @param dst (transfer none): destination buffer.
	 * @param dst_rect position of upper left destination pixel, or NULL for top
	 * left coordinates of the buffer extents.
	 *
	 * copies a region from source buffer to destination buffer.
	 *
	 * If the babl_formats of the buffers are the same, and the tile boundaries
	 * align, this will create copy-on-write tiles in the destination buffer.
	 *
	 * This function never does any scaling. When src_rect and dst_rect do not have
	 * the same width and height, the size of src_rect is used.
	 */
	public void            copy              (
			GeglRectangle src_rect,
			GeglAbyssPolicy      repeat_mode,
			GeglBuffer dst,
			GeglRectangle dst_rect)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_copy(this, src_rect,
			repeat_mode,
			dst,
			dst_rect);
	}



	/**
	 * gegl_buffer_dup:
	 *
	 * Duplicate a buffer (internally uses gegl_buffer_copy). Aligned tiles
	 * will create copy-on-write clones in the new buffer.
	 *
	 * @return Return value: (transfer full): the new buffer
	 */
	public GeglBuffer dup()
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_dup(this);
	}


	/**
	 * gegl_buffer_sample_at_level: (skip)
	 * @param buffer the GeglBuffer to sample from
	 * @param x x coordinate to sample in buffer coordinates
	 * @param y y coordinate to sample in buffer coordinates
	 * @param scale a matrix that indicates scaling factors, see
	 * gegl_sampler_compute_scale the same.
	 * @param dest buffer capable of storing one pixel in @format.
	 * @param format the format to store the sampled color in.
	 * @param level mipmap level to sample from (@x and @y are level 0 coordinates)
	 * @param sampler_type the sampler type to use,
	 * to be ported from working code. Valid values: GEGL_SAMPLER_NEAREST,
	 * GEGL_SAMPLER_LINEAR, GEGL_SAMPLER_CUBIC, GEGL_SAMPLER_NOHALO and
	 * GEGL_SAMPLER_LOHALO
	 * @param repeat_mode how requests outside the buffer extent are handled.
	 * Valid values: GEGL_ABYSS_NONE (abyss pixels are zeroed), GEGL_ABYSS_WHITE
	 * (abyss pixels are white), GEGL_ABYSS_BLACK (abyss pixels are black),
	 * GEGL_ABYSS_CLAMP (coordinates are clamped to the abyss rectangle),
	 * GEGL_ABYSS_LOOP (buffer contents are tiled if outside of the abyss rectangle).
	 *
	 * Query interpolate pixel values at a given coordinate using a specified form
	 * of interpolation. The samplers used cache for a small neighbourhood of the
	 * buffer for more efficient access.
	 */

	public void              sampleAtLevel (
			double           x,
			double           y,
			GeglMatrix2      scale,
			Pointer          dest,
			BablFormat       format,
			int              level,
			GeglSamplerType   sampler_type,
			GeglAbyssPolicy   repeat_mode)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_sample_at_level (this,
				x,
				y,
				scale,
				dest,
				format,
				level,
				sampler_type,
				repeat_mode);
	}

	/**
	 * gegl_buffer_sample: (skip)
	 * @param buffer the GeglBuffer to sample from
	 * @param x x coordinate to sample in buffer coordinates
	 * @param y y coordinate to sample in buffer coordinates
	 * @param scale a matrix that indicates scaling factors, see
	 * gegl_sampler_compute_scale the same.
	 * @param dest buffer capable of storing one pixel in format.
	 * @param format the format to store the sampled color in.
	 * @param sampler_type the sampler type to use,
	 * to be ported from working code. Valid values: GEGL_SAMPLER_NEAREST,
	 * GEGL_SAMPLER_LINEAR, GEGL_SAMPLER_CUBIC, GEGL_SAMPLER_NOHALO and
	 * GEGL_SAMPLER_LOHALO
	 * @param repeat_mode how requests outside the buffer extent are handled.
	 * Valid values: GEGL_ABYSS_NONE (abyss pixels are zeroed), GEGL_ABYSS_WHITE
	 * (abyss pixels are white), GEGL_ABYSS_BLACK (abyss pixels are black),
	 * GEGL_ABYSS_CLAMP (coordinates are clamped to the abyss rectangle),
	 * GEGL_ABYSS_LOOP (buffer contents are tiled if outside of the abyss rectangle).
	 *
	 * Query interpolate pixel values at a given coordinate using a specified form
	 * of interpolation. The samplers used cache for a small neighbourhood of the
	 * buffer for more efficient access.
	 */
	public void              sample          (
			double           x,
			double           y,
			GeglMatrix2      scale,
			Pointer          dest,
			BablFormat       format,
			GeglSamplerType   sampler_type,
			GeglAbyssPolicy   repeat_mode)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_sample(this,
				x,
				y,
				scale,
				dest,
				format,
				sampler_type,
				repeat_mode);
	}



	/**
	 * gegl_buffer_sample_cleanup:
	 * @buffer: the GeglBuffer to sample from
	 *
	 * Clean up resources used by sampling framework of buffer (will be freed
	 * automatically later when the buffer is destroyed, for long lived buffers
	 * cleaning up the sampling infrastructure when it has been used for its
	 * purpose will sometimes be more efficient).
	 */
	public void sampleCleanup()
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_sample_cleanup(this);
	}

	/*
typedef void (*GeglSamplerGetFun)  (GeglSampler     *self,
                                    gdouble          x,
                                    gdouble          y,
                                    GeglMatrix2     *scale,
                                    void            *output,
                                    GeglAbyssPolicy  repeat_mode);
	 */
	/**
	 * gegl_sampler_get_fun: (skip)
	 */
	/*
GeglSamplerGetFun gegl_sampler_get_fun (GeglSampler *sampler);
	 */

	/**
	 * gegl_buffer_sampler_new: (skip)
	 * @param buffer buffer to create a new sampler for
	 * @param format format we want data back in
	 * @param sampler_type the sampler type to use,
	 * to be ported from working code. Valid values: GEGL_SAMPLER_NEAREST,
	 * GEGL_SAMPLER_LINEAR, GEGL_SAMPLER_CUBIC, GEGL_SAMPLER_NOHALO and
	 * GEGL_SAMPLER_LOHALO
	 *
	 * @return
	 * Create a new sampler, when you are done with the sampler, g_object_unref
	 * it.
	 *
	 * Samplers only hold weak references to buffers, so if its buffer is freed
	 * the sampler will become invalid.
	 */
	public GeglSampler newSampler(BablFormat format, GeglSamplerType sampler_type)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_sampler_new(this, format, sampler_type);
	}

	/**
	 * gegl_buffer_sampler_new_at_level: (skip)
	 * @param format format we want data back in
	 * @param sampler_type the sampler type to use,
	 * to be ported from working code. Valid values: GEGL_SAMPLER_NEAREST,
	 * GEGL_SAMPLER_LINEAR, GEGL_SAMPLER_CUBIC, GEGL_SAMPLER_NOHALO and
	 * GEGL_SAMPLER_LOHALO
	 * @param level the mipmap level to create a sampler for
	 *
	 * @return Create a new sampler, when you are done with the sampler, g_object_unref
	 * it.
	 *
	 * Samplers only hold weak references to buffers, so if its buffer is freed
	 * the sampler will become invalid.
	 */
	public GeglSampler newSamplerAtLevel (
			BablFormat format,
			GeglSamplerType   sampler_type,
			int              level)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_sampler_new_at_level (this,
			format,
			sampler_type,
			level);
	}


	/**
	 * gegl_buffer_linear_new: (skip)
	 * @param extent dimensions of buffer.
	 * @param format desired pixel format.
	 *
	 * Creates a GeglBuffer backed by a linear memory buffer, of the given
	 * @extent in the specified @format. babl_format ("R'G'B'A u8") for instance
	 * to make a normal 8bit buffer.
	 *
	 * @return a GeglBuffer that can be used as any other GeglBuffer.
	 */
	public static GeglBuffer newLinear(GeglRectangle extent,
			BablFormat format)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_linear_new(extent, format);
	}

	/**
	 * gegl_buffer_linear_new_from_data: (skip)
	 * @param data a pointer to a linear buffer in memory.
	 * @param format the format of the data in memory
	 * @param extent the dimensions (and upper left coordinates) of linear buffer.
	 * @param rowstride the number of bytes between rowstarts in memory (or 0 to
	 *             autodetect)
	 * @param destroy_fn function to call to free data or NULL if memory should not be
	 *              freed.
	 * @param destroy_fn_data extra argument to be passed to void destroy(ptr, data) type
	 *              function.
	 *
	 * Creates a GeglBuffer backed by a linear memory buffer that already exists,
	 * of the given @extent in the specified @format. babl_format ("R'G'B'A u8")
	 * for instance to make a normal 8bit buffer.
	 *
	 * @return a GeglBuffer that can be used as any other GeglBuffer.
	 */
	public static GeglBuffer newLinearFromData (Pointer       data,
			BablFormat          format,
			GeglRectangle extent,
			int                 rowstride,
			GDestroyNotify       destroy_fn,
			Pointer             destroy_fn_data)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_linear_new_from_data(data, format, extent, rowstride, destroy_fn, destroy_fn_data);
	}

	/**
	 * gegl_buffer_linear_open: (skip)
	 * @param extent region to open, pass NULL for entire buffer.
	 * @param rowstride return location for rowstride.
	 * @param format desired format or NULL to use buffers format.
	 *
	 * Raw direct random access to the full data of a buffer in linear memory.
	 *
	 * @return a pointer to a linear memory region describing the buffer, if the
	 * request is compatible with the underlying data storage direct access
	 * to the underlying data is provided. Otherwise, it returns a copy of the data.
	 */
	public Pointer        openLinear(
			GeglRectangle extent,
			int                rowstride,
			BablFormat          format)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_linear_open(this,
				extent,
				rowstride,
				format);
	}

	/**
	 * gegl_buffer_linear_close:
	 * @param linear a previously returned buffer.
	 *
	 * This function makes sure GeglBuffer and underlying code is aware of changes
	 * being made to the linear buffer. If the request was not a compatible one
	 * it is written back to the buffer. Multiple concurrent users can be handed
	 * the same buffer (both raw access and converted).
	 */
	public void            closeLinear(Pointer       linear)
	{
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_linear_close(this, linear);
	}


	/**
	 * gegl_buffer_get_abyss:
	 * 
	 * @return the abyss extent of a buffer, this expands out to the parents extent in
	 * subbuffers.
	 */
	public GeglRectangle getAbyss()
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_get_abyss(this);
	}



	/**
	 * gegl_buffer_signal_connect:
	 * @param detailed_signal only "changed" expected for now
	 * @param c_handler (scope async) : c function callback
	 * @param data user data:
	 *
	 * This function should be used instead of g_signal_connect when connecting to
	 * the GeglBuffer::changed signal handler, GeglBuffer contains additional
	 * machinery to avoid the overhead of changes when no signal handler have been
	 * connected, if regular g_signal_connect is used; then no signals will be
	 * emitted.
	 *
	 * @return an handle like g_signal_connect.
	 */
	public long connectSignal(
			String detailed_signal,
			com.jibee.gegl.priv.Gegl.GCallback   c_handler,
			Pointer    data)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_signal_connect (this,
				detailed_signal,
				c_handler,
				data);
	}
}

