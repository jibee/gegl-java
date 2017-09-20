package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Color to Alpha
 *
 * Convert a specified color to transparency, works best with white.
 * 
 * License: GPL3+
 * Supports OpenCL: true
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=true, position_dependant=false, categories={"color"})
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

