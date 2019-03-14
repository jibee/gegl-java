package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * SVG Saturate
 *
 * SVG color matrix operation svg_saturate
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class SvgSaturate extends GeglFilter implements Filter
{
    /** Constructs a SVG Saturate.
     *
     * SVG color matrix operation svg_saturate
     *
     * @param container container node
     */
    public SvgSaturate(GeglNode container)
    {
        super(container, "gegl:svg-saturate");
    }
    /** Constructs a SVG Saturate.
     *
     * SVG color matrix operation svg_saturate
     *
     * @param parent parent filter node
     */
    public SvgSaturate(GeglFilter parent)
    {
        super(parent, "gegl:svg-saturate");
    }

    
    /** Values
     *
     * list of <number>s
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Values ;

    /** Values
     *
     * list of <number>s
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Values
     * @return this filter (for chaining operations)
     * 
     */
    public SvgSaturate setValues(String value)
    {
	
        m_Values = value;
        setProperty("values", value);
        return this;
    }

    /** Values
     *
     * list of <number>s
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Values
     * 
     */
    public String getValues()
    {
        return m_Values;
    }

    @Override
    public InputPad<SvgSaturate> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<SvgSaturate> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

