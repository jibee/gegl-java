package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Hard-light
 *
 * SVG blend operation hard-light (<code>if 2 * cA < aA: d = 2 * cA * cB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = aA * aB - 2 * (aB - cB) * (aA - cA) + cA * (1 - aB) + cB * (1 - aA)</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class HardLight extends GeglFilter implements CombiningFilter
{
    /** Constructs a Hard-light.
     *
     * SVG blend operation hard-light (<code>if 2 * cA < aA: d = 2 * cA * cB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = aA * aB - 2 * (aB - cB) * (aA - cA) + cA * (1 - aB) + cB * (1 - aA)</code>)
     *
     * @param container container node
     */
    public HardLight(GeglNode container)
    {
        super(container, "svg:hard-light");
    }
    /** Constructs a Hard-light.
     *
     * SVG blend operation hard-light (<code>if 2 * cA < aA: d = 2 * cA * cB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = aA * aB - 2 * (aB - cB) * (aA - cA) + cA * (1 - aB) + cB * (1 - aA)</code>)
     *
     * @param parent parent filter node
     */
    public HardLight(GeglFilter parent)
    {
        super(parent, "svg:hard-light");
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
    public HardLight setSrgb(boolean value)
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
    public InputPad<HardLight> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<HardLight> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<HardLight> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

