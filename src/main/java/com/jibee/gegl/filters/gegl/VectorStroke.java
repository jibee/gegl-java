package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.GeglVector;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Vector Stroke
 *
 * Renders a vector stroke
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"render"})
public class VectorStroke extends GeglFilter implements Source, Sink
{
    /** Constructs a Vector Stroke.
     *
     * Renders a vector stroke
     */
    public VectorStroke(GeglNode container)
    {
        super(container, "gegl:vector-stroke");
    }
    /** Constructs a Vector Stroke.
     *
     * Renders a vector stroke
     */
    public VectorStroke(GeglFilter parent)
    {
        super(parent, "gegl:vector-stroke");
    }

    
    /** Color
     *
     * Color of paint to use for stroking.
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Color
     *
     * Color of paint to use for stroking.
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public VectorStroke setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

    /** Color
     *
     * Color of paint to use for stroking.
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor()
    {
        return m_Color;
    }


    /** Width
     *
     * The width of the brush used to stroke the path.
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 0.00 200.00
     * */
    private double m_Width  = 2.00;

    /** Width
     *
     * The width of the brush used to stroke the path.
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 0.00 200.00
     */
    public VectorStroke setWidth(double value) throws ParameterOutOfRangeException
    {
		if(value > 200.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 200.00);
	}

        m_Width = value;
        setProperty("width", value);
        return this;
    }

    /** Width
     *
     * The width of the brush used to stroke the path.
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 0.00 200.00
     */
    public double getWidth()
    {
        return m_Width;
    }


    /** Opacity
     *
     * Opacity of stroke, note, does not behave like SVG since at the moment stroking is done using an airbrush tool.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_Opacity  = 1.00;

    /** Opacity
     *
     * Opacity of stroke, note, does not behave like SVG since at the moment stroking is done using an airbrush tool.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public VectorStroke setOpacity(double value) throws ParameterOutOfRangeException
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
     *
     * Opacity of stroke, note, does not behave like SVG since at the moment stroking is done using an airbrush tool.
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public double getOpacity()
    {
        return m_Opacity;
    }


    /** Transform
     *
     * svg style description of transform.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Transform ;

    /** Transform
     *
     * svg style description of transform.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public VectorStroke setTransform(String value)
    {
	
        m_Transform = value;
        setProperty("transform", value);
        return this;
    }

    /** Transform
     *
     * svg style description of transform.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getTransform()
    {
        return m_Transform;
    }


    /** Vector
     *
     * A GeglVector representing the path of the stroke
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private GeglVector m_D ;

    /** Vector
     *
     * A GeglVector representing the path of the stroke
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public VectorStroke setD(GeglVector value)
    {
	
        m_D = value;
        setProperty("d", value);
        return this;
    }

    /** Vector
     *
     * A GeglVector representing the path of the stroke
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public GeglVector getD()
    {
        return m_D;
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

