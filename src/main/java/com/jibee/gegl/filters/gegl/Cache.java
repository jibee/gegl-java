package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Cache
 *
 * An explicit caching node, caches results and should provide faster recomputation if what is cached by it is expensive but isn't changing.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"programming"})
public class Cache extends GeglFilter implements Filter
{
    /** Constructs a Cache.
     *
     * An explicit caching node, caches results and should provide faster recomputation if what is cached by it is expensive but isn't changing.
     *
     * @param container container node
     */
    public Cache(GeglNode container)
    {
        super(container, "gegl:cache");
    }
    /** Constructs a Cache.
     *
     * An explicit caching node, caches results and should provide faster recomputation if what is cached by it is expensive but isn't changing.
     *
     * @param parent parent filter node
     */
    public Cache(GeglFilter parent)
    {
        super(parent, "gegl:cache");
    }

    
    /** Cache
     *
     * NULL or a GeglBuffer containing cached rendering results, this is a special buffer where gegl_buffer_list_valid_rectangles returns the part of the cache that is valid.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private GeglBuffer m_Cache ;

    /** Cache
     *
     * NULL or a GeglBuffer containing cached rendering results, this is a special buffer where gegl_buffer_list_valid_rectangles returns the part of the cache that is valid.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Cache
     * @return this filter (for chaining operations)
     * 
     */
    public Cache setCache(GeglBuffer value)
    {
	
        m_Cache = value;
        setProperty("cache", value);
        return this;
    }

    /** Cache
     *
     * NULL or a GeglBuffer containing cached rendering results, this is a special buffer where gegl_buffer_list_valid_rectangles returns the part of the cache that is valid.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Cache
     * 
     */
    public GeglBuffer getCache()
    {
        return m_Cache;
    }

    @Override
    public InputPad<Cache> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Cache> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

