package com.jibee.gegl.filters.svg;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * 
 *
 * SVG blend operation multiply (<code>d = cA * cB +  cA * (1 - aB) + cB * (1 - aA)</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class Multiply extends GeglFilter
{
    /** Constructs a .
     *
     * SVG blend operation multiply (<code>d = cA * cB +  cA * (1 - aB) + cB * (1 - aA)</code>)
     */
    public Multiply(GeglNode container)
    {
        super(container, "svg:multiply");
    }
    /** Constructs a .
     *
     * SVG blend operation multiply (<code>d = cA * cB +  cA * (1 - aB) + cB * (1 - aA)</code>)
     */
    public Multiply(GeglFilter parent)
    {
        super(parent, "svg:multiply");
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
    public Multiply setSrgb(boolean value)
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

