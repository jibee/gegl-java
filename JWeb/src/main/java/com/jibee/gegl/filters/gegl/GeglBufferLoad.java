package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**


GeglBuffer file loader.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class GeglBufferLoad extends GeglFilter
{
/** Constructs a .

GeglBuffer file loader.
*/
    public GeglBufferLoad(GeglNode container)
    {
        super(container, "gegl:gegl-buffer-load");
    }
/** Constructs a .

GeglBuffer file loader.
*/
    public GeglBufferLoad(GeglFilter parent)
    {
        super(parent, "gegl:gegl-buffer-load");
    }

    
/** File

Path of GeglBuffer file to load.

Unit: 
Default value: "/tmp/gegl-buffer.gegl"
Acceptable Range:  
*/
    private String m_Path  = "/tmp/gegl-buffer.gegl";

/** File

Path of GeglBuffer file to load.

Unit: 
Default value: "/tmp/gegl-buffer.gegl"
Acceptable Range:  
*/
    public GeglBufferLoad setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

/** File

Path of GeglBuffer file to load.

Unit: 
Default value: "/tmp/gegl-buffer.gegl"
Acceptable Range:  
*/
    public String getPath()
    {
        return m_Path;
    }


}
