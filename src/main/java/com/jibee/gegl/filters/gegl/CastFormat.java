package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Babl;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Cast Format
 *
 * Cast the data between input_format and output_format, both formats must have the same bpp
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"core", "color"})
public class CastFormat extends GeglFilter implements Source, Sink
{
    /** Constructs a Cast Format.
     *
     * Cast the data between input_format and output_format, both formats must have the same bpp
     */
    public CastFormat(GeglNode container)
    {
        super(container, "gegl:cast-format");
    }
    /** Constructs a Cast Format.
     *
     * Cast the data between input_format and output_format, both formats must have the same bpp
     */
    public CastFormat(GeglFilter parent)
    {
        super(parent, "gegl:cast-format");
    }

    
    /** Input format
     *
     * The babl format of the input
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private Babl m_InputFormat ;

    /** Input format
     *
     * The babl format of the input
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public CastFormat setInputFormat(Babl value)
    {
	
        m_InputFormat = value;
        setProperty("input-format", value);
        return this;
    }

    /** Input format
     *
     * The babl format of the input
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Babl getInputFormat()
    {
        return m_InputFormat;
    }


    /** Output format
     *
     * The babl format of the output
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private Babl m_OutputFormat ;

    /** Output format
     *
     * The babl format of the output
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public CastFormat setOutputFormat(Babl value)
    {
	
        m_OutputFormat = value;
        setProperty("output-format", value);
        return this;
    }

    /** Output format
     *
     * The babl format of the output
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Babl getOutputFormat()
    {
        return m_OutputFormat;
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

