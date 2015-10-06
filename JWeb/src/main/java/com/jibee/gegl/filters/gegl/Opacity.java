package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**
Opacity

Weights the opacity of the input both the value of the aux input and the global value property.

License: 
Supports OpenCL: true
Position Dependant: 
*/
public class Opacity extends GeglFilter
{
/** Constructs a Opacity.

Weights the opacity of the input both the value of the aux input and the global value property.
*/
    public Opacity(GeglNode container)
    {
        super(container, "gegl:opacity");
    }
/** Constructs a Opacity.

Weights the opacity of the input both the value of the aux input and the global value property.
*/
    public Opacity(GeglFilter parent)
    {
        super(parent, "gegl:opacity");
    }

    
/** Opacity

Global opacity value that is always used on top of the optional auxiliary input buffer.

Unit: 
Default value: 1.00
Acceptable Range: -10.00 10.00
*/
    private double m_Value  = 1.00;

/** Opacity

Global opacity value that is always used on top of the optional auxiliary input buffer.

Unit: 
Default value: 1.00
Acceptable Range: -10.00 10.00
*/
    public Opacity setValue(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < -10.00)
	{
	    throw new ParameterOutOfRangeException(value, -10.00, 10.00);
	}

        m_Value = value;
        setProperty("value", value);
        return this;
    }

/** Opacity

Global opacity value that is always used on top of the optional auxiliary input buffer.

Unit: 
Default value: 1.00
Acceptable Range: -10.00 10.00
*/
    public double getValue()
    {
        return m_Value;
    }


}
