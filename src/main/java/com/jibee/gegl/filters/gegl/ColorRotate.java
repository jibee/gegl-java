package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Color Rotate
 *
 * Replace a range of colors with another
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class ColorRotate extends GeglFilter implements Source, Sink
{
    /** Constructs a Color Rotate.
     *
     * Replace a range of colors with another
     *
     * @param container container node
     */
    public ColorRotate(GeglNode container)
    {
        super(container, "gegl:color-rotate");
    }
    /** Constructs a Color Rotate.
     *
     * Replace a range of colors with another
     *
     * @param parent parent filter node
     */
    public ColorRotate(GeglFilter parent)
    {
        super(parent, "gegl:color-rotate");
    }

    
    /** Clockwise
     *
     * Switch to clockwise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_SrcClockwise  = false;

    /** Clockwise
     *
     * Switch to clockwise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Clockwise
     * @return this filter (for chaining operations)
     * 
     */
    public ColorRotate setSrcClockwise(boolean value)
    {
	
        m_SrcClockwise = value;
        setProperty("src-clockwise", value);
        return this;
    }

    /** Clockwise
     *
     * Switch to clockwise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Clockwise
     * 
     */
    public boolean getSrcClockwise()
    {
        return m_SrcClockwise;
    }


    /** From
     *
     * Start angle of the source color range
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_SrcFrom  = 0.00;

    /** From
     *
     * Start angle of the source color range
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @param value new value for From
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorRotate setSrcFrom(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	    }

        m_SrcFrom = value;
        setProperty("src-from", value);
        return this;
    }

    /** From
     *
     * Start angle of the source color range
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @return value of From
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getSrcFrom()
    {
        return m_SrcFrom;
    }


    /** To
     *
     * End angle of the source color range
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_SrcTo  = 90.00;

    /** To
     *
     * End angle of the source color range
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range: 0.00 360.00
     *
     * @param value new value for To
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorRotate setSrcTo(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	    }

        m_SrcTo = value;
        setProperty("src-to", value);
        return this;
    }

    /** To
     *
     * End angle of the source color range
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range: 0.00 360.00
     *
     * @return value of To
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getSrcTo()
    {
        return m_SrcTo;
    }


    /** Clockwise
     *
     * Switch to clockwise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_DestClockwise  = false;

    /** Clockwise
     *
     * Switch to clockwise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Clockwise
     * @return this filter (for chaining operations)
     * 
     */
    public ColorRotate setDestClockwise(boolean value)
    {
	
        m_DestClockwise = value;
        setProperty("dest-clockwise", value);
        return this;
    }

    /** Clockwise
     *
     * Switch to clockwise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Clockwise
     * 
     */
    public boolean getDestClockwise()
    {
        return m_DestClockwise;
    }


    /** From
     *
     * Start angle of the destination color range
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_DestFrom  = 0.00;

    /** From
     *
     * Start angle of the destination color range
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @param value new value for From
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorRotate setDestFrom(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	    }

        m_DestFrom = value;
        setProperty("dest-from", value);
        return this;
    }

    /** From
     *
     * Start angle of the destination color range
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @return value of From
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getDestFrom()
    {
        return m_DestFrom;
    }


    /** To
     *
     * End angle of the destination color range
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_DestTo  = 90.00;

    /** To
     *
     * End angle of the destination color range
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range: 0.00 360.00
     *
     * @param value new value for To
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorRotate setDestTo(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	    }

        m_DestTo = value;
        setProperty("dest-to", value);
        return this;
    }

    /** To
     *
     * End angle of the destination color range
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range: 0.00 360.00
     *
     * @return value of To
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getDestTo()
    {
        return m_DestTo;
    }


    /** Gray threshold
     *
     * Colors with a saturation less than this will treated as gray
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Threshold  = 0.00;

    /** Gray threshold
     *
     * Colors with a saturation less than this will treated as gray
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Gray threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorRotate setThreshold(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Threshold = value;
        setProperty("threshold", value);
        return this;
    }

    /** Gray threshold
     *
     * Colors with a saturation less than this will treated as gray
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Gray threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getThreshold()
    {
        return m_Threshold;
    }


    /** Gray mode
     *
     * Treat as this: Gray colors from above source range will be treated as if they had this hue and saturation
Change to this: Change gray colors to this hue and saturation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_GrayMode ;

    /** Gray mode
     *
     * Treat as this: Gray colors from above source range will be treated as if they had this hue and saturation
Change to this: Change gray colors to this hue and saturation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Gray mode
     * @return this filter (for chaining operations)
     * 
     */
    public ColorRotate setGrayMode(String value)
    {
	
        m_GrayMode = value;
        setProperty("gray-mode", value);
        return this;
    }

    /** Gray mode
     *
     * Treat as this: Gray colors from above source range will be treated as if they had this hue and saturation
Change to this: Change gray colors to this hue and saturation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Gray mode
     * 
     */
    public String getGrayMode()
    {
        return m_GrayMode;
    }


    /** Hue
     *
     * Hue value for above gray settings
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Hue  = 0.00;

    /** Hue
     *
     * Hue value for above gray settings
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @param value new value for Hue
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorRotate setHue(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	    }

        m_Hue = value;
        setProperty("hue", value);
        return this;
    }

    /** Hue
     *
     * Hue value for above gray settings
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @return value of Hue
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getHue()
    {
        return m_Hue;
    }


    /** Saturation
     *
     * Saturation value for above gray settings
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Saturation  = 0.00;

    /** Saturation
     *
     * Saturation value for above gray settings
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Saturation
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorRotate setSaturation(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Saturation = value;
        setProperty("saturation", value);
        return this;
    }

    /** Saturation
     *
     * Saturation value for above gray settings
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Saturation
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getSaturation()
    {
        return m_Saturation;
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

