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
 * Zooming Motion Blur
 *
 * Zoom motion blur
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"blur"})
public class MotionBlurZoom extends GeglFilter implements Source, Sink
{
    /** Constructs a Zooming Motion Blur.
     *
     * Zoom motion blur
     *
     * @param container container node
     */
    public MotionBlurZoom(GeglNode container)
    {
        super(container, "gegl:motion-blur-zoom");
    }
    /** Constructs a Zooming Motion Blur.
     *
     * Zoom motion blur
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Center X
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Center Y
     * 
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
     *
     * @param value new value for Blurring factor
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Blurring factor
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getFactor()
    {
        return m_Factor;
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

