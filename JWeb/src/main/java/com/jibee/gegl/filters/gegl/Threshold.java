package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**
Threshold

Thresholds the image to white/black based on either the global value set in the value property, or per pixel from the aux input.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Threshold extends GeglFilter
{
/** Constructs a Threshold.

Thresholds the image to white/black based on either the global value set in the value property, or per pixel from the aux input.
*/
    public Threshold(GeglNode container)
    {
        super(container, "gegl:threshold");
    }
/** Constructs a Threshold.

Thresholds the image to white/black based on either the global value set in the value property, or per pixel from the aux input.
*/
    public Threshold(GeglFilter parent)
    {
        super(parent, "gegl:threshold");
    }

    
/** Threshold

Scalar threshold level (overriden if an auxiliary input buffer is provided.).

Unit: 
Default value: 0.50
Acceptable Range: -200.00 200.00
*/
    private double m_Value  = 0.50;

/** Threshold

Scalar threshold level (overriden if an auxiliary input buffer is provided.).

Unit: 
Default value: 0.50
Acceptable Range: -200.00 200.00
*/
    public Threshold setValue(double value) throws ParameterOutOfRangeException
    {
		if(value > 200.00 || value < -200.00)
	{
	    throw new ParameterOutOfRangeException(value, -200.00, 200.00);
	}

        m_Value = value;
        setProperty("value", value);
        return this;
    }

/** Threshold

Scalar threshold level (overriden if an auxiliary input buffer is provided.).

Unit: 
Default value: 0.50
Acceptable Range: -200.00 200.00
*/
    public double getValue()
    {
        return m_Value;
    }


}
