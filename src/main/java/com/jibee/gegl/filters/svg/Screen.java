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
 * SVG blend operation screen (<code>d = cA + cB - cA * cB</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class Screen extends GeglFilter implements CombiningFilter
{
    /** Constructs a .
     *
     * SVG blend operation screen (<code>d = cA + cB - cA * cB</code>)
     *
     * @param container container node
     */
    public Screen(GeglNode container)
    {
        super(container, "svg:screen");
    }
    /** Constructs a .
     *
     * SVG blend operation screen (<code>d = cA + cB - cA * cB</code>)
     *
     * @param parent parent filter node
     */
    public Screen(GeglFilter parent)
    {
        super(parent, "svg:screen");
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
    public Screen setSrgb(boolean value)
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
    public InputPad<Screen> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Screen> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Screen> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

