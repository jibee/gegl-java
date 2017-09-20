package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Write Buffer
 *
 * Write input data into an existing GEGL buffer destination surface.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"programming", "output"})
public class WriteBuffer extends GeglFilter implements Sink
{
    /** Constructs a Write Buffer.
     *
     * Write input data into an existing GEGL buffer destination surface.
     *
     * @param container container node
     */
    public WriteBuffer(GeglNode container)
    {
        super(container, "gegl:write-buffer");
    }
    /** Constructs a Write Buffer.
     *
     * Write input data into an existing GEGL buffer destination surface.
     *
     * @param parent parent filter node
     */
    public WriteBuffer(GeglFilter parent)
    {
        super(parent, "gegl:write-buffer");
    }

    
    /** Buffer location
     *
     * A pre-existing GeglBuffer to write incoming buffer data to.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private GeglBuffer m_Buffer ;

    /** Buffer location
     *
     * A pre-existing GeglBuffer to write incoming buffer data to.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Buffer location
     * @return this filter (for chaining operations)
     * 
     */
    public WriteBuffer setBuffer(GeglBuffer value)
    {
	
        m_Buffer = value;
        setProperty("buffer", value);
        return this;
    }

    /** Buffer location
     *
     * A pre-existing GeglBuffer to write incoming buffer data to.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Buffer location
     * 
     */
    public GeglBuffer getBuffer()
    {
        return m_Buffer;
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }

}

