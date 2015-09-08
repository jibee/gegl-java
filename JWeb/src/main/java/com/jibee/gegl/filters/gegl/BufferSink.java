package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.sun.jna.Pointer;
import com.jibee.gegl.GeglNode;

/**
Buffer Sink

Create a new GEGL buffer to write the resulting rendering.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class BufferSink extends GeglFilter
{
/** Constructs a Buffer Sink.

Create a new GEGL buffer to write the resulting rendering.
*/
    public BufferSink(GeglNode container)
    {
        super(container, "gegl:buffer-sink");
    }
/** Constructs a Buffer Sink.

Create a new GEGL buffer to write the resulting rendering.
*/
    public BufferSink(GeglFilter parent)
    {
        super(parent, "gegl:buffer-sink");
    }

    
/** Buffer location



Unit: 
Default value: 
Acceptable Range:  
*/
    private Pointer m_Buffer ;

/** Buffer location



Unit: 
Default value: 
Acceptable Range:  
*/
    public BufferSink setBuffer(Pointer value)
    {
	
        m_Buffer = value;
        setProperty("buffer", value);
        return this;
    }

/** Buffer location



Unit: 
Default value: 
Acceptable Range:  
*/
    public Pointer getBuffer()
    {
        return m_Buffer;
    }


/** babl format



Unit: 
Default value: 
Acceptable Range:  
*/
    private Pointer m_Format ;

/** babl format



Unit: 
Default value: 
Acceptable Range:  
*/
    public BufferSink setFormat(Pointer value)
    {
	
        m_Format = value;
        setProperty("format", value);
        return this;
    }

/** babl format



Unit: 
Default value: 
Acceptable Range:  
*/
    public Pointer getFormat()
    {
        return m_Format;
    }


}

