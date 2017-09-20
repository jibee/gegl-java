package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Tile Glass
 *
 * Simulate distortion caused by rectangular glass tiles
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=true, categories={"artistic", "map"})
public class TileGlass extends GeglFilter implements Filter
{
    /** Constructs a Tile Glass.
     *
     * Simulate distortion caused by rectangular glass tiles
     *
     * @param container container node
     */
    public TileGlass(GeglNode container)
    {
        super(container, "gegl:tile-glass");
    }
    /** Constructs a Tile Glass.
     *
     * Simulate distortion caused by rectangular glass tiles
     *
     * @param parent parent filter node
     */
    public TileGlass(GeglFilter parent)
    {
        super(parent, "gegl:tile-glass");
    }

    
    /** Tile Width
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 25
     * Acceptable Range: 5 500
     * */
    private int m_TileWidth  = 25;

    /** Tile Width
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 25
     * Acceptable Range: 5 500
     *
     * @param value new value for Tile Width
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 25
     * Acceptable Range: 5 500
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
     * 
     *
     * Unit: pixel-distance
     * Default value: 25
     * Acceptable Range: 5 500
     * */
    private int m_TileHeight  = 25;

    /** Tile Height
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 25
     * Acceptable Range: 5 500
     *
     * @param value new value for Tile Height
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 25
     * Acceptable Range: 5 500
     *
     * @return value of Tile Height
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getTileHeight()
    {
        return m_TileHeight;
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

