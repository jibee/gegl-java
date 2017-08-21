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
     *
     * @param container container node
     */
    public NoiseRgb(GeglNode container)
    {
        super(container, "gegl:noise-rgb");
    }
    /** Constructs a Add RGB Noise.
     *
     * Distort colors by random amounts
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Correlated noise
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Correlated noise
     * 
     */
    public boolean getCorrelated()
    {
        return m_Correlated;
    }


    /** Independent RGB
     *
     * Control amount of noise for each RGB channel separately
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Independent  = true;

    /** Independent RGB
     *
     * Control amount of noise for each RGB channel separately
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Independent RGB
     * @return this filter (for chaining operations)
     * 
     */
    public NoiseRgb setIndependent(boolean value)
    {
	
        m_Independent = value;
        setProperty("independent", value);
        return this;
    }

    /** Independent RGB
     *
     * Control amount of noise for each RGB channel separately
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Independent RGB
     * 
     */
    public boolean getIndependent()
    {
        return m_Independent;
    }


    /** Linear RGB
     *
     * Operate on linearized RGB color data
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Linear  = true;

    /** Linear RGB
     *
     * Operate on linearized RGB color data
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Linear RGB
     * @return this filter (for chaining operations)
     * 
     */
    public NoiseRgb setLinear(boolean value)
    {
	
        m_Linear = value;
        setProperty("linear", value);
        return this;
    }

    /** Linear RGB
     *
     * Operate on linearized RGB color data
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Linear RGB
     * 
     */
    public boolean getLinear()
    {
        return m_Linear;
    }


    /** Gaussian distribution
     *
     * Use a gaussian noise distribution, when unticked a linear noise distribution is used instead
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Gaussian  = true;

    /** Gaussian distribution
     *
     * Use a gaussian noise distribution, when unticked a linear noise distribution is used instead
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Gaussian distribution
     * @return this filter (for chaining operations)
     * 
     */
    public NoiseRgb setGaussian(boolean value)
    {
	
        m_Gaussian = value;
        setProperty("gaussian", value);
        return this;
    }

    /** Gaussian distribution
     *
     * Use a gaussian noise distribution, when unticked a linear noise distribution is used instead
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Gaussian distribution
     * 
     */
    public boolean getGaussian()
    {
        return m_Gaussian;
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
     *
     * @param value new value for Red
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Red
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Green
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Green
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Blue
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Blue
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Alpha
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Alpha
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Random seed
     * 
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

