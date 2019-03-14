package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Linear Motion Blur
 *
 * Blur pixels in a direction, simulates blurring caused by moving camera in a straight line during exposure.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=true, position_dependant=false, categories={"blur"})
public class MotionBlurLinear extends GeglFilter implements Filter
{
    /** Constructs a Linear Motion Blur.
     *
     * Blur pixels in a direction, simulates blurring caused by moving camera in a straight line during exposure.
     *
     * @param container container node
     */
    public MotionBlurLinear(GeglNode container)
    {
        super(container, "gegl:motion-blur-linear");
    }
    /** Constructs a Linear Motion Blur.
     *
     * Blur pixels in a direction, simulates blurring caused by moving camera in a straight line during exposure.
     *
     * @param parent parent filter node
     */
    public MotionBlurLinear(GeglFilter parent)
    {
        super(parent, "gegl:motion-blur-linear");
    }

    
    /** Length
     *
     * Length of blur in pixels
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 1000.00
     * */
    private double m_Length  = 10.00;

    /** Length
     *
     * Length of blur in pixels
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 1000.00
     *
     * @param value new value for Length
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public MotionBlurLinear setLength(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1000.00);
	    }

        m_Length = value;
        setProperty("length", value);
        return this;
    }

    /** Length
     *
     * Length of blur in pixels
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 1000.00
     *
     * @return value of Length
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getLength()
    {
        return m_Length;
    }


    /** Angle
     *
     * Angle of blur in degrees
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Angle  = 0.00;

    /** Angle
     *
     * Angle of blur in degrees
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     *
     * @param value new value for Angle
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public MotionBlurLinear setAngle(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < -180.00)
	    {
	        throw new ParameterOutOfRangeException(value, -180.00, 180.00);
	    }

        m_Angle = value;
        setProperty("angle", value);
        return this;
    }

    /** Angle
     *
     * Angle of blur in degrees
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     *
     * @return value of Angle
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getAngle()
    {
        return m_Angle;
    }

    @Override
    public InputPad<MotionBlurLinear> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<MotionBlurLinear> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

