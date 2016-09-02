package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Circular Motion Blur
 *
 * Circular motion blur
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"blur"})
public class MotionBlurCircular extends GeglFilter
{
    /** Constructs a Circular Motion Blur.
     *
     * Circular motion blur
     */
    public MotionBlurCircular(GeglNode container)
    {
        super(container, "gegl:motion-blur-circular");
    }
    /** Constructs a Circular Motion Blur.
     *
     * Circular motion blur
     */
    public MotionBlurCircular(GeglFilter parent)
    {
        super(parent, "gegl:motion-blur-circular");
    }

    
    /** Center X
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_CenterX  = 0.50;

    /** Center X
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public MotionBlurCircular setCenterX(double value)
    {
	
        m_CenterX = value;
        setProperty("center-x", value);
        return this;
    }

    /** Center X
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public double getCenterX()
    {
        return m_CenterX;
    }


    /** Center Y
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_CenterY  = 0.50;

    /** Center Y
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public MotionBlurCircular setCenterY(double value)
    {
	
        m_CenterY = value;
        setProperty("center-y", value);
        return this;
    }

    /** Center Y
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public double getCenterY()
    {
        return m_CenterY;
    }


    /** Angle
     *
     * Rotation blur angle. A large angle may take some time to render
     *
     * Unit: degree
     * Default value: 5.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Angle  = 5.00;

    /** Angle
     *
     * Rotation blur angle. A large angle may take some time to render
     *
     * Unit: degree
     * Default value: 5.00
     * Acceptable Range: -180.00 180.00
     */
    public MotionBlurCircular setAngle(double value) throws ParameterOutOfRangeException
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
     * Rotation blur angle. A large angle may take some time to render
     *
     * Unit: degree
     * Default value: 5.00
     * Acceptable Range: -180.00 180.00
     */
    public double getAngle()
    {
        return m_Angle;
    }

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

