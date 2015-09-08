package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Map Absolute

sample input with an auxiliary buffer that contain absolute source coordinates

License: 
Supports OpenCL: 
Position Dependant: true
*/
public class MapAbsolute extends GeglFilter
{
/** Constructs a Map Absolute.

sample input with an auxiliary buffer that contain absolute source coordinates
*/
    public MapAbsolute(GeglNode container)
    {
        super(container, "gegl:map-absolute");
    }
/** Constructs a Map Absolute.

sample input with an auxiliary buffer that contain absolute source coordinates
*/
    public MapAbsolute(GeglFilter parent)
    {
        super(parent, "gegl:map-absolute");
    }

    
/** Resampling method



Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_SamplerType ;

/** Resampling method



Unit: 
Default value: 
Acceptable Range:  
*/
    public MapAbsolute setSamplerType(String value)
    {
	
        m_SamplerType = value;
        setProperty("sampler-type", value);
        return this;
    }

/** Resampling method



Unit: 
Default value: 
Acceptable Range:  
*/
    public String getSamplerType()
    {
        return m_SamplerType;
    }


}

