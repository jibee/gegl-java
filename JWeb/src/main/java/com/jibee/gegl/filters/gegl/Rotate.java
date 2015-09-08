package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**


Rotate the buffer around the specified origin.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Rotate extends GeglFilter
{
/** Constructs a .

Rotate the buffer around the specified origin.
*/
    public Rotate(GeglNode container)
    {
        super(container, "gegl:rotate");
    }
/** Constructs a .

Rotate the buffer around the specified origin.
*/
    public Rotate(GeglFilter parent)
    {
        super(parent, "gegl:rotate");
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
    public Rotate setOriginX(double value)
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
    public Rotate setOriginY(double value)
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
    public Rotate setSampler(String value)
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


/** degrees

Angle to rotate (clockwise)

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    private double m_Degrees  = 0.00;

/** degrees

Angle to rotate (clockwise)

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public Rotate setDegrees(double value)
    {
	
        m_Degrees = value;
        setProperty("degrees", value);
        return this;
    }

/** degrees

Angle to rotate (clockwise)

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public double getDegrees()
    {
        return m_Degrees;
    }


}

