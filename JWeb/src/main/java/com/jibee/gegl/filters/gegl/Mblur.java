package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Temporal blur

Accumulating motion blur using a kalman filter, for use with video sequences of frames.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Mblur extends GeglFilter
{
/** Constructs a Temporal blur.

Accumulating motion blur using a kalman filter, for use with video sequences of frames.
*/
    public Mblur(GeglNode container)
    {
        super(container, "gegl:mblur");
    }
/** Constructs a Temporal blur.

Accumulating motion blur using a kalman filter, for use with video sequences of frames.
*/
    public Mblur(GeglFilter parent)
    {
        super(parent, "gegl:mblur");
    }

    
/** Dampness

The value represents the contribution of the past to the new frame.

Unit: 
Default value: 0.95
Acceptable Range: 0.00 1.00
*/
    private double m_Dampness  = 0.95;

/** Dampness

The value represents the contribution of the past to the new frame.

Unit: 
Default value: 0.95
Acceptable Range: 0.00 1.00
*/
    public Mblur setDampness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Dampness = value;
        setProperty("dampness", value);
        return this;
    }

/** Dampness

The value represents the contribution of the past to the new frame.

Unit: 
Default value: 0.95
Acceptable Range: 0.00 1.00
*/
    public double getDampness()
    {
        return m_Dampness;
    }


}

