package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Multiply
 *
 * Math operation multiply, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = input * value)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "math"})
public class Multiply extends GeglFilter
{
    /** Constructs a Multiply.
     *
     * Math operation multiply, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = input * value)
     */
    public Multiply(GeglNode container)
    {
        super(container, "gegl:multiply");
    }
    /** Constructs a Multiply.
     *
     * Math operation multiply, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = input * value)
     */
    public Multiply(GeglFilter parent)
    {
        super(parent, "gegl:multiply");
    }

    
    /** Value
     *
     * global value used if aux doesn't contain data
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     * */
    private double m_Value  = 1.00;

    /** Value
     *
     * global value used if aux doesn't contain data
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public Multiply setValue(double value)
    {
	
        m_Value = value;
        setProperty("value", value);
        return this;
    }

    /** Value
     *
     * global value used if aux doesn't contain data
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public double getValue()
    {
        return m_Value;
    }

    public InputPad aux()
    {
        return new InputPad(this, "aux");
    }

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

