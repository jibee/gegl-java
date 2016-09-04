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
 * Waves
 *
 * Distort the image with waves
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"distort"})
public class Waves extends GeglFilter implements Source, Sink
{
    /** Constructs a Waves.
     *
     * Distort the image with waves
     */
    public Waves(GeglNode container)
    {
        super(container, "gegl:waves");
    }
    /** Constructs a Waves.
     *
     * Distort the image with waves
     */
    public Waves(GeglFilter parent)
    {
        super(parent, "gegl:waves");
    }

    
    /** Center X
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_X  = 0.50;

    /** Center X
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public Waves setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** Center X
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public double getX()
    {
        return m_X;
    }


    /** Center Y
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_Y  = 0.50;

    /** Center Y
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public Waves setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Center Y
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public double getY()
    {
        return m_Y;
    }


    /** Amplitude
     *
     * Amplitude of the ripple
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range: 0.00 1000.00
     * */
    private double m_Amplitude  = 25.00;

    /** Amplitude
     *
     * Amplitude of the ripple
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range: 0.00 1000.00
     */
    public Waves setAmplitude(double value) throws ParameterOutOfRangeException
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
     * Amplitude of the ripple
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
     * Period (wavelength) of the ripple
     *
     * Unit: 
     * Default value: 200.00
     * Acceptable Range: 0.10 1000.00
     * */
    private double m_Period  = 200.00;

    /** Period
     *
     * Period (wavelength) of the ripple
     *
     * Unit: 
     * Default value: 200.00
     * Acceptable Range: 0.10 1000.00
     */
    public Waves setPeriod(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.10)
	{
	    throw new ParameterOutOfRangeException(value, 0.10, 1000.00);
	}

        m_Period = value;
        setProperty("period", value);
        return this;
    }

    /** Period
     *
     * Period (wavelength) of the ripple
     *
     * Unit: 
     * Default value: 200.00
     * Acceptable Range: 0.10 1000.00
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
    public Waves setPhi(double value) throws ParameterOutOfRangeException
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


    /** Aspect ratio
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.10 10.00
     * */
    private double m_Aspect  = 1.00;

    /** Aspect ratio
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.10 10.00
     */
    public Waves setAspect(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < 0.10)
	{
	    throw new ParameterOutOfRangeException(value, 0.10, 10.00);
	}

        m_Aspect = value;
        setProperty("aspect", value);
        return this;
    }

    /** Aspect ratio
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.10 10.00
     */
    public double getAspect()
    {
        return m_Aspect;
    }


    /** Resampling method
     *
     * Mathematical method for reconstructing pixel values
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_SamplerType ;

    /** Resampling method
     *
     * Mathematical method for reconstructing pixel values
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Waves setSamplerType(String value)
    {
	
        m_SamplerType = value;
        setProperty("sampler-type", value);
        return this;
    }

    /** Resampling method
     *
     * Mathematical method for reconstructing pixel values
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getSamplerType()
    {
        return m_SamplerType;
    }


    /** Clamp deformation
     *
     * Limit deformation in the image area.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Clamp  = false;

    /** Clamp deformation
     *
     * Limit deformation in the image area.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public Waves setClamp(boolean value)
    {
	
        m_Clamp = value;
        setProperty("clamp", value);
        return this;
    }

    /** Clamp deformation
     *
     * Limit deformation in the image area.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getClamp()
    {
        return m_Clamp;
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

