package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * 
 *
 * GEGL graph visualizer.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"render"})
public class Introspect extends GeglFilter implements Source
{
    /** Constructs a .
     *
     * GEGL graph visualizer.
     */
    public Introspect(GeglNode container)
    {
        super(container, "gegl:introspect");
    }
    /** Constructs a .
     *
     * GEGL graph visualizer.
     */
    public Introspect(GeglFilter parent)
    {
        super(parent, "gegl:introspect");
    }

    
    /** Node
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private GeglBuffer m_Node ;

    /** Node
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Introspect setNode(GeglBuffer value)
    {
	
        m_Node = value;
        setProperty("node", value);
        return this;
    }

    /** Node
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public GeglBuffer getNode()
    {
        return m_Node;
    }

    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

