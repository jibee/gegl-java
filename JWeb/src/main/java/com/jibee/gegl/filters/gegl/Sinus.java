package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Sinus
 *
 * Generate complex sinusoidal textures
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"render"})
public class Sinus extends GeglFilter
{
    /** Constructs a Sinus.
     *
     * Generate complex sinusoidal textures
     */
    public Sinus(GeglNode container)
    {
        super(container, "gegl:sinus");
    }
    /** Constructs a Sinus.
     *
     * Generate complex sinusoidal textures
     */
    public Sinus(GeglFilter parent)
    {
        super(parent, "gegl:sinus");
    }

    
    /** X Scale
     *
     * Scale value for x axis
     *
     * Unit: pixel-distance
     * Default value: 15.00
     * Acceptable Range: 0.00 
     * */
    private double m_XScale  = 15.00;

    /** X Scale
     *
     * Scale value for x axis
     *
     * Unit: pixel-distance
     * Default value: 15.00
     * Acceptable Range: 0.00 
     */
    public Sinus setXScale(double value) throws ParameterOutOfRangeException
    {
		if(value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, Double.POSITIVE_INFINITY);
	}

        m_XScale = value;
        setProperty("x-scale", value);
        return this;
    }

    /** X Scale
     *
     * Scale value for x axis
     *
     * Unit: pixel-distance
     * Default value: 15.00
     * Acceptable Range: 0.00 
     */
    public double getXScale()
    {
        return m_XScale;
    }


    /** Y Scale
     *
     * Scale value for y axis
     *
     * Unit: pixel-distance
     * Default value: 15.00
     * Acceptable Range: 0.00 
     * */
    private double m_YScale  = 15.00;

    /** Y Scale
     *
     * Scale value for y axis
     *
     * Unit: pixel-distance
     * Default value: 15.00
     * Acceptable Range: 0.00 
     */
    public Sinus setYScale(double value) throws ParameterOutOfRangeException
    {
		if(value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, Double.POSITIVE_INFINITY);
	}

        m_YScale = value;
        setProperty("y-scale", value);
        return this;
    }

    /** Y Scale
     *
     * Scale value for y axis
     *
     * Unit: pixel-distance
     * Default value: 15.00
     * Acceptable Range: 0.00 
     */
    public double getYScale()
    {
        return m_YScale;
    }


    /** Complexity
     *
     * Complexity factor
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 15.00
     * */
    private double m_Complexity  = 1.00;

    /** Complexity
     *
     * Complexity factor
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 15.00
     */
    public Sinus setComplexity(double value) throws ParameterOutOfRangeException
    {
		if(value > 15.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 15.00);
	}

        m_Complexity = value;
        setProperty("complexity", value);
        return this;
    }

    /** Complexity
     *
     * Complexity factor
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 15.00
     */
    public double getComplexity()
    {
        return m_Complexity;
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
    public Sinus setSeed(int value)
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


    /** Force tiling
     *
     * If set, the pattern generated will tile
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Tiling  = true;

    /** Force tiling
     *
     * If set, the pattern generated will tile
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public Sinus setTiling(boolean value)
    {
	
        m_Tiling = value;
        setProperty("tiling", value);
        return this;
    }

    /** Force tiling
     *
     * If set, the pattern generated will tile
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getTiling()
    {
        return m_Tiling;
    }


    /** Distorted
     *
     * If set, the pattern will be a little more distorted
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Perturbation  = true;

    /** Distorted
     *
     * If set, the pattern will be a little more distorted
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public Sinus setPerturbation(boolean value)
    {
	
        m_Perturbation = value;
        setProperty("perturbation", value);
        return this;
    }

    /** Distorted
     *
     * If set, the pattern will be a little more distorted
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getPerturbation()
    {
        return m_Perturbation;
    }


    /** Color 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color1  = makeColor("rgb(1.0000, 1.0000, 0.0000)");

    /** Color 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 0.0000)")
     * Acceptable Range:  
     */
    public Sinus setColor1(GeglColor value)
    {
	
        m_Color1 = value;
        setProperty("color1", value);
        return this;
    }

    /** Color 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 0.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor1()
    {
        return m_Color1;
    }


    /** Color 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color2  = makeColor("rgb(0.0000, 0.0000, 1.0000)");

    /** Color 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     */
    public Sinus setColor2(GeglColor value)
    {
	
        m_Color2 = value;
        setProperty("color2", value);
        return this;
    }

    /** Color 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor2()
    {
        return m_Color2;
    }


    /** Blend Mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_BlendMode ;

    /** Blend Mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Sinus setBlendMode(String value)
    {
	
        m_BlendMode = value;
        setProperty("blend-mode", value);
        return this;
    }

    /** Blend Mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getBlendMode()
    {
        return m_BlendMode;
    }


    /** Exponent
     *
     * Power used to strech the blend
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -7.50 7.50
     * */
    private double m_BlendPower  = 0.00;

    /** Exponent
     *
     * Power used to strech the blend
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -7.50 7.50
     */
    public Sinus setBlendPower(double value) throws ParameterOutOfRangeException
    {
		if(value > 7.50 || value < -7.50)
	{
	    throw new ParameterOutOfRangeException(value, -7.50, 7.50);
	}

        m_BlendPower = value;
        setProperty("blend-power", value);
        return this;
    }

    /** Exponent
     *
     * Power used to strech the blend
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -7.50 7.50
     */
    public double getBlendPower()
    {
        return m_BlendPower;
    }


    /** Width
     *
     * Width of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 1024
     * Acceptable Range:  
     * */
    private int m_Width  = 1024;

    /** Width
     *
     * Width of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 1024
     * Acceptable Range:  
     */
    public Sinus setWidth(int value)
    {
	
        m_Width = value;
        setProperty("width", value);
        return this;
    }

    /** Width
     *
     * Width of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 1024
     * Acceptable Range:  
     */
    public int getWidth()
    {
        return m_Width;
    }


    /** Height
     *
     * Height of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 768
     * Acceptable Range:  
     * */
    private int m_Height  = 768;

    /** Height
     *
     * Height of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 768
     * Acceptable Range:  
     */
    public Sinus setHeight(int value)
    {
	
        m_Height = value;
        setProperty("height", value);
        return this;
    }

    /** Height
     *
     * Height of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 768
     * Acceptable Range:  
     */
    public int getHeight()
    {
        return m_Height;
    }

    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

