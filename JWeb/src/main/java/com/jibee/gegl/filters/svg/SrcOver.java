package com.jibee.gegl.filters.svg;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * Normal compositing
 *
 * Porter Duff operation over (also known as normal mode, and src-over) (d = cA + cB * (1 - aA))
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class SrcOver extends GeglFilter implements Source, DualSink
{
    /** Constructs a Normal compositing.
     *
     * Porter Duff operation over (also known as normal mode, and src-over) (d = cA + cB * (1 - aA))
     */
    public SrcOver(GeglNode container)
    {
        super(container, "svg:src-over");
    }
    /** Constructs a Normal compositing.
     *
     * Porter Duff operation over (also known as normal mode, and src-over) (d = cA + cB * (1 - aA))
     */
    public SrcOver(GeglFilter parent)
    {
        super(parent, "svg:src-over");
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
    public SrcOver setSrgb(boolean value)
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

