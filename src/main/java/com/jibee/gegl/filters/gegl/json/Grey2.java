package com.jibee.gegl.filters.gegl.json;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * 
 *
 * 
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"meta", "json"})
public class Grey2 extends GeglFilter implements Source, Sink
{
    /** Constructs a .
     *
     * 
     */
    public Grey2(GeglNode container)
    {
        super(container, "gegl:json:grey2");
    }
    /** Constructs a .
     *
     * 
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
     */
    public double getWidth()
    {
        return m_Width;
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
