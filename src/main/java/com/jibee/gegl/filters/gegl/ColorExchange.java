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
 * Exchange color
 *
 * Exchange one color with another, optionally setting a threshold to convert from one shade to another.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"color"})
public class ColorExchange extends GeglFilter implements Filter
{
    /** Constructs a Exchange color.
     *
     * Exchange one color with another, optionally setting a threshold to convert from one shade to another.
     *
     * @param container container node
     */
    public ColorExchange(GeglNode container)
    {
        super(container, "gegl:color-exchange");
    }
    /** Constructs a Exchange color.
     *
     * Exchange one color with another, optionally setting a threshold to convert from one shade to another.
     *
     * @param parent parent filter node
     */
    public ColorExchange(GeglFilter parent)
    {
        super(parent, "gegl:color-exchange");
    }

    
    /** From Color
     *
     * The color to change.
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_FromColor  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** From Color
     *
     * The color to change.
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @param value new value for From Color
     * @return this filter (for chaining operations)
     * 
     */
    public ColorExchange setFromColor(GeglColor value)
    {
	
        m_FromColor = value;
        setProperty("from-color", value);
        return this;
    }

    /** From Color
     *
     * The color to change.
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @return value of From Color
     * 
     */
    public GeglColor getFromColor()
    {
        return m_FromColor;
    }


    /** To Color
     *
     * Replacement color.
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_ToColor  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** To Color
     *
     * Replacement color.
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for To Color
     * @return this filter (for chaining operations)
     * 
     */
    public ColorExchange setToColor(GeglColor value)
    {
	
        m_ToColor = value;
        setProperty("to-color", value);
        return this;
    }

    /** To Color
     *
     * Replacement color.
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of To Color
     * 
     */
    public GeglColor getToColor()
    {
        return m_ToColor;
    }


    /** Red Threshold
     *
     * Red threshold of the input color
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_RedThreshold  = 0.00;

    /** Red Threshold
     *
     * Red threshold of the input color
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Red Threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorExchange setRedThreshold(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_RedThreshold = value;
        setProperty("red-threshold", value);
        return this;
    }

    /** Red Threshold
     *
     * Red threshold of the input color
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Red Threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRedThreshold()
    {
        return m_RedThreshold;
    }


    /** Green Threshold
     *
     * Green threshold of the input color
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_GreenThreshold  = 0.00;

    /** Green Threshold
     *
     * Green threshold of the input color
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Green Threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorExchange setGreenThreshold(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_GreenThreshold = value;
        setProperty("green-threshold", value);
        return this;
    }

    /** Green Threshold
     *
     * Green threshold of the input color
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Green Threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getGreenThreshold()
    {
        return m_GreenThreshold;
    }


    /** Blue Threshold
     *
     * Blue threshold of the input color
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_BlueThreshold  = 0.00;

    /** Blue Threshold
     *
     * Blue threshold of the input color
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Blue Threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorExchange setBlueThreshold(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_BlueThreshold = value;
        setProperty("blue-threshold", value);
        return this;
    }

    /** Blue Threshold
     *
     * Blue threshold of the input color
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Blue Threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBlueThreshold()
    {
        return m_BlueThreshold;
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

