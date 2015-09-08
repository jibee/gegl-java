package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**


SVG color matrix operation svg_huerotate

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class SvgHuerotate extends GeglFilter
{
/** Constructs a .

SVG color matrix operation svg_huerotate
*/
    public SvgHuerotate(GeglNode container)
    {
        super(container, "gegl:svg-huerotate");
    }
/** Constructs a .

SVG color matrix operation svg_huerotate
*/
    public SvgHuerotate(GeglFilter parent)
    {
        super(parent, "gegl:svg-huerotate");
    }

    
/** Values

list of <number>s

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Values ;

/** Values

list of <number>s

Unit: 
Default value: 
Acceptable Range:  
*/
    public SvgHuerotate setValues(String value)
    {
	
        m_Values = value;
        setProperty("values", value);
        return this;
    }

/** Values

list of <number>s

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getValues()
    {
        return m_Values;
    }


}

