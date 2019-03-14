package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Saturation
 *
 * Changes the saturation
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class Saturation extends GeglFilter implements Filter
{
    /** Constructs a Saturation.
     *
     * Changes the saturation
     *
     * @param container container node
     */
    public Saturation(GeglNode container)
    {
        super(container, "gegl:saturation");
    }
    /** Constructs a Saturation.
     *
     * Changes the saturation
     *
     * @param parent parent filter node
     */
    public Saturation(GeglFilter parent)
    {
        super(parent, "gegl:saturation");
    }

    
    /** Scale
     *
     * Scale, strength of effect
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 10.00
     * */
    private double m_Scale  = 1.00;

    /** Scale
     *
     * Scale, strength of effect
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 10.00
     *
     * @param value new value for Scale
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Saturation setScale(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 10.00);
	    }

        m_Scale = value;
        setProperty("scale", value);
        return this;
    }

    /** Scale
     *
     * Scale, strength of effect
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 10.00
     *
     * @return value of Scale
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getScale()
    {
        return m_Scale;
    }

    @Override
    public InputPad<Saturation> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Saturation> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

