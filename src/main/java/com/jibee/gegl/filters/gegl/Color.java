package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Babl;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

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
public class Color extends GeglFilter implements Source
{
    /** Constructs a Color.
     *
     * Generates a buffer entirely filled with the specified color, use gegl:crop to get smaller dimensions.
     *
     * @param container container node
     */
    public Color(GeglNode container)
    {
        super(container, "gegl:color");
    }
    /** Constructs a Color.
     *
     * Generates a buffer entirely filled with the specified color, use gegl:crop to get smaller dimensions.
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Color
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Color
     * 
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
     *
     * @param value new value for Babl Format
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Babl Format
     * 
     */
    public Babl getFormat()
    {
        return m_Format;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

