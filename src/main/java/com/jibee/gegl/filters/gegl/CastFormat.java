package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.BablFormat;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Cast Format
 *
 * Cast the data between input_format and output_format, both formats must have the same bpp
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"core", "color"})
public class CastFormat extends GeglFilter implements Filter
{
    /** Constructs a Cast Format.
     *
     * Cast the data between input_format and output_format, both formats must have the same bpp
     *
     * @param container container node
     */
    public CastFormat(GeglNode container)
    {
        super(container, "gegl:cast-format");
    }
    /** Constructs a Cast Format.
     *
     * Cast the data between input_format and output_format, both formats must have the same bpp
     *
     * @param parent parent filter node
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
    private BablFormat m_InputFormat ;

    /** Input format
     *
     * The babl format of the input
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Input format
     * @return this filter (for chaining operations)
     * 
     */
    public CastFormat setInputFormat(BablFormat value)
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
     *
     * @return value of Input format
     * 
     */
    public BablFormat getInputFormat()
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
    private BablFormat m_OutputFormat ;

    /** Output format
     *
     * The babl format of the output
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Output format
     * @return this filter (for chaining operations)
     * 
     */
    public CastFormat setOutputFormat(BablFormat value)
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
     *
     * @return value of Output format
     * 
     */
    public BablFormat getOutputFormat()
    {
        return m_OutputFormat;
    }

    @Override
    public InputPad<CastFormat> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<CastFormat> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

