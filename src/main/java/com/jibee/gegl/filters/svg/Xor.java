package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Xor
 *
 * Porter Duff operation xor (d = cA * (1.0f - aB)+ cB * (1.0f - aA))
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class Xor extends GeglFilter implements CombiningFilter
{
    /** Constructs a Xor.
     *
     * Porter Duff operation xor (d = cA * (1.0f - aB)+ cB * (1.0f - aA))
     *
     * @param container container node
     */
    public Xor(GeglNode container)
    {
        super(container, "svg:xor");
    }
    /** Constructs a Xor.
     *
     * Porter Duff operation xor (d = cA * (1.0f - aB)+ cB * (1.0f - aA))
     *
     * @param parent parent filter node
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
     *
     * @param value new value for sRGB
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of sRGB
     * 
     */
    public boolean getSrgb()
    {
        return m_Srgb;
    }

    @Override
    public InputPad<Xor> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Xor> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Xor> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

