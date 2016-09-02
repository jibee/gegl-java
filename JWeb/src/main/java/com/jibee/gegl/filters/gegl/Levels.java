package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Levels
 *
 * Remaps the intensity range of the image
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"color"})
public class Levels extends GeglFilter
{
    /** Constructs a Levels.
     *
     * Remaps the intensity range of the image
     */
    public Levels(GeglNode container)
    {
        super(container, "gegl:levels");
    }
    /** Constructs a Levels.
     *
     * Remaps the intensity range of the image
     */
    public Levels(GeglFilter parent)
    {
        super(parent, "gegl:levels");
    }

    
    /** Low input
     *
     * Input luminance level to become lowest output
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 4.00
     * */
    private double m_InLow  = 0.00;

    /** Low input
     *
     * Input luminance level to become lowest output
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 4.00
     */
    public Levels setInLow(double value) throws ParameterOutOfRangeException
    {
		if(value > 4.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 4.00);
	}

        m_InLow = value;
        setProperty("in-low", value);
        return this;
    }

    /** Low input
     *
     * Input luminance level to become lowest output
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 4.00
     */
    public double getInLow()
    {
        return m_InLow;
    }


    /** High input
     *
     * Input luminance level to become white
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -1.00 4.00
     * */
    private double m_InHigh  = 1.00;

    /** High input
     *
     * Input luminance level to become white
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -1.00 4.00
     */
    public Levels setInHigh(double value) throws ParameterOutOfRangeException
    {
		if(value > 4.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 4.00);
	}

        m_InHigh = value;
        setProperty("in-high", value);
        return this;
    }

    /** High input
     *
     * Input luminance level to become white
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -1.00 4.00
     */
    public double getInHigh()
    {
        return m_InHigh;
    }


    /** Low output
     *
     * Lowest luminance level in output
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 4.00
     * */
    private double m_OutLow  = 0.00;

    /** Low output
     *
     * Lowest luminance level in output
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 4.00
     */
    public Levels setOutLow(double value) throws ParameterOutOfRangeException
    {
		if(value > 4.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 4.00);
	}

        m_OutLow = value;
        setProperty("out-low", value);
        return this;
    }

    /** Low output
     *
     * Lowest luminance level in output
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 4.00
     */
    public double getOutLow()
    {
        return m_OutLow;
    }


    /** High output
     *
     * Highest luminance level in output
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -1.00 4.00
     * */
    private double m_OutHigh  = 1.00;

    /** High output
     *
     * Highest luminance level in output
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -1.00 4.00
     */
    public Levels setOutHigh(double value) throws ParameterOutOfRangeException
    {
		if(value > 4.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 4.00);
	}

        m_OutHigh = value;
        setProperty("out-high", value);
        return this;
    }

    /** High output
     *
     * Highest luminance level in output
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -1.00 4.00
     */
    public double getOutHigh()
    {
        return m_OutHigh;
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

