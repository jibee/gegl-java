package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;

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
public class Sinus extends GeglFilter implements Source
{
    /** Constructs a Sinus.
     *
     * Generate complex sinusoidal textures
     *
     * @param container container node
     */
    public Sinus(GeglNode container)
    {
        super(container, "gegl:sinus");
    }
    /** Constructs a Sinus.
     *
     * Generate complex sinusoidal textures
     *
     * @param parent parent filter node
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
     *
     * @param value new value for X Scale
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of X Scale
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Y Scale
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Y Scale
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Complexity
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Complexity
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Random seed
     * 
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
     *
     * @param value new value for Force tiling
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Force tiling
     * 
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
     *
     * @param value new value for Distorted
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Distorted
     * 
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
     *
     * @param value new value for Color 1
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Color 1
     * 
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
     *
     * @param value new value for Color 2
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Color 2
     * 
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
     *
     * @param value new value for Blend Mode
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Blend Mode
     * 
     */
    public String getBlendMode()
    {
        return m_BlendMode;
    }


    /** Exponent
     *
     * Power used to stretch the blend
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -7.50 7.50
     * */
    private double m_BlendPower  = 0.00;

    /** Exponent
     *
     * Power used to stretch the blend
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -7.50 7.50
     *
     * @param value new value for Exponent
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     * Power used to stretch the blend
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -7.50 7.50
     *
     * @return value of Exponent
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Width
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Width
     * 
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
     *
     * @param value new value for Height
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Height
     * 
     */
    public int getHeight()
    {
        return m_Height;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

