package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * 
 *
 * SVG color matrix operation svg_matrix
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class SvgMatrix extends GeglFilter
{
    /** Constructs a .
     *
     * SVG color matrix operation svg_matrix
     */
    public SvgMatrix(GeglNode container)
    {
        super(container, "gegl:svg-matrix");
    }
    /** Constructs a .
     *
     * SVG color matrix operation svg_matrix
     */
    public SvgMatrix(GeglFilter parent)
    {
        super(parent, "gegl:svg-matrix");
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
    public SvgMatrix setValues(String value)
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

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

