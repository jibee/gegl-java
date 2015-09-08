package com.jibee.gegl.filters.svg;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Dst-over

Porter Duff operation dst-over (d = cB + cA * (1.0f - aB))

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class DstOver extends GeglFilter
{
/** Constructs a Dst-over.

Porter Duff operation dst-over (d = cB + cA * (1.0f - aB))
*/
    public DstOver(GeglNode container)
    {
        super(container, "svg:dst-over");
    }
/** Constructs a Dst-over.

Porter Duff operation dst-over (d = cB + cA * (1.0f - aB))
*/
    public DstOver(GeglFilter parent)
    {
        super(parent, "svg:dst-over");
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
    public DstOver setSrgb(boolean value)
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

