package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * 
 *
 * Raw image loader, wrapping dcraw with pipes.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class DcrawLoad extends GeglFilter
{
    /** Constructs a .
     *
     * Raw image loader, wrapping dcraw with pipes.
     */
    public DcrawLoad(GeglNode container)
    {
        super(container, "gegl:dcraw-load");
    }
    /** Constructs a .
     *
     * Raw image loader, wrapping dcraw with pipes.
     */
    public DcrawLoad(GeglFilter parent)
    {
        super(parent, "gegl:dcraw-load");
    }

    
    /** File
     *
     * Path of file to load.
     *
     * Unit: 
     * Default value: "/tmp/test.raw"
     * Acceptable Range:  
     * */
    private String m_Path  = "/tmp/test.raw";

    /** File
     *
     * Path of file to load.
     *
     * Unit: 
     * Default value: "/tmp/test.raw"
     * Acceptable Range:  
     */
    public DcrawLoad setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Path of file to load.
     *
     * Unit: 
     * Default value: "/tmp/test.raw"
     * Acceptable Range:  
     */
    public String getPath()
    {
        return m_Path;
    }

    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

