package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Clear
 *
 * Porter Duff operation clear (d = 0.0f)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "porter-duff"})
public class Clear extends GeglFilter implements CombiningFilter
{
    /** Constructs a Clear.
     *
     * Porter Duff operation clear (d = 0.0f)
     *
     * @param container container node
     */
    public Clear(GeglNode container)
    {
        super(container, "svg:clear");
    }
    /** Constructs a Clear.
     *
     * Porter Duff operation clear (d = 0.0f)
     *
     * @param parent parent filter node
     */
    public Clear(GeglFilter parent)
    {
        super(parent, "svg:clear");
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
    public Clear setSrgb(boolean value)
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
    public InputPad<Clear> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Clear> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Clear> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

