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
     *
     * @param container container node
     */
    public Ripple(GeglNode container)
    {
        super(container, "gegl:ripple");
    }
    /** Constructs a Ripple.
     *
     * Displace pixels in a ripple pattern
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Amplitude
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Amplitude
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Period
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Period
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Phase shift
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Phase shift
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Angle
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Angle
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Resampling method
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Resampling method
     * 
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
     *
     * @param value new value for Wave type
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Wave type
     * 
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
     *
     * @param value new value for Tileable
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Tileable
     * 
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

