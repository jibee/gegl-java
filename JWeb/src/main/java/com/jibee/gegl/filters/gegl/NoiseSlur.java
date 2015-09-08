package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;

/**
Noise Slur

Randomly slide some pixels downward (similar to melting)

License: GPL3+
Supports OpenCL: 
Position Dependant: 
*/
public class NoiseSlur extends GeglFilter
{
/** Constructs a Noise Slur.

Randomly slide some pixels downward (similar to melting)
*/
    public NoiseSlur(GeglNode container)
    {
        super(container, "gegl:noise-slur");
    }
/** Constructs a Noise Slur.

Randomly slide some pixels downward (similar to melting)
*/
    public NoiseSlur(GeglFilter parent)
    {
        super(parent, "gegl:noise-slur");
    }

    
/** Randomization (%)



Unit: 
Default value: 50.00
Acceptable Range: 0.00 100.00
*/
    private double m_PctRandom  = 50.00;

/** Randomization (%)



Unit: 
Default value: 50.00
Acceptable Range: 0.00 100.00
*/
    public NoiseSlur setPctRandom(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	}

        m_PctRandom = value;
        setProperty("pct-random", value);
        return this;
    }

/** Randomization (%)



Unit: 
Default value: 50.00
Acceptable Range: 0.00 100.00
*/
    public double getPctRandom()
    {
        return m_PctRandom;
    }


/** Repeat



Unit: 
Default value: 1
Acceptable Range: 1 100
*/
    private int m_Repeat  = 1;

/** Repeat



Unit: 
Default value: 1
Acceptable Range: 1 100
*/
    public NoiseSlur setRepeat(int value) throws ParameterOutOfRangeException
    {
		if(value > 100 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 100);
	}

        m_Repeat = value;
        setProperty("repeat", value);
        return this;
    }

/** Repeat



Unit: 
Default value: 1
Acceptable Range: 1 100
*/
    public int getRepeat()
    {
        return m_Repeat;
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
    public NoiseSlur setSeed(int value)
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

