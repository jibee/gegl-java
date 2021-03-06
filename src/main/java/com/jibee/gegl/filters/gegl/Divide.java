package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Divide
 *
 * Math operation divide, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. The result is the evaluation of the expression result = value==0.0f?0.0f:input/value
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "math"})
public class Divide extends GeglFilter implements CombiningFilter
{
    /** Constructs a Divide.
     *
     * Math operation divide, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. The result is the evaluation of the expression result = value==0.0f?0.0f:input/value
     *
     * @param container container node
     */
    public Divide(GeglNode container)
    {
        super(container, "gegl:divide");
    }
    /** Constructs a Divide.
     *
     * Math operation divide, performs the operation per pixel, using either the constant provided in 'value' or the corresponding pixel from the buffer on aux as operands. The result is the evaluation of the expression result = value==0.0f?0.0f:input/value
     *
     * @param parent parent filter node
     */
    public Divide(GeglFilter parent)
    {
        super(parent, "gegl:divide");
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
    public Divide setValue(double value)
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
    public InputPad<Divide> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Divide> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Divide> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

