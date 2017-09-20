package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Diffraction Patterns
 *
 * Generate diffraction patterns
 * 
 * License: GPL3+
 * Supports OpenCL: true
 * Position Dependant: true
 */
@GeglFilterOp(license="GPL3+", opencl=true, position_dependant=true, categories={"render"})
public class DiffractionPatterns extends GeglFilter implements Source
{
    /** Constructs a Diffraction Patterns.
     *
     * Generate diffraction patterns
     *
     * @param container container node
     */
    public DiffractionPatterns(GeglNode container)
    {
        super(container, "gegl:diffraction-patterns");
    }
    /** Constructs a Diffraction Patterns.
     *
     * Generate diffraction patterns
     *
     * @param parent parent filter node
     */
    public DiffractionPatterns(GeglFilter parent)
    {
        super(parent, "gegl:diffraction-patterns");
    }

    
    /** Red frequency
     *
     * Light frequency (red)
     *
     * Unit: 
     * Default value: 0.81
     * Acceptable Range: 0.00 20.00
     * */
    private double m_RedFrequency  = 0.81;

    /** Red frequency
     *
     * Light frequency (red)
     *
     * Unit: 
     * Default value: 0.81
     * Acceptable Range: 0.00 20.00
     *
     * @param value new value for Red frequency
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setRedFrequency(double value) throws ParameterOutOfRangeException
    {
		if(value > 20.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 20.00);
	    }

        m_RedFrequency = value;
        setProperty("red-frequency", value);
        return this;
    }

    /** Red frequency
     *
     * Light frequency (red)
     *
     * Unit: 
     * Default value: 0.81
     * Acceptable Range: 0.00 20.00
     *
     * @return value of Red frequency
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRedFrequency()
    {
        return m_RedFrequency;
    }


    /** Green frequency
     *
     * Light frequency (green)
     *
     * Unit: 
     * Default value: 1.22
     * Acceptable Range: 0.00 20.00
     * */
    private double m_GreenFrequency  = 1.22;

    /** Green frequency
     *
     * Light frequency (green)
     *
     * Unit: 
     * Default value: 1.22
     * Acceptable Range: 0.00 20.00
     *
     * @param value new value for Green frequency
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setGreenFrequency(double value) throws ParameterOutOfRangeException
    {
		if(value > 20.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 20.00);
	    }

        m_GreenFrequency = value;
        setProperty("green-frequency", value);
        return this;
    }

    /** Green frequency
     *
     * Light frequency (green)
     *
     * Unit: 
     * Default value: 1.22
     * Acceptable Range: 0.00 20.00
     *
     * @return value of Green frequency
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getGreenFrequency()
    {
        return m_GreenFrequency;
    }


    /** Blue frequency
     *
     * Light frequency (blue)
     *
     * Unit: 
     * Default value: 1.12
     * Acceptable Range: 0.00 20.00
     * */
    private double m_BlueFrequency  = 1.12;

    /** Blue frequency
     *
     * Light frequency (blue)
     *
     * Unit: 
     * Default value: 1.12
     * Acceptable Range: 0.00 20.00
     *
     * @param value new value for Blue frequency
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setBlueFrequency(double value) throws ParameterOutOfRangeException
    {
		if(value > 20.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 20.00);
	    }

        m_BlueFrequency = value;
        setProperty("blue-frequency", value);
        return this;
    }

    /** Blue frequency
     *
     * Light frequency (blue)
     *
     * Unit: 
     * Default value: 1.12
     * Acceptable Range: 0.00 20.00
     *
     * @return value of Blue frequency
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBlueFrequency()
    {
        return m_BlueFrequency;
    }


    /** Red contours
     *
     * Number of contours (red)
     *
     * Unit: 
     * Default value: 0.82
     * Acceptable Range: 0.00 10.00
     * */
    private double m_RedContours  = 0.82;

    /** Red contours
     *
     * Number of contours (red)
     *
     * Unit: 
     * Default value: 0.82
     * Acceptable Range: 0.00 10.00
     *
     * @param value new value for Red contours
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setRedContours(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 10.00);
	    }

        m_RedContours = value;
        setProperty("red-contours", value);
        return this;
    }

    /** Red contours
     *
     * Number of contours (red)
     *
     * Unit: 
     * Default value: 0.82
     * Acceptable Range: 0.00 10.00
     *
     * @return value of Red contours
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRedContours()
    {
        return m_RedContours;
    }


    /** Green contours
     *
     * Number of contours (green)
     *
     * Unit: 
     * Default value: 0.82
     * Acceptable Range: 0.00 10.00
     * */
    private double m_GreenContours  = 0.82;

    /** Green contours
     *
     * Number of contours (green)
     *
     * Unit: 
     * Default value: 0.82
     * Acceptable Range: 0.00 10.00
     *
     * @param value new value for Green contours
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setGreenContours(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 10.00);
	    }

        m_GreenContours = value;
        setProperty("green-contours", value);
        return this;
    }

    /** Green contours
     *
     * Number of contours (green)
     *
     * Unit: 
     * Default value: 0.82
     * Acceptable Range: 0.00 10.00
     *
     * @return value of Green contours
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getGreenContours()
    {
        return m_GreenContours;
    }


    /** Blue contours
     *
     * Number of contours (blue)
     *
     * Unit: 
     * Default value: 0.97
     * Acceptable Range: 0.00 10.00
     * */
    private double m_BlueContours  = 0.97;

