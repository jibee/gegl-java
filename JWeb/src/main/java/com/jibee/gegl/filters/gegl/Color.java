package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Babl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Color
 *
 * Generates a buffer entirely filled with the specified color, use gegl:crop to get smaller dimensions.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"render"})
public class Color extends GeglFilter
{
    /** Constructs a Color.
     *
     * Generates a buffer entirely filled with the specified color, use gegl:crop to get smaller dimensions.
     */
    public Color(GeglNode container)
    {
        super(container, "gegl:color");
    }
    /** Constructs a Color.
     *
     * Generates a buffer entirely filled with the specified color, use gegl:crop to get smaller dimensions.
     */
    public Color(GeglFilter parent)
    {
        super(parent, "gegl:color");
    }

    
    /** Color
     *
     * The color to render (defaults to 'black')
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Value  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Color
     *
     * The color to render (defaults to 'black')
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public Color setValue(GeglColor value)
    {
	
        m_Value = value;
        setProperty("value", value);
        return this;
    }

    /** Color
     *
     * The color to render (defaults to 'black')
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public GeglColor getValue()
    {
        return m_Value;
    }


    /** Babl Format
     *
     * The babl format of the output
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private Babl m_Format ;

    /** Babl Format
     *
     * The babl format of the output
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Color setFormat(Babl value)
    {
	
        m_Format = value;
        setProperty("format", value);
        return this;
    }

    /** Babl Format
     *
     * The babl format of the output
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Babl getFormat()
    {
        return m_Format;
    }

    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

