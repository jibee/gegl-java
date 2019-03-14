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
 * Long Shadow
 *
 * Creates a long-shadow effect
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"light"})
public class LongShadow extends GeglFilter implements Filter
{
    /** Constructs a Long Shadow.
     *
     * Creates a long-shadow effect
     *
     * @param container container node
     */
    public LongShadow(GeglNode container)
    {
        super(container, "gegl:long-shadow");
    }
    /** Constructs a Long Shadow.
     *
     * Creates a long-shadow effect
     *
     * @param parent parent filter node
     */
    public LongShadow(GeglFilter parent)
    {
        super(parent, "gegl:long-shadow");
    }

    
    /** Style
     *
     * Shadow style
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Style ;

    /** Style
     *
     * Shadow style
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Style
     * @return this filter (for chaining operations)
     * 
     */
    public LongShadow setStyle(String value)
    {
	
        m_Style = value;
        setProperty("style", value);
        return this;
    }

    /** Style
     *
     * Shadow style
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Style
     * 
     */
    public String getStyle()
    {
        return m_Style;
    }


    /** Angle
     *
     * Shadow angle
     *
     * Unit: degree
     * Default value: 45.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Angle  = 45.00;

    /** Angle
     *
     * Shadow angle
     *
     * Unit: degree
     * Default value: 45.00
     * Acceptable Range: -180.00 180.00
     *
     * @param value new value for Angle
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public LongShadow setAngle(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < -180.00)
	    {
	        throw new ParameterOutOfRangeException(value, -180.00, 180.00);
	    }

        m_Angle = value;
        setProperty("angle", value);
        return this;
    }

    /** Angle
     *
     * Shadow angle
     *
     * Unit: degree
     * Default value: 45.00
     * Acceptable Range: -180.00 180.00
     *
     * @return value of Angle
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getAngle()
    {
        return m_Angle;
    }


    /** Length
     *
     * Shadow length
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.00 
     * */
    private double m_Length  = 100.00;

    /** Length
     *
     * Shadow length
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.00 
     *
     * @param value new value for Length
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public LongShadow setLength(double value) throws ParameterOutOfRangeException
    {
		if(value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, Double.POSITIVE_INFINITY);
	    }

        m_Length = value;
        setProperty("length", value);
        return this;
    }

    /** Length
     *
     * Shadow length
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.00 
     *
     * @return value of Length
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getLength()
    {
        return m_Length;
    }


    /** Midpoint
     *
     * Shadow fade midpoint
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.00 
     * */
    private double m_Midpoint  = 100.00;

    /** Midpoint
     *
     * Shadow fade midpoint
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.00 
     *
     * @param value new value for Midpoint
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public LongShadow setMidpoint(double value) throws ParameterOutOfRangeException
    {
		if(value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, Double.POSITIVE_INFINITY);
	    }

        m_Midpoint = value;
        setProperty("midpoint", value);
        return this;
    }

    /** Midpoint
     *
     * Shadow fade midpoint
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.00 
     *
     * @return value of Midpoint
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getMidpoint()
    {
        return m_Midpoint;
    }


    /** alt-label
     *
     * Shadow fade midpoint, as a factor of the shadow length
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     * */
    private double m_MidpointRel  = 0.50;

    /** alt-label
     *
     * Shadow fade midpoint, as a factor of the shadow length
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for alt-label
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public LongShadow setMidpointRel(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_MidpointRel = value;
        setProperty("midpoint-rel", value);
        return this;
    }

    /** alt-label
     *
     * Shadow fade midpoint, as a factor of the shadow length
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     *
     * @return value of alt-label
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getMidpointRel()
    {
        return m_MidpointRel;
    }


    /** Color
     *
     * Shadow color
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Color
     *
     * Shadow color
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Color
     * @return this filter (for chaining operations)
     * 
     */
    public LongShadow setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

    /** Color
     *
     * Shadow color
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


    /** Composition
     *
     * Output composition
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Composition ;

    /** Composition
     *
     * Output composition
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Composition
     * @return this filter (for chaining operations)
     * 
     */
    public LongShadow setComposition(String value)
    {
	
        m_Composition = value;
        setProperty("composition", value);
        return this;
    }

    /** Composition
     *
     * Output composition
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Composition
     * 
     */
    public String getComposition()
    {
        return m_Composition;
    }

    @Override
    public InputPad<LongShadow> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<LongShadow> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

