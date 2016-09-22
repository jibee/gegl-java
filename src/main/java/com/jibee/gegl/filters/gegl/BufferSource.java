package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * Buffer Source
 *
 * Use an existing in-memory GeglBuffer as image source.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"programming", "input"})
public class BufferSource extends GeglFilter implements Source
{
    /** Constructs a Buffer Source.
     *
     * Use an existing in-memory GeglBuffer as image source.
     */
    public BufferSource(GeglNode container)
    {
        super(container, "gegl:buffer-source");
    }
    /** Constructs a Buffer Source.
     *
     * Use an existing in-memory GeglBuffer as image source.
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
     */
    public GeglBuffer getBuffer()
    {
        return m_Buffer;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}
