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
 * Ripple
 *
 * Displace pixels in a ripple pattern
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"distort"})
public class Ripple extends GeglFilter implements Source, Sink
{
    /** Constructs a Ripple.
     *
     * Displace pixels in a ripple pattern
     */
    public Ripple(GeglNode container)
    {
        super(container, "gegl:ripple");
    }
    /** Constructs a Ripple.
     *
     * Displace pixels in a ripple pattern
     */
    public Ripple(GeglFilter parent)
    {
        super(parent, "gegl:ripple");
    }

    
    /** Amplitude
     *
     * 
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range: 0.00 1000.00
     * */
    private double m_Amplitude  = 25.00;

    /** Amplitude
     *
     * 
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range: 0.00 1000.00
     */
    public Ripple setAmplitude(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1000.00);
	}

        m_Amplitude = value;
        setProperty("amplitude", value);
        return this;
    }

    /** Amplitude
     *
     * 
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range: 0.00 1000.00
     */
    public double getAmplitude()
    {
        return m_Amplitude;
    }


    /** Period
     *
     * 
     *
     * Unit: 
     * Default value: 200.00
     * Acceptable Range: 0.00 1000.00
     * */
    private double m_Period  = 200.00;

    /** Period
     *
     * 
     *
     * Unit: 
     * Default value: 200.00
     * Acceptable Range: 0.00 1000.00
     */
    public Ripple setPeriod(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1000.00);
	}

        m_Period = value;
        setProperty("period", value);
        return this;
    }

    /** Period
     *
     * 
     *
     * Unit: 
     * Default value: 200.00
     * Acceptable Range: 0.00 1000.00
     */
    public double getPeriod()
    {
        return m_Period;
    }


    /** Phase shift
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_Phi  = 0.00;

    /** Phase shift
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public Ripple setPhi(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_Phi = value;
        setProperty("phi", value);
        return this;
    }

    /** Phase shift
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getPhi()
    {
        return m_Phi;
    }


    /** Angle
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Angle  = 0.00;

    /** Angle
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     */
    public Ripple setAngle(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < -180.00)
	{
	    throw new ParameterOutOfRangeException(value, -180.00, 180.00);
	}

        m_Angle = value;
        setProperty("angle", value);
        return this;
    }

    /** Angle
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     */
    public double getAngle()
    {
        return m_Angle;
    }


    /** Resampling method
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_SamplerType ;

    /** Resampling method
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Ripple setSamplerType(String value)
    {
	
        m_SamplerType = value;
        setProperty("sampler-type", value);
        return this;
    }

    /** Resampling method
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getSamplerType()
    {
        return m_SamplerType;
    }


    /** Wave type
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_WaveType ;

    /** Wave type
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Ripple setWaveType(String value)
    {
	
        m_WaveType = value;
        setProperty("wave-type", value);
        return this;
    }

    /** Wave type
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getWaveType()
    {
        return m_WaveType;
    }


    /** Tileable
     *
     * Retain tilebility
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Tileable  = false;

    /** Tileable
     *
     * Retain tilebility
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public Ripple setTileable(boolean value)
    {
	
        m_Tileable = value;
        setProperty("tileable", value);
        return this;
    }

    /** Tileable
     *
     * Retain tilebility
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getTileable()
    {
        return m_Tileable;
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

