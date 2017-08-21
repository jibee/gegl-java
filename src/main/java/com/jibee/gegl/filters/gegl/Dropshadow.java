package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Dropshadow
 *
 * Creates a dropshadow effect on the input buffer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"light"})
public class Dropshadow extends GeglFilter implements Source, Sink
{
    /** Constructs a Dropshadow.
     *
     * Creates a dropshadow effect on the input buffer
     *
     * @param container container node
     */
    public Dropshadow(GeglNode container)
    {
        super(container, "gegl:dropshadow");
    }
    /** Constructs a Dropshadow.
     *
     * Creates a dropshadow effect on the input buffer
     *
     * @param parent parent filter node
     */
    public Dropshadow(GeglFilter parent)
    {
        super(parent, "gegl:dropshadow");
    }

    
    /** X
     *
     * Horizontal shadow offset
     *
     * Unit: pixel-distance
     * Default value: 20.00
     * Acceptable Range:  
     * */
    private double m_X  = 20.00;

    /** X
     *
     * Horizontal shadow offset
     *
     * Unit: pixel-distance
     * Default value: 20.00
     * Acceptable Range:  
     *
     * @param value new value for X
     * @return this filter (for chaining operations)
     * 
     */
    public Dropshadow setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** X
     *
     * Horizontal shadow offset
     *
     * Unit: pixel-distance
     * Default value: 20.00
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
     * Vertical shadow offset
     *
     * Unit: pixel-distance
     * Default value: 20.00
     * Acceptable Range:  
     * */
    private double m_Y  = 20.00;

    /** Y
     *
     * Vertical shadow offset
     *
     * Unit: pixel-distance
     * Default value: 20.00
     * Acceptable Range:  
     *
     * @param value new value for Y
     * @return this filter (for chaining operations)
     * 
     */
    public Dropshadow setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Y
     *
     * Vertical shadow offset
     *
     * Unit: pixel-distance
     * Default value: 20.00
     * Acceptable Range:  
     *
     * @return value of Y
     * 
     */
    public double getY()
    {
        return m_Y;
    }


    /** Blur radius
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 
     * */
    private double m_Radius  = 10.00;

    /** Blur radius
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 
     *
     * @param value new value for Blur radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 
     *
     * @return value of Blur radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRadius()
    {
        return m_Radius;
    }


    /** Color
     *
     * The shadow's color (defaults to 'black')
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Color
     *
     * The shadow's color (defaults to 'black')
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Color
     * @return this filter (for chaining operations)
     * 
     */
    public Dropshadow setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

    /** Color
     *
     * The shadow's color (defaults to 'black')
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of Color
     * 
     */
    public GeglColor getColor()
    {
        return m_Color;
    }


    /** Opacity
     *
     * 
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 2.00
     * */
    private double m_Opacity  = 0.50;

    /** Opacity
     *
     * 
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 2.00
     *
     * @param value new value for Opacity
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * 
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 2.00
     *
     * @return value of Opacity
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getOpacity()
    {
        return m_Opacity;
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

