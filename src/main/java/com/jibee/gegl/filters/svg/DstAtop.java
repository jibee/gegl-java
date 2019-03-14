package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Dst-atop
 *
 * Porter Duff operation dst-atop (d = cB * aA + cA * (1.0f - aB))
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class DstAtop extends GeglFilter implements CombiningFilter
{
    /** Constructs a Dst-atop.
     *
     * Porter Duff operation dst-atop (d = cB * aA + cA * (1.0f - aB))
     *
     * @param container container node
     */
    public DstAtop(GeglNode container)
    {
        super(container, "svg:dst-atop");
    }
    /** Constructs a Dst-atop.
     *
     * Porter Duff operation dst-atop (d = cB * aA + cA * (1.0f - aB))
     *
     * @param parent parent filter node
     */
    public DstAtop(GeglFilter parent)
    {
        super(parent, "svg:dst-atop");
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
    public DstAtop setSrgb(boolean value)
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
    public InputPad<DstAtop> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<DstAtop> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<DstAtop> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

