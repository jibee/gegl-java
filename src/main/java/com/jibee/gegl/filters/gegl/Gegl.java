package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * GEGL graph
 *
 * Do a chain of operations, with key=value pairs after each operation name to set properties. And aux=[ source filter ] for specifying a chain with a source as something connected to an aux pad.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"generic"})
public class Gegl extends GeglFilter implements Filter
{
    /** Constructs a GEGL graph.
     *
     * Do a chain of operations, with key=value pairs after each operation name to set properties. And aux=[ source filter ] for specifying a chain with a source as something connected to an aux pad.
     *
     * @param container container node
     */
    public Gegl(GeglNode container)
    {
        super(container, "gegl:gegl");
    }
    /** Constructs a GEGL graph.
     *
     * Do a chain of operations, with key=value pairs after each operation name to set properties. And aux=[ source filter ] for specifying a chain with a source as something connected to an aux pad.
     *
     * @param parent parent filter node
     */
    public Gegl(GeglFilter parent)
    {
        super(parent, "gegl:gegl");
    }

    
    /** pipeline
     *
     * [op [property=value] [property=value]] [[op] [property=value]
     *
     * Unit: 
     * Default value: "gaussian-blur std-dev-x=0.3rel std-dev-y=0.3rel"
     * Acceptable Range:  
     * */
    private String m_String  = "gaussian-blur std-dev-x=0.3rel std-dev-y=0.3rel";

    /** pipeline
     *
     * [op [property=value] [property=value]] [[op] [property=value]
     *
     * Unit: 
     * Default value: "gaussian-blur std-dev-x=0.3rel std-dev-y=0.3rel"
     * Acceptable Range:  
     *
     * @param value new value for pipeline
     * @return this filter (for chaining operations)
     * 
     */
    public Gegl setString(String value)
    {
	
        m_String = value;
        setProperty("string", value);
        return this;
    }

    /** pipeline
     *
     * [op [property=value] [property=value]] [[op] [property=value]
     *
     * Unit: 
     * Default value: "gaussian-blur std-dev-x=0.3rel std-dev-y=0.3rel"
     * Acceptable Range:  
     *
     * @return value of pipeline
     * 
     */
    public String getString()
    {
        return m_String;
    }


    /** Eeeeeek
     *
     * There is a problem in the syntax or in the application of parsed property values. Things might mostly work nevertheless.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Error ;

    /** Eeeeeek
     *
     * There is a problem in the syntax or in the application of parsed property values. Things might mostly work nevertheless.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Eeeeeek
     * @return this filter (for chaining operations)
     * 
     */
    public Gegl setError(String value)
    {
	
        m_Error = value;
        setProperty("error", value);
        return this;
    }

    /** Eeeeeek
     *
     * There is a problem in the syntax or in the application of parsed property values. Things might mostly work nevertheless.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Eeeeeek
     * 
     */
    public String getError()
    {
        return m_Error;
    }

    @Override
    public InputPad<Gegl> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Gegl> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

