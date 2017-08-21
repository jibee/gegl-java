package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;
import com.sun.jna.Pointer;

/**
 * Buffer Sink
 *
 * Create a new GEGL buffer to write the resulting rendering.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"programming", "output"})
public class BufferSink extends GeglFilter implements Sink
{
    /** Constructs a Buffer Sink.
     *
     * Create a new GEGL buffer to write the resulting rendering.
     *
     * @param container container node
     */
    public BufferSink(GeglNode container)
    {
        super(container, "gegl:buffer-sink");
    }
    /** Constructs a Buffer Sink.
     *
     * Create a new GEGL buffer to write the resulting rendering.
     *
     * @param parent parent filter node
     */
    public BufferSink(GeglFilter parent)
    {
        super(parent, "gegl:buffer-sink");
    }

    
    /** Buffer location
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private GeglBuffer m_Buffer ;

    /** Buffer location
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Buffer location
     * @return this filter (for chaining operations)
     * 
     */
    public BufferSink setBuffer(GeglBuffer value)
    {
	
        m_Buffer = value;
        setProperty("buffer", value);
        return this;
    }

    /** Buffer location
     *
     * 
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


    /** babl format
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private Pointer m_Format ;

    /** babl format
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for babl format
     * @return this filter (for chaining operations)
     * 
     */
    public BufferSink setFormat(Pointer value)
    {
	
        m_Format = value;
        setProperty("format", value);
        return this;
    }

    /** babl format
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of babl format
     * 
     */
    public Pointer getFormat()
    {
        return m_Format;
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }

}

