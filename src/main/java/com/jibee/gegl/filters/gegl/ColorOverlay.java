package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Color Overlay
 *
 * Paint a color overlay over the input, preserving its transparency.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class ColorOverlay extends GeglFilter implements Filter
{
    /** Constructs a Color Overlay.
     *
     * Paint a color overlay over the input, preserving its transparency.
     *
     * @param container container node
     */
    public ColorOverlay(GeglNode container)
    {
        super(container, "gegl:color-overlay");
    }
    /** Constructs a Color Overlay.
     *
     * Paint a color overlay over the input, preserving its transparency.
     *
     * @param parent parent filter node
     */
    public ColorOverlay(GeglFilter parent)
    {
        super(parent, "gegl:color-overlay");
    }

    
    /** Color
     *
     * The color to paint over the input
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Value  = makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)");

    /** Color
     *
     * The color to paint over the input
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Color
     * @return this filter (for chaining operations)
     * 
     */
    public ColorOverlay setValue(GeglColor value)
    {
	
        m_Value = value;
        setProperty("value", value);
        return this;
    }

    /** Color
     *
     * The color to paint over the input
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of Color
     * 
     */
    public GeglColor getValue()
    {
        return m_Value;
    }


    /** sRGB
     *
     * Use sRGB gamma instead of linear
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Srgb  = false;

    /** sRGB
     *
     * Use sRGB gamma instead of linear
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for sRGB
     * @return this filter (for chaining operations)
     * 
     */
    public ColorOverlay setSrgb(boolean value)
    {
	
        m_Srgb = value;
        setProperty("srgb", value);
        return this;
    }

    /** sRGB
     *
     * Use sRGB gamma instead of linear
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of sRGB
     * 
     */
    public boolean getSrgb()
    {
        return m_Srgb;
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

