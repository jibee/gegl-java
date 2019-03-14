package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * 
 *
 * SVG blend operation darken (<code>d = MIN (cA * aB, cB * aA) + cA * (1 - aB) + cB * (1 - aA)</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class Darken extends GeglFilter implements CombiningFilter
{
    /** Constructs a .
     *
     * SVG blend operation darken (<code>d = MIN (cA * aB, cB * aA) + cA * (1 - aB) + cB * (1 - aA)</code>)
     *
     * @param container container node
     */
    public Darken(GeglNode container)
    {
        super(container, "svg:darken");
    }
    /** Constructs a .
     *
     * SVG blend operation darken (<code>d = MIN (cA * aB, cB * aA) + cA * (1 - aB) + cB * (1 - aA)</code>)
     *
     * @param parent parent filter node
     */
    public Darken(GeglFilter parent)
    {
        super(parent, "svg:darken");
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
    public Darken setSrgb(boolean value)
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
    public InputPad<Darken> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Darken> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Darken> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

