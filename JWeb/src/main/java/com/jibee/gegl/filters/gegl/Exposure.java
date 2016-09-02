package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;

/**
 * Exposure
 *
 * Changes Exposure of an image, allows stepping HDR and photographs up/down in stops. 
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"color"})
public class Exposure extends GeglFilter
{
    /** Constructs a Exposure.
     *
     * Changes Exposure of an image, allows stepping HDR and photographs up/down in stops. 
     */
    public Exposure(GeglNode container)
    {
        super(container, "gegl:exposure");
    }
    /** Constructs a Exposure.
     *
     * Changes Exposure of an image, allows stepping HDR and photographs up/down in stops. 
     */
    public Exposure(GeglFilter parent)
    {
        super(parent, "gegl:exposure");
    }

    
    /** Exposure
     *
     * Relative brightness change in stops
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Exposure  = 0.00;

    /** Exposure
     *
     * Relative brightness change in stops
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public Exposure setExposure(double value)
    {
	
        m_Exposure = value;
        setProperty("exposure", value);
        return this;
    }

    /** Exposure
     *
     * Relative brightness change in stops
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getExposure()
    {
        return m_Exposure;
    }


    /** Offset
     *
     * Offset value added
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -0.50 0.50
     * */
    private double m_Offset  = 0.00;

    /** Offset
     *
     * Offset value added
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -0.50 0.50
     */
    public Exposure setOffset(double value) throws ParameterOutOfRangeException
    {
		if(value > 0.50 || value < -0.50)
	{
	    throw new ParameterOutOfRangeException(value, -0.50, 0.50);
	}

        m_Offset = value;
        setProperty("offset", value);
        return this;
    }

    /** Offset
     *
     * Offset value added
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -0.50 0.50
     */
    public double getOffset()
    {
        return m_Offset;
    }


    /** Gamma adjustment
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.01 10.00
     * */
    private double m_Gamma  = 1.00;

    /** Gamma adjustment
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.01 10.00
     */
    public Exposure setGamma(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < 0.01)
	{
	    throw new ParameterOutOfRangeException(value, 0.01, 10.00);
	}

        m_Gamma = value;
        setProperty("gamma", value);
        return this;
    }

    /** Gamma adjustment
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.01 10.00
     */
    public double getGamma()
    {
        return m_Gamma;
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

