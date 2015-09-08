package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Grid

Grid renderer

License: 
Supports OpenCL: 
Position Dependant: true
*/
public class Grid extends GeglFilter
{
/** Constructs a Grid.

Grid renderer
*/
    public Grid(GeglNode container)
    {
        super(container, "gegl:grid");
    }
/** Constructs a Grid.

Grid renderer
*/
    public Grid(GeglFilter parent)
    {
        super(parent, "gegl:grid");
    }

    
/** Width

Horizontal width of cells pixels

Unit: pixel-distance
Default value: 32
Acceptable Range: 1 
*/
    private int m_X  = 32;

/** Width

Horizontal width of cells pixels

Unit: pixel-distance
Default value: 32
Acceptable Range: 1 
*/
    public Grid setX(int value) throws ParameterOutOfRangeException
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
Default value: 32
Acceptable Range: 1 
*/
    public int getX()
    {
        return m_X;
    }


/** Height

Vertical width of cells pixels

Unit: pixel-distance
Default value: 32
Acceptable Range: 1 
*/
    private int m_Y  = 32;

/** Height

Vertical width of cells pixels

Unit: pixel-distance
Default value: 32
Acceptable Range: 1 
*/
    public Grid setY(int value) throws ParameterOutOfRangeException
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
Default value: 32
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
    public Grid setXOffset(int value)
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
    public Grid setYOffset(int value)
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


/** Line width

Width of grid lines in pixels

Unit: pixel-distance
Default value: 4
Acceptable Range:  
*/
    private int m_LineWidth  = 4;

/** Line width

Width of grid lines in pixels

Unit: pixel-distance
Default value: 4
Acceptable Range:  
*/
    public Grid setLineWidth(int value)
    {
	
        m_LineWidth = value;
        setProperty("line-width", value);
        return this;
    }

/** Line width

Width of grid lines in pixels

Unit: pixel-distance
Default value: 4
Acceptable Range:  
*/
    public int getLineWidth()
    {
        return m_LineWidth;
    }


/** Line height

Height of grid lines in pixels

Unit: pixel-distance
Default value: 4
Acceptable Range:  
*/
    private int m_LineHeight  = 4;

/** Line height

Height of grid lines in pixels

Unit: pixel-distance
Default value: 4
Acceptable Range:  
*/
    public Grid setLineHeight(int value)
    {
	
        m_LineHeight = value;
        setProperty("line-height", value);
        return this;
    }

/** Line height

Height of grid lines in pixels

Unit: pixel-distance
Default value: 4
Acceptable Range:  
*/
    public int getLineHeight()
    {
        return m_LineHeight;
    }


/** Color

Color of the grid lines

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    private GeglColor m_LineColor  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

/** Color

Color of the grid lines

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public Grid setLineColor(GeglColor value)
    {
	
        m_LineColor = value;
        setProperty("line-color", value);
        return this;
    }

/** Color

Color of the grid lines

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public GeglColor getLineColor()
    {
        return m_LineColor;
    }


}

