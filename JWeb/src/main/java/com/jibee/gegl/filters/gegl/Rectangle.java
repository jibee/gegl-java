package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Rectangle
 *
 * A rectangular source of a fixed size with a solid color
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="", opencl=false, position_dependant=true, categories={"render"})
public class Rectangle extends GeglFilter
{
    /** Constructs a Rectangle.
     *
     * A rectangular source of a fixed size with a solid color
     */
    public Rectangle(GeglNode container)
    {
        super(container, "gegl:rectangle");
    }
    /** Constructs a Rectangle.
     *
     * A rectangular source of a fixed size with a solid color
     */
    public Rectangle(GeglFilter parent)
    {
        super(parent, "gegl:rectangle");
    }

    
    /** X
     *
     * Horizontal position
     *
     * Unit: pixel-coordinate
     * Default value: 42.00
     * Acceptable Range:  
     * */
    private double m_X  = 42.00;

    /** X
     *
     * Horizontal position
     *
     * Unit: pixel-coordinate
     * Default value: 42.00
     * Acceptable Range:  
     */
    public Rectangle setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** X
     *
     * Horizontal position
     *
     * Unit: pixel-coordinate
     * Default value: 42.00
     * Acceptable Range:  
     */
    public double getX()
    {
        return m_X;
    }


    /** Y
     *
     * Vertical position
     *
     * Unit: pixel-coordinate
     * Default value: 42.00
     * Acceptable Range:  
     * */
    private double m_Y  = 42.00;

    /** Y
     *
     * Vertical position
     *
     * Unit: pixel-coordinate
     * Default value: 42.00
     * Acceptable Range:  
     */
    public Rectangle setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Y
     *
     * Vertical position
     *
     * Unit: pixel-coordinate
     * Default value: 42.00
     * Acceptable Range:  
     */
    public double getY()
    {
        return m_Y;
    }


    /** Width
     *
     * Horizontal extent
     *
     * Unit: pixel-distance
     * Default value: 23.00
     * Acceptable Range: 0.00 
     * */
    private double m_Width  = 23.00;

    /** Width
     *
     * Horizontal extent
     *
     * Unit: pixel-distance
     * Default value: 23.00
     * Acceptable Range: 0.00 
     */
    public Rectangle setWidth(double value) throws ParameterOutOfRangeException
    {
		if(value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, Double.POSITIVE_INFINITY);
	}

        m_Width = value;
        setProperty("width", value);
        return this;
    }

    /** Width
     *
     * Horizontal extent
     *
     * Unit: pixel-distance
     * Default value: 23.00
     * Acceptable Range: 0.00 
     */
    public double getWidth()
    {
        return m_Width;
    }


    /** Height
     *
     * Vertical extent
     *
     * Unit: pixel-distance
     * Default value: 42.00
     * Acceptable Range: 0.00 
     * */
    private double m_Height  = 42.00;

    /** Height
     *
     * Vertical extent
     *
     * Unit: pixel-distance
     * Default value: 42.00
     * Acceptable Range: 0.00 
     */
    public Rectangle setHeight(double value) throws ParameterOutOfRangeException
    {
		if(value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, Double.POSITIVE_INFINITY);
	}

        m_Height = value;
        setProperty("height", value);
        return this;
    }

    /** Height
     *
     * Vertical extent
     *
     * Unit: pixel-distance
     * Default value: 42.00
     * Acceptable Range: 0.00 
     */
    public double getHeight()
    {
        return m_Height;
    }


    /** Color
     *
     * Color to render
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.2159, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.2159, 0.0000)");

    /** Color
     *
     * Color to render
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.2159, 0.0000)")
     * Acceptable Range:  
     */
    public Rectangle setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

    /** Color
     *
     * Color to render
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.2159, 0.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor()
    {
        return m_Color;
    }

    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

