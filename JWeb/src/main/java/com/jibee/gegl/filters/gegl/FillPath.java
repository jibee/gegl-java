package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglVector;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Fill Path

Renders a filled region

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class FillPath extends GeglFilter
{
/** Constructs a Fill Path.

Renders a filled region
*/
    public FillPath(GeglNode container)
    {
        super(container, "gegl:fill-path");
    }
/** Constructs a Fill Path.

Renders a filled region
*/
    public FillPath(GeglFilter parent)
    {
        super(parent, "gegl:fill-path");
    }

    
/** Color

Color of paint to use for filling.

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

/** Color

Color of paint to use for filling.

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public FillPath setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

/** Color

Color of paint to use for filling.

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public GeglColor getColor()
    {
        return m_Color;
    }


/** Opacity

The fill opacity to use.

Unit: 
Default value: 1.00
Acceptable Range: -2.00 2.00
*/
    private double m_Opacity  = 1.00;

/** Opacity

The fill opacity to use.

Unit: 
Default value: 1.00
Acceptable Range: -2.00 2.00
*/
    public FillPath setOpacity(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_Opacity = value;
        setProperty("opacity", value);
        return this;
    }

/** Opacity

The fill opacity to use.

Unit: 
Default value: 1.00
Acceptable Range: -2.00 2.00
*/
    public double getOpacity()
    {
        return m_Opacity;
    }


/** Fill rule.

how to determine what to fill (nonzero|evenodd)

Unit: 
Default value: "nonzero"
Acceptable Range:  
*/
    private String m_FillRule  = "nonzero";

/** Fill rule.

how to determine what to fill (nonzero|evenodd)

Unit: 
Default value: "nonzero"
Acceptable Range:  
*/
    public FillPath setFillRule(String value)
    {
	
        m_FillRule = value;
        setProperty("fill-rule", value);
        return this;
    }

/** Fill rule.

how to determine what to fill (nonzero|evenodd)

Unit: 
Default value: "nonzero"
Acceptable Range:  
*/
    public String getFillRule()
    {
        return m_FillRule;
    }


/** Transform

svg style description of transform.

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Transform ;

/** Transform

svg style description of transform.

Unit: 
Default value: 
Acceptable Range:  
*/
    public FillPath setTransform(String value)
    {
	
        m_Transform = value;
        setProperty("transform", value);
        return this;
    }

/** Transform

svg style description of transform.

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getTransform()
    {
        return m_Transform;
    }


/** Vector

A GeglVector representing the path of the stroke

Unit: 
Default value: 
Acceptable Range:  
*/
    private GeglVector m_D ;

/** Vector

A GeglVector representing the path of the stroke

Unit: 
Default value: 
Acceptable Range:  
*/
    public FillPath setD(GeglVector value)
    {
	
        m_D = value;
        setProperty("d", value);
        return this;
    }

/** Vector

A GeglVector representing the path of the stroke

Unit: 
Default value: 
Acceptable Range:  
*/
    public GeglVector getD()
    {
        return m_D;
    }


}
