package com.jibee.gegl.filters.svg;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Xor

Porter Duff operation xor (d = cA * (1.0f - aB)+ cB * (1.0f - aA))

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Xor extends GeglFilter
{
/** Constructs a Xor.

Porter Duff operation xor (d = cA * (1.0f - aB)+ cB * (1.0f - aA))
*/
    public Xor(GeglNode container)
    {
        super(container, "svg:xor");
    }
/** Constructs a Xor.

Porter Duff operation xor (d = cA * (1.0f - aB)+ cB * (1.0f - aA))
*/
    public Xor(GeglFilter parent)
    {
        super(parent, "svg:xor");
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
    public Xor setSrgb(boolean value)
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

