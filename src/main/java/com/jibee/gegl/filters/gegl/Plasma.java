package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Plasma
 *
 * Creates an image filled with a plasma effect.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=true, categories={"render"})
public class Plasma extends GeglFilter implements Source
{
    /** Constructs a Plasma.
     *
     * Creates an image filled with a plasma effect.
     *
     * @param container container node
     */
    public Plasma(GeglNode container)
    {
        super(container, "gegl:plasma");
    }
    /** Constructs a Plasma.
     *
     * Creates an image filled with a plasma effect.
     *
     * @param parent parent filter node
     */
    public Plasma(GeglFilter parent)
    {
        super(parent, "gegl:plasma");
    }

    
    /** Turbulence
     *
     * High values give more variation in details
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 7.00
     * */
    private double m_Turbulence  = 1.00;

    /** Turbulence
     *
     * High values give more variation in details
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 7.00
     *
     * @param value new value for Turbulence
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Plasma setTurbulence(double value) throws ParameterOutOfRangeException
    {
		if(value > 7.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 7.00);
	    }

        m_Turbulence = value;
        setProperty("turbulence", value);
        return this;
    }

    /** Turbulence
     *
     * High values give more variation in details
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 7.00
     *
     * @return value of Turbulence
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getTurbulence()
    {
        return m_Turbulence;
    }


    /** X
     *
     * X start of the generated buffer
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_X ;

    /** X
     *
     * X start of the generated buffer
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for X
     * @return this filter (for chaining operations)
     * 
     */
    public Plasma setX(int value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** X
     *
     * X start of the generated buffer
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of X
     * 
     */
    public int getX()
    {
        return m_X;
    }


    /** Y
     *
     * Y start of the generated buffer
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Y ;

    /** Y
     *
     * Y start of the generated buffer
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Y
     * @return this filter (for chaining operations)
     * 
     */
    public Plasma setY(int value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Y
     *
     * Y start of the generated buffer
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Y
     * 
     */
    public int getY()
    {
        return m_Y;
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
    public Plasma setWidth(int value)
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
    public Plasma setHeight(int value)
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
    public Plasma setSeed(int value)
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
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

