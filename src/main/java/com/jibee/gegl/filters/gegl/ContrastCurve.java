package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglCurve;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Contrast Curve
 *
 * Adjusts the contrast of a grayscale image with a curve specifying contrast for intensity.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=true, position_dependant=false, categories={"color"})
public class ContrastCurve extends GeglFilter implements Filter
{
    /** Constructs a Contrast Curve.
     *
     * Adjusts the contrast of a grayscale image with a curve specifying contrast for intensity.
     *
     * @param container container node
     */
    public ContrastCurve(GeglNode container)
    {
        super(container, "gegl:contrast-curve");
    }
    /** Constructs a Contrast Curve.
     *
     * Adjusts the contrast of a grayscale image with a curve specifying contrast for intensity.
     *
     * @param parent parent filter node
     */
    public ContrastCurve(GeglFilter parent)
    {
        super(parent, "gegl:contrast-curve");
    }

    
    /** Sample points
     *
     * Number of curve sampling points.  0 for exact calculation.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  65536
     * */
    private int m_SamplingPoints ;

    /** Sample points
     *
     * Number of curve sampling points.  0 for exact calculation.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  65536
     *
     * @param value new value for Sample points
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ContrastCurve setSamplingPoints(int value) throws ParameterOutOfRangeException
    {
		if(value > 65536)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 65536);
	    }

        m_SamplingPoints = value;
        setProperty("sampling-points", value);
        return this;
    }

    /** Sample points
     *
     * Number of curve sampling points.  0 for exact calculation.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  65536
     *
     * @return value of Sample points
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getSamplingPoints()
    {
        return m_SamplingPoints;
    }


    /** Curve
     *
     * The contrast curve.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private GeglCurve m_Curve ;

    /** Curve
     *
     * The contrast curve.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Curve
     * @return this filter (for chaining operations)
     * 
     */
    public ContrastCurve setCurve(GeglCurve value)
    {
	
        m_Curve = value;
        setProperty("curve", value);
        return this;
    }

    /** Curve
     *
     * The contrast curve.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Curve
     * 
     */
    public GeglCurve getCurve()
    {
        return m_Curve;
    }

    @Override
    public InputPad<ContrastCurve> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ContrastCurve> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

