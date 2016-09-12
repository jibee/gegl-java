package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * Soft-light
 *
 * SVG blend operation soft-light (<code>if 2 * cA < aA: d = cB * (aA - (aB == 0 ? 1 : 1 - cB / aB) * (2 * cA - aA)) + cA * (1 - aB) + cB * (1 - aA); if 8 * cB <= aB: d = cB * (aA - (aB == 0 ? 1 : 1 - cB / aB) * (2 * cA - aA) * (aB == 0 ? 3 : 3 - 8 * cB / aB)) + cA * (1 - aB) + cB * (1 - aA); otherwise: d = (aA * cB + (aB == 0 ? 0 : sqrt (cB / aB) * aB - cB) * (2 * cA - aA)) + cA * (1 - aB) + cB * (1 - aA)</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class SoftLight extends GeglFilter implements Source, DualSink
{
    /** Constructs a Soft-light.
     *
     * SVG blend operation soft-light (<code>if 2 * cA < aA: d = cB * (aA - (aB == 0 ? 1 : 1 - cB / aB) * (2 * cA - aA)) + cA * (1 - aB) + cB * (1 - aA); if 8 * cB <= aB: d = cB * (aA - (aB == 0 ? 1 : 1 - cB / aB) * (2 * cA - aA) * (aB == 0 ? 3 : 3 - 8 * cB / aB)) + cA * (1 - aB) + cB * (1 - aA); otherwise: d = (aA * cB + (aB == 0 ? 0 : sqrt (cB / aB) * aB - cB) * (2 * cA - aA)) + cA * (1 - aB) + cB * (1 - aA)</code>)
     */
    public SoftLight(GeglNode container)
    {
        super(container, "gegl:soft-light");
    }
    /** Constructs a Soft-light.
     *
     * SVG blend operation soft-light (<code>if 2 * cA < aA: d = cB * (aA - (aB == 0 ? 1 : 1 - cB / aB) * (2 * cA - aA)) + cA * (1 - aB) + cB * (1 - aA); if 8 * cB <= aB: d = cB * (aA - (aB == 0 ? 1 : 1 - cB / aB) * (2 * cA - aA) * (aB == 0 ? 3 : 3 - 8 * cB / aB)) + cA * (1 - aB) + cB * (1 - aA); otherwise: d = (aA * cB + (aB == 0 ? 0 : sqrt (cB / aB) * aB - cB) * (2 * cA - aA)) + cA * (1 - aB) + cB * (1 - aA)</code>)
     */
    public SoftLight(GeglFilter parent)
    {
        super(parent, "gegl:soft-light");
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
     */
    public SoftLight setSrgb(boolean value)
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
     */
    public boolean getSrgb()
    {
        return m_Srgb;
    }

    @Override
    public InputPad Aux()
    {
        return new InputPad(this, "aux");
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

