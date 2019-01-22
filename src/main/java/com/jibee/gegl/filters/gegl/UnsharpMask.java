package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Sharpen (Unsharp Mask)
 *
 * Sharpen image, by adding difference to blurred image, a technique for sharpening originally used in darkrooms.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"enhance", "sharpen"})
public class UnsharpMask extends GeglFilter implements Filter
{
    /** Constructs a Sharpen (Unsharp Mask).
     *
     * Sharpen image, by adding difference to blurred image, a technique for sharpening originally used in darkrooms.
     *
     * @param container container node
     */
    public UnsharpMask(GeglNode container)
    {
        super(container, "gegl:unsharp-mask");
    }
    /** Constructs a Sharpen (Unsharp Mask).
     *
     * Sharpen image, by adding difference to blurred image, a technique for sharpening originally used in darkrooms.
     *
     * @param parent parent filter node
     */
    public UnsharpMask(GeglFilter parent)
    {
        super(parent, "gegl:unsharp-mask");
    }

    
    /** Radius
     *
     * Expressed as standard deviation, in pixels
     *
     * Unit: pixel-distance
     * Default value: 3.00
     * Acceptable Range: 0.00 1500.00
     * */
    private double m_StdDev  = 3.00;

    /** Radius
     *
     * Expressed as standard deviation, in pixels
     *
     * Unit: pixel-distance
     * Default value: 3.00
     * Acceptable Range: 0.00 1500.00
     *
     * @param value new value for Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public UnsharpMask setStdDev(double value) throws ParameterOutOfRangeException
    {
		if(value > 1500.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1500.00);
	    }

        m_StdDev = value;
        setProperty("std-dev", value);
        return this;
    }

    /** Radius
     *
     * Expressed as standard deviation, in pixels
     *
     * Unit: pixel-distance
     * Default value: 3.00
     * Acceptable Range: 0.00 1500.00
     *
     * @return value of Radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getStdDev()
    {
        return m_StdDev;
    }


    /** Amount
     *
     * Scaling factor for unsharp-mask, the strength of effect
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 300.00
     * */
    private double m_Scale  = 0.50;

    /** Amount
     *
     * Scaling factor for unsharp-mask, the strength of effect
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 300.00
     *
     * @param value new value for Amount
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public UnsharpMask setScale(double value) throws ParameterOutOfRangeException
    {
		if(value > 300.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 300.00);
	    }

        m_Scale = value;
        setProperty("scale", value);
        return this;
    }

    /** Amount
     *
     * Scaling factor for unsharp-mask, the strength of effect
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 300.00
     *
     * @return value of Amount
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getScale()
    {
        return m_Scale;
    }


    /** Threshold
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Threshold  = 0.00;

    /** Threshold
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public UnsharpMask setThreshold(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Threshold = value;
        setProperty("threshold", value);
        return this;
    }

    /** Threshold
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getThreshold()
    {
        return m_Threshold;
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

