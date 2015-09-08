package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**




License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Reflect extends GeglFilter
{
/** Constructs a .


*/
    public Reflect(GeglNode container)
    {
        super(container, "gegl:reflect");
    }
/** Constructs a .


*/
    public Reflect(GeglFilter parent)
    {
        super(parent, "gegl:reflect");
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
    public Reflect setOriginX(double value)
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
    public Reflect setOriginY(double value)
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
    public Reflect setSampler(String value)
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

Direction vector's X component

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    private double m_X  = 0.00;

/** x

Direction vector's X component

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public Reflect setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

/** x

Direction vector's X component

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public double getX()
    {
        return m_X;
    }


/** y

Direction vector's Y component

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    private double m_Y  = 0.00;

/** y

Direction vector's Y component

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public Reflect setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

/** y

Direction vector's Y component

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public double getY()
    {
        return m_Y;
    }


}

