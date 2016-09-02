package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Softglow
 *
 * Simulate glow by making highlights intense and fuzzy
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"artistic"})
public class Softglow extends GeglFilter
{
    /** Constructs a Softglow.
     *
     * Simulate glow by making highlights intense and fuzzy
     */
    public Softglow(GeglNode container)
    {
        super(container, "gegl:softglow");
    }
    /** Constructs a Softglow.
     *
     * Simulate glow by making highlights intense and fuzzy
     */
    public Softglow(GeglFilter parent)
    {
        super(parent, "gegl:softglow");
    }

    
    /** Glow radius
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 1.00 50.00
     * */
    private double m_GlowRadius  = 10.00;

    /** Glow radius
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 1.00 50.00
     */
    public Softglow setGlowRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 50.00);
	}

        m_GlowRadius = value;
        setProperty("glow-radius", value);
        return this;
    }

    /** Glow radius
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 1.00 50.00
     */
    public double getGlowRadius()
    {
        return m_GlowRadius;
    }


    /** Brightness
     *
     * 
     *
     * Unit: 
     * Default value: 0.30
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Brightness  = 0.30;

    /** Brightness
     *
     * 
     *
     * Unit: 
     * Default value: 0.30
     * Acceptable Range: 0.00 1.00
     */
    public Softglow setBrightness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Brightness = value;
        setProperty("brightness", value);
        return this;
    }

    /** Brightness
     *
     * 
     *
     * Unit: 
     * Default value: 0.30
     * Acceptable Range: 0.00 1.00
     */
    public double getBrightness()
    {
        return m_Brightness;
    }


    /** Sharpness
     *
     * 
     *
     * Unit: 
     * Default value: 0.85
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Sharpness  = 0.85;

    /** Sharpness
     *
     * 
     *
     * Unit: 
     * Default value: 0.85
     * Acceptable Range: 0.00 1.00
     */
    public Softglow setSharpness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Sharpness = value;
        setProperty("sharpness", value);
        return this;
    }

    /** Sharpness
     *
     * 
     *
     * Unit: 
     * Default value: 0.85
     * Acceptable Range: 0.00 1.00
     */
    public double getSharpness()
    {
        return m_Sharpness;
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

