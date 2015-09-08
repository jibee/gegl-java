package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**
Video Degradation

This function simulates the degradation of being on an old low-dotpitch RGB video monitor.

License: GPL3+
Supports OpenCL: 
Position Dependant: 
*/
public class VideoDegradation extends GeglFilter
{
/** Constructs a Video Degradation.

This function simulates the degradation of being on an old low-dotpitch RGB video monitor.
*/
    public VideoDegradation(GeglNode container)
    {
        super(container, "gegl:video-degradation");
    }
/** Constructs a Video Degradation.

This function simulates the degradation of being on an old low-dotpitch RGB video monitor.
*/
    public VideoDegradation(GeglFilter parent)
    {
        super(parent, "gegl:video-degradation");
    }

    
/** Pattern

Type of RGB pattern to use

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Pattern ;

/** Pattern

Type of RGB pattern to use

Unit: 
Default value: 
Acceptable Range:  
*/
    public VideoDegradation setPattern(String value)
    {
	
        m_Pattern = value;
        setProperty("pattern", value);
        return this;
    }

/** Pattern

Type of RGB pattern to use

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getPattern()
    {
        return m_Pattern;
    }


/** Additive

Whether the function adds the result to the original image.

Unit: 
Default value: true
Acceptable Range:  
*/
    private boolean m_Additive  = true;

/** Additive

Whether the function adds the result to the original image.

Unit: 
Default value: true
Acceptable Range:  
*/
    public VideoDegradation setAdditive(boolean value)
    {
	
        m_Additive = value;
        setProperty("additive", value);
        return this;
    }

/** Additive

Whether the function adds the result to the original image.

Unit: 
Default value: true
Acceptable Range:  
*/
    public boolean getAdditive()
    {
        return m_Additive;
    }


/** Rotated

Whether to rotate the RGB pattern by ninety degrees.

Unit: 
Default value: false
Acceptable Range:  
*/
    private boolean m_Rotated  = false;

/** Rotated

Whether to rotate the RGB pattern by ninety degrees.

Unit: 
Default value: false
Acceptable Range:  
*/
    public VideoDegradation setRotated(boolean value)
    {
	
        m_Rotated = value;
        setProperty("rotated", value);
        return this;
    }

/** Rotated

Whether to rotate the RGB pattern by ninety degrees.

Unit: 
Default value: false
Acceptable Range:  
*/
    public boolean getRotated()
    {
        return m_Rotated;
    }


}

