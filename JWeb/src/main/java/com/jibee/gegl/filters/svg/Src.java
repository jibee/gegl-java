package com.jibee.gegl.filters.svg;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Src

Porter Duff operation src (d = cA)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Src extends GeglFilter
{
/** Constructs a Src.

Porter Duff operation src (d = cA)
*/
    public Src(GeglNode container)
    {
        super(container, "svg:src");
    }
/** Constructs a Src.

Porter Duff operation src (d = cA)
*/
    public Src(GeglFilter parent)
    {
        super(parent, "svg:src");
    }

    
/** sRGB

Use sRGB gamma instead of linear

Unit: 
Default value: false
Acceptable Range:  
*/
    private boolean m_Srgb  = false;

/** sRGB

Use sRGB gamma instead of linear

Unit: 
Default value: false
Acceptable Range:  
*/
    public Src setSrgb(boolean value)
    {
	
        m_Srgb = value;
        setProperty("srgb", value);
        return this;
    }

/** sRGB

Use sRGB gamma instead of linear

Unit: 
Default value: false
Acceptable Range:  
*/
    public boolean getSrgb()
    {
        return m_Srgb;
    }


}

