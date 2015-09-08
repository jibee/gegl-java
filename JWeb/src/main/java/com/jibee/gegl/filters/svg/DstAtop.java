package com.jibee.gegl.filters.svg;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Dst-atop

Porter Duff operation dst-atop (d = cB * aA + cA * (1.0f - aB))

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class DstAtop extends GeglFilter
{
/** Constructs a Dst-atop.

Porter Duff operation dst-atop (d = cB * aA + cA * (1.0f - aB))
*/
    public DstAtop(GeglNode container)
    {
        super(container, "svg:dst-atop");
    }
/** Constructs a Dst-atop.

Porter Duff operation dst-atop (d = cB * aA + cA * (1.0f - aB))
*/
    public DstAtop(GeglFilter parent)
    {
        super(parent, "svg:dst-atop");
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
    public DstAtop setSrgb(boolean value)
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

