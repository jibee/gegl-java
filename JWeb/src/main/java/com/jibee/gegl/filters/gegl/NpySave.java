package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**
NPY File Saver

NPY image saver (Numerical python file saver.)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class NpySave extends GeglFilter
{
/** Constructs a NPY File Saver.

NPY image saver (Numerical python file saver.)
*/
    public NpySave(GeglNode container)
    {
        super(container, "gegl:npy-save");
    }
/** Constructs a NPY File Saver.

NPY image saver (Numerical python file saver.)
*/
    public NpySave(GeglFilter parent)
    {
        super(parent, "gegl:npy-save");
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
    public NpySave setPath(String value)
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
