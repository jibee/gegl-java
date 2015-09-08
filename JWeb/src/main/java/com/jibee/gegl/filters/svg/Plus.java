package com.jibee.gegl.filters.svg;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**
Plus

SVG blend operation plus (<code>d = cA + cB</code>)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Plus extends GeglFilter
{
/** Constructs a Plus.

SVG blend operation plus (<code>d = cA + cB</code>)
*/
    public Plus(GeglNode container)
    {
        super(container, "svg:plus");
    }
/** Constructs a Plus.

SVG blend operation plus (<code>d = cA + cB</code>)
*/
    public Plus(GeglFilter parent)
    {
        super(parent, "svg:plus");
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
    public Plus setSrgb(boolean value)
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

