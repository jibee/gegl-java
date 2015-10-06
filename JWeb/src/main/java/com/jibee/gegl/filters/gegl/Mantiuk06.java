package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**
Mantiuk 2006 Tonemapping

Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator constrains contrasts across multiple spatial frequencies, producing luminance within the range 0.0-1.0

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Mantiuk06 extends GeglFilter
{
/** Constructs a Mantiuk 2006 Tonemapping.

Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator constrains contrasts across multiple spatial frequencies, producing luminance within the range 0.0-1.0
*/
    public Mantiuk06(GeglNode container)
    {
        super(container, "gegl:mantiuk06");
    }
/** Constructs a Mantiuk 2006 Tonemapping.

Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator constrains contrasts across multiple spatial frequencies, producing luminance within the range 0.0-1.0
*/
    public Mantiuk06(GeglFilter parent)
    {
        super(parent, "gegl:mantiuk06");
    }

    
/** Contrast

The amount of contrast compression

Unit: 
Default value: 0.10
Acceptable Range: 0.00 1.00
*/
    private double m_Contrast  = 0.10;

/** Contrast

The amount of contrast compression

Unit: 
Default value: 0.10
Acceptable Range: 0.00 1.00
*/
    public Mantiuk06 setContrast(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Contrast = value;
        setProperty("contrast", value);
        return this;
    }

/** Contrast

The amount of contrast compression

Unit: 
Default value: 0.10
Acceptable Range: 0.00 1.00
*/
    public double getContrast()
    {
        return m_Contrast;
    }


/** Saturation

Global color saturation factor

Unit: 
Default value: 0.80
Acceptable Range: 0.00 2.00
*/
    private double m_Saturation  = 0.80;

/** Saturation

Global color saturation factor

Unit: 
Default value: 0.80
Acceptable Range: 0.00 2.00
*/
    public Mantiuk06 setSaturation(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 2.00);
	}

        m_Saturation = value;
        setProperty("saturation", value);
        return this;
    }

/** Saturation

Global color saturation factor

Unit: 
Default value: 0.80
Acceptable Range: 0.00 2.00
*/
    public double getSaturation()
    {
        return m_Saturation;
    }


/** Detail

Level of emphasis on image gradient details

Unit: 
Default value: 1.00
Acceptable Range: 1.00 99.00
*/
    private double m_Detail  = 1.00;

/** Detail

Level of emphasis on image gradient details

Unit: 
Default value: 1.00
Acceptable Range: 1.00 99.00
*/
    public Mantiuk06 setDetail(double value) throws ParameterOutOfRangeException
    {
		if(value > 99.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 99.00);
	}

        m_Detail = value;
        setProperty("detail", value);
        return this;
    }

/** Detail

Level of emphasis on image gradient details

Unit: 
Default value: 1.00
Acceptable Range: 1.00 99.00
*/
    public double getDetail()
    {
        return m_Detail;
    }


}