    /** Blue contours
     *
     * Number of contours (blue)
     *
     * Unit: 
     * Default value: 0.97
     * Acceptable Range: 0.00 10.00
     *
     * @param value new value for Blue contours
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setBlueContours(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 10.00);
	    }

        m_BlueContours = value;
        setProperty("blue-contours", value);
        return this;
    }

    /** Blue contours
     *
     * Number of contours (blue)
     *
     * Unit: 
     * Default value: 0.97
     * Acceptable Range: 0.00 10.00
     *
     * @return value of Blue contours
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBlueContours()
    {
        return m_BlueContours;
    }


    /** Red sharp edges
     *
     * Number of sharp edges (red)
     *
     * Unit: 
     * Default value: 0.61
     * Acceptable Range: 0.00 1.00
     * */
    private double m_RedSedges  = 0.61;

    /** Red sharp edges
     *
     * Number of sharp edges (red)
     *
     * Unit: 
     * Default value: 0.61
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Red sharp edges
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setRedSedges(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_RedSedges = value;
        setProperty("red-sedges", value);
        return this;
    }

    /** Red sharp edges
     *
     * Number of sharp edges (red)
     *
     * Unit: 
     * Default value: 0.61
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Red sharp edges
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRedSedges()
    {
        return m_RedSedges;
    }


    /** Green sharp edges
     *
     * Number of sharp edges (green)
     *
     * Unit: 
     * Default value: 0.68
     * Acceptable Range: 0.00 1.00
     * */
    private double m_GreenSedges  = 0.68;

    /** Green sharp edges
     *
     * Number of sharp edges (green)
     *
     * Unit: 
     * Default value: 0.68
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Green sharp edges
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setGreenSedges(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_GreenSedges = value;
        setProperty("green-sedges", value);
        return this;
    }

    /** Green sharp edges
     *
     * Number of sharp edges (green)
     *
     * Unit: 
     * Default value: 0.68
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Green sharp edges
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getGreenSedges()
    {
        return m_GreenSedges;
    }


    /** Blue sharp edges
     *
     * Number of sharp edges (blue)
     *
     * Unit: 
     * Default value: 0.64
     * Acceptable Range: 0.00 1.00
     * */
    private double m_BlueSedges  = 0.64;

    /** Blue sharp edges
     *
     * Number of sharp edges (blue)
     *
     * Unit: 
     * Default value: 0.64
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Blue sharp edges
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setBlueSedges(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_BlueSedges = value;
        setProperty("blue-sedges", value);
        return this;
    }

    /** Blue sharp edges
     *
     * Number of sharp edges (blue)
     *
     * Unit: 
     * Default value: 0.64
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Blue sharp edges
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBlueSedges()
    {
        return m_BlueSedges;
    }


    /** Brightness
     *
     * Brightness and shifting/fattening of contours
     *
     * Unit: 
     * Default value: 0.07
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Brightness  = 0.07;

    /** Brightness
     *
     * Brightness and shifting/fattening of contours
     *
     * Unit: 
     * Default value: 0.07
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Brightness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setBrightness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Brightness = value;
        setProperty("brightness", value);
        return this;
    }

    /** Brightness
     *
     * Brightness and shifting/fattening of contours
     *
     * Unit: 
     * Default value: 0.07
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Brightness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBrightness()
    {
        return m_Brightness;
    }


    /** Scattering
     *
     * Scattering (speed vs. quality)
     *
     * Unit: 
     * Default value: 37.13
     * Acceptable Range: 0.00 100.00
     * */
    private double m_Scattering  = 37.13;

    /** Scattering
     *
     * Scattering (speed vs. quality)
     *
     * Unit: 
     * Default value: 37.13
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Scattering
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setScattering(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_Scattering = value;
        setProperty("scattering", value);
        return this;
    }

    /** Scattering
     *
     * Scattering (speed vs. quality)
     *
     * Unit: 
     * Default value: 37.13
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Scattering
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getScattering()
    {
        return m_Scattering;
    }


    /** Polarization
     *
     * Polarization
     *
     * Unit: 
     * Default value: -0.47
     * Acceptable Range: -1.00 1.00
     * */
    private double m_Polarization  = -0.47;

    /** Polarization
     *
     * Polarization
     *
     * Unit: 
     * Default value: -0.47
     * Acceptable Range: -1.00 1.00
     *
     * @param value new value for Polarization
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public DiffractionPatterns setPolarization(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	    {
	        throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	    }

        m_Polarization = value;
        setProperty("polarization", value);
        return this;
    }

    /** Polarization
     *
     * Polarization
     *
     * Unit: 
     * Default value: -0.47
     * Acceptable Range: -1.00 1.00
     *
     * @return value of Polarization
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getPolarization()
    {
        return m_Polarization;
    }


    /** Width
     *
     * Width of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 200
     * Acceptable Range:  
     * */
    private int m_Width  = 200;

    /** Width
     *
     * Width of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 200
     * Acceptable Range:  
     *
     * @param value new value for Width
     * @return this filter (for chaining operations)
     * 
     */
    public DiffractionPatterns setWidth(int value)
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
     * Default value: 200
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
     * Default value: 200
     * Acceptable Range:  
     * */
    private int m_Height  = 200;

    /** Height
     *
     * Height of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 200
     * Acceptable Range:  
     *
     * @param value new value for Height
     * @return this filter (for chaining operations)
     * 
     */
    public DiffractionPatterns setHeight(int value)
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
     * Default value: 200
     * Acceptable Range:  
     *
     * @return value of Height
     * 
     */
    public int getHeight()
    {
        return m_Height;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

