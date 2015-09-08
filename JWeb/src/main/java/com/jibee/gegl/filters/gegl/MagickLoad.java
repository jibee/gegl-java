package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**


Image Magick wrapper using the png op.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class MagickLoad extends GeglFilter
{
/** Constructs a .

Image Magick wrapper using the png op.
*/
    public MagickLoad(GeglNode container)
    {
        super(container, "gegl:magick-load");
    }
/** Constructs a .

Image Magick wrapper using the png op.
*/
    public MagickLoad(GeglFilter parent)
    {
        super(parent, "gegl:magick-load");
    }

    
/** File

Path of file to load.

Unit: 
Default value: "/tmp/gegl-logo.svg"
Acceptable Range:  
*/
    private String m_Path  = "/tmp/gegl-logo.svg";

/** File

Path of file to load.

Unit: 
Default value: "/tmp/gegl-logo.svg"
Acceptable Range:  
*/
    public MagickLoad setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

/** File

Path of file to load.

Unit: 
Default value: "/tmp/gegl-logo.svg"
Acceptable Range:  
*/
    public String getPath()
    {
        return m_Path;
    }


}

