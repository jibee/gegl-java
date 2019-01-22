package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Render Text
 *
 * Display a string of text using pango and cairo.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"render"})
public class Text extends GeglFilter implements Source
{
    /** Constructs a Render Text.
     *
     * Display a string of text using pango and cairo.
     *
     * @param container container node
     */
    public Text(GeglNode container)
    {
        super(container, "gegl:text");
    }
    /** Constructs a Render Text.
     *
     * Display a string of text using pango and cairo.
     *
     * @param parent parent filter node
     */
    public Text(GeglFilter parent)
    {
        super(parent, "gegl:text");
    }

    
    /** Text
     *
     * String to display (utf8)
     *
     * Unit: 
     * Default value: "Hello"
     * Acceptable Range:  
     * */
    private String m_String  = "Hello";

    /** Text
     *
     * String to display (utf8)
     *
     * Unit: 
     * Default value: "Hello"
     * Acceptable Range:  
     *
     * @param value new value for Text
     * @return this filter (for chaining operations)
     * 
     */
    public Text setString(String value)
    {
	
        m_String = value;
        setProperty("string", value);
        return this;
    }

    /** Text
     *
     * String to display (utf8)
     *
     * Unit: 
     * Default value: "Hello"
     * Acceptable Range:  
     *
     * @return value of Text
     * 
     */
    public String getString()
    {
        return m_String;
    }


    /** Font family
     *
     * Font family (utf8)
     *
     * Unit: 
     * Default value: "Sans"
     * Acceptable Range:  
     * */
    private String m_Font  = "Sans";

    /** Font family
     *
     * Font family (utf8)
     *
     * Unit: 
     * Default value: "Sans"
     * Acceptable Range:  
     *
     * @param value new value for Font family
     * @return this filter (for chaining operations)
     * 
     */
    public Text setFont(String value)
    {
	
        m_Font = value;
        setProperty("font", value);
        return this;
    }

    /** Font family
     *
     * Font family (utf8)
     *
     * Unit: 
     * Default value: "Sans"
     * Acceptable Range:  
     *
     * @return value of Font family
     * 
     */
    public String getFont()
    {
        return m_Font;
    }


    /** Size
     *
     * Font size in pixels.
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 2048.00
     * */
    private double m_Size  = 10.00;

    /** Size
     *
     * Font size in pixels.
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 2048.00
     *
     * @param value new value for Size
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Text setSize(double value) throws ParameterOutOfRangeException
    {
		if(value > 2048.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 2048.00);
	    }

        m_Size = value;
        setProperty("size", value);
        return this;
    }

    /** Size
     *
     * Font size in pixels.
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 0.00 2048.00
     *
     * @return value of Size
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getSize()
    {
        return m_Size;
    }


    /** Color
     *
     * Color for the text (defaults to 'black')
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Color
     *
     * Color for the text (defaults to 'black')
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Color
     * @return this filter (for chaining operations)
     * 
     */
    public Text setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

    /** Color
     *
     * Color for the text (defaults to 'black')
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


    /** Wrap width
     *
     * Sets the width in pixels at which long lines will wrap. Use -1 for no wrapping.
     *
     * Unit: pixel-distance
     * Default value: -1
     * Acceptable Range: -1 1000000
     * */
    private int m_Wrap  = -1;

    /** Wrap width
     *
     * Sets the width in pixels at which long lines will wrap. Use -1 for no wrapping.
     *
     * Unit: pixel-distance
     * Default value: -1
     * Acceptable Range: -1 1000000
     *
     * @param value new value for Wrap width
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Text setWrap(int value) throws ParameterOutOfRangeException
    {
		if(value > 1000000 || value < -1)
	    {
	        throw new ParameterOutOfRangeException(value, -1, 1000000);
	    }

        m_Wrap = value;
        setProperty("wrap", value);
        return this;
    }

    /** Wrap width
     *
     * Sets the width in pixels at which long lines will wrap. Use -1 for no wrapping.
     *
     * Unit: pixel-distance
     * Default value: -1
     * Acceptable Range: -1 1000000
     *
     * @return value of Wrap width
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getWrap()
    {
        return m_Wrap;
    }


    /** Wrap height
     *
     * Sets the height in pixels according to which the text is vertically justified. Use -1 for no vertical justification.
     *
     * Unit: pixel-distance
     * Default value: -1
     * Acceptable Range: -1 1000000
     * */
    private int m_VerticalWrap  = -1;

