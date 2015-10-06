package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**


Scales the buffer to a size, preserving aspect ratio

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class ScaleSizeKeepaspect extends GeglFilter
{
/** Constructs a .

Scales the buffer to a size, preserving aspect ratio
*/
    public ScaleSizeKeepaspect(GeglNode container)
    {
        super(container, "gegl:scale-size-keepaspect");
    }
/** Constructs a .

Scales the buffer to a size, preserving aspect ratio
*/
    public ScaleSizeKeepaspect(GeglFilter parent)
    {
        super(parent, "gegl:scale-size-keepaspect");
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
    public ScaleSizeKeepaspect setOriginX(double value)
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
    public ScaleSizeKeepaspect setOriginY(double value)
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
    public ScaleSizeKeepaspect setSampler(String value)
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

Horizontal size

Unit: 
Default value: -1.00
Acceptable Range:  
*/
    private double m_X  = -1.00;

/** x

Horizontal size

Unit: 
Default value: -1.00
Acceptable Range:  
*/
    public ScaleSizeKeepaspect setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

/** x

Horizontal size

Unit: 
Default value: -1.00
Acceptable Range:  
*/
    public double getX()
    {
        return m_X;
    }


/** y

Vertical size

Unit: 
Default value: -1.00
Acceptable Range:  
*/
    private double m_Y  = -1.00;

/** y

Vertical size

Unit: 
Default value: -1.00
Acceptable Range:  
*/
    public ScaleSizeKeepaspect setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

/** y

Vertical size

Unit: 
Default value: -1.00
Acceptable Range:  
*/
    public double getY()
    {
        return m_Y;
    }


}
