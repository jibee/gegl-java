package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**


SVG color matrix operation svg_saturate

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class SvgSaturate extends GeglFilter
{
/** Constructs a .

SVG color matrix operation svg_saturate
*/
    public SvgSaturate(GeglNode container)
    {
        super(container, "gegl:svg-saturate");
    }
/** Constructs a .

SVG color matrix operation svg_saturate
*/
    public SvgSaturate(GeglFilter parent)
    {
        super(parent, "gegl:svg-saturate");
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
    public SvgSaturate setValues(String value)
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
