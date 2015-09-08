package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Save

Multipurpose file saver, that uses other native save handlers depending on extension, use the format specific save ops to specify additional parameters.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Save extends GeglFilter
{
/** Constructs a Save.

Multipurpose file saver, that uses other native save handlers depending on extension, use the format specific save ops to specify additional parameters.
*/
    public Save(GeglNode container)
    {
        super(container, "gegl:save");
    }
/** Constructs a Save.

Multipurpose file saver, that uses other native save handlers depending on extension, use the format specific save ops to specify additional parameters.
*/
    public Save(GeglFilter parent)
    {
        super(parent, "gegl:save");
    }

    
/** File

Path of file to save.

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Path ;

/** File

Path of file to save.

Unit: 
Default value: 
Acceptable Range:  
*/
    public GeglFilter setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

/** File

Path of file to save.

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getPath()
    {
        return m_Path;
    }


}

