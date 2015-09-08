package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**
Noise Reduction

Anisotropic smoothing operation

License: 
Supports OpenCL: true
Position Dependant: 
*/
public class NoiseReduction extends GeglFilter
{
/** Constructs a Noise Reduction.

Anisotropic smoothing operation
*/
    public NoiseReduction(GeglNode container)
    {
        super(container, "gegl:noise-reduction");
    }
/** Constructs a Noise Reduction.

Anisotropic smoothing operation
*/
    public NoiseReduction(GeglFilter parent)
    {
        super(parent, "gegl:noise-reduction");
    }

    
/** Strength

Controls the number of iterations; lower values give less plastic results

Unit: 
Default value: 4
Acceptable Range: 1 32
*/
    private int m_Iterations  = 4;

/** Strength

Controls the number of iterations; lower values give less plastic results

Unit: 
Default value: 4
Acceptable Range: 1 32
*/
    public NoiseReduction setIterations(int value) throws ParameterOutOfRangeException
    {
		if(value > 32 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 32);
	}

        m_Iterations = value;
        setProperty("iterations", value);
        return this;
    }

/** Strength

Controls the number of iterations; lower values give less plastic results

Unit: 
Default value: 4
Acceptable Range: 1 32
*/
    public int getIterations()
    {
        return m_Iterations;
    }


}

