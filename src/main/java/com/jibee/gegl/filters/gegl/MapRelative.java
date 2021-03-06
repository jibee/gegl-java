package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Map Relative
 *
 * sample input with an auxiliary buffer that contain relative source coordinates
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"map"})
public class MapRelative extends GeglFilter implements CombiningFilter
{
    /** Constructs a Map Relative.
     *
     * sample input with an auxiliary buffer that contain relative source coordinates
     *
     * @param container container node
     */
    public MapRelative(GeglNode container)
    {
        super(container, "gegl:map-relative");
    }
    /** Constructs a Map Relative.
     *
     * sample input with an auxiliary buffer that contain relative source coordinates
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Scaling
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Scaling
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Resampling method
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Resampling method
     * 
     */
    public String getSamplerType()
    {
        return m_SamplerType;
    }


    /** Abyss policy
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_AbyssPolicy ;

    /** Abyss policy
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Abyss policy
     * @return this filter (for chaining operations)
     * 
     */
    public MapRelative setAbyssPolicy(String value)
    {
	
        m_AbyssPolicy = value;
        setProperty("abyss-policy", value);
        return this;
    }

    /** Abyss policy
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Abyss policy
     * 
     */
    public String getAbyssPolicy()
    {
        return m_AbyssPolicy;
    }

    @Override
    public InputPad<MapRelative> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<MapRelative> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<MapRelative> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

