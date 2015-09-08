package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**


Performs an averaging of neighboring pixels with the normal distribution as weighting

License: 
Supports OpenCL: true
Position Dependant: 
*/
public class Gblur1d extends GeglFilter
{
/** Constructs a .

Performs an averaging of neighboring pixels with the normal distribution as weighting
*/
    public Gblur1d(GeglNode container)
    {
        super(container, "gegl:gblur-1d");
    }
/** Constructs a .

Performs an averaging of neighboring pixels with the normal distribution as weighting
*/
    public Gblur1d(GeglFilter parent)
    {
        super(parent, "gegl:gblur-1d");
    }

    
/** Size

Standard deviation (spatial scale factor)

Unit: 
Default value: 1.50
Acceptable Range: 0.00 1500.00
*/
    private double m_StdDev  = 1.50;

/** Size

Standard deviation (spatial scale factor)

Unit: 
Default value: 1.50
Acceptable Range: 0.00 1500.00
*/
    public Gblur1d setStdDev(double value) throws ParameterOutOfRangeException
    {
		if(value > 1500.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1500.00);
	}

        m_StdDev = value;
        setProperty("std-dev", value);
        return this;
    }

/** Size

Standard deviation (spatial scale factor)

Unit: 
Default value: 1.50
Acceptable Range: 0.00 1500.00
*/
    public double getStdDev()
    {
        return m_StdDev;
    }


/** Orientation

The orientation of the blur - hor/ver

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Orientation ;

/** Orientation

The orientation of the blur - hor/ver

Unit: 
Default value: 
Acceptable Range:  
*/
    public Gblur1d setOrientation(String value)
    {
	
        m_Orientation = value;
        setProperty("orientation", value);
        return this;
    }

/** Orientation

The orientation of the blur - hor/ver

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getOrientation()
    {
        return m_Orientation;
    }


/** Filter

How the gaussian kernel is discretized

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Filter ;

/** Filter

How the gaussian kernel is discretized

Unit: 
Default value: 
Acceptable Range:  
*/
    public Gblur1d setFilter(String value)
    {
	
        m_Filter = value;
        setProperty("filter", value);
        return this;
    }

/** Filter

How the gaussian kernel is discretized

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getFilter()
    {
        return m_Filter;
    }


/** Abyss policy

How image edges are handled

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_AbyssPolicy ;

/** Abyss policy

How image edges are handled

Unit: 
Default value: 
Acceptable Range:  
*/
    public Gblur1d setAbyssPolicy(String value)
    {
	
        m_AbyssPolicy = value;
        setProperty("abyss-policy", value);
        return this;
    }

/** Abyss policy

How image edges are handled

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getAbyssPolicy()
    {
        return m_AbyssPolicy;
    }


/** Clip to the input extent

Should the output extent be clipped to the input extent

Unit: 
Default value: true
Acceptable Range:  
*/
    private boolean m_ClipExtent  = true;

/** Clip to the input extent

Should the output extent be clipped to the input extent

Unit: 
Default value: true
Acceptable Range:  
*/
    public Gblur1d setClipExtent(boolean value)
    {
	
        m_ClipExtent = value;
        setProperty("clip-extent", value);
        return this;
    }

/** Clip to the input extent

Should the output extent be clipped to the input extent

Unit: 
Default value: true
Acceptable Range:  
*/
    public boolean getClipExtent()
    {
        return m_ClipExtent;
    }


}

