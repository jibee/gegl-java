package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglCurve;
import com.jibee.gegl.GeglNode;

/**
Contrast Curve

Adjusts the contrast of a grayscale image with a curve specifying contrast for intensity.

License: 
Supports OpenCL: true
Position Dependant: 
*/
public class ContrastCurve extends GeglFilter
{
/** Constructs a Contrast Curve.

Adjusts the contrast of a grayscale image with a curve specifying contrast for intensity.
*/
    public ContrastCurve(GeglNode container)
    {
        super(container, "gegl:contrast-curve");
    }
/** Constructs a Contrast Curve.

Adjusts the contrast of a grayscale image with a curve specifying contrast for intensity.
*/
    public ContrastCurve(GeglFilter parent)
    {
        super(parent, "gegl:contrast-curve");
    }

    
/** Sample points

Number of curve sampling points.  0 for exact calculation.

Unit: 
Default value: 
Acceptable Range:  65536
*/
    private int m_SamplingPoints ;

/** Sample points

Number of curve sampling points.  0 for exact calculation.

Unit: 
Default value: 
Acceptable Range:  65536
*/
    public ContrastCurve setSamplingPoints(int value) throws ParameterOutOfRangeException
    {
		if(value > 65536)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 65536);
	}

        m_SamplingPoints = value;
        setProperty("sampling-points", value);
        return this;
    }

/** Sample points

Number of curve sampling points.  0 for exact calculation.

Unit: 
Default value: 
Acceptable Range:  65536
*/
    public int getSamplingPoints()
    {
        return m_SamplingPoints;
    }


/** Curve

The contrast curve.

Unit: 
Default value: 
Acceptable Range:  
*/
    private GeglCurve m_Curve ;

/** Curve

The contrast curve.

Unit: 
Default value: 
Acceptable Range:  
*/
    public ContrastCurve setCurve(GeglCurve value)
    {
	
        m_Curve = value;
        setProperty("curve", value);
        return this;
    }

/** Curve

The contrast curve.

Unit: 
Default value: 
Acceptable Range:  
*/
    public GeglCurve getCurve()
    {
        return m_Curve;
    }


}

