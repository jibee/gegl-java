package com.jibee.gegl.filters.svg;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**
Dst-out

Porter Duff operation dst-out (d = cB * (1.0f - aA))

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class DstOut extends GeglFilter
{
/** Constructs a Dst-out.

Porter Duff operation dst-out (d = cB * (1.0f - aA))
*/
    public DstOut(GeglNode container)
    {
        super(container, "svg:dst-out");
    }
/** Constructs a Dst-out.

Porter Duff operation dst-out (d = cB * (1.0f - aA))
*/
    public DstOut(GeglFilter parent)
    {
        super(parent, "svg:dst-out");
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
    public DstOut setSrgb(boolean value)
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

