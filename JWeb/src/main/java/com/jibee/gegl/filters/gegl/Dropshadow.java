package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglNode;

/**


Creates a dropshadow effect on the input buffer

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Dropshadow extends GeglFilter
{
/** Constructs a .

Creates a dropshadow effect on the input buffer
*/
    public Dropshadow(GeglNode container)
    {
        super(container, "gegl:dropshadow");
    }
/** Constructs a .

Creates a dropshadow effect on the input buffer
*/
    public Dropshadow(GeglFilter parent)
    {
        super(parent, "gegl:dropshadow");
    }

    
/** X

Horizontal shadow offset

Unit: pixel-distance
Default value: 20.00
Acceptable Range:  
*/
    private double m_X  = 20.00;

/** X

Horizontal shadow offset

Unit: pixel-distance
Default value: 20.00
Acceptable Range:  
*/
    public Dropshadow setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

/** X

Horizontal shadow offset

Unit: pixel-distance
Default value: 20.00
Acceptable Range:  
*/
    public double getX()
    {
        return m_X;
    }


/** Y

Vertical shadow offset

Unit: pixel-distance
Default value: 20.00
Acceptable Range:  
*/
    private double m_Y  = 20.00;

/** Y

Vertical shadow offset

Unit: pixel-distance
Default value: 20.00
Acceptable Range:  
*/
    public Dropshadow setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

/** Y

Vertical shadow offset

Unit: pixel-distance
Default value: 20.00
Acceptable Range:  
*/
    public double getY()
    {
        return m_Y;
    }


/** Blur radius



Unit: pixel-distance
Default value: 10.00
Acceptable Range: 0.00 
*/
    private double m_Radius  = 10.00;

/** Blur radius



Unit: pixel-distance
Default value: 10.00
Acceptable Range: 0.00 
*/
    public Dropshadow setRadius(double value) throws ParameterOutOfRangeException
    {
		if(value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, Double.POSITIVE_INFINITY);
	}

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

/** Blur radius



Unit: pixel-distance
Default value: 10.00
Acceptable Range: 0.00 
*/
    public double getRadius()
    {
        return m_Radius;
    }


/** Color

The shadow's color (defaults to 'black')

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

/** Color

The shadow's color (defaults to 'black')

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public Dropshadow setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

/** Color

The shadow's color (defaults to 'black')

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public GeglColor getColor()
    {
        return m_Color;
    }


/** Opacity



Unit: 
Default value: 0.50
Acceptable Range: 0.00 2.00
*/
    private double m_Opacity  = 0.50;

/** Opacity



Unit: 
Default value: 0.50
Acceptable Range: 0.00 2.00
*/
    public Dropshadow setOpacity(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 2.00);
	}

        m_Opacity = value;
        setProperty("opacity", value);
        return this;
    }

/** Opacity



Unit: 
Default value: 0.50
Acceptable Range: 0.00 2.00
*/
    public double getOpacity()
    {
        return m_Opacity;
    }


}

