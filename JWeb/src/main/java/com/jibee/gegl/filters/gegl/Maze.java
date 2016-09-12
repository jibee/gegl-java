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
 * Maze
 *
 * Draw a labyrinth
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"render"})
public class Maze extends GeglFilter implements Source, Sink
{
    /** Constructs a Maze.
     *
     * Draw a labyrinth
     */
    public Maze(GeglNode container)
    {
        super(container, "gegl:maze");
    }
    /** Constructs a Maze.
     *
     * Draw a labyrinth
     */
    public Maze(GeglFilter parent)
    {
        super(parent, "gegl:maze");
    }

    
    /** Width
     *
     * Horizontal width of cells pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     * */
    private int m_X  = 16;

    /** Width
     *
     * Horizontal width of cells pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     */
    public Maze setX(int value) throws ParameterOutOfRangeException
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
     *
     * Horizontal width of cells pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     */
    public int getX()
    {
        return m_X;
    }


    /** Height
     *
     * Vertical width of cells pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     * */
    private int m_Y  = 16;

    /** Height
     *
     * Vertical width of cells pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     */
    public Maze setY(int value) throws ParameterOutOfRangeException
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
     *
     * Vertical width of cells pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     */
    public int getY()
    {
        return m_Y;
    }


    /** Algorithm type
     *
     * Maze algorithm type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_AlgorithmType ;

    /** Algorithm type
     *
     * Maze algorithm type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Maze setAlgorithmType(String value)
    {
	
        m_AlgorithmType = value;
        setProperty("algorithm-type", value);
        return this;
    }

    /** Algorithm type
     *
     * Maze algorithm type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getAlgorithmType()
    {
        return m_AlgorithmType;
    }


    /** Tileable
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Tileable  = false;

    /** Tileable
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public Maze setTileable(boolean value)
    {
	
        m_Tileable = value;
        setProperty("tileable", value);
        return this;
    }

    /** Tileable
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getTileable()
    {
        return m_Tileable;
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
    public Maze setSeed(int value)
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


    /** Foreground Color
     *
     * The foreground color
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_FgColor  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Foreground Color
     *
     * The foreground color
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public Maze setFgColor(GeglColor value)
    {
	
        m_FgColor = value;
        setProperty("fg-color", value);
        return this;
    }

    /** Foreground Color
     *
     * The foreground color
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public GeglColor getFgColor()
    {
        return m_FgColor;
    }


    /** Background Color
     *
     * The background color
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_BgColor  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** Background Color
     *
     * The background color
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public Maze setBgColor(GeglColor value)
    {
	
        m_BgColor = value;
        setProperty("bg-color", value);
        return this;
    }

    /** Background Color
     *
     * The background color
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GeglColor getBgColor()
    {
        return m_BgColor;
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

