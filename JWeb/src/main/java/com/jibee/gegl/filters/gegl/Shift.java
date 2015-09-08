package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Shift

Shift each row or column of pixels by a random amount

License: GPL3+
Supports OpenCL: 
Position Dependant: 
*/
public class Shift extends GeglFilter
{
/** Constructs a Shift.

Shift each row or column of pixels by a random amount
*/
    public Shift(GeglNode container)
    {
        super(container, "gegl:shift");
    }
/** Constructs a Shift.

Shift each row or column of pixels by a random amount
*/
    public Shift(GeglFilter parent)
    {
        super(parent, "gegl:shift");
    }

    
/** Shift

Maximum amount to shift

Unit: pixel-distance
Default value: 5
Acceptable Range:  200
*/
    private int m_Shift  = 5;

/** Shift

Maximum amount to shift

Unit: pixel-distance
Default value: 5
Acceptable Range:  200
*/
    public Shift setShift(int value) throws ParameterOutOfRangeException
    {
		if(value > 200)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 200);
	}

        m_Shift = value;
        setProperty("shift", value);
        return this;
    }

/** Shift

Maximum amount to shift

Unit: pixel-distance
Default value: 5
Acceptable Range:  200
*/
    public int getShift()
    {
        return m_Shift;
    }


/** Shift direction



Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Direction ;

/** Shift direction



Unit: 
Default value: 
Acceptable Range:  
*/
    public Shift setDirection(String value)
    {
	
        m_Direction = value;
        setProperty("direction", value);
        return this;
    }

/** Shift direction



Unit: 
Default value: 
Acceptable Range:  
*/
    public String getDirection()
    {
        return m_Direction;
    }


/** Random seed



Unit: 
Default value: 
Acceptable Range:  
*/
    private int m_Seed ;

/** Random seed



Unit: 
Default value: 
Acceptable Range:  
*/
    public Shift setSeed(int value)
    {
	
        m_Seed = value;
        setProperty("seed", value);
        return this;
    }

/** Random seed



Unit: 
Default value: 
Acceptable Range:  
*/
    public int getSeed()
    {
        return m_Seed;
    }


}

