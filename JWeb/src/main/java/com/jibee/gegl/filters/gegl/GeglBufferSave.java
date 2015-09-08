package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**


GeglBuffer file writer.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class GeglBufferSave extends GeglFilter
{
/** Constructs a .

GeglBuffer file writer.
*/
    public GeglBufferSave(GeglNode container)
    {
        super(container, "gegl:gegl-buffer-save");
    }
/** Constructs a .

GeglBuffer file writer.
*/
    public GeglBufferSave(GeglFilter parent)
    {
        super(parent, "gegl:gegl-buffer-save");
    }

    
/** File

Target file path to write GeglBuffer to.

Unit: 
Default value: "/tmp/gegl-buffer.gegl"
Acceptable Range:  
*/
    private String m_Path  = "/tmp/gegl-buffer.gegl";

/** File

Target file path to write GeglBuffer to.

Unit: 
Default value: "/tmp/gegl-buffer.gegl"
Acceptable Range:  
*/
    public GeglBufferSave setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

/** File

Target file path to write GeglBuffer to.

Unit: 
Default value: "/tmp/gegl-buffer.gegl"
Acceptable Range:  
*/
    public String getPath()
    {
        return m_Path;
    }


}

