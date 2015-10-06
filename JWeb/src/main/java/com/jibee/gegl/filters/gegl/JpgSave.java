package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
JPEG File Saver

JPEG image saver, using libjpeg

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class JpgSave extends GeglFilter
{
/** Constructs a JPEG File Saver.

JPEG image saver, using libjpeg
*/
    public JpgSave(GeglNode container)
    {
        super(container, "gegl:jpg-save");
    }
/** Constructs a JPEG File Saver.

JPEG image saver, using libjpeg
*/
    public JpgSave(GeglFilter parent)
    {
        super(parent, "gegl:jpg-save");
    }

    
/** File

Target path and filename, use '-' for stdout

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Path ;

/** File

Target path and filename, use '-' for stdout

Unit: 
Default value: 
Acceptable Range:  
*/
    public JpgSave setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

/** File

Target path and filename, use '-' for stdout

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getPath()
    {
        return m_Path;
    }


/** Quality

JPEG compression quality (between 1 and 100)

Unit: 
Default value: 90
Acceptable Range: 1 100
*/
    private int m_Quality  = 90;

/** Quality

JPEG compression quality (between 1 and 100)

Unit: 
Default value: 90
Acceptable Range: 1 100
*/
    public JpgSave setQuality(int value) throws ParameterOutOfRangeException
    {
		if(value > 100 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 100);
	}

        m_Quality = value;
        setProperty("quality", value);
        return this;
    }

/** Quality

JPEG compression quality (between 1 and 100)

Unit: 
Default value: 90
Acceptable Range: 1 100
*/
    public int getQuality()
    {
        return m_Quality;
    }


/** Smoothing

Smoothing factor from 1 to 100; 0 disables smoothing

Unit: 
Default value: 
Acceptable Range:  100
*/
    private int m_Smoothing ;

/** Smoothing

Smoothing factor from 1 to 100; 0 disables smoothing

Unit: 
Default value: 
Acceptable Range:  100
*/
    public JpgSave setSmoothing(int value) throws ParameterOutOfRangeException
    {
		if(value > 100)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 100);
	}

        m_Smoothing = value;
        setProperty("smoothing", value);
        return this;
    }

/** Smoothing

Smoothing factor from 1 to 100; 0 disables smoothing

Unit: 
Default value: 
Acceptable Range:  100
*/
    public int getSmoothing()
    {
        return m_Smoothing;
    }


/** Optimize

Use optimized huffman tables

Unit: 
Default value: true
Acceptable Range:  
*/
    private boolean m_Optimize  = true;

/** Optimize

Use optimized huffman tables

Unit: 
Default value: true
Acceptable Range:  
*/
    public JpgSave setOptimize(boolean value)
    {
	
        m_Optimize = value;
        setProperty("optimize", value);
        return this;
    }

/** Optimize

Use optimized huffman tables

Unit: 
Default value: true
Acceptable Range:  
*/
    public boolean getOptimize()
    {
        return m_Optimize;
    }


/** Progressive

Create progressive JPEG images

Unit: 
Default value: true
Acceptable Range:  
*/
    private boolean m_Progressive  = true;

/** Progressive

Create progressive JPEG images

Unit: 
Default value: true
Acceptable Range:  
*/
    public JpgSave setProgressive(boolean value)
    {
	
        m_Progressive = value;
        setProperty("progressive", value);
        return this;
    }

/** Progressive

Create progressive JPEG images

Unit: 
Default value: true
Acceptable Range:  
*/
    public boolean getProgressive()
    {
        return m_Progressive;
    }


/** Grayscale

Create a grayscale (monochrome) image

Unit: 
Default value: false
Acceptable Range:  
*/
    private boolean m_Grayscale  = false;

/** Grayscale

Create a grayscale (monochrome) image

Unit: 
Default value: false
Acceptable Range:  
*/
    public JpgSave setGrayscale(boolean value)
    {
	
        m_Grayscale = value;
        setProperty("grayscale", value);
        return this;
    }

/** Grayscale

Create a grayscale (monochrome) image

Unit: 
Default value: false
Acceptable Range:  
*/
    public boolean getGrayscale()
    {
        return m_Grayscale;
    }


}
