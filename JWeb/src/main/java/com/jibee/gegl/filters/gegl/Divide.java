package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**
Divide

Math operation divide, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = value==0.0f?0.0f:input/value)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Divide extends GeglFilter
{
/** Constructs a Divide.

Math operation divide, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = value==0.0f?0.0f:input/value)
*/
    public Divide(GeglNode container)
    {
        super(container, "gegl:divide");
    }
/** Constructs a Divide.

Math operation divide, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = value==0.0f?0.0f:input/value)
*/
    public Divide(GeglFilter parent)
    {
        super(parent, "gegl:divide");
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
    public Divide setValue(double value)
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

