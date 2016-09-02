package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;

/**
 * Clone
 *
 * Clone a buffer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"core"})
public class Clone extends GeglFilter
{
    /** Constructs a Clone.
     *
     * Clone a buffer
     */
    public Clone(GeglNode container)
    {
        super(container, "gegl:clone");
    }
    /** Constructs a Clone.
     *
     * Clone a buffer
     */
    public Clone(GeglFilter parent)
    {
        super(parent, "gegl:clone");
    }

    
    /** Reference
     *
     * The reference ID used as input (for use in XML).
     *
     * Unit: 
     * Default value: "ID"
     * Acceptable Range:  
     * */
    private String m_Ref  = "ID";

    /** Reference
     *
     * The reference ID used as input (for use in XML).
     *
     * Unit: 
     * Default value: "ID"
     * Acceptable Range:  
     */
    public Clone setRef(String value)
    {
	
        m_Ref = value;
        setProperty("ref", value);
        return this;
    }

    /** Reference
     *
     * The reference ID used as input (for use in XML).
     *
     * Unit: 
     * Default value: "ID"
     * Acceptable Range:  
     */
    public String getRef()
    {
        return m_Ref;
    }

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

