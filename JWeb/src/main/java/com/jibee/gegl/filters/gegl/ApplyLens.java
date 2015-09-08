package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**
Apply Lens

Simulates the optical distoration caused by having an elliptical lens over the image

License: GPL3+
Supports OpenCL: 
Position Dependant: 
*/
public class ApplyLens extends GeglFilter
{
/** Constructs a Apply Lens.

Simulates the optical distoration caused by having an elliptical lens over the image
*/
    public ApplyLens(GeglNode container)
    {
        super(container, "gegl:apply-lens");
    }
/** Constructs a Apply Lens.

Simulates the optical distoration caused by having an elliptical lens over the image
*/
    public ApplyLens(GeglFilter parent)
    {
        super(parent, "gegl:apply-lens");
    }

    
/** Lens refraction index



Unit: 
Default value: 1.70
Acceptable Range: 1.00 100.00
*/
    private double m_RefractionIndex  = 1.70;

/** Lens refraction index



Unit: 
Default value: 1.70
Acceptable Range: 1.00 100.00
*/
    public ApplyLens setRefractionIndex(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 100.00);
	}

        m_RefractionIndex = value;
        setProperty("refraction-index", value);
        return this;
    }

/** Lens refraction index



Unit: 
Default value: 1.70
Acceptable Range: 1.00 100.00
*/
    public double getRefractionIndex()
    {
        return m_RefractionIndex;
    }


/** Keep original surroundings

Keep image unchanged, where not affected by the lens.

Unit: 
Default value: false
Acceptable Range:  
*/
    private boolean m_KeepSurroundings  = false;

/** Keep original surroundings

Keep image unchanged, where not affected by the lens.

Unit: 
Default value: false
Acceptable Range:  
*/
    public ApplyLens setKeepSurroundings(boolean value)
    {
	
        m_KeepSurroundings = value;
        setProperty("keep-surroundings", value);
        return this;
    }

/** Keep original surroundings

Keep image unchanged, where not affected by the lens.

Unit: 
Default value: false
Acceptable Range:  
*/
    public boolean getKeepSurroundings()
    {
        return m_KeepSurroundings;
    }


/** Background color



Unit: 
Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    private GeglColor m_BackgroundColor  = makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)");

/** Background color



Unit: 
Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public ApplyLens setBackgroundColor(GeglColor value)
    {
	
        m_BackgroundColor = value;
        setProperty("background-color", value);
        return this;
    }

/** Background color



Unit: 
Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public GeglColor getBackgroundColor()
    {
        return m_BackgroundColor;
    }


}

