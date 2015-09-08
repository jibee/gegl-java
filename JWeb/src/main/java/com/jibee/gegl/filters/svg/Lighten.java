package com.jibee.gegl.filters.svg;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**


SVG blend operation lighten (<code>d = MAX (cA * aB, cB * aA) + cA * (1 - aB) + cB * (1 - aA)</code>)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Lighten extends GeglFilter
{
/** Constructs a .

SVG blend operation lighten (<code>d = MAX (cA * aB, cB * aA) + cA * (1 - aB) + cB * (1 - aA)</code>)
*/
    public Lighten(GeglNode container)
    {
        super(container, "svg:lighten");
    }
/** Constructs a .

SVG blend operation lighten (<code>d = MAX (cA * aB, cB * aA) + cA * (1 - aB) + cB * (1 - aA)</code>)
*/
    public Lighten(GeglFilter parent)
    {
        super(parent, "svg:lighten");
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
    public Lighten setSrgb(boolean value)
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

