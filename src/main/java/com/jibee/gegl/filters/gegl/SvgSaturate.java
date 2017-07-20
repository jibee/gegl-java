package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * SVG Saturate
 *
 * SVG color matrix operation svg_saturate
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class SvgSaturate extends GeglFilter implements Source, Sink
{
    /** Constructs a SVG Saturate.
     *
     * SVG color matrix operation svg_saturate
     */
    public SvgSaturate(GeglNode container)
    {
        super(container, "gegl:svg-saturate");
    }
    /** Constructs a SVG Saturate.
     *
     * SVG color matrix operation svg_saturate
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
     */
    public String getValues()
    {
        return m_Values;
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

