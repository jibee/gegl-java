package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Explicit cache of results at this point of graph.

An explicit caching node

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Cache extends GeglFilter
{
/** Constructs a Explicit cache of results at this point of graph..

An explicit caching node
*/
    public Cache(GeglNode container)
    {
        super(container, "gegl:cache");
    }
/** Constructs a Explicit cache of results at this point of graph..

An explicit caching node
*/
    public Cache(GeglFilter parent)
    {
        super(parent, "gegl:cache");
    }

    
/** Cache

NULL or a GeglBuffer containing cached rendering results, this is a special buffer where gegl_buffer_list_valid_rectangles returns the part of the cache that is valid.

Unit: 
Default value: 
Acceptable Range:  
*/
    private GeglBuffer m_Cache ;

/** Cache

NULL or a GeglBuffer containing cached rendering results, this is a special buffer where gegl_buffer_list_valid_rectangles returns the part of the cache that is valid.

Unit: 
Default value: 
Acceptable Range:  
*/
    public Cache setCache(GeglBuffer value)
    {
	
        m_Cache = value;
        setProperty("cache", value);
        return this;
    }

/** Cache

NULL or a GeglBuffer containing cached rendering results, this is a special buffer where gegl_buffer_list_valid_rectangles returns the part of the cache that is valid.

Unit: 
Default value: 
Acceptable Range:  
*/
    public GeglBuffer getCache()
    {
        return m_Cache;
    }


}

