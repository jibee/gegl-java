package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Spiral
 *
 * Spiral renderer
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=true, categories={"render"})
public class Spiral extends GeglFilter implements Source
{
    /** Constructs a Spiral.
     *
     * Spiral renderer
     *
     * @param container container node
     */
    public Spiral(GeglNode container)
    {
        super(container, "gegl:spiral");
    }
    /** Constructs a Spiral.
     *
     * Spiral renderer
     *
     * @param parent parent filter node
     */
    public Spiral(GeglFilter parent)
    {
        super(parent, "gegl:spiral");
    }

    
    /** Type
     *
     * Spiral type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Type ;

    /** Type
     *
     * Spiral type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Type
     * @return this filter (for chaining operations)
     * 
     */
    public Spiral setType(String value)
    {
	
        m_Type = value;
        setProperty("type", value);
        return this;
    }

    /** Type
     *
     * Spiral type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Type
     * 
     */
    public String getType()
    {
        return m_Type;
    }


    /** X
     *
     * Spiral origin X coordinate
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_X  = 0.50;

    /** X
     *
     * Spiral origin X coordinate
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @param value new value for X
     * @return this filter (for chaining operations)
     * 
     */
    public Spiral setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** X
     *
     * Spiral origin X coordinate
     *
     * Unit: relative-coordinate
     * Default value: 0.50
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
     * Spiral origin Y coordinate
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_Y  = 0.50;

    /** Y
     *
     * Spiral origin Y coordinate
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @param value new value for Y
     * @return this filter (for chaining operations)
     * 
     */
    public Spiral setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Y
     *
     * Spiral origin Y coordinate
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @return value of Y
     * 
     */
    public double getY()
    {
        return m_Y;
    }


    /** Radius
     *
     * Spiral radius
     *
     * Unit: pixel-distance
     * Default value: 100.00
     * Acceptable Range: 1.00 
     * */
    private double m_Radius  = 100.00;

    /** Radius
     *
     * Spiral radius
     *
     * Unit: pixel-distance
     * Default value: 100.00
     * Acceptable Range: 1.00 
     *
     * @param value new value for Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Spiral setRadius(double value) throws ParameterOutOfRangeException
    {
		if(value < 1.00)
	    {
	        throw new ParameterOutOfRangeException(value, 1.00, Double.POSITIVE_INFINITY);
	    }

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * Spiral radius
     *
     * Unit: pixel-distance
     * Default value: 100.00
     * Acceptable Range: 1.00 
     *
     * @return value of Radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRadius()
    {
        return m_Radius;
    }


    /** Base
     *
     * Logarithmic spiral base
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 
     * */
    private double m_Base  = 2.00;

    /** Base
     *
     * Logarithmic spiral base
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 
     *
     * @param value new value for Base
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Spiral setBase(double value) throws ParameterOutOfRangeException
    {
		if(value < 1.00)
	    {
	        throw new ParameterOutOfRangeException(value, 1.00, Double.POSITIVE_INFINITY);
	    }

        m_Base = value;
        setProperty("base", value);
        return this;
    }

    /** Base
     *
     * Logarithmic spiral base
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 
     *
     * @return value of Base
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBase()
    {
        return m_Base;
    }


    /** Balance
     *
     * Area balance between the two colors
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_Balance  = 0.00;

    /** Balance
     *
     * Area balance between the two colors
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     *
     * @param value new value for Balance
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Spiral setBalance(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	    {
	        throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	    }

        m_Balance = value;
        setProperty("balance", value);
        return this;
    }

    /** Balance
     *
     * Area balance between the two colors
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     *
     * @return value of Balance
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBalance()
    {
        return m_Balance;
    }


    /** Rotation
     *
     * Spiral rotation
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Rotation  = 0.00;

    /** Rotation
     *
     * Spiral rotation
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @param value new value for Rotation
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Spiral setRotation(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	    }

        m_Rotation = value;
        setProperty("rotation", value);
        return this;
    }

    /** Rotation
     *
     * Spiral rotation
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @return value of Rotation
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRotation()
    {
        return m_Rotation;
    }


    /** Direction
     *
     * Spiral swirl direction
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Direction ;

    /** Direction
     *
     * Spiral swirl direction
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Direction
     * @return this filter (for chaining operations)
     * 
     */
    public Spiral setDirection(String value)
    {
	
        m_Direction = value;
        setProperty("direction", value);
        return this;
    }

    /** Direction
     *
     * Spiral swirl direction
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Direction
     * 
     */
    public String getDirection()
    {
        return m_Direction;
    }


    /** Color 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color1  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Color 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Color 1
     * @return this filter (for chaining operations)
     * 
     */
    public Spiral setColor1(GeglColor value)
    {
	
        m_Color1 = value;
        setProperty("color1", value);
        return this;
    }

    /** Color 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of Color 1
     * 
     */
    public GeglColor getColor1()
    {
        return m_Color1;
    }


    /** Color 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color2  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** Color 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Color 2
     * @return this filter (for chaining operations)
     * 
     */
    public Spiral setColor2(GeglColor value)
    {
	
        m_Color2 = value;
        setProperty("color2", value);
        return this;
    }

    /** Color 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @return value of Color 2
     * 
     */
    public GeglColor getColor2()
    {
        return m_Color2;
    }


    /** Width
     *
     * Width of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 1024
     * Acceptable Range:  
     * */
    private int m_Width  = 1024;

    /** Width
     *
     * Width of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 1024
     * Acceptable Range:  
     *
     * @param value new value for Width
     * @return this filter (for chaining operations)
     * 
     */
    public Spiral setWidth(int value)
    {
	
        m_Width = value;
        setProperty("width", value);
        return this;
    }

    /** Width
     *
     * Width of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 1024
     * Acceptable Range:  
     *
     * @return value of Width
     * 
     */
    public int getWidth()
    {
        return m_Width;
    }


    /** Height
     *
     * Height of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 768
     * Acceptable Range:  
     * */
    private int m_Height  = 768;

    /** Height
     *
     * Height of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 768
     * Acceptable Range:  
     *
     * @param value new value for Height
     * @return this filter (for chaining operations)
     * 
     */
    public Spiral setHeight(int value)
    {
	
        m_Height = value;
        setProperty("height", value);
        return this;
    }

    /** Height
     *
     * Height of the generated buffer
     *
     * Unit: pixel-distance
     * Default value: 768
     * Acceptable Range:  
     *
     * @return value of Height
     * 
     */
    public int getHeight()
    {
        return m_Height;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

