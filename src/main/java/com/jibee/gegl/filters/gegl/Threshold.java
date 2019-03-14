package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Threshold
 *
 * Thresholds the image to white/black based on either the global value set in the value property, or per pixel from the aux input.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class Threshold extends GeglFilter implements CombiningFilter
{
    /** Constructs a Threshold.
     *
     * Thresholds the image to white/black based on either the global value set in the value property, or per pixel from the aux input.
     *
     * @param container container node
     */
    public Threshold(GeglNode container)
    {
        super(container, "gegl:threshold");
    }
    /** Constructs a Threshold.
     *
     * Thresholds the image to white/black based on either the global value set in the value property, or per pixel from the aux input.
     *
     * @param parent parent filter node
     */
    public Threshold(GeglFilter parent)
    {
        super(parent, "gegl:threshold");
    }

    
    /** Threshold
     *
     * Scalar threshold level (overridden if an auxiliary input buffer is provided.).
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -200.00 200.00
     * */
    private double m_Value  = 0.50;

    /** Threshold
     *
     * Scalar threshold level (overridden if an auxiliary input buffer is provided.).
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -200.00 200.00
     *
     * @param value new value for Threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * Scalar threshold level (overridden if an auxiliary input buffer is provided.).
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -200.00 200.00
     *
     * @return value of Threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getValue()
    {
        return m_Value;
    }

    @Override
    public InputPad<Threshold> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Threshold> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Threshold> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

