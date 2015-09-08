package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Tile Glass

Simulate distortion caused by rectangular glass tiles

License: GPL3+
Supports OpenCL: 
Position Dependant: true
*/
public class TileGlass extends GeglFilter
{
/** Constructs a Tile Glass.

Simulate distortion caused by rectangular glass tiles
*/
    public TileGlass(GeglNode container)
    {
        super(container, "gegl:tile-glass");
    }
/** Constructs a Tile Glass.

Simulate distortion caused by rectangular glass tiles
*/
    public TileGlass(GeglFilter parent)
    {
        super(parent, "gegl:tile-glass");
    }

    
/** Tile Width



Unit: pixel-distance
Default value: 25
Acceptable Range: 5 500
*/
    private int m_TileWidth  = 25;

/** Tile Width



Unit: pixel-distance
Default value: 25
Acceptable Range: 5 500
*/
    public TileGlass setTileWidth(int value) throws ParameterOutOfRangeException
    {
		if(value > 500 || value < 5)
	{
	    throw new ParameterOutOfRangeException(value, 5, 500);
	}

        m_TileWidth = value;
        setProperty("tile-width", value);
        return this;
    }

/** Tile Width



Unit: pixel-distance
Default value: 25
Acceptable Range: 5 500
*/
    public int getTileWidth()
    {
        return m_TileWidth;
    }


/** Tile Height



Unit: pixel-distance
Default value: 25
Acceptable Range: 5 500
*/
    private int m_TileHeight  = 25;

/** Tile Height



Unit: pixel-distance
Default value: 25
Acceptable Range: 5 500
*/
    public TileGlass setTileHeight(int value) throws ParameterOutOfRangeException
    {
		if(value > 500 || value < 5)
	{
	    throw new ParameterOutOfRangeException(value, 5, 500);
	}

        m_TileHeight = value;
        setProperty("tile-height", value);
        return this;
    }

/** Tile Height



Unit: pixel-distance
Default value: 25
Acceptable Range: 5 500
*/
    public int getTileHeight()
    {
        return m_TileHeight;
    }


}

