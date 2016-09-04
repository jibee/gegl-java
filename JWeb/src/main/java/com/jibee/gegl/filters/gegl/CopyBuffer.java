package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Copy Buffer
 *
 * Writes image data to an already existing buffer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"programming"})
public class CopyBuffer extends GeglFilter implements Source, Sink
{
    /** Constructs a Copy Buffer.
     *
     * Writes image data to an already existing buffer
     */
    public CopyBuffer(GeglNode container)
    {
        super(container, "gegl:copy-buffer");
    }
    /** Constructs a Copy Buffer.
     *
     * Writes image data to an already existing buffer
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
     */
    public GeglBuffer getBuffer()
    {
        return m_Buffer;
    }

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

