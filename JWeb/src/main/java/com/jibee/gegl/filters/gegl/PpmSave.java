package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;

/**
PPM File Saver

PPM image saver (Portable pixmap saver.)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class PpmSave extends GeglFilter
{
/** Constructs a PPM File Saver.

PPM image saver (Portable pixmap saver.)
*/
    public PpmSave(GeglNode container)
    {
        super(container, "gegl:ppm-save");
    }
/** Constructs a PPM File Saver.

PPM image saver (Portable pixmap saver.)
*/
    public PpmSave(GeglFilter parent)
    {
        super(parent, "gegl:ppm-save");
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
    public PpmSave setPath(String value)
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


/** Raw format



Unit: 
Default value: true
Acceptable Range:  
*/
    private boolean m_Rawformat  = true;

/** Raw format



Unit: 
Default value: true
Acceptable Range:  
*/
    public PpmSave setRawformat(boolean value)
    {
	
        m_Rawformat = value;
        setProperty("rawformat", value);
        return this;
    }

/** Raw format



Unit: 
Default value: true
Acceptable Range:  
*/
    public boolean getRawformat()
    {
        return m_Rawformat;
    }


/** Bitdepth

8 and 16 are the currently accepted values.

Unit: 
Default value: 16
Acceptable Range: 8 16
*/
    private int m_Bitdepth  = 16;

/** Bitdepth

8 and 16 are the currently accepted values.

Unit: 
Default value: 16
Acceptable Range: 8 16
*/
    public PpmSave setBitdepth(int value) throws ParameterOutOfRangeException
    {
		if(value > 16 || value < 8)
	{
	    throw new ParameterOutOfRangeException(value, 8, 16);
	}

        m_Bitdepth = value;
        setProperty("bitdepth", value);
        return this;
    }

/** Bitdepth

8 and 16 are the currently accepted values.

Unit: 
Default value: 16
Acceptable Range: 8 16
*/
    public int getBitdepth()
    {
        return m_Bitdepth;
    }


}

