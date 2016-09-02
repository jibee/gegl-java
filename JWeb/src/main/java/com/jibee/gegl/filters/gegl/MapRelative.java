package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Map Relative
 *
 * sample input with an auxiliary buffer that contain relative source coordinates
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"map"})
public class MapRelative extends GeglFilter
{
    /** Constructs a Map Relative.
     *
     * sample input with an auxiliary buffer that contain relative source coordinates
     */
    public MapRelative(GeglNode container)
    {
        super(container, "gegl:map-relative");
    }
    /** Constructs a Map Relative.
     *
     * sample input with an auxiliary buffer that contain relative source coordinates
     */
    public MapRelative(GeglFilter parent)
    {
        super(parent, "gegl:map-relative");
    }

    
    /** Scaling
     *
     * scaling factor of displacement, indicates how large spatial displacement a relative mapping value of 1.0 corresponds to.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 5000.00
     * */
    private double m_Scaling  = 1.00;

    /** Scaling
     *
     * scaling factor of displacement, indicates how large spatial displacement a relative mapping value of 1.0 corresponds to.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 5000.00
     */
    public MapRelative setScaling(double value) throws ParameterOutOfRangeException
    {
		if(value > 5000.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 5000.00);
	}

        m_Scaling = value;
        setProperty("scaling", value);
        return this;
    }

    /** Scaling
     *
     * scaling factor of displacement, indicates how large spatial displacement a relative mapping value of 1.0 corresponds to.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 5000.00
     */
    public double getScaling()
    {
        return m_Scaling;
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
    public MapRelative setSamplerType(String value)
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

    public InputPad aux()
    {
        return new InputPad(this, "aux");
    }

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

