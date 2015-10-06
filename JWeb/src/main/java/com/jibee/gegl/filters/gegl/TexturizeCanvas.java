package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Texturize Canvas

Textures the image as if it were an artist's canvas.

License: GPL3+
Supports OpenCL: true
Position Dependant: true
*/
public class TexturizeCanvas extends GeglFilter
{
/** Constructs a Texturize Canvas.

Textures the image as if it were an artist's canvas.
*/
    public TexturizeCanvas(GeglNode container)
    {
        super(container, "gegl:texturize-canvas");
    }
/** Constructs a Texturize Canvas.

Textures the image as if it were an artist's canvas.
*/
    public TexturizeCanvas(GeglFilter parent)
    {
        super(parent, "gegl:texturize-canvas");
    }

    
/** Direction

Position of the light source which lightens the canvas: Top-right, Top-left, Bottom-left or Bottom-right

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Direction ;

/** Direction

Position of the light source which lightens the canvas: Top-right, Top-left, Bottom-left or Bottom-right

Unit: 
Default value: 
Acceptable Range:  
*/
    public TexturizeCanvas setDirection(String value)
    {
	
        m_Direction = value;
        setProperty("direction", value);
        return this;
    }

/** Direction

Position of the light source which lightens the canvas: Top-right, Top-left, Bottom-left or Bottom-right

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getDirection()
    {
        return m_Direction;
    }


/** Depth

Apparent depth of the rendered canvas effect; from 1 (very flat) to 50 (very deep)

Unit: 
Default value: 4
Acceptable Range: 1 50
*/
    private int m_Depth  = 4;

/** Depth

Apparent depth of the rendered canvas effect; from 1 (very flat) to 50 (very deep)

Unit: 
Default value: 4
Acceptable Range: 1 50
*/
    public TexturizeCanvas setDepth(int value) throws ParameterOutOfRangeException
    {
		if(value > 50 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 50);
	}

        m_Depth = value;
        setProperty("depth", value);
        return this;
    }

/** Depth

Apparent depth of the rendered canvas effect; from 1 (very flat) to 50 (very deep)

Unit: 
Default value: 4
Acceptable Range: 1 50
*/
    public int getDepth()
    {
        return m_Depth;
    }


}
