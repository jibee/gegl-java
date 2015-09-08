package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.Babl;
import com.jibee.gegl.GeglNode;

/**
Convert Format

Convert the data to the specified format

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class ConvertFormat extends GeglFilter
{
/** Constructs a Convert Format.

Convert the data to the specified format
*/
    public ConvertFormat(GeglNode container)
    {
        super(container, "gegl:convert-format");
    }
/** Constructs a Convert Format.

Convert the data to the specified format
*/
    public ConvertFormat(GeglFilter parent)
    {
        super(parent, "gegl:convert-format");
    }

    
/** Output format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    private Babl m_Format ;

/** Output format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    public ConvertFormat setFormat(Babl value)
    {
	
        m_Format = value;
        setProperty("format", value);
        return this;
    }

/** Output format

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

