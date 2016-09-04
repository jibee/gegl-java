package com.jibee.gegl.filters.svg;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * Color-burn
 *
 * SVG blend operation color-burn (<code>if cA * aB + cB * aA <= aA * aB: d = cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == 0 ? 1 : (aA * (cA * aB + cB * aA - aA * aB) / cA) + cA * (1 - aB) + cB * (1 - aA))</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class ColorBurn extends GeglFilter implements Source, DualSink
{
    /** Constructs a Color-burn.
     *
     * SVG blend operation color-burn (<code>if cA * aB + cB * aA <= aA * aB: d = cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == 0 ? 1 : (aA * (cA * aB + cB * aA - aA * aB) / cA) + cA * (1 - aB) + cB * (1 - aA))</code>)
     */
    public ColorBurn(GeglNode container)
    {
        super(container, "svg:color-burn");
    }
    /** Constructs a Color-burn.
     *
     * SVG blend operation color-burn (<code>if cA * aB + cB * aA <= aA * aB: d = cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == 0 ? 1 : (aA * (cA * aB + cB * aA - aA * aB) / cA) + cA * (1 - aB) + cB * (1 - aA))</code>)
     */
    public ColorBurn(GeglFilter parent)
    {
        super(parent, "svg:color-burn");
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
     */
    public ColorBurn setSrgb(boolean value)
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
     */
    public boolean getSrgb()
    {
        return m_Srgb;
    }

    public InputPad Aux()
    {
        return new InputPad(this, "aux");
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

