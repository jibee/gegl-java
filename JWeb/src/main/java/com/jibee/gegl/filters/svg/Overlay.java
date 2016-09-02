package com.jibee.gegl.filters.svg;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Overlay
 *
 * SVG blend operation overlay (<code>if 2 * cB > aB: d = 2 * cA * cB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = aA * aB - 2 * (aB - cB) * (aA - cA) + cA * (1 - aB) + cB * (1 - aA)</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class Overlay extends GeglFilter
{
    /** Constructs a Overlay.
     *
     * SVG blend operation overlay (<code>if 2 * cB > aB: d = 2 * cA * cB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = aA * aB - 2 * (aB - cB) * (aA - cA) + cA * (1 - aB) + cB * (1 - aA)</code>)
     */
    public Overlay(GeglNode container)
    {
        super(container, "svg:overlay");
    }
    /** Constructs a Overlay.
     *
     * SVG blend operation overlay (<code>if 2 * cB > aB: d = 2 * cA * cB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = aA * aB - 2 * (aB - cB) * (aA - cA) + cA * (1 - aB) + cB * (1 - aA)</code>)
     */
    public Overlay(GeglFilter parent)
    {
        super(parent, "svg:overlay");
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
    public Overlay setSrgb(boolean value)
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

    public InputPad aux()
    {
        return new InputPad(this, "aux");
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

