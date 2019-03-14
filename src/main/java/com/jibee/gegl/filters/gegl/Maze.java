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
 * Maze
 *
 * Draw a labyrinth
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=true, categories={"render"})
public class Maze extends GeglFilter implements Filter
{
    /** Constructs a Maze.
     *
     * Draw a labyrinth
     *
     * @param container container node
     */
    public Maze(GeglNode container)
    {
        super(container, "gegl:maze");
    }
    /** Constructs a Maze.
     *
     * Draw a labyrinth
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Width
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Width
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Height
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Height
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Algorithm type
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Algorithm type
     * 
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
     *
     * @param value new value for Tileable
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Tileable
     * 
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
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Random seed
     * 
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
     *
     * @param value new value for Foreground Color
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Foreground Color
     * 
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
     *
     * @param value new value for Background Color
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Background Color
     * 
     */
    public GeglColor getBgColor()
    {
        return m_BgColor;
    }

    @Override
    public InputPad<Maze> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Maze> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

