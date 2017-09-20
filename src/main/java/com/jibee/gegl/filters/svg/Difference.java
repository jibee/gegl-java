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
 * SVG blend operation difference (<code>d = cA + cB - 2 * (MIN (cA * aB, cB * aA))</code>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class Difference extends GeglFilter implements CombiningFilter
{
    /** Constructs a .
     *
     * SVG blend operation difference (<code>d = cA + cB - 2 * (MIN (cA * aB, cB * aA))</code>)
     *
     * @param container container node
     */
    public Difference(GeglNode container)
    {
        super(container, "svg:difference");
    }
    /** Constructs a .
     *
     * SVG blend operation difference (<code>d = cA + cB - 2 * (MIN (cA * aB, cB * aA))</code>)
     *
     * @param parent parent filter node
     */
    public Difference(GeglFilter parent)
    {
        super(parent, "svg:difference");
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
    public Difference setSrgb(boolean value)
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

