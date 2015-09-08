package com.jibee.gegl.filters.svg;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**


SVG blend operation exclusion (<code>d = (cA * aB + cB * aA - 2 * cA * cB) + cA * (1 - aB) + cB * (1 - aA)</code>)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Exclusion extends GeglFilter
{
/** Constructs a .

SVG blend operation exclusion (<code>d = (cA * aB + cB * aA - 2 * cA * cB) + cA * (1 - aB) + cB * (1 - aA)</code>)
*/
    public Exclusion(GeglNode container)
    {
        super(container, "svg:exclusion");
    }
/** Constructs a .

SVG blend operation exclusion (<code>d = (cA * aB + cB * aA - 2 * cA * cB) + cA * (1 - aB) + cB * (1 - aA)</code>)
*/
    public Exclusion(GeglFilter parent)
    {
        super(parent, "svg:exclusion");
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
    public Exclusion setSrgb(boolean value)
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

