package com.jibee.gegl.filters.svg;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Color-dodge

SVG blend operation color-dodge (<code>if cA * aB + cB * aA >= aA * aB: d = aA * aB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == aA ? 1 : cB * aA / (aA == 0 ? 1 : 1 - cA / aA)) + cA * (1 - aB) + cB * (1 - aA)</code>)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class ColorDodge extends GeglFilter
{
/** Constructs a Color-dodge.

SVG blend operation color-dodge (<code>if cA * aB + cB * aA >= aA * aB: d = aA * aB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == aA ? 1 : cB * aA / (aA == 0 ? 1 : 1 - cA / aA)) + cA * (1 - aB) + cB * (1 - aA)</code>)
*/
    public ColorDodge(GeglNode container)
    {
        super(container, "svg:color-dodge");
    }
/** Constructs a Color-dodge.

SVG blend operation color-dodge (<code>if cA * aB + cB * aA >= aA * aB: d = aA * aB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == aA ? 1 : cB * aA / (aA == 0 ? 1 : 1 - cA / aA)) + cA * (1 - aB) + cB * (1 - aA)</code>)
*/
    public ColorDodge(GeglFilter parent)
    {
        super(parent, "svg:color-dodge");
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
    public ColorDodge setSrgb(boolean value)
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

