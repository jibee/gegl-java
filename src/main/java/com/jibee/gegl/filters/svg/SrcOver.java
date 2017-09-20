package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Normal compositing
 *
 * Porter Duff operation over (also known as normal mode, and src-over) (d = cA + cB * (1 - aA))
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class SrcOver extends GeglFilter implements CombiningFilter
{
    /** Constructs a Normal compositing.
     *
     * Porter Duff operation over (also known as normal mode, and src-over) (d = cA + cB * (1 - aA))
     *
     * @param container container node
     */
    public SrcOver(GeglNode container)
    {
        super(container, "svg:src-over");
    }
    /** Constructs a Normal compositing.
     *
     * Porter Duff operation over (also known as normal mode, and src-over) (d = cA + cB * (1 - aA))
     *
     * @param parent parent filter node
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
     *
     * @param value new value for sRGB
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of sRGB
     * 
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

