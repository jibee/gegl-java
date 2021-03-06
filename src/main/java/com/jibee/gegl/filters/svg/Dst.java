package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Dst
 *
 * Porter Duff operation dst (d = cB)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class Dst extends GeglFilter implements CombiningFilter
{
    /** Constructs a Dst.
     *
     * Porter Duff operation dst (d = cB)
     *
     * @param container container node
     */
    public Dst(GeglNode container)
    {
        super(container, "svg:dst");
    }
    /** Constructs a Dst.
     *
     * Porter Duff operation dst (d = cB)
     *
     * @param parent parent filter node
     */
    public Dst(GeglFilter parent)
    {
        super(parent, "svg:dst");
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
    public Dst setSrgb(boolean value)
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
    public InputPad<Dst> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Dst> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Dst> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

