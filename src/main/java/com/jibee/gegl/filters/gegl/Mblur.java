package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Temporal blur
 *
 * Accumulating motion blur using a kalman filter, for use with video sequences of frames.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"blur", "video"})
public class Mblur extends GeglFilter implements Filter
{
    /** Constructs a Temporal blur.
     *
     * Accumulating motion blur using a kalman filter, for use with video sequences of frames.
     *
     * @param container container node
     */
    public Mblur(GeglNode container)
    {
        super(container, "gegl:mblur");
    }
    /** Constructs a Temporal blur.
     *
     * Accumulating motion blur using a kalman filter, for use with video sequences of frames.
     *
     * @param parent parent filter node
     */
    public Mblur(GeglFilter parent)
    {
        super(parent, "gegl:mblur");
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
     *
     * @param value new value for Dampness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mblur setDampness(double value) throws ParameterOutOfRangeException
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
     *
     * @return value of Dampness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

