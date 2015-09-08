package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**
JPEG 2000 File Loader

JPEG 2000 image loader using jasper.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Jp2Load extends GeglFilter
{
/** Constructs a JPEG 2000 File Loader.

JPEG 2000 image loader using jasper.
*/
    public Jp2Load(GeglNode container)
    {
        super(container, "gegl:jp2-load");
    }
/** Constructs a JPEG 2000 File Loader.

JPEG 2000 image loader using jasper.
*/
    public Jp2Load(GeglFilter parent)
    {
        super(parent, "gegl:jp2-load");
    }

    
/** File

Path of file to load

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Path ;

/** File

Path of file to load

Unit: 
Default value: 
Acceptable Range:  
*/
    public Jp2Load setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

/** File

Path of file to load

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getPath()
    {
        return m_Path;
    }


}

