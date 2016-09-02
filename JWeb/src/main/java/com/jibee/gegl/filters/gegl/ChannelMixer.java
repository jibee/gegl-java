package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;

/**
 * Channel Mixer
 *
 * Remix colors; by defining relative contributions from source components.
 * 
 * License: GPL3+
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=true, position_dependant=false, categories={"color"})
public class ChannelMixer extends GeglFilter
{
    /** Constructs a Channel Mixer.
     *
     * Remix colors; by defining relative contributions from source components.
     */
    public ChannelMixer(GeglNode container)
    {
        super(container, "gegl:channel-mixer");
    }
    /** Constructs a Channel Mixer.
     *
     * Remix colors; by defining relative contributions from source components.
     */
    public ChannelMixer(GeglFilter parent)
    {
        super(parent, "gegl:channel-mixer");
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
    public ChannelMixer setPreserveLuminosity(boolean value)
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


    /** Red in Red channel
     *
     * Set the red amount for the red channel
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_RrGain  = 1.00;

    /** Red in Red channel
     *
     * Set the red amount for the red channel
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public ChannelMixer setRrGain(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_RrGain = value;
        setProperty("rr-gain", value);
        return this;
    }

    /** Red in Red channel
     *
     * Set the red amount for the red channel
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public double getRrGain()
    {
        return m_RrGain;
    }


    /** Green in Red channel
     *
     * Set the green amount for the red channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_RgGain  = 0.00;

    /** Green in Red channel
     *
     * Set the green amount for the red channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public ChannelMixer setRgGain(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_RgGain = value;
        setProperty("rg-gain", value);
        return this;
    }

    /** Green in Red channel
     *
     * Set the green amount for the red channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public double getRgGain()
    {
        return m_RgGain;
    }


    /** Blue in Red channel
     *
     * Set the blue amount for the red channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_RbGain  = 0.00;

    /** Blue in Red channel
     *
     * Set the blue amount for the red channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public ChannelMixer setRbGain(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_RbGain = value;
        setProperty("rb-gain", value);
        return this;
    }

    /** Blue in Red channel
     *
     * Set the blue amount for the red channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public double getRbGain()
    {
        return m_RbGain;
    }


    /** Red in Green channel
     *
     * Set the red amount for the green channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_GrGain  = 0.00;

    /** Red in Green channel
     *
     * Set the red amount for the green channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public ChannelMixer setGrGain(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_GrGain = value;
        setProperty("gr-gain", value);
        return this;
    }

    /** Red in Green channel
     *
     * Set the red amount for the green channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public double getGrGain()
    {
        return m_GrGain;
    }


    /** Green for Green channel
     *
     * Set the green amount for the green channel
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_GgGain  = 1.00;

    /** Green for Green channel
     *
     * Set the green amount for the green channel
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public ChannelMixer setGgGain(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_GgGain = value;
        setProperty("gg-gain", value);
        return this;
    }

    /** Green for Green channel
     *
     * Set the green amount for the green channel
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public double getGgGain()
    {
        return m_GgGain;
    }


    /** Blue in Green channel
     *
     * Set the blue amount for the green channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_GbGain  = 0.00;

    /** Blue in Green channel
     *
     * Set the blue amount for the green channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public ChannelMixer setGbGain(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_GbGain = value;
        setProperty("gb-gain", value);
        return this;
    }

    /** Blue in Green channel
     *
     * Set the blue amount for the green channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public double getGbGain()
    {
        return m_GbGain;
    }


    /** Red in Blue channel
     *
     * Set the red amount for the blue channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_BrGain  = 0.00;

    /** Red in Blue channel
     *
     * Set the red amount for the blue channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public ChannelMixer setBrGain(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_BrGain = value;
        setProperty("br-gain", value);
        return this;
    }

    /** Red in Blue channel
     *
     * Set the red amount for the blue channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public double getBrGain()
    {
        return m_BrGain;
    }


    /** Green in Blue channel
     *
     * Set the green amount for the blue channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_BgGain  = 0.00;

    /** Green in Blue channel
     *
     * Set the green amount for the blue channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public ChannelMixer setBgGain(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_BgGain = value;
        setProperty("bg-gain", value);
        return this;
    }

    /** Green in Blue channel
     *
     * Set the green amount for the blue channel
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -2.00 2.00
     */
    public double getBgGain()
    {
        return m_BgGain;
    }


    /** Blue in Blue channel
     *
     * Set the blue amount for the blue channel
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_BbGain  = 1.00;

    /** Blue in Blue channel
     *
     * Set the blue amount for the blue channel
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public ChannelMixer setBbGain(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_BbGain = value;
        setProperty("bb-gain", value);
        return this;
    }

    /** Blue in Blue channel
     *
     * Set the blue amount for the blue channel
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public double getBbGain()
    {
        return m_BbGain;
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

