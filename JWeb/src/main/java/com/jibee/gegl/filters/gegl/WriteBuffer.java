package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglNode;

/**
Write Buffer

Write input data into an existing GEGL buffer destination surface.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class WriteBuffer extends GeglFilter
{
/** Constructs a Write Buffer.

Write input data into an existing GEGL buffer destination surface.
*/
    public WriteBuffer(GeglNode container)
    {
        super(container, "gegl:write-buffer");
    }
/** Constructs a Write Buffer.

Write input data into an existing GEGL buffer destination surface.
*/
    public WriteBuffer(GeglFilter parent)
    {
        super(parent, "gegl:write-buffer");
    }

    
/** Buffer location

A pre-existing GeglBuffer to write incoming buffer data to.

Unit: 
Default value: 
Acceptable Range:  
*/
    private GeglBuffer m_Buffer ;

/** Buffer location

A pre-existing GeglBuffer to write incoming buffer data to.

Unit: 
Default value: 
Acceptable Range:  
*/
    public WriteBuffer setBuffer(GeglBuffer value)
    {
	
        m_Buffer = value;
        setProperty("buffer", value);
        return this;
    }

/** Buffer location

A pre-existing GeglBuffer to write incoming buffer data to.

Unit: 
Default value: 
Acceptable Range:  
*/
    public GeglBuffer getBuffer()
    {
        return m_Buffer;
    }


}
