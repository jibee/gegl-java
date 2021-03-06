package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Selective Gaussian Blur
 *
 * Blur neighboring pixels, but only in low-contrast areas
 * 
 * License: GPL3+
 * Supports OpenCL: true
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=true, position_dependant=false, categories={"enhance", "noise-reduction"})
public class GaussianBlurSelective extends GeglFilter implements CombiningFilter
{
    /** Constructs a Selective Gaussian Blur.
     *
     * Blur neighboring pixels, but only in low-contrast areas
     *
     * @param container container node
     */
    public GaussianBlurSelective(GeglNode container)
    {
        super(container, "gegl:gaussian-blur-selective");
    }
    /** Constructs a Selective Gaussian Blur.
     *
     * Blur neighboring pixels, but only in low-contrast areas
     *
     * @param parent parent filter node
     */
    public GaussianBlurSelective(GeglFilter parent)
    {
        super(parent, "gegl:gaussian-blur-selective");
    }

    
    /** Blur radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1).
     *
     * Unit: 
     * Default value: 5.00
     * Acceptable Range: 1.00 1000.00
     * */
    private double m_BlurRadius  = 5.00;

    /** Blur radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1).
     *
     * Unit: 
     * Default value: 5.00
     * Acceptable Range: 1.00 1000.00
     *
     * @param value new value for Blur radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public GaussianBlurSelective setBlurRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 1.00)
	    {
	        throw new ParameterOutOfRangeException(value, 1.00, 1000.00);
	    }

        m_BlurRadius = value;
        setProperty("blur-radius", value);
        return this;
    }

    /** Blur radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1).
     *
     * Unit: 
     * Default value: 5.00
     * Acceptable Range: 1.00 1000.00
     *
     * @return value of Blur radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBlurRadius()
    {
        return m_BlurRadius;
    }


    /** Max. delta
     *
     * Maximum delta
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     * */
    private double m_MaxDelta  = 0.20;

    /** Max. delta
     *
     * Maximum delta
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Max. delta
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public GaussianBlurSelective setMaxDelta(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_MaxDelta = value;
        setProperty("max-delta", value);
        return this;
    }

    /** Max. delta
     *
     * Maximum delta
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Max. delta
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getMaxDelta()
    {
        return m_MaxDelta;
    }

    @Override
    public InputPad<GaussianBlurSelective> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<GaussianBlurSelective> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<GaussianBlurSelective> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

