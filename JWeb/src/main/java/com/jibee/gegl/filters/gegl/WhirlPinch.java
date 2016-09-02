package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;

/**
 * Whirl Pinch
 *
 * Distort an image by whirling and pinching
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"distort", "map"})
public class WhirlPinch extends GeglFilter
{
    /** Constructs a Whirl Pinch.
     *
     * Distort an image by whirling and pinching
     */
    public WhirlPinch(GeglNode container)
    {
        super(container, "gegl:whirl-pinch");
    }
    /** Constructs a Whirl Pinch.
     *
     * Distort an image by whirling and pinching
     */
    public WhirlPinch(GeglFilter parent)
    {
        super(parent, "gegl:whirl-pinch");
    }

    
    /** Whirl
     *
     * Whirl angle (degrees)
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range:  
     * */
    private double m_Whirl  = 90.00;

    /** Whirl
     *
     * Whirl angle (degrees)
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range:  
     */
    public WhirlPinch setWhirl(double value)
    {
	
        m_Whirl = value;
        setProperty("whirl", value);
        return this;
    }

    /** Whirl
     *
     * Whirl angle (degrees)
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range:  
     */
    public double getWhirl()
    {
        return m_Whirl;
    }


    /** Pinch
     *
     * Pinch amount
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_Pinch  = 0.00;

    /** Pinch
     *
     * Pinch amount
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public WhirlPinch setPinch(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_Pinch = value;
        setProperty("pinch", value);
        return this;
    }

    /** Pinch
     *
     * Pinch amount
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getPinch()
    {
        return m_Pinch;
    }


    /** Radius
     *
     * Radius (1.0 is the largest circle that fits in the image, and 2.0 goes all the way to the corners)
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     * */
    private double m_Radius  = 1.00;

    /** Radius
     *
     * Radius (1.0 is the largest circle that fits in the image, and 2.0 goes all the way to the corners)
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public WhirlPinch setRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 2.00);
	}

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * Radius (1.0 is the largest circle that fits in the image, and 2.0 goes all the way to the corners)
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public double getRadius()
    {
        return m_Radius;
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

