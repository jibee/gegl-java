package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Rectangle
 *
 * A rectangular source of a fixed size with a solid color
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"render"})
public class Rectangle extends GeglFilter implements Source
{
    /** Constructs a Rectangle.
     *
     * A rectangular source of a fixed size with a solid color
     *
     * @param container container node
     */
    public Rectangle(GeglNode container)
    {
        super(container, "gegl:rectangle");
    }
    /** Constructs a Rectangle.
     *
     * A rectangular source of a fixed size with a solid color
     *
     * @param parent parent filter node
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
     *
     * @param value new value for X
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of X
     * 
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
     *
     * @param value new value for Y
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Y
     * 
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
     *
     * @param value new value for Width
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Width
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Height
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Height
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Color
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Color
     * 
     */
    public GeglColor getColor()
    {
        return m_Color;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

