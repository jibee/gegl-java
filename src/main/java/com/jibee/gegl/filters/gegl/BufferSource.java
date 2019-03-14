package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Buffer Source
 *
 * Use an existing in-memory GeglBuffer as image source.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"programming", "input"})
public class BufferSource extends GeglFilter implements Source
{
    /** Constructs a Buffer Source.
     *
     * Use an existing in-memory GeglBuffer as image source.
     *
     * @param container container node
     */
    public BufferSource(GeglNode container)
    {
        super(container, "gegl:buffer-source");
    }
    /** Constructs a Buffer Source.
     *
     * Use an existing in-memory GeglBuffer as image source.
     *
     * @param parent parent filter node
     */
    public BufferSource(GeglFilter parent)
    {
        super(parent, "gegl:buffer-source");
    }

    
    /** Input buffer
     *
     * The GeglBuffer to load into the pipeline
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private GeglBuffer m_Buffer ;

    /** Input buffer
     *
     * The GeglBuffer to load into the pipeline
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Input buffer
     * @return this filter (for chaining operations)
     * 
     */
    public BufferSource setBuffer(GeglBuffer value)
    {
	
        m_Buffer = value;
        setProperty("buffer", value);
        return this;
    }

    /** Input buffer
     *
     * The GeglBuffer to load into the pipeline
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Input buffer
     * 
     */
    public GeglBuffer getBuffer()
    {
        return m_Buffer;
    }

    @Override
    public OutputPad<BufferSource> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

