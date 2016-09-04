package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;

/**
 * Solid Noise
 *
 * Create a random cloud-like texture
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"render"})
public class NoiseSolid extends GeglFilter implements Source
{
    /** Constructs a Solid Noise.
     *
     * Create a random cloud-like texture
     */
    public NoiseSolid(GeglNode container)
    {
        super(container, "gegl:noise-solid");
    }
    /** Constructs a Solid Noise.
     *
     * Create a random cloud-like texture
     */
    public NoiseSolid(GeglFilter parent)
    {
        super(parent, "gegl:noise-solid");
    }

    
    /** X Size
     *
     * Horizontal texture size
     *
     * Unit: pixel-distance
     * Default value: 4.00
     * Acceptable Range: 0.10 16.00
     * */
    private double m_XSize  = 4.00;

    /** X Size
     *
     * Horizontal texture size
     *
     * Unit: pixel-distance
     * Default value: 4.00
     * Acceptable Range: 0.10 16.00
     */
    public NoiseSolid setXSize(double value) throws ParameterOutOfRangeException
    {
		if(value > 16.00 || value < 0.10)
	{
	    throw new ParameterOutOfRangeException(value, 0.10, 16.00);
	}

        m_XSize = value;
        setProperty("x-size", value);
        return this;
    }

    /** X Size
     *
     * Horizontal texture size
     *
     * Unit: pixel-distance
     * Default value: 4.00
     * Acceptable Range: 0.10 16.00
     */
    public double getXSize()
    {
        return m_XSize;
    }


    /** Y Size
     *
     * Vertical texture size
     *
     * Unit: pixel-distance
     * Default value: 4.00
     * Acceptable Range: 0.10 16.00
     * */
    private double m_YSize  = 4.00;

    /** Y Size
     *
     * Vertical texture size
     *
     * Unit: pixel-distance
     * Default value: 4.00
     * Acceptable Range: 0.10 16.00
     */
    public NoiseSolid setYSize(double value) throws ParameterOutOfRangeException
    {
		if(value > 16.00 || value < 0.10)
	{
	    throw new ParameterOutOfRangeException(value, 0.10, 16.00);
	}

        m_YSize = value;
        setProperty("y-size", value);
        return this;
    }

    /** Y Size
     *
     * Vertical texture size
     *
     * Unit: pixel-distance
     * Default value: 4.00
     * Acceptable Range: 0.10 16.00
     */
    public double getYSize()
    {
        return m_YSize;
    }


    /** Detail
     *
     * Detail level
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range:  15
     * */
    private int m_Detail  = 1;

    /** Detail
     *
     * Detail level
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range:  15
     */
    public NoiseSolid setDetail(int value) throws ParameterOutOfRangeException
    {
		if(value > 15)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 15);
	}

        m_Detail = value;
        setProperty("detail", value);
        return this;
    }

    /** Detail
     *
     * Detail level
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range:  15
     */
    public int getDetail()
    {
        return m_Detail;
    }


    /** Tileable
     *
     * Create a tileable output
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Tileable  = false;

    /** Tileable
     *
     * Create a tileable output
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public NoiseSolid setTileable(boolean value)
    {
	
        m_Tileable = value;
        setProperty("tileable", value);
        return this;
    }

    /** Tileable
     *
     * Create a tileable output
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getTileable()
    {
        return m_Tileable;
    }


    /** Turbulent
     *
     * Make a turbulent noise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Turbulent  = false;

    /** Turbulent
     *
     * Make a turbulent noise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public NoiseSolid setTurbulent(boolean value)
    {
	
        m_Turbulent = value;
        setProperty("turbulent", value);
        return this;
    }

    /** Turbulent
     *
     * Make a turbulent noise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getTurbulent()
    {
        return m_Turbulent;
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
    public NoiseSolid setSeed(int value)
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
    public NoiseSolid setWidth(int value)
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
    public NoiseSolid setHeight(int value)
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

    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

