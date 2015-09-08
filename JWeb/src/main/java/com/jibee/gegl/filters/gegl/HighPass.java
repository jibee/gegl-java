package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
High Pass Filter

Enhances fine details.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class HighPass extends GeglFilter
{
/** Constructs a High Pass Filter.

Enhances fine details.
*/
    public HighPass(GeglNode container)
    {
        super(container, "gegl:high-pass");
    }
/** Constructs a High Pass Filter.

Enhances fine details.
*/
    public HighPass(GeglFilter parent)
    {
        super(parent, "gegl:high-pass");
    }

    
/** Std. Dev.

Standard deviation (spatial scale factor)

Unit: 
Default value: 4.00
Acceptable Range: 0.00 10000.00
*/
    private double m_StdDev  = 4.00;

/** Std. Dev.

Standard deviation (spatial scale factor)

Unit: 
Default value: 4.00
Acceptable Range: 0.00 10000.00
*/
    public HighPass setStdDev(double value) throws ParameterOutOfRangeException
    {
		if(value > 10000.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 10000.00);
	}

        m_StdDev = value;
        setProperty("std-dev", value);
        return this;
    }

/** Std. Dev.

Standard deviation (spatial scale factor)

Unit: 
Default value: 4.00
Acceptable Range: 0.00 10000.00
*/
    public double getStdDev()
    {
        return m_StdDev;
    }


/** Contrast

Contrast of high-pass

Unit: 
Default value: 1.00
Acceptable Range: 0.00 5.00
*/
    private double m_Contrast  = 1.00;

/** Contrast

Contrast of high-pass

Unit: 
Default value: 1.00
Acceptable Range: 0.00 5.00
*/
    public HighPass setContrast(double value) throws ParameterOutOfRangeException
    {
		if(value > 5.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 5.00);
	}

        m_Contrast = value;
        setProperty("contrast", value);
        return this;
    }

/** Contrast

Contrast of high-pass

Unit: 
Default value: 1.00
Acceptable Range: 0.00 5.00
*/
    public double getContrast()
    {
        return m_Contrast;
    }


}

