package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Dst-over
 *
 * Porter Duff operation dst-over (d = cB + cA * (1.0f - aB))
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class DstOver extends GeglFilter implements CombiningFilter
{
    /** Constructs a Dst-over.
     *
     * Porter Duff operation dst-over (d = cB + cA * (1.0f - aB))
     *
     * @param container container node
     */
    public DstOver(GeglNode container)
    {
        super(container, "svg:dst-over");
    }
    /** Constructs a Dst-over.
     *
     * Porter Duff operation dst-over (d = cB + cA * (1.0f - aB))
     *
     * @param parent parent filter node
     */
    public DstOver(GeglFilter parent)
    {
        super(parent, "svg:dst-over");
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
    public DstOver setSrgb(boolean value)
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
    public InputPad<DstOver> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<DstOver> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<DstOver> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

