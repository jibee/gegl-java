package com.jibee.gegl.filters.gegl.json;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * 
 *
 * 
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"meta", "json"})
public class Grey2 extends GeglFilter implements Filter
{
    /** Constructs a .
     *
     * 
     *
     * @param container container node
     */
    public Grey2(GeglNode container)
    {
        super(container, "gegl:json:grey2");
    }
    /** Constructs a .
     *
     * 
     *
     * @param parent parent filter node
     */
    public Grey2(GeglFilter parent)
    {
        super(parent, "gegl:json:grey2");
    }

    
    /** height
     *
     * 
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range:  
     * */
    private double m_Height  = 10.00;

    /** height
     *
     * 
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range:  
     *
     * @param value new value for height
     * @return this filter (for chaining operations)
     * 
     */
    public Grey2 setHeight(double value)
    {
	
        m_Height = value;
        setProperty("height", value);
        return this;
    }

    /** height
     *
     * 
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range:  
     *
     * @return value of height
     * 
     */
    public double getHeight()
    {
        return m_Height;
    }


    /** width
     *
     * 
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range:  
     * */
    private double m_Width  = 10.00;

    /** width
     *
     * 
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range:  
     *
     * @param value new value for width
     * @return this filter (for chaining operations)
     * 
     */
    public Grey2 setWidth(double value)
    {
	
        m_Width = value;
        setProperty("width", value);
        return this;
    }

    /** width
     *
     * 
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range:  
     *
     * @return value of width
     * 
     */
    public double getWidth()
    {
        return m_Width;
    }

    @Override
    public InputPad<Grey2> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Grey2> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

