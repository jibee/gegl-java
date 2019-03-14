package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * SVG Hue Rotate
 *
 * SVG color matrix operation svg_huerotate
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class SvgHuerotate extends GeglFilter implements Filter
{
    /** Constructs a SVG Hue Rotate.
     *
     * SVG color matrix operation svg_huerotate
     *
     * @param container container node
     */
    public SvgHuerotate(GeglNode container)
    {
        super(container, "gegl:svg-huerotate");
    }
    /** Constructs a SVG Hue Rotate.
     *
     * SVG color matrix operation svg_huerotate
     *
     * @param parent parent filter node
     */
    public SvgHuerotate(GeglFilter parent)
    {
        super(parent, "gegl:svg-huerotate");
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
    public SvgHuerotate setValues(String value)
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
    public InputPad<SvgHuerotate> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<SvgHuerotate> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

