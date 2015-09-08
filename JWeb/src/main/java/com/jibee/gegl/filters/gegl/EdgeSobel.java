package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**
Sobel Edge Detection

Specialized direction-dependent edge detection

License: 
Supports OpenCL: true
Position Dependant: 
*/
public class EdgeSobel extends GeglFilter
{
/** Constructs a Sobel Edge Detection.

Specialized direction-dependent edge detection
*/
    public EdgeSobel(GeglNode container)
    {
        super(container, "gegl:edge-sobel");
    }
/** Constructs a Sobel Edge Detection.

Specialized direction-dependent edge detection
*/
    public EdgeSobel(GeglFilter parent)
    {
        super(parent, "gegl:edge-sobel");
    }

    
/** Horizontal



Unit: 
Default value: true
Acceptable Range:  
*/
    private boolean m_Horizontal  = true;

/** Horizontal



Unit: 
Default value: true
Acceptable Range:  
*/
    public EdgeSobel setHorizontal(boolean value)
    {
	
        m_Horizontal = value;
        setProperty("horizontal", value);
        return this;
    }

/** Horizontal



Unit: 
Default value: true
Acceptable Range:  
*/
    public boolean getHorizontal()
    {
        return m_Horizontal;
    }


/** Vertical



Unit: 
Default value: true
Acceptable Range:  
*/
    private boolean m_Vertical  = true;

/** Vertical



Unit: 
Default value: true
Acceptable Range:  
*/
    public EdgeSobel setVertical(boolean value)
    {
	
        m_Vertical = value;
        setProperty("vertical", value);
        return this;
    }

/** Vertical



Unit: 
Default value: true
Acceptable Range:  
*/
    public boolean getVertical()
    {
        return m_Vertical;
    }


/** Keep Sign

Keep negative values in result; when off, the absolute value of the result is used instead.

Unit: 
Default value: true
Acceptable Range:  
*/
    private boolean m_KeepSign  = true;

/** Keep Sign

Keep negative values in result; when off, the absolute value of the result is used instead.

Unit: 
Default value: true
Acceptable Range:  
*/
    public EdgeSobel setKeepSign(boolean value)
    {
	
        m_KeepSign = value;
        setProperty("keep-sign", value);
        return this;
    }

/** Keep Sign

Keep negative values in result; when off, the absolute value of the result is used instead.

Unit: 
Default value: true
Acceptable Range:  
*/
    public boolean getKeepSign()
    {
        return m_KeepSign;
    }


}

