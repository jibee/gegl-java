package com.jibee.gegl.filters.svg;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**
Src-out

Porter Duff operation src-out (d = cA * (1.0f - aB))

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class SrcOut extends GeglFilter
{
/** Constructs a Src-out.

Porter Duff operation src-out (d = cA * (1.0f - aB))
*/
    public SrcOut(GeglNode container)
    {
        super(container, "svg:src-out");
    }
/** Constructs a Src-out.

Porter Duff operation src-out (d = cA * (1.0f - aB))
*/
    public SrcOut(GeglFilter parent)
    {
        super(parent, "svg:src-out");
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
    public SrcOut setSrgb(boolean value)
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

