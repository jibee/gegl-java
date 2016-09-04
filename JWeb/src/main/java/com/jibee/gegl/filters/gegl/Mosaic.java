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
 * Mosaic
 *
 * Mosaic is a filter which transforms an image into what appears to be a mosaic, composed of small primitives, each of constant color and of an approximate size.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"artistic", "scramble"})
public class Mosaic extends GeglFilter implements Source, Sink
{
    /** Constructs a Mosaic.
     *
     * Mosaic is a filter which transforms an image into what appears to be a mosaic, composed of small primitives, each of constant color and of an approximate size.
     */
    public Mosaic(GeglNode container)
    {
        super(container, "gegl:mosaic");
    }
    /** Constructs a Mosaic.
     *
     * Mosaic is a filter which transforms an image into what appears to be a mosaic, composed of small primitives, each of constant color and of an approximate size.
     */
    public Mosaic(GeglFilter parent)
    {
        super(parent, "gegl:mosaic");
    }

    
    /** Tile geometry
     *
     * What shape to use for tiles
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_TileType ;

    /** Tile geometry
     *
     * What shape to use for tiles
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Mosaic setTileType(String value)
    {
	
        m_TileType = value;
        setProperty("tile-type", value);
        return this;
    }

    /** Tile geometry
     *
     * What shape to use for tiles
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getTileType()
    {
        return m_TileType;
    }


    /** Tile size
     *
     * Average diameter of each tile (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 15.00
     * Acceptable Range: 1.00 1000.00
     * */
    private double m_TileSize  = 15.00;

    /** Tile size
     *
     * Average diameter of each tile (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 15.00
     * Acceptable Range: 1.00 1000.00
     */
    public Mosaic setTileSize(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 1000.00);
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
     * Default value: 15.00
     * Acceptable Range: 1.00 1000.00
     */
    public double getTileSize()
    {
        return m_TileSize;
    }


    /** Tile height
     *
     * Apparent height of each tile (in pixels)
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 1.00 1000.00
     * */
    private double m_TileHeight  = 4.00;

    /** Tile height
     *
     * Apparent height of each tile (in pixels)
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 1.00 1000.00
     */
    public Mosaic setTileHeight(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 1000.00);
	}

        m_TileHeight = value;
        setProperty("tile-height", value);
        return this;
    }

    /** Tile height
     *
     * Apparent height of each tile (in pixels)
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 1.00 1000.00
     */
    public double getTileHeight()
    {
        return m_TileHeight;
    }


    /** Tile neatness
     *
     * Deviation from perfectly formed tiles
     *
     * Unit: 
     * Default value: 0.65
     * Acceptable Range: 0.00 1.00
     * */
    private double m_TileNeatness  = 0.65;

    /** Tile neatness
     *
     * Deviation from perfectly formed tiles
     *
     * Unit: 
     * Default value: 0.65
     * Acceptable Range: 0.00 1.00
     */
    public Mosaic setTileNeatness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_TileNeatness = value;
        setProperty("tile-neatness", value);
        return this;
    }

    /** Tile neatness
     *
     * Deviation from perfectly formed tiles
     *
     * Unit: 
     * Default value: 0.65
     * Acceptable Range: 0.00 1.00
     */
    public double getTileNeatness()
    {
        return m_TileNeatness;
    }


    /** Tile color variation
     *
     * Magnitude of random color variations
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     * */
    private double m_ColorVariation  = 0.20;

    /** Tile color variation
     *
     * Magnitude of random color variations
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     */
    public Mosaic setColorVariation(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_ColorVariation = value;
        setProperty("color-variation", value);
        return this;
    }

    /** Tile color variation
     *
     * Magnitude of random color variations
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     */
    public double getColorVariation()
    {
        return m_ColorVariation;
    }


    /** Color averaging
     *
     * Tile color based on average of subsumed pixels
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_ColorAveraging  = true;

    /** Color averaging
     *
     * Tile color based on average of subsumed pixels
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public Mosaic setColorAveraging(boolean value)
    {
	
        m_ColorAveraging = value;
        setProperty("color-averaging", value);
        return this;
    }

    /** Color averaging
     *
     * Tile color based on average of subsumed pixels
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getColorAveraging()
    {
        return m_ColorAveraging;
    }


    /** Rough tile surface
     *
     * Surface characteristics
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_TileSurface  = false;

    /** Rough tile surface
     *
     * Surface characteristics
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public Mosaic setTileSurface(boolean value)
    {
	
        m_TileSurface = value;
        setProperty("tile-surface", value);
        return this;
    }

    /** Rough tile surface
     *
     * Surface characteristics
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getTileSurface()
    {
        return m_TileSurface;
    }


    /** Allow splitting tiles
     *
     * Allows splitting tiles at hard edges
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_TileAllowSplit  = true;

    /** Allow splitting tiles
     *
     * Allows splitting tiles at hard edges
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public Mosaic setTileAllowSplit(boolean value)
    {
	
        m_TileAllowSplit = value;
        setProperty("tile-allow-split", value);
        return this;
    }

    /** Allow splitting tiles
     *
     * Allows splitting tiles at hard edges
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getTileAllowSplit()
    {
        return m_TileAllowSplit;
    }


    /** Tile spacing
     *
     * Inter-tile spacing (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 1.00
     * Acceptable Range: 0.00 1000.00
     * */
    private double m_TileSpacing  = 1.00;

    /** Tile spacing
     *
     * Inter-tile spacing (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 1.00
     * Acceptable Range: 0.00 1000.00
     */
    public Mosaic setTileSpacing(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1000.00);
	}

        m_TileSpacing = value;
        setProperty("tile-spacing", value);
        return this;
    }

    /** Tile spacing
     *
     * Inter-tile spacing (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 1.00
     * Acceptable Range: 0.00 1000.00
     */
    public double getTileSpacing()
    {
        return m_TileSpacing;
    }


    /** Joints color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_JointsColor  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Joints color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public Mosaic setJointsColor(GeglColor value)
    {
	
        m_JointsColor = value;
        setProperty("joints-color", value);
        return this;
    }

    /** Joints color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public GeglColor getJointsColor()
    {
        return m_JointsColor;
    }


    /** Light color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_LightColor  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** Light color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public Mosaic setLightColor(GeglColor value)
    {
	
        m_LightColor = value;
        setProperty("light-color", value);
        return this;
    }

    /** Light color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GeglColor getLightColor()
    {
        return m_LightColor;
    }


    /** Light direction
     *
     * Direction of light-source (in degrees)
     *
     * Unit: degree
     * Default value: 135.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_LightDir  = 135.00;

    /** Light direction
     *
     * Direction of light-source (in degrees)
     *
     * Unit: degree
     * Default value: 135.00
     * Acceptable Range: 0.00 360.00
     */
    public Mosaic setLightDir(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	}

        m_LightDir = value;
        setProperty("light-dir", value);
        return this;
    }

    /** Light direction
     *
     * Direction of light-source (in degrees)
     *
     * Unit: degree
     * Default value: 135.00
     * Acceptable Range: 0.00 360.00
     */
    public double getLightDir()
    {
        return m_LightDir;
    }


    /** Antialiasing
     *
     * Enables smoother tile output
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Antialiasing  = true;

    /** Antialiasing
     *
     * Enables smoother tile output
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public Mosaic setAntialiasing(boolean value)
    {
	
        m_Antialiasing = value;
        setProperty("antialiasing", value);
        return this;
    }

    /** Antialiasing
     *
     * Enables smoother tile output
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getAntialiasing()
    {
        return m_Antialiasing;
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
    public Mosaic setSeed(int value)
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

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

