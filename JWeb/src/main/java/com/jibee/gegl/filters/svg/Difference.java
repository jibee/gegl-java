package com.jibee.gegl.filters.svg;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**


SVG blend operation difference (<code>d = cA + cB - 2 * (MIN (cA * aB, cB * aA))</code>)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Difference extends GeglFilter
{
/** Constructs a .

SVG blend operation difference (<code>d = cA + cB - 2 * (MIN (cA * aB, cB * aA))</code>)
*/
    public Difference(GeglNode container)
    {
        super(container, "svg:difference");
    }
/** Constructs a .

SVG blend operation difference (<code>d = cA + cB - 2 * (MIN (cA * aB, cB * aA))</code>)
*/
    public Difference(GeglFilter parent)
    {
        super(parent, "svg:difference");
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
    public Difference setSrgb(boolean value)
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

