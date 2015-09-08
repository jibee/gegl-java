package com.jibee.gegl.filters.svg;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Dst-in

Porter Duff operation dst-in (d = cB * aA)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class DstIn extends GeglFilter
{
/** Constructs a Dst-in.

Porter Duff operation dst-in (d = cB * aA)
*/
    public DstIn(GeglNode container)
    {
        super(container, "svg:dst-in");
    }
/** Constructs a Dst-in.

Porter Duff operation dst-in (d = cB * aA)
*/
    public DstIn(GeglFilter parent)
    {
        super(parent, "svg:dst-in");
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
    public DstIn setSrgb(boolean value)
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

