package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Mono Mixer
 *
 * Monochrome channel mixer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class MonoMixer extends GeglFilter implements Filter
{
    /** Constructs a Mono Mixer.
     *
     * Monochrome channel mixer
     *
     * @param container container node
     */
    public MonoMixer(GeglNode container)
    {
        super(container, "gegl:mono-mixer");
    }
    /** Constructs a Mono Mixer.
     *
     * Monochrome channel mixer
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Preserve luminosity
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Preserve luminosity
     * 
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
     *
     * @param value new value for Red Channel Multiplier
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Red Channel Multiplier
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Green Channel Multiplier
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Green Channel Multiplier
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Blue Channel Multiplier
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Blue Channel Multiplier
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBlue()
    {
        return m_Blue;
    }

    @Override
    public InputPad<MonoMixer> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<MonoMixer> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

