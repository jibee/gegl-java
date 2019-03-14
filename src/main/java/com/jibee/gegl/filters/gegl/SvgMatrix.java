package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * SVG Matrix
 *
 * SVG color matrix operation svg_matrix
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class SvgMatrix extends GeglFilter implements Filter
{
    /** Constructs a SVG Matrix.
     *
     * SVG color matrix operation svg_matrix
     *
     * @param container container node
     */
    public SvgMatrix(GeglNode container)
    {
        super(container, "gegl:svg-matrix");
    }
    /** Constructs a SVG Matrix.
     *
     * SVG color matrix operation svg_matrix
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Values
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Values
     * 
     */
    public String getValues()
    {
        return m_Values;
    }

    @Override
    public InputPad<SvgMatrix> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<SvgMatrix> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

