package com.jibee.gegl.filters.svg;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Hard-light

SVG blend operation hard-light (<code>if 2 * cA < aA: d = 2 * cA * cB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = aA * aB - 2 * (aB - cB) * (aA - cA) + cA * (1 - aB) + cB * (1 - aA)</code>)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class HardLight extends GeglFilter
{
/** Constructs a Hard-light.

SVG blend operation hard-light (<code>if 2 * cA < aA: d = 2 * cA * cB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = aA * aB - 2 * (aB - cB) * (aA - cA) + cA * (1 - aB) + cB * (1 - aA)</code>)
*/
    public HardLight(GeglNode container)
    {
        super(container, "svg:hard-light");
    }
/** Constructs a Hard-light.

SVG blend operation hard-light (<code>if 2 * cA < aA: d = 2 * cA * cB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = aA * aB - 2 * (aB - cB) * (aA - cA) + cA * (1 - aB) + cB * (1 - aA)</code>)
*/
    public HardLight(GeglFilter parent)
    {
        super(parent, "svg:hard-light");
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
    public HardLight setSrgb(boolean value)
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

