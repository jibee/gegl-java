package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Add RGB Noise
 *
 * Distort colors by random amounts
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"noise"})
public class NoiseRgb extends GeglFilter implements Source, Sink
{
    /** Constructs a Add RGB Noise.
     *
     * Distort colors by random amounts
     */
    public NoiseRgb(GeglNode container)
    {
        super(container, "gegl:noise-rgb");
    }
    /** Constructs a Add RGB Noise.
     *
     * Distort colors by random amounts
     */
    public NoiseRgb(GeglFilter parent)
    {
        super(parent, "gegl:noise-rgb");
    }

    
    /** Correlated noise
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Correlated  = false;

    /** Correlated noise
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public NoiseRgb setCorrelated(boolean value)
    {
	
        m_Correlated = value;
        setProperty("correlated", value);
        return this;
    }

    /** Correlated noise
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getCorrelated()
    {
        return m_Correlated;
    }


    /** Independent RGB
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Independent  = true;

    /** Independent RGB
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public NoiseRgb setIndependent(boolean value)
    {
	
        m_Independent = value;
        setProperty("independent", value);
        return this;
    }

    /** Independent RGB
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getIndependent()
    {
        return m_Independent;
    }


    /** Red
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Red  = 0.20;

    /** Red
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     */
    public NoiseRgb setRed(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Red = value;
        setProperty("red", value);
        return this;
    }

    /** Red
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     */
    public double getRed()
    {
        return m_Red;
    }


    /** Green
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Green  = 0.20;

    /** Green
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     */
    public NoiseRgb setGreen(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Green = value;
        setProperty("green", value);
        return this;
    }

    /** Green
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     */
    public double getGreen()
    {
        return m_Green;
    }


    /** Blue
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Blue  = 0.20;

    /** Blue
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     */
    public NoiseRgb setBlue(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Blue = value;
        setProperty("blue", value);
        return this;
    }

    /** Blue
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     */
    public double getBlue()
    {
        return m_Blue;
    }


    /** Alpha
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Alpha  = 0.00;

    /** Alpha
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public NoiseRgb setAlpha(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Alpha = value;
        setProperty("alpha", value);
        return this;
    }

    /** Alpha
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public double getAlpha()
    {
        return m_Alpha;
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
    public NoiseRgb setSeed(int value)
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

