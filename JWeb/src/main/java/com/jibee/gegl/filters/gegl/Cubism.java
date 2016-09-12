package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Cubism
 *
 * Convert the image into randomly rotated square blobs, somehow resembling a cubist painting style
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"artistic", "scramble"})
public class Cubism extends GeglFilter implements Source, Sink
{
    /** Constructs a Cubism.
     *
     * Convert the image into randomly rotated square blobs, somehow resembling a cubist painting style
     */
    public Cubism(GeglNode container)
    {
        super(container, "gegl:cubism");
    }
    /** Constructs a Cubism.
     *
     * Convert the image into randomly rotated square blobs, somehow resembling a cubist painting style
     */
    public Cubism(GeglFilter parent)
    {
        super(parent, "gegl:cubism");
    }

    
    /** Tile size
     *
     * Average diameter of each tile (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 256.00
     * */
    private double m_TileSize  = 10.00;

    /** Tile size
     *
     * Average diameter of each tile (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 256.00
     */
    public Cubism setTileSize(double value) throws ParameterOutOfRangeException
    {
		if(value > 256.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 256.00);
	}

        m_TileSize = value;
        setProperty("tile-size", value);
        return this;
    }

    /** Tile size
     *
     * Average diameter of each tile (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 256.00
     */
    public double getTileSize()
    {
        return m_TileSize;
    }


    /** Tile saturation
     *
     * Expand tiles by this amount
     *
     * Unit: 
     * Default value: 2.50
     * Acceptable Range: 0.00 10.00
     * */
    private double m_TileSaturation  = 2.50;

    /** Tile saturation
     *
     * Expand tiles by this amount
     *
     * Unit: 
     * Default value: 2.50
     * Acceptable Range: 0.00 10.00
     */
    public Cubism setTileSaturation(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 10.00);
	}

        m_TileSaturation = value;
        setProperty("tile-saturation", value);
        return this;
    }

    /** Tile saturation
     *
     * Expand tiles by this amount
     *
     * Unit: 
     * Default value: 2.50
     * Acceptable Range: 0.00 10.00
     */
    public double getTileSaturation()
    {
        return m_TileSaturation;
    }


    /** Background color
     *
     * The tiles' background color
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_BgColor  = makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)");

    /** Background color
     *
     * The tiles' background color
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public Cubism setBgColor(GeglColor value)
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
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
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
     */
    public Cubism setSeed(int value)
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
     */
    public int getSeed()
    {
        return m_Seed;
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

