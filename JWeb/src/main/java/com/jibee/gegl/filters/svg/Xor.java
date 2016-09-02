package com.jibee.gegl.filters.svg;

import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Xor
 *
 * Porter Duff operation xor (d = cA * (1.0f - aB)+ cB * (1.0f - aA))
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class Xor extends GeglFilter
{
    /** Constructs a Xor.
     *
     * Porter Duff operation xor (d = cA * (1.0f - aB)+ cB * (1.0f - aA))
     */
    public Xor(GeglNode container)
    {
        super(container, "svg:xor");
    }
    /** Constructs a Xor.
     *
     * Porter Duff operation xor (d = cA * (1.0f - aB)+ cB * (1.0f - aA))
     */
    public Xor(GeglFilter parent)
    {
        super(parent, "svg:xor");
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
    public Xor setSrgb(boolean value)
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

