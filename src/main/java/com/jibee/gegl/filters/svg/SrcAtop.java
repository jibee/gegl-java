package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Src-atop
 *
 * Porter Duff operation src-atop (d = cA * aB + cB * (1.0f - aA))
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class SrcAtop extends GeglFilter implements CombiningFilter
{
    /** Constructs a Src-atop.
     *
     * Porter Duff operation src-atop (d = cA * aB + cB * (1.0f - aA))
     *
     * @param container container node
     */
    public SrcAtop(GeglNode container)
    {
        super(container, "svg:src-atop");
    }
    /** Constructs a Src-atop.
     *
     * Porter Duff operation src-atop (d = cA * aB + cB * (1.0f - aA))
     *
     * @param parent parent filter node
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
     *
     * @param value new value for sRGB
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of sRGB
     * 
     */
    public boolean getSrgb()
    {
        return m_Srgb;
    }

    @Override
    public InputPad<SrcAtop> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<SrcAtop> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<SrcAtop> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

