package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Src-in
 *
 * Porter Duff compositing operation src-in (formula:   cA * aB)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class SrcIn extends GeglFilter implements CombiningFilter
{
    /** Constructs a Src-in.
     *
     * Porter Duff compositing operation src-in (formula:   cA * aB)
     *
     * @param container container node
     */
    public SrcIn(GeglNode container)
    {
        super(container, "svg:src-in");
    }
    /** Constructs a Src-in.
     *
     * Porter Duff compositing operation src-in (formula:   cA * aB)
     *
     * @param parent parent filter node
     */
    public SrcIn(GeglFilter parent)
    {
        super(parent, "svg:src-in");
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
    public SrcIn setSrgb(boolean value)
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
    public InputPad<SrcIn> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<SrcIn> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<SrcIn> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

