package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * 1D Wavelet-blur
 *
 * This blur is used for the wavelet decomposition filter, each pixel is computed from another by the HAT transform
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"hidden", "blur"})
public class WaveletBlur1d extends GeglFilter implements Filter
{
    /** Constructs a 1D Wavelet-blur.
     *
     * This blur is used for the wavelet decomposition filter, each pixel is computed from another by the HAT transform
     *
     * @param container container node
     */
    public WaveletBlur1d(GeglNode container)
    {
        super(container, "gegl:wavelet-blur-1d");
    }
    /** Constructs a 1D Wavelet-blur.
     *
     * This blur is used for the wavelet decomposition filter, each pixel is computed from another by the HAT transform
     *
     * @param parent parent filter node
     */
    public WaveletBlur1d(GeglFilter parent)
    {
        super(parent, "gegl:wavelet-blur-1d");
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
    public WaveletBlur1d setRadius(double value) throws ParameterOutOfRangeException
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


    /** Orientation
     *
     * The orientation of the blur - hor/ver
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Orientation ;

    /** Orientation
     *
     * The orientation of the blur - hor/ver
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Orientation
     * @return this filter (for chaining operations)
     * 
     */
    public WaveletBlur1d setOrientation(String value)
    {
	
        m_Orientation = value;
        setProperty("orientation", value);
        return this;
    }

    /** Orientation
     *
     * The orientation of the blur - hor/ver
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Orientation
     * 
     */
    public String getOrientation()
    {
        return m_Orientation;
    }

    @Override
    public InputPad<WaveletBlur1d> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<WaveletBlur1d> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

