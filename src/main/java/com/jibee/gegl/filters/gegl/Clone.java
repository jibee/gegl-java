package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Clone
 *
 * Clone a buffer, this is the same as gegl:nop but can get special treatment to get more human readable references in serializations/UI.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"core"})
public class Clone extends GeglFilter implements Filter
{
    /** Constructs a Clone.
     *
     * Clone a buffer, this is the same as gegl:nop but can get special treatment to get more human readable references in serializations/UI.
     *
     * @param container container node
     */
    public Clone(GeglNode container)
    {
        super(container, "gegl:clone");
    }
    /** Constructs a Clone.
     *
     * Clone a buffer, this is the same as gegl:nop but can get special treatment to get more human readable references in serializations/UI.
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Reference
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Reference
     * 
     */
    public String getRef()
    {
        return m_Ref;
    }

    @Override
    public InputPad<Clone> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Clone> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

