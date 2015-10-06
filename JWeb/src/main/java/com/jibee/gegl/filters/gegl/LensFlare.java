package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Lens Flare

Adds a lens flare effect.

License: GPL3+
Supports OpenCL: 
Position Dependant: 
*/
public class LensFlare extends GeglFilter
{
/** Constructs a Lens Flare.

Adds a lens flare effect.
*/
    public LensFlare(GeglNode container)
    {
        super(container, "gegl:lens-flare");
    }
/** Constructs a Lens Flare.

Adds a lens flare effect.
*/
    public LensFlare(GeglFilter parent)
    {
        super(parent, "gegl:lens-flare");
    }

    
/** X position

X coordinates of the flare center

Unit: relative-coordinate
Default value: 0.50
Acceptable Range:  
*/
    private double m_PosX  = 0.50;

/** X position

X coordinates of the flare center

Unit: relative-coordinate
Default value: 0.50
Acceptable Range:  
*/
    public LensFlare setPosX(double value)
    {
	
        m_PosX = value;
        setProperty("pos-x", value);
        return this;
    }

/** X position

X coordinates of the flare center

Unit: relative-coordinate
Default value: 0.50
Acceptable Range:  
*/
    public double getPosX()
    {
        return m_PosX;
    }


/** Y position

Y coordinates of the flare center

Unit: relative-coordinate
Default value: 0.50
Acceptable Range:  
*/
    private double m_PosY  = 0.50;

/** Y position

Y coordinates of the flare center

Unit: relative-coordinate
Default value: 0.50
Acceptable Range:  
*/
    public LensFlare setPosY(double value)
    {
	
        m_PosY = value;
        setProperty("pos-y", value);
        return this;
    }

/** Y position

Y coordinates of the flare center

Unit: relative-coordinate
Default value: 0.50
Acceptable Range:  
*/
    public double getPosY()
    {
        return m_PosY;
    }


}
