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
 * Pixelize
 *
 * Simplify image into an array of solid-colored rectangles
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: true
 */
@Filter(license="", opencl=true, position_dependant=true, categories={"blur", "scramble"})
public class Pixelize extends GeglFilter implements Source, Sink
{
    /** Constructs a Pixelize.
     *
     * Simplify image into an array of solid-colored rectangles
     *
     * @param container container node
     */
    public Pixelize(GeglNode container)
    {
        super(container, "gegl:pixelize");
    }
    /** Constructs a Pixelize.
     *
     * Simplify image into an array of solid-colored rectangles
     *
     * @param parent parent filter node
     */
    public Pixelize(GeglFilter parent)
    {
        super(parent, "gegl:pixelize");
    }

    
    /** Shape
     *
     * The shape of pixels
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Norm ;

    /** Shape
     *
     * The shape of pixels
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Shape
     * @return this filter (for chaining operations)
     * 
     */
    public Pixelize setNorm(String value)
    {
	
        m_Norm = value;
        setProperty("norm", value);
        return this;
    }

    /** Shape
     *
     * The shape of pixels
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Shape
     * 
     */
    public String getNorm()
    {
        return m_Norm;
    }


    /** Block width
     *
     * Width of blocks in pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     * */
    private int m_SizeX  = 16;

    /** Block width
     *
     * Width of blocks in pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     *
     * @param value new value for Block width
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Pixelize setSizeX(int value) throws ParameterOutOfRangeException
    {
		if(value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, Double.POSITIVE_INFINITY);
	    }

        m_SizeX = value;
        setProperty("size-x", value);
        return this;
    }

    /** Block width
     *
     * Width of blocks in pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     *
     * @return value of Block width
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getSizeX()
    {
        return m_SizeX;
    }


    /** Block height
     *
     * Height of blocks in pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     * */
    private int m_SizeY  = 16;

    /** Block height
     *
     * Height of blocks in pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     *
     * @param value new value for Block height
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Pixelize setSizeY(int value) throws ParameterOutOfRangeException
    {
		if(value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, Double.POSITIVE_INFINITY);
	    }

        m_SizeY = value;
        setProperty("size-y", value);
        return this;
    }

    /** Block height
     *
     * Height of blocks in pixels
     *
     * Unit: pixel-distance
     * Default value: 16
     * Acceptable Range: 1 
     *
     * @return value of Block height
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getSizeY()
    {
        return m_SizeY;
    }


    /** Size ratio X
     *
     * Horizontal size ratio of a pixel inside each block
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_RatioX  = 1.00;

    /** Size ratio X
     *
     * Horizontal size ratio of a pixel inside each block
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Size ratio X
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Pixelize setRatioX(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_RatioX = value;
        setProperty("ratio-x", value);
        return this;
    }

    /** Size ratio X
     *
     * Horizontal size ratio of a pixel inside each block
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Size ratio X
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRatioX()
    {
        return m_RatioX;
    }


    /** Size ratio Y
     *
     * Vertical size ratio of a pixel inside each block
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_RatioY  = 1.00;

    /** Size ratio Y
     *
     * Vertical size ratio of a pixel inside each block
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Size ratio Y
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Pixelize setRatioY(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_RatioY = value;
        setProperty("ratio-y", value);
        return this;
    }

    /** Size ratio Y
     *
     * Vertical size ratio of a pixel inside each block
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Size ratio Y
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRatioY()
    {
        return m_RatioY;
    }


    /** Background color
     *
     * Color used to fill the background
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Background  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** Background color
     *
     * Color used to fill the background
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Background color
     * @return this filter (for chaining operations)
     * 
     */
    public Pixelize setBackground(GeglColor value)
    {
	
        m_Background = value;
        setProperty("background", value);
        return this;
    }

    /** Background color
     *
     * Color used to fill the background
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @return value of Background color
     * 
     */
    public GeglColor getBackground()
    {
        return m_Background;
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

