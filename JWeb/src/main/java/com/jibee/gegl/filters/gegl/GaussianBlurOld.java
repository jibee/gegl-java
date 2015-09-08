package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**
Gaussian Blur

Each result pixel is the average of the neighbouring pixels weighted by a normal distribution with specified standard deviation.

License: 
Supports OpenCL: true
Position Dependant: 
*/
public class GaussianBlurOld extends GeglFilter
{
/** Constructs a Gaussian Blur.

Each result pixel is the average of the neighbouring pixels weighted by a normal distribution with specified standard deviation.
*/
    public GaussianBlurOld(GeglNode container)
    {
        super(container, "gegl:gaussian-blur-old");
    }
/** Constructs a Gaussian Blur.

Each result pixel is the average of the neighbouring pixels weighted by a normal distribution with specified standard deviation.
*/
    public GaussianBlurOld(GeglFilter parent)
    {
        super(parent, "gegl:gaussian-blur-old");
    }

    
/** Size X

Standard deviation for the horizontal axis

Unit: pixel-distance
Default value: 1.50
Acceptable Range: 0.00 1500.00
*/
    private double m_StdDevX  = 1.50;

/** Size X

Standard deviation for the horizontal axis

Unit: pixel-distance
Default value: 1.50
Acceptable Range: 0.00 1500.00
*/
    public GaussianBlurOld setStdDevX(double value) throws ParameterOutOfRangeException
    {
		if(value > 1500.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1500.00);
	}

        m_StdDevX = value;
        setProperty("std-dev-x", value);
        return this;
    }

/** Size X

Standard deviation for the horizontal axis

Unit: pixel-distance
Default value: 1.50
Acceptable Range: 0.00 1500.00
*/
    public double getStdDevX()
    {
        return m_StdDevX;
    }


/** Size Y

Standard deviation for the vertical axis

Unit: pixel-distance
Default value: 1.50
Acceptable Range: 0.00 1500.00
*/
    private double m_StdDevY  = 1.50;

/** Size Y

Standard deviation for the vertical axis

Unit: pixel-distance
Default value: 1.50
Acceptable Range: 0.00 1500.00
*/
    public GaussianBlurOld setStdDevY(double value) throws ParameterOutOfRangeException
    {
		if(value > 1500.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1500.00);
	}

        m_StdDevY = value;
        setProperty("std-dev-y", value);
        return this;
    }

/** Size Y

Standard deviation for the vertical axis

Unit: pixel-distance
Default value: 1.50
Acceptable Range: 0.00 1500.00
*/
    public double getStdDevY()
    {
        return m_StdDevY;
    }


/** Filter

Optional parameter to override the automatic selection of blur filter

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Filter ;

/** Filter

Optional parameter to override the automatic selection of blur filter

Unit: 
Default value: 
Acceptable Range:  
*/
    public GaussianBlurOld setFilter(String value)
    {
	
        m_Filter = value;
        setProperty("filter", value);
        return this;
    }

/** Filter

Optional parameter to override the automatic selection of blur filter

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getFilter()
    {
        return m_Filter;
    }


}

