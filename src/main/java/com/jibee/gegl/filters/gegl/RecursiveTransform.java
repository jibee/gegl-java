package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Recursive Transform
 *
 * Apply a transformation recursively.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"map"})
public class RecursiveTransform extends GeglFilter implements Filter
{
    /** Constructs a Recursive Transform.
     *
     * Apply a transformation recursively.
     *
     * @param container container node
     */
    public RecursiveTransform(GeglNode container)
    {
        super(container, "gegl:recursive-transform");
    }
    /** Constructs a Recursive Transform.
     *
     * Apply a transformation recursively.
     *
     * @param parent parent filter node
     */
    public RecursiveTransform(GeglFilter parent)
    {
        super(parent, "gegl:recursive-transform");
    }

    
    /** Transform
     *
     * Transformation matrix, using SVG syntax (or multiple matrices, separated by semicolons)
     *
     * Unit: 
     * Default value: "matrix (1, 0, 0, 0, 1, 0, 0, 0, 1)"
     * Acceptable Range:  
     * */
    private String m_Transform  = "matrix (1, 0, 0, 0, 1, 0, 0, 0, 1)";

    /** Transform
     *
     * Transformation matrix, using SVG syntax (or multiple matrices, separated by semicolons)
     *
     * Unit: 
     * Default value: "matrix (1, 0, 0, 0, 1, 0, 0, 0, 1)"
     * Acceptable Range:  
     *
     * @param value new value for Transform
     * @return this filter (for chaining operations)
     * 
     */
    public RecursiveTransform setTransform(String value)
    {
	
        m_Transform = value;
        setProperty("transform", value);
        return this;
    }

    /** Transform
     *
     * Transformation matrix, using SVG syntax (or multiple matrices, separated by semicolons)
     *
     * Unit: 
     * Default value: "matrix (1, 0, 0, 0, 1, 0, 0, 0, 1)"
     * Acceptable Range:  
     *
     * @return value of Transform
     * 
     */
    public String getTransform()
    {
        return m_Transform;
    }


    /** First iteration
     *
     * First iteration
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  20
     * */
    private int m_FirstIteration ;

    /** First iteration
     *
     * First iteration
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  20
     *
     * @param value new value for First iteration
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public RecursiveTransform setFirstIteration(int value) throws ParameterOutOfRangeException
    {
		if(value > 20)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 20);
	    }

        m_FirstIteration = value;
        setProperty("first-iteration", value);
        return this;
    }

    /** First iteration
     *
     * First iteration
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  20
     *
     * @return value of First iteration
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getFirstIteration()
    {
        return m_FirstIteration;
    }


    /** Iterations
     *
     * Number of iterations
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range:  20
     * */
    private int m_Iterations  = 3;

    /** Iterations
     *
     * Number of iterations
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range:  20
     *
     * @param value new value for Iterations
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public RecursiveTransform setIterations(int value) throws ParameterOutOfRangeException
    {
		if(value > 20)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 20);
	    }

        m_Iterations = value;
        setProperty("iterations", value);
        return this;
    }

    /** Iterations
     *
     * Number of iterations
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range:  20
     *
     * @return value of Iterations
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getIterations()
    {
        return m_Iterations;
    }


    /** Fade color
     *
     * Color to fade transformed images towards, with a rate depending on its alpha
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_FadeColor  = makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)");

    /** Fade color
     *
     * Color to fade transformed images towards, with a rate depending on its alpha
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Fade color
     * @return this filter (for chaining operations)
     * 
     */
    public RecursiveTransform setFadeColor(GeglColor value)
    {
	
        m_FadeColor = value;
        setProperty("fade-color", value);
        return this;
    }

    /** Fade color
     *
     * Color to fade transformed images towards, with a rate depending on its alpha
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of Fade color
     * 
     */
    public GeglColor getFadeColor()
    {
        return m_FadeColor;
    }


    /** Fade opacity
     *
     * Amount by which to scale the opacity of each transformed image
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_FadeOpacity  = 1.00;

    /** Fade opacity
     *
     * Amount by which to scale the opacity of each transformed image
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Fade opacity
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public RecursiveTransform setFadeOpacity(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_FadeOpacity = value;
        setProperty("fade-opacity", value);
        return this;
    }

    /** Fade opacity
     *
     * Amount by which to scale the opacity of each transformed image
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Fade opacity
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getFadeOpacity()
    {
        return m_FadeOpacity;
    }


    /** Paste below
     *
     * Paste transformed images below each other
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_PasteBelow  = false;

    /** Paste below
     *
     * Paste transformed images below each other
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Paste below
     * @return this filter (for chaining operations)
     * 
     */
    public RecursiveTransform setPasteBelow(boolean value)
    {
	
        m_PasteBelow = value;
        setProperty("paste-below", value);
        return this;
    }

    /** Paste below
     *
     * Paste transformed images below each other
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Paste below
     * 
     */
    public boolean getPasteBelow()
    {
        return m_PasteBelow;
    }


    /** Resampling method
     *
     * Mathematical method for reconstructing pixel values
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_SamplerType ;

    /** Resampling method
     *
     * Mathematical method for reconstructing pixel values
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Resampling method
     * @return this filter (for chaining operations)
     * 
     */
    public RecursiveTransform setSamplerType(String value)
    {
	
        m_SamplerType = value;
        setProperty("sampler-type", value);
        return this;
    }

    /** Resampling method
     *
     * Mathematical method for reconstructing pixel values
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Resampling method
     * 
     */
    public String getSamplerType()
    {
        return m_SamplerType;
    }

    @Override
    public InputPad<RecursiveTransform> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<RecursiveTransform> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

