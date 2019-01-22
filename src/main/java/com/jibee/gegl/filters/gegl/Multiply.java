package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Multiply
 *
 * Math operation multiply, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. The result is the evaluation of the expression result = input * value
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "math"})
public class Multiply extends GeglFilter implements CombiningFilter
{
    /** Constructs a Multiply.
     *
     * Math operation multiply, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. The result is the evaluation of the expression result = input * value
     *
     * @param container container node
     */
    public Multiply(GeglNode container)
    {
        super(container, "gegl:multiply");
    }
    /** Constructs a Multiply.
     *
     * Math operation multiply, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. The result is the evaluation of the expression result = input * value
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Value
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Value
     * 
     */
    public double getValue()
    {
        return m_Value;
    }

    @Override
    public InputPad Aux()
    {
        return new InputPad(this, "aux");
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

