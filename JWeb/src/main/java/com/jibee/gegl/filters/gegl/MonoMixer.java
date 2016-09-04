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
 * Mono Mixer
 *
 * Monochrome channel mixer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class MonoMixer extends GeglFilter implements Source, Sink
{
    /** Constructs a Mono Mixer.
     *
     * Monochrome channel mixer
     */
    public MonoMixer(GeglNode container)
    {
        super(container, "gegl:mono-mixer");
    }
    /** Constructs a Mono Mixer.
     *
     * Monochrome channel mixer
     */
    public MonoMixer(GeglFilter parent)
    {
        super(parent, "gegl:mono-mixer");
    }

    
    /** Preserve luminosity
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_PreserveLuminosity  = false;

    /** Preserve luminosity
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public MonoMixer setPreserveLuminosity(boolean value)
    {
	
        m_PreserveLuminosity = value;
        setProperty("preserve-luminosity", value);
        return this;
    }

    /** Preserve luminosity
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getPreserveLuminosity()
    {
        return m_PreserveLuminosity;
    }


    /** Red Channel Multiplier
     *
     * 
     *
     * Unit: 
     * Default value: 0.33
     * Acceptable Range: -5.00 5.00
     * */
    private double m_Red  = 0.33;

    /** Red Channel Multiplier
     *
     * 
     *
     * Unit: 
     * Default value: 0.33
     * Acceptable Range: -5.00 5.00
     */
    public MonoMixer setRed(double value) throws ParameterOutOfRangeException
    {
		if(value > 5.00 || value < -5.00)
	{
	    throw new ParameterOutOfRangeException(value, -5.00, 5.00);
	}

        m_Red = value;
        setProperty("red", value);
        return this;
    }

    /** Red Channel Multiplier
     *
     * 
     *
     * Unit: 
     * Default value: 0.33
     * Acceptable Range: -5.00 5.00
     */
    public double getRed()
    {
        return m_Red;
    }


    /** Green Channel Multiplier
     *
     * 
     *
     * Unit: 
     * Default value: 0.33
     * Acceptable Range: -5.00 5.00
     * */
    private double m_Green  = 0.33;

    /** Green Channel Multiplier
     *
     * 
     *
     * Unit: 
     * Default value: 0.33
     * Acceptable Range: -5.00 5.00
     */
    public MonoMixer setGreen(double value) throws ParameterOutOfRangeException
    {
		if(value > 5.00 || value < -5.00)
	{
	    throw new ParameterOutOfRangeException(value, -5.00, 5.00);
	}

        m_Green = value;
        setProperty("green", value);
        return this;
    }

    /** Green Channel Multiplier
     *
     * 
     *
     * Unit: 
     * Default value: 0.33
     * Acceptable Range: -5.00 5.00
     */
    public double getGreen()
    {
        return m_Green;
    }


    /** Blue Channel Multiplier
     *
     * 
     *
     * Unit: 
     * Default value: 0.33
     * Acceptable Range: -5.00 5.00
     * */
    private double m_Blue  = 0.33;

    /** Blue Channel Multiplier
     *
     * 
     *
     * Unit: 
     * Default value: 0.33
     * Acceptable Range: -5.00 5.00
     */
    public MonoMixer setBlue(double value) throws ParameterOutOfRangeException
    {
		if(value > 5.00 || value < -5.00)
	{
	    throw new ParameterOutOfRangeException(value, -5.00, 5.00);
	}

        m_Blue = value;
        setProperty("blue", value);
        return this;
    }

    /** Blue Channel Multiplier
     *
     * 
     *
     * Unit: 
     * Default value: 0.33
     * Acceptable Range: -5.00 5.00
     */
    public double getBlue()
    {
        return m_Blue;
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

