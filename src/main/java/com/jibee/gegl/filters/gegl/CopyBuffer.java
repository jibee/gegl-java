package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Copy Buffer
 *
 * Writes image data to an already existing buffer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"programming"})
public class CopyBuffer extends GeglFilter implements Filter
{
    /** Constructs a Copy Buffer.
     *
     * Writes image data to an already existing buffer
     *
     * @param container container node
     */
    public CopyBuffer(GeglNode container)
    {
        super(container, "gegl:copy-buffer");
    }
    /** Constructs a Copy Buffer.
     *
     * Writes image data to an already existing buffer
     *
     * @param parent parent filter node
     */
    public CopyBuffer(GeglFilter parent)
    {
        super(parent, "gegl:copy-buffer");
    }

    
    /** Buffer
     *
     * An already existing GeglBuffer to write incoming buffer data to, or NULL.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private GeglBuffer m_Buffer ;

    /** Buffer
     *
     * An already existing GeglBuffer to write incoming buffer data to, or NULL.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Buffer
     * @return this filter (for chaining operations)
     * 
     */
    public CopyBuffer setBuffer(GeglBuffer value)
    {
	
        m_Buffer = value;
        setProperty("buffer", value);
        return this;
    }

    /** Buffer
     *
     * An already existing GeglBuffer to write incoming buffer data to, or NULL.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Buffer
     * 
     */
    public GeglBuffer getBuffer()
    {
        return m_Buffer;
    }

    @Override
    public InputPad<CopyBuffer> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<CopyBuffer> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

