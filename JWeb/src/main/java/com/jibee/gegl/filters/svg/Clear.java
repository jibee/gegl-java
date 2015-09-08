package com.jibee.gegl.filters.svg;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**
Clear

Porter Duff operation clear (d = 0.0f)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Clear extends GeglFilter
{
/** Constructs a Clear.

Porter Duff operation clear (d = 0.0f)
*/
    public Clear(GeglNode container)
    {
        super(container, "svg:clear");
    }
/** Constructs a Clear.

Porter Duff operation clear (d = 0.0f)
*/
    public Clear(GeglFilter parent)
    {
        super(parent, "svg:clear");
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
    public Clear setSrgb(boolean value)
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

