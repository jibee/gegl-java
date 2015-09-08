package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Add CIE Lch Noise

Randomize lightness, chroma and hue independently

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class NoiseCieLch extends GeglFilter
{
/** Constructs a Add CIE Lch Noise.

Randomize lightness, chroma and hue independently
*/
    public NoiseCieLch(GeglNode container)
    {
        super(container, "gegl:noise-cie-lch");
    }
/** Constructs a Add CIE Lch Noise.

Randomize lightness, chroma and hue independently
*/
    public NoiseCieLch(GeglFilter parent)
    {
        super(parent, "gegl:noise-cie-lch");
    }

    
/** Holdness



Unit: 
Default value: 2
Acceptable Range: 1 8
*/
    private int m_Holdness  = 2;

/** Holdness



Unit: 
Default value: 2
Acceptable Range: 1 8
*/
    public NoiseCieLch setHoldness(int value) throws ParameterOutOfRangeException
    {
		if(value > 8 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 8);
	}

        m_Holdness = value;
        setProperty("holdness", value);
        return this;
    }

/** Holdness



Unit: 
Default value: 2
Acceptable Range: 1 8
*/
    public int getHoldness()
    {
        return m_Holdness;
    }


/** Lightness



Unit: 
Default value: 40.00
Acceptable Range: 0.00 100.00
*/
    private double m_LightnessDistance  = 40.00;

/** Lightness



Unit: 
Default value: 40.00
Acceptable Range: 0.00 100.00
*/
    public NoiseCieLch setLightnessDistance(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	}

        m_LightnessDistance = value;
        setProperty("lightness-distance", value);
        return this;
    }

/** Lightness



Unit: 
Default value: 40.00
Acceptable Range: 0.00 100.00
*/
    public double getLightnessDistance()
    {
        return m_LightnessDistance;
    }


/** Chroma



Unit: 
Default value: 40.00
Acceptable Range: 0.00 100.00
*/
    private double m_ChromaDistance  = 40.00;

/** Chroma



Unit: 
Default value: 40.00
Acceptable Range: 0.00 100.00
*/
    public NoiseCieLch setChromaDistance(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	}

        m_ChromaDistance = value;
        setProperty("chroma-distance", value);
        return this;
    }

/** Chroma



Unit: 
Default value: 40.00
Acceptable Range: 0.00 100.00
*/
    public double getChromaDistance()
    {
        return m_ChromaDistance;
    }


/** Hue



Unit: 
Default value: 3.00
Acceptable Range: 0.00 180.00
*/
    private double m_HueDistance  = 3.00;

/** Hue



Unit: 
Default value: 3.00
Acceptable Range: 0.00 180.00
*/
    public NoiseCieLch setHueDistance(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 180.00);
	}

        m_HueDistance = value;
        setProperty("hue-distance", value);
        return this;
    }

/** Hue



Unit: 
Default value: 3.00
Acceptable Range: 0.00 180.00
*/
    public double getHueDistance()
    {
        return m_HueDistance;
    }


/** Random seed



Unit: 
Default value: 
Acceptable Range:  
*/
    private int m_Seed ;

/** Random seed



Unit: 
Default value: 
Acceptable Range:  
*/
    public NoiseCieLch setSeed(int value)
    {
	
        m_Seed = value;
        setProperty("seed", value);
        return this;
    }

/** Random seed



Unit: 
Default value: 
Acceptable Range:  
*/
    public int getSeed()
    {
        return m_Seed;
    }


}

