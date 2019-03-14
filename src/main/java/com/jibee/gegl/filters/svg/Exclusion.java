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
 * SVG blend operation exclusion (<code>d = (cA * aB + cB * aA - 2 * cA * cB) + cA * (1 - aB) + cB * (1 - aA)</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class Exclusion extends GeglFilter implements CombiningFilter
{
    /** Constructs a .
     *
     * SVG blend operation exclusion (<code>d = (cA * aB + cB * aA - 2 * cA * cB) + cA * (1 - aB) + cB * (1 - aA)</code>)
     *
     * @param container container node
     */
    public Exclusion(GeglNode container)
    {
        super(container, "svg:exclusion");
    }
    /** Constructs a .
     *
     * SVG blend operation exclusion (<code>d = (cA * aB + cB * aA - 2 * cA * cB) + cA * (1 - aB) + cB * (1 - aA)</code>)
     *
     * @param parent parent filter node
     */
    public Exclusion(GeglFilter parent)
    {
        super(parent, "svg:exclusion");
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
    public Exclusion setSrgb(boolean value)
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
    public InputPad<Exclusion> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Exclusion> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Exclusion> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

