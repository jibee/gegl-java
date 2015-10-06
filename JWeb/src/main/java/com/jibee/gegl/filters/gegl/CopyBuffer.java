package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Copy Buffer

Writes image data to an already existing buffer

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class CopyBuffer extends GeglFilter
{
/** Constructs a Copy Buffer.

Writes image data to an already existing buffer
*/
    public CopyBuffer(GeglNode container)
    {
        super(container, "gegl:copy-buffer");
    }
/** Constructs a Copy Buffer.

Writes image data to an already existing buffer
*/
    public CopyBuffer(GeglFilter parent)
    {
        super(parent, "gegl:copy-buffer");
    }

    
/** Buffer

An already existing GeglBuffer to write incoming buffer data to, or NULL.

Unit: 
Default value: 
Acceptable Range:  
*/
    private GeglBuffer m_Buffer ;

/** Buffer

An already existing GeglBuffer to write incoming buffer data to, or NULL.

Unit: 
Default value: 
Acceptable Range:  
*/
    public CopyBuffer setBuffer(GeglBuffer value)
    {
	
        m_Buffer = value;
        setProperty("buffer", value);
        return this;
    }

/** Buffer

An already existing GeglBuffer to write incoming buffer data to, or NULL.

Unit: 
Default value: 
Acceptable Range:  
*/
    public GeglBuffer getBuffer()
    {
        return m_Buffer;
    }


}
