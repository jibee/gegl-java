package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Color to Alpha
 *
 * Convert a specified color to transparency, works best with white.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"color"})
public class ColorToAlpha extends GeglFilter implements Filter
{
    /** Constructs a Color to Alpha.
     *
     * Convert a specified color to transparency, works best with white.
     *
     * @param container container node
     */
    public ColorToAlpha(GeglNode container)
    {
        super(container, "gegl:color-to-alpha");
    }
    /** Constructs a Color to Alpha.
     *
     * Convert a specified color to transparency, works best with white.
     *
     * @param parent parent filter node
     */
    public ColorToAlpha(GeglFilter parent)
    {
        super(parent, "gegl:color-to-alpha");
    }

    
    /** Color
     *
     * The color to make transparent.
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** Color
     *
     * The color to make transparent.
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Color
     * @return this filter (for chaining operations)
     * 
     */
    public ColorToAlpha setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

    /** Color
     *
     * The color to make transparent.
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @return value of Color
     * 
     */
    public GeglColor getColor()
    {
        return m_Color;
    }


    /** Transparency threshold
     *
     * The limit below which colors become transparent.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_TransparencyThreshold  = 0.00;

    /** Transparency threshold
     *
     * The limit below which colors become transparent.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Transparency threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorToAlpha setTransparencyThreshold(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_TransparencyThreshold = value;
        setProperty("transparency-threshold", value);
        return this;
    }

    /** Transparency threshold
     *
     * The limit below which colors become transparent.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Transparency threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getTransparencyThreshold()
    {
        return m_TransparencyThreshold;
    }


    /** Opacity threshold
     *
     * The limit above which colors remain opaque.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_OpacityThreshold  = 1.00;

    /** Opacity threshold
     *
     * The limit above which colors remain opaque.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Opacity threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorToAlpha setOpacityThreshold(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_OpacityThreshold = value;
        setProperty("opacity-threshold", value);
        return this;
    }

    /** Opacity threshold
     *
     * The limit above which colors remain opaque.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Opacity threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getOpacityThreshold()
    {
        return m_OpacityThreshold;
    }

    @Override
    public InputPad<ColorToAlpha> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ColorToAlpha> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

