package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Opacity
 *
 * Weights the opacity of the input both the value of the aux input and the global value property.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=true, position_dependant=false, categories={"transparency"})
public class Opacity extends GeglFilter implements CombiningFilter
{
    /** Constructs a Opacity.
     *
     * Weights the opacity of the input both the value of the aux input and the global value property.
     *
     * @param container container node
     */
    public Opacity(GeglNode container)
    {
        super(container, "gegl:opacity");
    }
    /** Constructs a Opacity.
     *
     * Weights the opacity of the input both the value of the aux input and the global value property.
     *
     * @param parent parent filter node
     */
    public Opacity(GeglFilter parent)
    {
        super(parent, "gegl:opacity");
    }

    
    /** Opacity
     *
     * Global opacity value that is always used on top of the optional auxiliary input buffer.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -10.00 10.00
     * */
    private double m_Value  = 1.00;

    /** Opacity
     *
     * Global opacity value that is always used on top of the optional auxiliary input buffer.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -10.00 10.00
     *
     * @param value new value for Opacity
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * Global opacity value that is always used on top of the optional auxiliary input buffer.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -10.00 10.00
     *
     * @return value of Opacity
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getValue()
    {
        return m_Value;
    }

    @Override
    public InputPad<Opacity> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Opacity> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Opacity> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

