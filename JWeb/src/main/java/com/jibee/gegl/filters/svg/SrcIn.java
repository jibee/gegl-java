package com.jibee.gegl.filters.svg;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Src-in

Porter Duff compositing operation src-in (formula:   cA * aB)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class SrcIn extends GeglFilter
{
/** Constructs a Src-in.

Porter Duff compositing operation src-in (formula:   cA * aB)
*/
    public SrcIn(GeglNode container)
    {
        super(container, "svg:src-in");
    }
/** Constructs a Src-in.

Porter Duff compositing operation src-in (formula:   cA * aB)
*/
    public SrcIn(GeglFilter parent)
    {
        super(parent, "svg:src-in");
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
    public SrcIn setSrgb(boolean value)
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

