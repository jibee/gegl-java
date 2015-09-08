package com.jibee.gegl.filters.svg;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**


SVG blend operation darken (<code>d = MIN (cA * aB, cB * aA) + cA * (1 - aB) + cB * (1 - aA)</code>)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Darken extends GeglFilter
{
/** Constructs a .

SVG blend operation darken (<code>d = MIN (cA * aB, cB * aA) + cA * (1 - aB) + cB * (1 - aA)</code>)
*/
    public Darken(GeglNode container)
    {
        super(container, "svg:darken");
    }
/** Constructs a .

SVG blend operation darken (<code>d = MIN (cA * aB, cB * aA) + cA * (1 - aB) + cB * (1 - aA)</code>)
*/
    public Darken(GeglFilter parent)
    {
        super(parent, "svg:darken");
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
    public Darken setSrgb(boolean value)
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

