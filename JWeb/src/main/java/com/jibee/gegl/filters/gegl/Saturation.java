package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Saturation
 *
 * Changes the saturation
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class Saturation extends GeglFilter implements Source, Sink
{
    /** Constructs a Saturation.
     *
     * Changes the saturation
     */
    public Saturation(GeglNode container)
    {
        super(container, "gegl:saturation");
    }
    /** Constructs a Saturation.
     *
     * Changes the saturation
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
     */
    public double getScale()
    {
        return m_Scale;
    }

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

