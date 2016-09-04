package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;

/**
 * 
 *
 * GeglBuffer file writer.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class GeglBufferSave extends GeglFilter implements Sink
{
    /** Constructs a .
     *
     * GeglBuffer file writer.
     */
    public GeglBufferSave(GeglNode container)
    {
        super(container, "gegl:gegl-buffer-save");
    }
    /** Constructs a .
     *
     * GeglBuffer file writer.
     */
    public GeglBufferSave(GeglFilter parent)
    {
        super(parent, "gegl:gegl-buffer-save");
    }

    
    /** File
     *
     * Target file path to write GeglBuffer to.
     *
     * Unit: 
     * Default value: "/tmp/gegl-buffer.gegl"
     * Acceptable Range:  
     * */
    private String m_Path  = "/tmp/gegl-buffer.gegl";

    /** File
     *
     * Target file path to write GeglBuffer to.
     *
     * Unit: 
     * Default value: "/tmp/gegl-buffer.gegl"
     * Acceptable Range:  
     */
    public GeglBufferSave setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Target file path to write GeglBuffer to.
     *
     * Unit: 
     * Default value: "/tmp/gegl-buffer.gegl"
     * Acceptable Range:  
     */
    public String getPath()
    {
        return m_Path;
    }

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }

}

