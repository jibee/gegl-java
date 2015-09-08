package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**


Scales the buffer according to a ratio.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class ScaleRatio extends GeglFilter
{
/** Constructs a .

Scales the buffer according to a ratio.
*/
    public ScaleRatio(GeglNode container)
    {
        super(container, "gegl:scale-ratio");
    }
/** Constructs a .

Scales the buffer according to a ratio.
*/
    public ScaleRatio(GeglFilter parent)
    {
        super(parent, "gegl:scale-ratio");
    }

    
/** Origin-x

X coordinate of origin

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    private double m_OriginX  = 0.00;

/** Origin-x

X coordinate of origin

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public ScaleRatio setOriginX(double value)
    {
	
        m_OriginX = value;
        setProperty("origin-x", value);
        return this;
    }

/** Origin-x

X coordinate of origin

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public double getOriginX()
    {
        return m_OriginX;
    }


/** Origin-y

Y coordinate of origin

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    private double m_OriginY  = 0.00;

/** Origin-y

Y coordinate of origin

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public ScaleRatio setOriginY(double value)
    {
	
        m_OriginY = value;
        setProperty("origin-y", value);
        return this;
    }

/** Origin-y

Y coordinate of origin

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public double getOriginY()
    {
        return m_OriginY;
    }


/** Sampler

Sampler used internally

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Sampler ;

/** Sampler

Sampler used internally

Unit: 
Default value: 
Acceptable Range:  
*/
    public ScaleRatio setSampler(String value)
    {
	
        m_Sampler = value;
        setProperty("sampler", value);
        return this;
    }

/** Sampler

Sampler used internally

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getSampler()
    {
        return m_Sampler;
    }


/** x

Horizontal scale factor

Unit: 
Default value: 1.00
Acceptable Range:  
*/
    private double m_X  = 1.00;

/** x

Horizontal scale factor

Unit: 
Default value: 1.00
Acceptable Range:  
*/
    public ScaleRatio setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

/** x

Horizontal scale factor

Unit: 
Default value: 1.00
Acceptable Range:  
*/
    public double getX()
    {
        return m_X;
    }


/** y

Vertical scale factor

Unit: 
Default value: 1.00
Acceptable Range:  
*/
    private double m_Y  = 1.00;

/** y

Vertical scale factor

Unit: 
Default value: 1.00
Acceptable Range:  
*/
    public ScaleRatio setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

/** y

Vertical scale factor

Unit: 
Default value: 1.00
Acceptable Range:  
*/
    public double getY()
    {
        return m_Y;
    }


}

