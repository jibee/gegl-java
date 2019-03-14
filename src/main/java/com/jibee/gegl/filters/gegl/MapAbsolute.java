package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Map Absolute
 *
 * sample input with an auxiliary buffer that contain absolute source coordinates
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"map"})
public class MapAbsolute extends GeglFilter implements CombiningFilter
{
    /** Constructs a Map Absolute.
     *
     * sample input with an auxiliary buffer that contain absolute source coordinates
     *
     * @param container container node
     */
    public MapAbsolute(GeglNode container)
    {
        super(container, "gegl:map-absolute");
    }
    /** Constructs a Map Absolute.
     *
     * sample input with an auxiliary buffer that contain absolute source coordinates
     *
     * @param parent parent filter node
     */
    public MapAbsolute(GeglFilter parent)
    {
        super(parent, "gegl:map-absolute");
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
    public MapAbsolute setSamplerType(String value)
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
    public MapAbsolute setAbyssPolicy(String value)
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
    public InputPad<MapAbsolute> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<MapAbsolute> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<MapAbsolute> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

