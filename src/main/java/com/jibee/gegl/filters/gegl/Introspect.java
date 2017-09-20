package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * 
 *
 * GEGL graph visualizer.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"render"})
public class Introspect extends GeglFilter implements Source
{
    /** Constructs a .
     *
     * GEGL graph visualizer.
     *
     * @param container container node
     */
    public Introspect(GeglNode container)
    {
        super(container, "gegl:introspect");
    }
    /** Constructs a .
     *
     * GEGL graph visualizer.
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Node
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Node
     * 
     */
    public GeglBuffer getNode()
    {
        return m_Node;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

