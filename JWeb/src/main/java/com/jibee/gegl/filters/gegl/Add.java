package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Add
 *
 * Math operation add, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = input + value)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "math"})
public class Add extends GeglFilter
{
    /** Constructs a Add.
     *
     * Math operation add, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = input + value)
     */
    public Add(GeglNode container)
    {
        super(container, "gegl:add");
    }
    /** Constructs a Add.
     *
     * Math operation add, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. (formula: result = input + value)
     */
    public Add(GeglFilter parent)
    {
        super(parent, "gegl:add");
    }

    
    /** Value
     *
     * global value used if aux doesn't contain data
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Value  = 0.00;

    /** Value
     *
     * global value used if aux doesn't contain data
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public Add setValue(double value)
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
     * Default value: 0.00
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

