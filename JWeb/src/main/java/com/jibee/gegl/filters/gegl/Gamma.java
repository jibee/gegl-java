package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Gamma

Math operation gamma, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = powf (input, value))

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Gamma extends GeglFilter
{
/** Constructs a Gamma.

Math operation gamma, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = powf (input, value))
*/
    public Gamma(GeglNode container)
    {
        super(container, "gegl:gamma");
    }
/** Constructs a Gamma.

Math operation gamma, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = powf (input, value))
*/
    public Gamma(GeglFilter parent)
    {
        super(parent, "gegl:gamma");
    }

    
/** Value

global value used if aux doesn't contain data

Unit: 
Default value: 1.00
Acceptable Range:  
*/
    private double m_Value  = 1.00;

/** Value

global value used if aux doesn't contain data

Unit: 
Default value: 1.00
Acceptable Range:  
*/
    public Gamma setValue(double value)
    {
	
        m_Value = value;
        setProperty("value", value);
        return this;
    }

/** Value

global value used if aux doesn't contain data

Unit: 
Default value: 1.00
Acceptable Range:  
*/
    public double getValue()
    {
        return m_Value;
    }


}

