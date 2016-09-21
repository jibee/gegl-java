package com.jibee.gegl.filters.svg;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * Dst-in
 *
 * Porter Duff operation dst-in (d = cB * aA)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class DstIn extends GeglFilter implements Source, DualSink
{
    /** Constructs a Dst-in.
     *
     * Porter Duff operation dst-in (d = cB * aA)
     */
    public DstIn(GeglNode container)
    {
        super(container, "svg:dst-in");
    }
    /** Constructs a Dst-in.
     *
     * Porter Duff operation dst-in (d = cB * aA)
     */
    public DstIn(GeglFilter parent)
    {
        super(parent, "svg:dst-in");
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
    public DstIn setSrgb(boolean value)
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

    @Override
    public InputPad Aux()
    {
        return new InputPad(this, "aux");
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

