package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Subtract
 *
 * Math operation subtract, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. The result is the evaluation of the expression result = input - value
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "math"})
public class Subtract extends GeglFilter implements CombiningFilter
{
    /** Constructs a Subtract.
     *
     * Math operation subtract, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. The result is the evaluation of the expression result = input - value
     *
     * @param container container node
     */
    public Subtract(GeglNode container)
    {
        super(container, "gegl:subtract");
    }
    /** Constructs a Subtract.
     *
     * Math operation subtract, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. The result is the evaluation of the expression result = input - value
     *
     * @param parent parent filter node
     */
    public Subtract(GeglFilter parent)
    {
        super(parent, "gegl:subtract");
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
     *
     * @param value new value for Value
     * @return this filter (for chaining operations)
     * 
     */
    public Subtract setValue(double value)
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
     *
     * @return value of Value
     * 
     */
    public double getValue()
    {
        return m_Value;
    }

    @Override
    public InputPad<Subtract> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Subtract> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Subtract> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

