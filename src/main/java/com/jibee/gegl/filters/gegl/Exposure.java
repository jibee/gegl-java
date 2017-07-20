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
 * Exposure
 *
 * Changes Exposure of an image, allows stepping HDR and photographs up/down in stops. 
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"color"})
public class Exposure extends GeglFilter implements Source, Sink
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

    
    /** Black level
     *
     * Adjust the black level
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -0.10 0.10
     * */
    private double m_BlackLevel  = 0.00;

    /** Black level
     *
     * Adjust the black level
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -0.10 0.10
     */
    public Exposure setBlackLevel(double value) throws ParameterOutOfRangeException
    {
		if(value > 0.10 || value < -0.10)
	{
	    throw new ParameterOutOfRangeException(value, -0.10, 0.10);
	}

        m_BlackLevel = value;
        setProperty("black-level", value);
        return this;
    }

    /** Black level
     *
     * Adjust the black level
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -0.10 0.10
     */
    public double getBlackLevel()
    {
        return m_BlackLevel;
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

