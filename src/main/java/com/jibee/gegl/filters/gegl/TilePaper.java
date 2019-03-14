package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Paper Tile
 *
 * Cut image into paper tiles, and slide them
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=true, categories={"artistic", "map"})
public class TilePaper extends GeglFilter implements Filter
{
    /** Constructs a Paper Tile.
     *
     * Cut image into paper tiles, and slide them
     *
     * @param container container node
     */
    public TilePaper(GeglNode container)
    {
        super(container, "gegl:tile-paper");
    }
    /** Constructs a Paper Tile.
     *
     * Cut image into paper tiles, and slide them
     *
     * @param parent parent filter node
     */
    public TilePaper(GeglFilter parent)
    {
        super(parent, "gegl:tile-paper");
    }

    
    /** Tile Width
     *
     * Width of the tile
     *
     * Unit: pixel-distance
     * Default value: 155
     * Acceptable Range: 1 
     * */
    private int m_TileWidth  = 155;

    /** Tile Width
     *
     * Width of the tile
     *
     * Unit: pixel-distance
     * Default value: 155
     * Acceptable Range: 1 
     *
     * @param value new value for Tile Width
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public TilePaper setTileWidth(int value) throws ParameterOutOfRangeException
    {
		if(value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, Double.POSITIVE_INFINITY);
	    }

        m_TileWidth = value;
        setProperty("tile-width", value);
        return this;
    }

    /** Tile Width
     *
     * Width of the tile
     *
     * Unit: pixel-distance
     * Default value: 155
     * Acceptable Range: 1 
     *
     * @return value of Tile Width
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getTileWidth()
    {
        return m_TileWidth;
    }


    /** Tile Height
     *
     * Height of the tile
     *
     * Unit: pixel-distance
     * Default value: 56
     * Acceptable Range: 1 
     * */
    private int m_TileHeight  = 56;

    /** Tile Height
     *
     * Height of the tile
     *
     * Unit: pixel-distance
     * Default value: 56
     * Acceptable Range: 1 
     *
     * @param value new value for Tile Height
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public TilePaper setTileHeight(int value) throws ParameterOutOfRangeException
    {
		if(value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, Double.POSITIVE_INFINITY);
	    }

        m_TileHeight = value;
        setProperty("tile-height", value);
        return this;
    }

    /** Tile Height
     *
     * Height of the tile
     *
     * Unit: pixel-distance
     * Default value: 56
     * Acceptable Range: 1 
     *
     * @return value of Tile Height
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getTileHeight()
    {
        return m_TileHeight;
    }


    /** Move rate
     *
     * Move rate
     *
     * Unit: percent
     * Default value: 25.00
     * Acceptable Range: 1.00 100.00
     * */
    private double m_MoveRate  = 25.00;

    /** Move rate
     *
     * Move rate
     *
     * Unit: percent
     * Default value: 25.00
     * Acceptable Range: 1.00 100.00
     *
     * @param value new value for Move rate
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public TilePaper setMoveRate(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 1.00)
	    {
	        throw new ParameterOutOfRangeException(value, 1.00, 100.00);
	    }

        m_MoveRate = value;
        setProperty("move-rate", value);
        return this;
    }

    /** Move rate
     *
     * Move rate
     *
     * Unit: percent
     * Default value: 25.00
     * Acceptable Range: 1.00 100.00
     *
     * @return value of Move rate
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getMoveRate()
    {
        return m_MoveRate;
    }


    /** Wrap around
     *
     * Wrap the fractional tiles
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_WrapAround  = false;

    /** Wrap around
     *
     * Wrap the fractional tiles
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Wrap around
     * @return this filter (for chaining operations)
     * 
     */
    public TilePaper setWrapAround(boolean value)
    {
	
        m_WrapAround = value;
        setProperty("wrap-around", value);
        return this;
    }

    /** Wrap around
     *
     * Wrap the fractional tiles
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Wrap around
     * 
     */
    public boolean getWrapAround()
    {
        return m_WrapAround;
    }


    /** Fractional type
     *
     * Fractional Type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_FractionalType ;

    /** Fractional type
     *
     * Fractional Type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Fractional type
     * @return this filter (for chaining operations)
     * 
     */
    public TilePaper setFractionalType(String value)
    {
	
        m_FractionalType = value;
        setProperty("fractional-type", value);
        return this;
    }

    /** Fractional type
     *
     * Fractional Type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Fractional type
     * 
     */
    public String getFractionalType()
    {
        return m_FractionalType;
    }


    /** Centering
     *
     * Centering of the tiles
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Centering  = true;

    /** Centering
     *
     * Centering of the tiles
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Centering
     * @return this filter (for chaining operations)
     * 
     */
    public TilePaper setCentering(boolean value)
    {
	
        m_Centering = value;
        setProperty("centering", value);
        return this;
    }

    /** Centering
     *
     * Centering of the tiles
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Centering
     * 
     */
    public boolean getCentering()
    {
        return m_Centering;
    }


    /** Background type
     *
     * Background type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_BackgroundType ;

    /** Background type
     *
     * Background type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Background type
     * @return this filter (for chaining operations)
     * 
     */
    public TilePaper setBackgroundType(String value)
    {
	
        m_BackgroundType = value;
        setProperty("background-type", value);
        return this;
    }

    /** Background type
     *
     * Background type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Background type
     * 
     */
    public String getBackgroundType()
    {
        return m_BackgroundType;
    }


    /** Background color
     *
     * The tiles' background color
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_BgColor  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Background color
     *
     * The tiles' background color
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Background color
     * @return this filter (for chaining operations)
     * 
     */
    public TilePaper setBgColor(GeglColor value)
    {
	
        m_BgColor = value;
        setProperty("bg-color", value);
        return this;
    }

    /** Background color
     *
     * The tiles' background color
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of Background color
     * 
     */
    public GeglColor getBgColor()
    {
        return m_BgColor;
    }


    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Seed ;

    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
     */
    public TilePaper setSeed(int value)
    {
	
        m_Seed = value;
        setProperty("seed", value);
        return this;
    }

    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Random seed
     * 
     */
    public int getSeed()
    {
        return m_Seed;
    }

    @Override
    public InputPad<TilePaper> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<TilePaper> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

