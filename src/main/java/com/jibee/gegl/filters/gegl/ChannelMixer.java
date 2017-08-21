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
 * Channel Mixer
 *
 * Remix colors; by defining relative contributions from source components.
 * 
 * License: GPL3+
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=true, position_dependant=false, categories={"color"})
public class ChannelMixer extends GeglFilter implements Source, Sink
{
    /** Constructs a Channel Mixer.
     *
     * Remix colors; by defining relative contributions from source components.
     *
     * @param container container node
     */
    public ChannelMixer(GeglNode container)
    {
        super(container, "gegl:channel-mixer");
    }
    /** Constructs a Channel Mixer.
     *
     * Remix colors; by defining relative contributions from source components.
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Preserve luminosity
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Preserve luminosity
     * 
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
     *
     * @param value new value for Red in Red channel
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Red in Red channel
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Green in Red channel
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Green in Red channel
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Blue in Red channel
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Blue in Red channel
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Red in Green channel
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Red in Green channel
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Green for Green channel
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Green for Green channel
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Blue in Green channel
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Blue in Green channel
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Red in Blue channel
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Red in Blue channel
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Green in Blue channel
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Green in Blue channel
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Blue in Blue channel
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Blue in Blue channel
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBbGain()
    {
        return m_BbGain;
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

