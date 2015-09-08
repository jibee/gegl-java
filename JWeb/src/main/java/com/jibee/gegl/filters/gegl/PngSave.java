package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;

/**
PNG File Saver

PNG image saver (passes the buffer through, saves as a side-effect.)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class PngSave extends GeglFilter
{
/** Constructs a PNG File Saver.

PNG image saver (passes the buffer through, saves as a side-effect.)
*/
    public PngSave(GeglNode container)
    {
        super(container, "gegl:png-save");
    }
/** Constructs a PNG File Saver.

PNG image saver (passes the buffer through, saves as a side-effect.)
*/
    public PngSave(GeglFilter parent)
    {
        super(parent, "gegl:png-save");
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
    public PngSave setPath(String value)
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


/** Compression

PNG compression level from 1 to 9

Unit: 
Default value: 3
Acceptable Range: 1 9
*/
    private int m_Compression  = 3;

/** Compression

PNG compression level from 1 to 9

Unit: 
Default value: 3
Acceptable Range: 1 9
*/
    public PngSave setCompression(int value) throws ParameterOutOfRangeException
    {
		if(value > 9 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 9);
	}

        m_Compression = value;
        setProperty("compression", value);
        return this;
    }

/** Compression

PNG compression level from 1 to 9

Unit: 
Default value: 3
Acceptable Range: 1 9
*/
    public int getCompression()
    {
        return m_Compression;
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
    public PngSave setBitdepth(int value) throws ParameterOutOfRangeException
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

