package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Bilateral Box Filter

A fast approximation of bilateral filter, using a box-filter instead of a gaussian blur.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class BilateralFilterFast extends GeglFilter
{
/** Constructs a Bilateral Box Filter.

A fast approximation of bilateral filter, using a box-filter instead of a gaussian blur.
*/
    public BilateralFilterFast(GeglNode container)
    {
        super(container, "gegl:bilateral-filter-fast");
    }
/** Constructs a Bilateral Box Filter.

A fast approximation of bilateral filter, using a box-filter instead of a gaussian blur.
*/
    public BilateralFilterFast(GeglFilter parent)
    {
        super(parent, "gegl:bilateral-filter-fast");
    }

    
/** Smoothness

Level of smoothness

Unit: 
Default value: 50.00
Acceptable Range: 1.00 100.00
*/
    private double m_RSigma  = 50.00;

/** Smoothness

Level of smoothness

Unit: 
Default value: 50.00
Acceptable Range: 1.00 100.00
*/
    public BilateralFilterFast setRSigma(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 100.00);
	}

        m_RSigma = value;
        setProperty("r-sigma", value);
        return this;
    }

/** Smoothness

Level of smoothness

Unit: 
Default value: 50.00
Acceptable Range: 1.00 100.00
*/
    public double getRSigma()
    {
        return m_RSigma;
    }


/** Blur radius

Radius of square pixel region, (width and height will be radius*2+1).

Unit: 
Default value: 8
Acceptable Range: 1 100
*/
    private int m_SSigma  = 8;

/** Blur radius

Radius of square pixel region, (width and height will be radius*2+1).

Unit: 
Default value: 8
Acceptable Range: 1 100
*/
    public BilateralFilterFast setSSigma(int value) throws ParameterOutOfRangeException
    {
		if(value > 100 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 100);
	}

        m_SSigma = value;
        setProperty("s-sigma", value);
        return this;
    }

/** Blur radius

Radius of square pixel region, (width and height will be radius*2+1).

Unit: 
Default value: 8
Acceptable Range: 1 100
*/
    public int getSSigma()
    {
        return m_SSigma;
    }


}

