package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**
Combine Exposures

Combine multiple scene exposures into one high dynamic range image.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class ExpCombine extends GeglFilter
{
/** Constructs a Combine Exposures.

Combine multiple scene exposures into one high dynamic range image.
*/
    public ExpCombine(GeglNode container)
    {
        super(container, "gegl:exp-combine");
    }
/** Constructs a Combine Exposures.

Combine multiple scene exposures into one high dynamic range image.
*/
    public ExpCombine(GeglFilter parent)
    {
        super(parent, "gegl:exp-combine");
    }

    
/** Exposure values

Relative brightness of each exposure in EV

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Exposures ;

/** Exposure values

Relative brightness of each exposure in EV

Unit: 
Default value: 
Acceptable Range:  
*/
    public ExpCombine setExposures(String value)
    {
	
        m_Exposures = value;
        setProperty("exposures", value);
        return this;
    }

/** Exposure values

Relative brightness of each exposure in EV

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getExposures()
    {
        return m_Exposures;
    }


/** Discretization bits

Log2 of source's discretization steps

Unit: 
Default value: 13
Acceptable Range: 8 32
*/
    private int m_Steps  = 13;

/** Discretization bits

Log2 of source's discretization steps

Unit: 
Default value: 13
Acceptable Range: 8 32
*/
    public ExpCombine setSteps(int value) throws ParameterOutOfRangeException
    {
		if(value > 32 || value < 8)
	{
	    throw new ParameterOutOfRangeException(value, 8, 32);
	}

        m_Steps = value;
        setProperty("steps", value);
        return this;
    }

/** Discretization bits

Log2 of source's discretization steps

Unit: 
Default value: 13
Acceptable Range: 8 32
*/
    public int getSteps()
    {
        return m_Steps;
    }


/** Weight sigma

Weight distribution sigma controlling response contributions

Unit: 
Default value: 8.00
Acceptable Range: 0.00 32.00
*/
    private double m_Sigma  = 8.00;

/** Weight sigma

Weight distribution sigma controlling response contributions

Unit: 
Default value: 8.00
Acceptable Range: 0.00 32.00
*/
    public ExpCombine setSigma(double value) throws ParameterOutOfRangeException
    {
		if(value > 32.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 32.00);
	}

        m_Sigma = value;
        setProperty("sigma", value);
        return this;
    }

/** Weight sigma

Weight distribution sigma controlling response contributions

Unit: 
Default value: 8.00
Acceptable Range: 0.00 32.00
*/
    public double getSigma()
    {
        return m_Sigma;
    }


}

