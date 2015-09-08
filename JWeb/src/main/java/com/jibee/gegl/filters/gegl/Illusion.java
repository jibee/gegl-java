package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Illusion

Superimpose many altered copies of the image.

License: GPL3+
Supports OpenCL: 
Position Dependant: 
*/
public class Illusion extends GeglFilter
{
/** Constructs a Illusion.

Superimpose many altered copies of the image.
*/
    public Illusion(GeglNode container)
    {
        super(container, "gegl:illusion");
    }
/** Constructs a Illusion.

Superimpose many altered copies of the image.
*/
    public Illusion(GeglFilter parent)
    {
        super(parent, "gegl:illusion");
    }

    
/** Division

The number of divisions

Unit: 
Default value: 8
Acceptable Range:  64
*/
    private int m_Division  = 8;

/** Division

The number of divisions

Unit: 
Default value: 8
Acceptable Range:  64
*/
    public Illusion setDivision(int value) throws ParameterOutOfRangeException
    {
		if(value > 64)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 64);
	}

        m_Division = value;
        setProperty("division", value);
        return this;
    }

/** Division

The number of divisions

Unit: 
Default value: 8
Acceptable Range:  64
*/
    public int getDivision()
    {
        return m_Division;
    }


/** Illusion type

Type of illusion

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_IllusionType ;

/** Illusion type

Type of illusion

Unit: 
Default value: 
Acceptable Range:  
*/
    public Illusion setIllusionType(String value)
    {
	
        m_IllusionType = value;
        setProperty("illusion-type", value);
        return this;
    }

/** Illusion type

Type of illusion

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getIllusionType()
    {
        return m_IllusionType;
    }


}

