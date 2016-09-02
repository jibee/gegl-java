package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;

/**
 * Zooming Motion Blur
 *
 * Zoom motion blur
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"blur"})
public class MotionBlurZoom extends GeglFilter
{
    /** Constructs a Zooming Motion Blur.
     *
     * Zoom motion blur
     */
    public MotionBlurZoom(GeglNode container)
    {
        super(container, "gegl:motion-blur-zoom");
    }
    /** Constructs a Zooming Motion Blur.
     *
     * Zoom motion blur
     */
    public MotionBlurZoom(GeglFilter parent)
    {
        super(parent, "gegl:motion-blur-zoom");
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
    public MotionBlurZoom setCenterX(double value)
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
    public MotionBlurZoom setCenterY(double value)
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


    /** Blurring factor
     *
     * 
     *
     * Unit: 
     * Default value: 0.10
     * Acceptable Range: -10.00 1.00
     * */
    private double m_Factor  = 0.10;

    /** Blurring factor
     *
     * 
     *
     * Unit: 
     * Default value: 0.10
     * Acceptable Range: -10.00 1.00
     */
    public MotionBlurZoom setFactor(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -10.00)
	{
	    throw new ParameterOutOfRangeException(value, -10.00, 1.00);
	}

        m_Factor = value;
        setProperty("factor", value);
        return this;
    }

    /** Blurring factor
     *
     * 
     *
     * Unit: 
     * Default value: 0.10
     * Acceptable Range: -10.00 1.00
     */
    public double getFactor()
    {
        return m_Factor;
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

