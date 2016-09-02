package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;

/**
 * Unsharp Mask
 *
 * Sharpen image, by adding difference to blurred image, a technique for sharpening originally used in darkrooms.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"enhance", "sharpen"})
public class UnsharpMask extends GeglFilter
{
    /** Constructs a Unsharp Mask.
     *
     * Sharpen image, by adding difference to blurred image, a technique for sharpening originally used in darkrooms.
     */
    public UnsharpMask(GeglNode container)
    {
        super(container, "gegl:unsharp-mask");
    }
    /** Constructs a Unsharp Mask.
     *
     * Sharpen image, by adding difference to blurred image, a technique for sharpening originally used in darkrooms.
     */
    public UnsharpMask(GeglFilter parent)
    {
        super(parent, "gegl:unsharp-mask");
    }

    
    /** Standard Deviation
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: pixel-distance
     * Default value: 0.55
     * Acceptable Range: 0.20 300.00
     * */
    private double m_StdDev  = 0.55;

    /** Standard Deviation
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: pixel-distance
     * Default value: 0.55
     * Acceptable Range: 0.20 300.00
     */
    public UnsharpMask setStdDev(double value) throws ParameterOutOfRangeException
    {
		if(value > 300.00 || value < 0.20)
	{
	    throw new ParameterOutOfRangeException(value, 0.20, 300.00);
	}

        m_StdDev = value;
        setProperty("std-dev", value);
        return this;
    }

    /** Standard Deviation
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: pixel-distance
     * Default value: 0.55
     * Acceptable Range: 0.20 300.00
     */
    public double getStdDev()
    {
        return m_StdDev;
    }


    /** Scale
     *
     * Scale, strength of effect
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 0.00 300.00
     * */
    private double m_Scale  = 4.00;

    /** Scale
     *
     * Scale, strength of effect
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 0.00 300.00
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

    /** Scale
     *
     * Scale, strength of effect
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 0.00 300.00
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

