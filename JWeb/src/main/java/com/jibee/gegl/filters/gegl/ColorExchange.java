package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Exchange color
 *
 * Exchange one color with another, optionally setting a threshold to convert from one shade to another.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"color"})
public class ColorExchange extends GeglFilter
{
    /** Constructs a Exchange color.
     *
     * Exchange one color with another, optionally setting a threshold to convert from one shade to another.
     */
    public ColorExchange(GeglNode container)
    {
        super(container, "gegl:color-exchange");
    }
    /** Constructs a Exchange color.
     *
     * Exchange one color with another, optionally setting a threshold to convert from one shade to another.
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
     */
    public double getBlueThreshold()
    {
        return m_BlueThreshold;
    }

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

