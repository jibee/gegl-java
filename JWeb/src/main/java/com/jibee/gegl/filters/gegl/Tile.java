package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Tile

Infinitely repeats the input image.

License: 
Supports OpenCL: 
Position Dependant: true
*/
public class Tile extends GeglFilter
{
/** Constructs a Tile.

Infinitely repeats the input image.
*/
    public Tile(GeglNode container)
    {
        super(container, "gegl:tile");
    }
/** Constructs a Tile.

Infinitely repeats the input image.
*/
    public Tile(GeglFilter parent)
    {
        super(parent, "gegl:tile");
    }

    
/** Horizontal offset



Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    private int m_OffsetX ;

/** Horizontal offset



Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    public Tile setOffsetX(int value)
    {
	
        m_OffsetX = value;
        setProperty("offset-x", value);
        return this;
    }

/** Horizontal offset



Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    public int getOffsetX()
    {
        return m_OffsetX;
    }


/** Vertical offset



Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    private int m_OffsetY ;

/** Vertical offset



Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    public Tile setOffsetY(int value)
    {
	
        m_OffsetY = value;
        setProperty("offset-y", value);
        return this;
    }

/** Vertical offset



Unit: pixel-coordinate
Default value: 
Acceptable Range:  
*/
    public int getOffsetY()
    {
        return m_OffsetY;
    }


}
