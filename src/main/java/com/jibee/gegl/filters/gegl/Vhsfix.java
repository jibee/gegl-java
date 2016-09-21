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
 * vhs glitch fixer
 *
 * fixes vhs digitization glitches
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"video"})
public class Vhsfix extends GeglFilter implements Source, Sink
{
    /** Constructs a vhs glitch fixer.
     *
     * fixes vhs digitization glitches
     */
    public Vhsfix(GeglNode container)
    {
        super(container, "gegl:vhsfix");
    }
    /** Constructs a vhs glitch fixer.
     *
     * fixes vhs digitization glitches
     */
    public Vhsfix(GeglFilter parent)
    {
        super(parent, "gegl:vhsfix");
    }

    
    /** Dampness
     *
     * The value represents the contribution of the past to the new frame.
     *
     * Unit: 
     * Default value: 0.95
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Dampness  = 0.95;

    /** Dampness
     *
     * The value represents the contribution of the past to the new frame.
     *
     * Unit: 
     * Default value: 0.95
     * Acceptable Range: 0.00 1.00
     */
    public Vhsfix setDampness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Dampness = value;
        setProperty("dampness", value);
        return this;
    }

    /** Dampness
     *
     * The value represents the contribution of the past to the new frame.
     *
     * Unit: 
     * Default value: 0.95
     * Acceptable Range: 0.00 1.00
     */
    public double getDampness()
    {
        return m_Dampness;
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

