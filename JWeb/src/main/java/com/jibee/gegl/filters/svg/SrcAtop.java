package com.jibee.gegl.filters.svg;

import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Src-atop
 *
 * Porter Duff operation src-atop (d = cA * aB + cB * (1.0f - aA))
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class SrcAtop extends GeglFilter
{
    /** Constructs a Src-atop.
     *
     * Porter Duff operation src-atop (d = cA * aB + cB * (1.0f - aA))
     */
    public SrcAtop(GeglNode container)
    {
        super(container, "svg:src-atop");
    }
    /** Constructs a Src-atop.
     *
     * Porter Duff operation src-atop (d = cA * aB + cB * (1.0f - aA))
     */
    public SrcAtop(GeglFilter parent)
    {
        super(parent, "svg:src-atop");
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
    public SrcAtop setSrgb(boolean value)
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

