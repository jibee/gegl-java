package com.jibee.gegl.filters.svg;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**


SVG blend operation screen (<code>d = cA + cB - cA * cB</code>)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Screen extends GeglFilter
{
/** Constructs a .

SVG blend operation screen (<code>d = cA + cB - cA * cB</code>)
*/
    public Screen(GeglNode container)
    {
        super(container, "svg:screen");
    }
/** Constructs a .

SVG blend operation screen (<code>d = cA + cB - cA * cB</code>)
*/
    public Screen(GeglFilter parent)
    {
        super(parent, "svg:screen");
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
    public Screen setSrgb(boolean value)
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

