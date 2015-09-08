package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.Babl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Cast Format

Cast the data between input_format and output_format, both bormats must have the same bpp

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class CastFormat extends GeglFilter
{
/** Constructs a Cast Format.

Cast the data between input_format and output_format, both bormats must have the same bpp
*/
    public CastFormat(GeglNode container)
    {
        super(container, "gegl:cast-format");
    }
/** Constructs a Cast Format.

Cast the data between input_format and output_format, both bormats must have the same bpp
*/
    public CastFormat(GeglFilter parent)
    {
        super(parent, "gegl:cast-format");
    }

    
/** Input format

The babl format of the input

Unit: 
Default value: 
Acceptable Range:  
*/
    private Babl m_InputFormat ;

/** Input format

The babl format of the input

Unit: 
Default value: 
Acceptable Range:  
*/
    public CastFormat setInputFormat(Babl value)
    {
	
        m_InputFormat = value;
        setProperty("input-format", value);
        return this;
    }

/** Input format

The babl format of the input

Unit: 
Default value: 
Acceptable Range:  
*/
    public Babl getInputFormat()
    {
        return m_InputFormat;
    }


/** Output format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    private Babl m_OutputFormat ;

/** Output format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    public CastFormat setOutputFormat(Babl value)
    {
	
        m_OutputFormat = value;
        setProperty("output-format", value);
        return this;
    }

/** Output format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    public Babl getOutputFormat()
    {
        return m_OutputFormat;
    }


}

