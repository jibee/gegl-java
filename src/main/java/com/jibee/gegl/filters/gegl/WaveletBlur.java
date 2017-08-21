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
 * Wavelet Blur
 *
 * This blur is used for the wavelet decomposition filter, each pixel is computed from another by the HAT transform
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"blur"})
public class WaveletBlur extends GeglFilter implements Source, Sink
{
    /** Constructs a Wavelet Blur.
     *
     * This blur is used for the wavelet decomposition filter, each pixel is computed from another by the HAT transform
     *
     * @param container container node
     */
    public WaveletBlur(GeglNode container)
    {
        super(container, "gegl:wavelet-blur");
    }
    /** Constructs a Wavelet Blur.
     *
     * This blur is used for the wavelet decomposition filter, each pixel is computed from another by the HAT transform
     *
     * @param parent parent filter node
     */
    public WaveletBlur(GeglFilter parent)
    {
        super(parent, "gegl:wavelet-blur");
    }

    
    /** Radius
     *
     * Radius of the wavelet blur
     *
     * Unit: pixel-distance
     * Default value: 1.00
     * Acceptable Range: 0.00 1500.00
     * */
    private double m_Radius  = 1.00;

    /** Radius
     *
     * Radius of the wavelet blur
     *
     * Unit: pixel-distance
     * Default value: 1.00
     * Acceptable Range: 0.00 1500.00
     *
     * @param value new value for Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public WaveletBlur setRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 1500.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1500.00);
	    }

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * Radius of the wavelet blur
     *
     * Unit: pixel-distance
     * Default value: 1.00
     * Acceptable Range: 0.00 1500.00
     *
     * @return value of Radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRadius()
    {
        return m_Radius;
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

