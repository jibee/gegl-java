package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Explicit cache of results at this point of graph.
 *
 * An explicit caching node
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"programming"})
public class Cache extends GeglFilter implements Source, Sink
{
    /** Constructs a Explicit cache of results at this point of graph..
     *
     * An explicit caching node
     */
    public Cache(GeglNode container)
    {
        super(container, "gegl:cache");
    }
    /** Constructs a Explicit cache of results at this point of graph..
     *
     * An explicit caching node
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
     */
    public GeglBuffer getCache()
    {
        return m_Cache;
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}
