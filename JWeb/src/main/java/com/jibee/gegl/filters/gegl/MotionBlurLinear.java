package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**
Linear Motion Blur

Blur pixels in a direction, simulates blurring caused by moving camera in a straight line during exposure.

License: 
Supports OpenCL: true
Position Dependant: 
*/
public class MotionBlurLinear extends GeglFilter
{
/** Constructs a Linear Motion Blur.

Blur pixels in a direction, simulates blurring caused by moving camera in a straight line during exposure.
*/
    public MotionBlurLinear(GeglNode container)
    {
        super(container, "gegl:motion-blur-linear");
    }
/** Constructs a Linear Motion Blur.

Blur pixels in a direction, simulates blurring caused by moving camera in a straight line during exposure.
*/
    public MotionBlurLinear(GeglFilter parent)
    {
        super(parent, "gegl:motion-blur-linear");
    }

    
/** Length

Length of blur in pixels

Unit: pixel-distance
Default value: 10.00
Acceptable Range: 0.00 1000.00
*/
    private double m_Length  = 10.00;

/** Length

Length of blur in pixels

Unit: pixel-distance
Default value: 10.00
Acceptable Range: 0.00 1000.00
*/
    public MotionBlurLinear setLength(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1000.00);
	}

        m_Length = value;
        setProperty("length", value);
        return this;
    }

/** Length

Length of blur in pixels

Unit: pixel-distance
Default value: 10.00
Acceptable Range: 0.00 1000.00
*/
    public double getLength()
    {
        return m_Length;
    }


/** Angle

Angle of blur in degrees

Unit: degree
Default value: 0.00
Acceptable Range: -180.00 180.00
*/
    private double m_Angle  = 0.00;

/** Angle

Angle of blur in degrees

Unit: degree
Default value: 0.00
Acceptable Range: -180.00 180.00
*/
    public MotionBlurLinear setAngle(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < -180.00)
	{
	    throw new ParameterOutOfRangeException(value, -180.00, 180.00);
	}

        m_Angle = value;
        setProperty("angle", value);
        return this;
    }

/** Angle

Angle of blur in degrees

Unit: degree
Default value: 0.00
Acceptable Range: -180.00 180.00
*/
    public double getAngle()
    {
        return m_Angle;
    }


}

