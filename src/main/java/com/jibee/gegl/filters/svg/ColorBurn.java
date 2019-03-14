package com.jibee.gegl.filters.svg;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Color-burn
 *
 * SVG blend operation color-burn (<code>if cA * aB + cB * aA <= aA * aB: d = cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == 0 ? 1 : (aA * (cA * aB + cB * aA - aA * aB) / cA) + cA * (1 - aB) + cB * (1 - aA))</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class ColorBurn extends GeglFilter implements CombiningFilter
{
    /** Constructs a Color-burn.
     *
     * SVG blend operation color-burn (<code>if cA * aB + cB * aA <= aA * aB: d = cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == 0 ? 1 : (aA * (cA * aB + cB * aA - aA * aB) / cA) + cA * (1 - aB) + cB * (1 - aA))</code>)
     *
     * @param container container node
     */
    public ColorBurn(GeglNode container)
    {
        super(container, "svg:color-burn");
    }
    /** Constructs a Color-burn.
     *
     * SVG blend operation color-burn (<code>if cA * aB + cB * aA <= aA * aB: d = cA * (1 - aB) + cB * (1 - aA) otherwise: d = (cA == 0 ? 1 : (aA * (cA * aB + cB * aA - aA * aB) / cA) + cA * (1 - aB) + cB * (1 - aA))</code>)
     *
     * @param parent parent filter node
     */
    public ColorBurn(GeglFilter parent)
    {
        super(parent, "svg:color-burn");
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
    public ColorBurn setSrgb(boolean value)
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
    public InputPad<ColorBurn> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<ColorBurn> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ColorBurn> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

