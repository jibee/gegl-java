package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.GeglVector;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Vector Stroke
 *
 * Renders a vector stroke
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"render", "vector"})
public class VectorStroke extends GeglFilter implements Filter
{
    /** Constructs a Vector Stroke.
     *
     * Renders a vector stroke
     *
     * @param container container node
     */
    public VectorStroke(GeglNode container)
    {
        super(container, "gegl:vector-stroke");
    }
    /** Constructs a Vector Stroke.
     *
     * Renders a vector stroke
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Color
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Color
     * 
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
     *
     * @param value new value for Width
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Width
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Opacity
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Opacity
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Transform
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Transform
     * 
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
     *
     * @param value new value for Vector
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Vector
     * 
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

