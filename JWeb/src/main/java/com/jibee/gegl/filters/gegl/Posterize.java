package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Posterize

Reduces the number of levels in each color component of the image.

License: 
Supports OpenCL: true
Position Dependant: 
*/
public class Posterize extends GeglFilter
{
/** Constructs a Posterize.

Reduces the number of levels in each color component of the image.
*/
    public Posterize(GeglNode container)
    {
        super(container, "gegl:posterize");
    }
/** Constructs a Posterize.

Reduces the number of levels in each color component of the image.
*/
    public Posterize(GeglFilter parent)
    {
        super(parent, "gegl:posterize");
    }

    
/** Levels

number of levels per component

Unit: 
Default value: 8
Acceptable Range: 1 64
*/
    private int m_Levels  = 8;

/** Levels

number of levels per component

Unit: 
Default value: 8
Acceptable Range: 1 64
*/
    public Posterize setLevels(int value) throws ParameterOutOfRangeException
    {
		if(value > 64 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 64);
	}

        m_Levels = value;
        setProperty("levels", value);
        return this;
    }

/** Levels

number of levels per component

Unit: 
Default value: 8
Acceptable Range: 1 64
*/
    public int getLevels()
    {
        return m_Levels;
    }


}
