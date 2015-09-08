package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglColor;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Babl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Checkerboard

Create a checkerboard pattern

License: 
Supports OpenCL: 
Position Dependant: true
*/
public class Checkerboard extends GeglFilter
{
/** Constructs a Checkerboard.

Create a checkerboard pattern
*/
    public Checkerboard(GeglNode container)
    {
        super(container, "gegl:checkerboard");
    }
/** Constructs a Checkerboard.

Create a checkerboard pattern
*/
    public Checkerboard(GeglFilter parent)
    {
        super(parent, "gegl:checkerboard");
    }

    
/** Width

Horizontal width of cells pixels

Unit: pixel-distance
Default value: 16
Acceptable Range: 1 
*/
    private int m_X  = 16;

/** Width

Horizontal width of cells pixels

Unit: pixel-distance
Default value: 16
Acceptable Range: 1 
*/
    public Checkerboard setX(int value) throws ParameterOutOfRangeException
    {
		if(value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, Double.POSITIVE_INFINITY);
	}

        m_X = value;
        setProperty("x", value);
        return this;
    }

/** Width

Horizontal width of cells pixels

Unit: pixel-distance
Default value: 16
Acceptable Range: 1 
*/
    public int getX()
    {
        return m_X;
    }


/** Height

Vertical width of cells pixels

Unit: pixel-distance
Default value: 16
Acceptable Range: 1 
*/
    private int m_Y  = 16;

/** Height

Vertical width of cells pixels

Unit: pixel-distance
Default value: 16
Acceptable Range: 1 
*/
    public Checkerboard setY(int value) throws ParameterOutOfRangeException
    {
		if(value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, Double.POSITIVE_INFINITY);
	}

        m_Y = value;
        setProperty("y", value);
        return this;
    }

/** Height

Vertical width of cells pixels

Unit: pixel-distance
Default value: 16
Acceptable Range: 1 
*/
    public int getY()
    {
        return m_Y;
    }


/** Offset X

Horizontal offset (from origin) for start of grid

Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    private int m_XOffset ;

/** Offset X

Horizontal offset (from origin) for start of grid

Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    public Checkerboard setXOffset(int value)
    {
	
        m_XOffset = value;
        setProperty("x-offset", value);
        return this;
    }

/** Offset X

Horizontal offset (from origin) for start of grid

Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    public int getXOffset()
    {
        return m_XOffset;
    }


/** Offset Y

Vertical offset (from origin) for start of grid

Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    private int m_YOffset ;

/** Offset Y

Vertical offset (from origin) for start of grid

Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    public Checkerboard setYOffset(int value)
    {
	
        m_YOffset = value;
        setProperty("y-offset", value);
        return this;
    }

/** Offset Y

Vertical offset (from origin) for start of grid

Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    public int getYOffset()
    {
        return m_YOffset;
    }


/** Color 1

The first cell color

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    private GeglColor m_Color1  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

/** Color 1

The first cell color

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public Checkerboard setColor1(GeglColor value)
    {
	
        m_Color1 = value;
        setProperty("color1", value);
        return this;
    }

/** Color 1

The first cell color

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public GeglColor getColor1()
    {
        return m_Color1;
    }


/** Color 2

The second cell color

Unit: 
Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
Acceptable Range:  
*/
    private GeglColor m_Color2  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

/** Color 2

The second cell color

Unit: 
Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
Acceptable Range:  
*/
    public Checkerboard setColor2(GeglColor value)
    {
	
        m_Color2 = value;
        setProperty("color2", value);
        return this;
    }

/** Color 2

The second cell color

Unit: 
Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
Acceptable Range:  
*/
    public GeglColor getColor2()
    {
        return m_Color2;
    }


/** Babl Format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    private Babl m_Format ;

/** Babl Format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    public Checkerboard setFormat(Babl value)
    {
	
        m_Format = value;
        setProperty("format", value);
        return this;
    }

/** Babl Format

The babl format of the output

Unit: 
Default value: 
Acceptable Range:  
*/
    public Babl getFormat()
    {
        return m_Format;
    }


}

