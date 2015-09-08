package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Render Text

Display a string of text using pango and cairo.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Text extends GeglFilter
{
/** Constructs a Render Text.

Display a string of text using pango and cairo.
*/
    public Text(GeglNode container)
    {
        super(container, "gegl:text");
    }
/** Constructs a Render Text.

Display a string of text using pango and cairo.
*/
    public Text(GeglFilter parent)
    {
        super(parent, "gegl:text");
    }

    
/** Text

String to display (utf8)

Unit: 
Default value: "Hello"
Acceptable Range:  
*/
    private String m_String  = "Hello";

/** Text

String to display (utf8)

Unit: 
Default value: "Hello"
Acceptable Range:  
*/
    public Text setString(String value)
    {
	
        m_String = value;
        setProperty("string", value);
        return this;
    }

/** Text

String to display (utf8)

Unit: 
Default value: "Hello"
Acceptable Range:  
*/
    public String getString()
    {
        return m_String;
    }


/** Font family

Font family (utf8)

Unit: 
Default value: "Sans"
Acceptable Range:  
*/
    private String m_Font  = "Sans";

/** Font family

Font family (utf8)

Unit: 
Default value: "Sans"
Acceptable Range:  
*/
    public Text setFont(String value)
    {
	
        m_Font = value;
        setProperty("font", value);
        return this;
    }

/** Font family

Font family (utf8)

Unit: 
Default value: "Sans"
Acceptable Range:  
*/
    public String getFont()
    {
        return m_Font;
    }


/** Size

Font size in pixels.

Unit: 
Default value: 10.00
Acceptable Range: 1.00 2048.00
*/
    private double m_Size  = 10.00;

/** Size

Font size in pixels.

Unit: 
Default value: 10.00
Acceptable Range: 1.00 2048.00
*/
    public Text setSize(double value) throws ParameterOutOfRangeException
    {
		if(value > 2048.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 2048.00);
	}

        m_Size = value;
        setProperty("size", value);
        return this;
    }

/** Size

Font size in pixels.

Unit: 
Default value: 10.00
Acceptable Range: 1.00 2048.00
*/
    public double getSize()
    {
        return m_Size;
    }


/** Color

Color for the text (defaults to 'white')

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

/** Color

Color for the text (defaults to 'white')

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public Text setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

/** Color

Color for the text (defaults to 'white')

Unit: 
Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
Acceptable Range:  
*/
    public GeglColor getColor()
    {
        return m_Color;
    }


/** Wrap width

Sets the width in pixels at which long lines will wrap. Use -1 for no wrapping.

Unit: 
Default value: -1
Acceptable Range: -1 1000000
*/
    private int m_Wrap  = -1;

/** Wrap width

Sets the width in pixels at which long lines will wrap. Use -1 for no wrapping.

Unit: 
Default value: -1
Acceptable Range: -1 1000000
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

Sets the width in pixels at which long lines will wrap. Use -1 for no wrapping.

Unit: 
Default value: -1
Acceptable Range: -1 1000000
*/
    public int getWrap()
    {
        return m_Wrap;
    }


/** Justification

Alignment for multi-line text (0=Left, 1=Center, 2=Right)

Unit: 
Default value: 
Acceptable Range:  2
*/
    private int m_Alignment ;

/** Justification

Alignment for multi-line text (0=Left, 1=Center, 2=Right)

Unit: 
Default value: 
Acceptable Range:  2
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

Alignment for multi-line text (0=Left, 1=Center, 2=Right)

Unit: 
Default value: 
Acceptable Range:  2
*/
    public int getAlignment()
    {
        return m_Alignment;
    }


/** Width

Rendered width in pixels. (read only)

Unit: 
Default value: 
Acceptable Range:  
*/
    private int m_Width ;

/** Width

Rendered width in pixels. (read only)

Unit: 
Default value: 
Acceptable Range:  
*/
    public Text setWidth(int value)
    {
	
        m_Width = value;
        setProperty("width", value);
        return this;
    }

/** Width

Rendered width in pixels. (read only)

Unit: 
Default value: 
Acceptable Range:  
*/
    public int getWidth()
    {
        return m_Width;
    }


/** Height

Rendered height in pixels. (read only)

Unit: 
Default value: 
Acceptable Range:  
*/
    private int m_Height ;

/** Height

Rendered height in pixels. (read only)

Unit: 
Default value: 
Acceptable Range:  
*/
    public Text setHeight(int value)
    {
	
        m_Height = value;
        setProperty("height", value);
        return this;
    }

/** Height

Rendered height in pixels. (read only)

Unit: 
Default value: 
Acceptable Range:  
*/
    public int getHeight()
    {
        return m_Height;
    }


}

