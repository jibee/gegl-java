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
 * Circular Motion Blur
 *
 * Circular motion blur
 * 
 * License: GPL3+
 * Supports OpenCL: true
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=true, position_dependant=true, categories={"blur"})
public class MotionBlurCircular extends GeglFilter implements Source, Sink
{
    /** Constructs a Circular Motion Blur.
     *
     * Circular motion blur
     *
     * @param container container node
     */
    public MotionBlurCircular(GeglNode container)
    {
        super(container, "gegl:motion-blur-circular");
    }
    /** Constructs a Circular Motion Blur.
     *
     * Circular motion blur
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Center X
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Center X
     * 
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
     *
     * @param value new value for Center Y
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Center Y
     * 
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
     *
     * @param value new value for Angle
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Angle
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getAngle()
    {
        return m_Angle;
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

