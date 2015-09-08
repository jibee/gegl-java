package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
RGBE File Saver

RGBE image saver (Radiance HDR format)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class RgbeSave extends GeglFilter
{
/** Constructs a RGBE File Saver.

RGBE image saver (Radiance HDR format)
*/
    public RgbeSave(GeglNode container)
    {
        super(container, "gegl:rgbe-save");
    }
/** Constructs a RGBE File Saver.

RGBE image saver (Radiance HDR format)
*/
    public RgbeSave(GeglFilter parent)
    {
        super(parent, "gegl:rgbe-save");
    }

    
/** File

Target path and filename, use '-' for stdout.

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Path ;

/** File

Target path and filename, use '-' for stdout.

Unit: 
Default value: 
Acceptable Range:  
*/
    public RgbeSave setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

/** File

Target path and filename, use '-' for stdout.

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getPath()
    {
        return m_Path;
    }


}

