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
 * Render Path
 *
 * Renders a brush stroke
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"render"})
public class Path extends GeglFilter implements Source, Sink
{
    /** Constructs a Render Path.
     *
     * Renders a brush stroke
     */
    public Path(GeglNode container)
    {
        super(container, "gegl:path");
    }
    /** Constructs a Render Path.
     *
     * Renders a brush stroke
     */
    public Path(GeglFilter parent)
    {
        super(parent, "gegl:path");
    }

    
    /** Fill Color
     *
     * Color of paint to use for filling, use 0 opacity to disable filling
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.6000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Fill  = makeColor("rgba(0.0000, 0.0000, 0.0000, 0.6000)");

    /** Fill Color
     *
     * Color of paint to use for filling, use 0 opacity to disable filling
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.6000)")
     * Acceptable Range:  
     */
    public Path setFill(GeglColor value)
    {
	
        m_Fill = value;
        setProperty("fill", value);
        return this;
    }

    /** Fill Color
     *
     * Color of paint to use for filling, use 0 opacity to disable filling
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.6000)")
     * Acceptable Range:  
     */
    public GeglColor getFill()
    {
        return m_Fill;
    }


    /** Stroke Color
     *
     * Color of paint to use for stroking
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Stroke  = makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)");

    /** Stroke Color
     *
     * Color of paint to use for stroking
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public Path setStroke(GeglColor value)
    {
	
        m_Stroke = value;
        setProperty("stroke", value);
        return this;
    }

    /** Stroke Color
     *
     * Color of paint to use for stroking
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public GeglColor getStroke()
    {
        return m_Stroke;
    }


    /** Stroke width
     *
     * The width of the brush used to stroke the path
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 0.00 200.00
     * */
    private double m_StrokeWidth  = 2.00;

    /** Stroke width
     *
     * The width of the brush used to stroke the path
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 0.00 200.00
     */
    public Path setStrokeWidth(double value) throws ParameterOutOfRangeException
    {
		if(value > 200.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 200.00);
	}

        m_StrokeWidth = value;
        setProperty("stroke-width", value);
        return this;
    }

    /** Stroke width
     *
     * The width of the brush used to stroke the path
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 0.00 200.00
     */
    public double getStrokeWidth()
    {
        return m_StrokeWidth;
    }


    /** Stroke opacity
     *
     * Opacity of stroke, note, does not behave like SVG since at the moment stroking is done using an airbrush tool
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_StrokeOpacity  = 1.00;

    /** Stroke opacity
     *
     * Opacity of stroke, note, does not behave like SVG since at the moment stroking is done using an airbrush tool
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public Path setStrokeOpacity(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_StrokeOpacity = value;
        setProperty("stroke-opacity", value);
        return this;
    }

    /** Stroke opacity
     *
     * Opacity of stroke, note, does not behave like SVG since at the moment stroking is done using an airbrush tool
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public double getStrokeOpacity()
    {
        return m_StrokeOpacity;
    }


    /** Hardness
     *
     * Hardness of the brush, 0.0 for a soft brush, 1.0 for a hard brush
     *
     * Unit: 
     * Default value: 0.60
     * Acceptable Range: 0.00 1.00
     * */
    private double m_StrokeHardness  = 0.60;

    /** Hardness
     *
     * Hardness of the brush, 0.0 for a soft brush, 1.0 for a hard brush
     *
     * Unit: 
     * Default value: 0.60
     * Acceptable Range: 0.00 1.00
     */
    public Path setStrokeHardness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_StrokeHardness = value;
        setProperty("stroke-hardness", value);
        return this;
    }

    /** Hardness
     *
     * Hardness of the brush, 0.0 for a soft brush, 1.0 for a hard brush
     *
     * Unit: 
     * Default value: 0.60
     * Acceptable Range: 0.00 1.00
     */
    public double getStrokeHardness()
    {
        return m_StrokeHardness;
    }


    /** Fill rule
     *
     * How to determine what to fill (nonzero|evenodd)
     *
     * Unit: 
     * Default value: "nonzero"
     * Acceptable Range:  
     * */
    private String m_FillRule  = "nonzero";

    /** Fill rule
     *
     * How to determine what to fill (nonzero|evenodd)
     *
     * Unit: 
     * Default value: "nonzero"
     * Acceptable Range:  
     */
    public Path setFillRule(String value)
    {
	
        m_FillRule = value;
        setProperty("fill-rule", value);
        return this;
    }

    /** Fill rule
     *
     * How to determine what to fill (nonzero|evenodd)
     *
     * Unit: 
     * Default value: "nonzero"
     * Acceptable Range:  
     */
    public String getFillRule()
    {
        return m_FillRule;
    }


    /** Transform
     *
     * SVG style description of transform
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Transform ;

    /** Transform
     *
     * SVG style description of transform
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Path setTransform(String value)
    {
	
        m_Transform = value;
        setProperty("transform", value);
        return this;
    }

    /** Transform
     *
     * SVG style description of transform
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getTransform()
    {
        return m_Transform;
    }


    /** Fill opacity
     *
     * The fill opacity to use
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     * */
    private double m_FillOpacity  = 1.00;

    /** Fill opacity
     *
     * The fill opacity to use
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public Path setFillOpacity(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < -2.00)
	{
	    throw new ParameterOutOfRangeException(value, -2.00, 2.00);
	}

        m_FillOpacity = value;
        setProperty("fill-opacity", value);
        return this;
    }

    /** Fill opacity
     *
     * The fill opacity to use
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -2.00 2.00
     */
    public double getFillOpacity()
    {
        return m_FillOpacity;
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
    public Path setD(GeglVector value)
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

