package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.Babl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Color

Generates a buffer entirely filled with the specified color, use gegl:crop to get smaller dimensions.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Color extends GeglFilter
{
/** Constructs a Color.

Generates a buffer entirely filled with the specified color, use gegl:crop to get smaller dimensions.
*/
    public Color(GeglNode container)
    {
        super(container, "gegl:color");
    }
/** Constructs a Color.

Generates a buffer entirely filled with the specified color, use gegl:crop to get smaller dimensions.
*/
    public Color(GeglFilter parent)
    {
        super(parent, "gegl:color");
    }

    
/** Color

The color to render (Idefaults to 'black')

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    private GeglColor m_Value  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

/** Color

The color to render (Idefaults to 'black')

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public Color setValue(GeglColor value)
    {
	
        m_Value = value;
        setProperty("value", value);
        return this;
    }

/** Color

The color to render (Idefaults to 'black')

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public GeglColor getValue()
    {
        return m_Value;
    }


/** Babl Format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    private Babl m_Format ;

/** Babl Format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    public Color setFormat(Babl value)
    {
	
        m_Format = value;
        setProperty("format", value);
        return this;
    }

/** Babl Format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    public Babl getFormat()
    {
        return m_Format;
    }


}