    /** Wrap height
     *
     * Sets the height in pixels according to which the text is vertically justified. Use -1 for no vertical justification.
     *
     * Unit: pixel-distance
     * Default value: -1
     * Acceptable Range: -1 1000000
     *
     * @param value new value for Wrap height
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Text setVerticalWrap(int value) throws ParameterOutOfRangeException
    {
		if(value > 1000000 || value < -1)
	    {
	        throw new ParameterOutOfRangeException(value, -1, 1000000);
	    }

        m_VerticalWrap = value;
        setProperty("vertical-wrap", value);
        return this;
    }

    /** Wrap height
     *
     * Sets the height in pixels according to which the text is vertically justified. Use -1 for no vertical justification.
     *
     * Unit: pixel-distance
     * Default value: -1
     * Acceptable Range: -1 1000000
     *
     * @return value of Wrap height
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getVerticalWrap()
    {
        return m_VerticalWrap;
    }


    /** Justification
     *
     * Alignment for multi-line text (0=Left, 1=Center, 2=Right)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  2
     * */
    private int m_Alignment ;

    /** Justification
     *
     * Alignment for multi-line text (0=Left, 1=Center, 2=Right)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  2
     *
     * @param value new value for Justification
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Text setAlignment(int value) throws ParameterOutOfRangeException
    {
		if(value > 2)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 2);
	    }

        m_Alignment = value;
        setProperty("alignment", value);
        return this;
    }

    /** Justification
     *
     * Alignment for multi-line text (0=Left, 1=Center, 2=Right)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  2
     *
     * @return value of Justification
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getAlignment()
    {
        return m_Alignment;
    }


    /** Vertical justification
     *
     * Vertical text alignment (0=Top, 1=Middle, 2=Bottom)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  2
     * */
    private int m_VerticalAlignment ;

    /** Vertical justification
     *
     * Vertical text alignment (0=Top, 1=Middle, 2=Bottom)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  2
     *
     * @param value new value for Vertical justification
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Text setVerticalAlignment(int value) throws ParameterOutOfRangeException
    {
		if(value > 2)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 2);
	    }

        m_VerticalAlignment = value;
        setProperty("vertical-alignment", value);
        return this;
    }

    /** Vertical justification
     *
     * Vertical text alignment (0=Top, 1=Middle, 2=Bottom)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  2
     *
     * @return value of Vertical justification
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getVerticalAlignment()
    {
        return m_VerticalAlignment;
    }


    /** Width
     *
     * Rendered width in pixels. (read only)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Width ;

    /** Width
     *
     * Rendered width in pixels. (read only)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Width
     * @return this filter (for chaining operations)
     * 
     */
    public Text setWidth(int value)
    {
	
        m_Width = value;
        setProperty("width", value);
        return this;
    }

    /** Width
     *
     * Rendered width in pixels. (read only)
     *
     * Unit: 
     * Default value: 
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
     * Rendered height in pixels. (read only)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Height ;

    /** Height
     *
     * Rendered height in pixels. (read only)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Height
     * @return this filter (for chaining operations)
     * 
     */
    public Text setHeight(int value)
    {
	
        m_Height = value;
        setProperty("height", value);
        return this;
    }

    /** Height
     *
     * Rendered height in pixels. (read only)
     *
     * Unit: 
     * Default value: 
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

