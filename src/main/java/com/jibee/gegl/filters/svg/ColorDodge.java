package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Color-dodge
 *
 * SVG blend operation color-dodge (<code>if cA * aB + cB * aA >= aA * aB: d = aA * aB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == aA ? 1 : cB * aA / (aA == 0 ? 1 : 1 - cA / aA)) + cA * (1 - aB) + cB * (1 - aA)</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class ColorDodge extends GeglFilter implements CombiningFilter
{
    /** Constructs a Color-dodge.
     *
     * SVG blend operation color-dodge (<code>if cA * aB + cB * aA >= aA * aB: d = aA * aB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == aA ? 1 : cB * aA / (aA == 0 ? 1 : 1 - cA / aA)) + cA * (1 - aB) + cB * (1 - aA)</code>)
     *
     * @param container container node
     */
    public ColorDodge(GeglNode container)
    {
        super(container, "svg:color-dodge");
    }
    /** Constructs a Color-dodge.
     *
     * SVG blend operation color-dodge (<code>if cA * aB + cB * aA >= aA * aB: d = aA * aB + cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == aA ? 1 : cB * aA / (aA == 0 ? 1 : 1 - cA / aA)) + cA * (1 - aB) + cB * (1 - aA)</code>)
     *
     * @param parent parent filter node
     */
    public ColorDodge(GeglFilter parent)
    {
        super(parent, "svg:color-dodge");
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
    public ColorDodge setSrgb(boolean value)
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
    public InputPad<ColorDodge> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<ColorDodge> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ColorDodge> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

