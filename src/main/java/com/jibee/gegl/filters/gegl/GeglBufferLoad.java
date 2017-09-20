package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * 
 *
 * GeglBuffer file loader.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class GeglBufferLoad extends GeglFilter implements Source
{
    /** Constructs a .
     *
     * GeglBuffer file loader.
     *
     * @param container container node
     */
    public GeglBufferLoad(GeglNode container)
    {
        super(container, "gegl:gegl-buffer-load");
    }
    /** Constructs a .
     *
     * GeglBuffer file loader.
     *
     * @param parent parent filter node
     */
    public GeglBufferLoad(GeglFilter parent)
    {
        super(parent, "gegl:gegl-buffer-load");
    }

    
    /** File
     *
     * Path of GeglBuffer file to load.
     *
     * Unit: 
     * Default value: "/tmp/gegl-buffer.gegl"
     * Acceptable Range:  
     * */
    private String m_Path  = "/tmp/gegl-buffer.gegl";

    /** File
     *
     * Path of GeglBuffer file to load.
     *
     * Unit: 
     * Default value: "/tmp/gegl-buffer.gegl"
     * Acceptable Range:  
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
     */
    public GeglBufferLoad setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Path of GeglBuffer file to load.
     *
     * Unit: 
     * Default value: "/tmp/gegl-buffer.gegl"
     * Acceptable Range:  
     *
     * @return value of File
     * 
     */
    public String getPath()
    {
        return m_Path;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

