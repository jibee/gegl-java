package com.jibee.gegl.filters.svg;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Dst

Porter Duff operation dst (d = cB)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Dst extends GeglFilter
{
/** Constructs a Dst.

Porter Duff operation dst (d = cB)
*/
    public Dst(GeglNode container)
    {
        super(container, "svg:dst");
    }
/** Constructs a Dst.

Porter Duff operation dst (d = cB)
*/
    public Dst(GeglFilter parent)
    {
        super(parent, "svg:dst");
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
    public Dst setSrgb(boolean value)
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

