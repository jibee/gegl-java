package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**
Map Relative

sample input with an auxiliary buffer that contain relative source coordinates

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class MapRelative extends GeglFilter
{
/** Constructs a Map Relative.

sample input with an auxiliary buffer that contain relative source coordinates
*/
    public MapRelative(GeglNode container)
    {
        super(container, "gegl:map-relative");
    }
/** Constructs a Map Relative.

sample input with an auxiliary buffer that contain relative source coordinates
*/
    public MapRelative(GeglFilter parent)
    {
        super(parent, "gegl:map-relative");
    }

    
/** Scaling

scaling factor of displacement, indicates how large spatial displacement a relative mapping value of 1.0 corresponds to.

Unit: 
Default value: 1.00
Acceptable Range: 0.00 5000.00
*/
    private double m_Scaling  = 1.00;

/** Scaling

scaling factor of displacement, indicates how large spatial displacement a relative mapping value of 1.0 corresponds to.

Unit: 
Default value: 1.00
Acceptable Range: 0.00 5000.00
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

scaling factor of displacement, indicates how large spatial displacement a relative mapping value of 1.0 corresponds to.

Unit: 
Default value: 1.00
Acceptable Range: 0.00 5000.00
*/
    public double getScaling()
    {
        return m_Scaling;
    }


/** Resampling method



Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_SamplerType ;

/** Resampling method



Unit: 
Default value: 
Acceptable Range:  
*/
    public MapRelative setSamplerType(String value)
    {
	
        m_SamplerType = value;
        setProperty("sampler-type", value);
        return this;
    }

/** Resampling method



Unit: 
Default value: 
Acceptable Range:  
*/
    public String getSamplerType()
    {
        return m_SamplerType;
    }


}

