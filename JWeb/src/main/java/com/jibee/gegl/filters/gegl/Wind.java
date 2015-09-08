package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Wind

Wind-like bleed effect

License: GPL3+
Supports OpenCL: 
Position Dependant: 
*/
public class Wind extends GeglFilter
{
/** Constructs a Wind.

Wind-like bleed effect
*/
    public Wind(GeglNode container)
    {
        super(container, "gegl:wind");
    }
/** Constructs a Wind.

Wind-like bleed effect
*/
    public Wind(GeglFilter parent)
    {
        super(parent, "gegl:wind");
    }

    
/** Style

Style of effect

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Style ;

/** Style

Style of effect

Unit: 
Default value: 
Acceptable Range:  
*/
    public Wind setStyle(String value)
    {
	
        m_Style = value;
        setProperty("style", value);
        return this;
    }

/** Style

Style of effect

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getStyle()
    {
        return m_Style;
    }


/** Direction

Direction of the effect

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Direction ;

/** Direction

Direction of the effect

Unit: 
Default value: 
Acceptable Range:  
*/
    public Wind setDirection(String value)
    {
	
        m_Direction = value;
        setProperty("direction", value);
        return this;
    }

/** Direction

Direction of the effect

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getDirection()
    {
        return m_Direction;
    }


/** Edge Affected

Edge behavior

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Edge ;

/** Edge Affected

Edge behavior

Unit: 
Default value: 
Acceptable Range:  
*/
    public Wind setEdge(String value)
    {
	
        m_Edge = value;
        setProperty("edge", value);
        return this;
    }

/** Edge Affected

Edge behavior

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getEdge()
    {
        return m_Edge;
    }


/** Threshold

Higher values restrict the effect to fewer areas of the image

Unit: 
Default value: 10
Acceptable Range:  50
*/
    private int m_Threshold  = 10;

/** Threshold

Higher values restrict the effect to fewer areas of the image

Unit: 
Default value: 10
Acceptable Range:  50
*/
    public Wind setThreshold(int value) throws ParameterOutOfRangeException
    {
		if(value > 50)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 50);
	}

        m_Threshold = value;
        setProperty("threshold", value);
        return this;
    }

/** Threshold

Higher values restrict the effect to fewer areas of the image

Unit: 
Default value: 10
Acceptable Range:  50
*/
    public int getThreshold()
    {
        return m_Threshold;
    }


/** Strength

Higher values increase the magnitude of the effect

Unit: 
Default value: 10
Acceptable Range: 1 100
*/
    private int m_Strength  = 10;

/** Strength

Higher values increase the magnitude of the effect

Unit: 
Default value: 10
Acceptable Range: 1 100
*/
    public Wind setStrength(int value) throws ParameterOutOfRangeException
    {
		if(value > 100 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 100);
	}

        m_Strength = value;
        setProperty("strength", value);
        return this;
    }

/** Strength

Higher values increase the magnitude of the effect

Unit: 
Default value: 10
Acceptable Range: 1 100
*/
    public int getStrength()
    {
        return m_Strength;
    }


}

