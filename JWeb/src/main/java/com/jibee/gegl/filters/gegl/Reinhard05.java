package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;

/**
Reinhard 2005 Tonemapper

Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This is an efficient global operator derived from simple physiological observations, producing luminance within the range 0.0-1.0

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Reinhard05 extends GeglFilter
{
/** Constructs a Reinhard 2005 Tonemapper.

Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This is an efficient global operator derived from simple physiological observations, producing luminance within the range 0.0-1.0
*/
    public Reinhard05(GeglNode container)
    {
        super(container, "gegl:reinhard05");
    }
/** Constructs a Reinhard 2005 Tonemapper.

Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This is an efficient global operator derived from simple physiological observations, producing luminance within the range 0.0-1.0
*/
    public Reinhard05(GeglFilter parent)
    {
        super(parent, "gegl:reinhard05");
    }

    
/** Brightness

Overall brightness of the image

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    private double m_Brightness  = 0.00;

/** Brightness

Overall brightness of the image

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public Reinhard05 setBrightness(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	{
	    throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	}

        m_Brightness = value;
        setProperty("brightness", value);
        return this;
    }

/** Brightness

Overall brightness of the image

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public double getBrightness()
    {
        return m_Brightness;
    }


/** Chromatic adaptation

Adaptation to color variation across the image

Unit: 
Default value: 0.00
Acceptable Range: 0.00 1.00
*/
    private double m_Chromatic  = 0.00;

/** Chromatic adaptation

Adaptation to color variation across the image

Unit: 
Default value: 0.00
Acceptable Range: 0.00 1.00
*/
    public Reinhard05 setChromatic(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Chromatic = value;
        setProperty("chromatic", value);
        return this;
    }

/** Chromatic adaptation

Adaptation to color variation across the image

Unit: 
Default value: 0.00
Acceptable Range: 0.00 1.00
*/
    public double getChromatic()
    {
        return m_Chromatic;
    }


/** Light adaptation

Adaptation to light variation across the image

Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
*/
    private double m_Light  = 1.00;

/** Light adaptation

Adaptation to light variation across the image

Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
*/
    public Reinhard05 setLight(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Light = value;
        setProperty("light", value);
        return this;
    }

/** Light adaptation

Adaptation to light variation across the image

Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
*/
    public double getLight()
    {
        return m_Light;
    }


}

