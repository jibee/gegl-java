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
 * Neon Edge Detection
 *
 * Performs edge detection using a Gaussian derivative method
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"edge-detect"})
public class EdgeNeon extends GeglFilter implements Source, Sink
{
    /** Constructs a Neon Edge Detection.
     *
     * Performs edge detection using a Gaussian derivative method
     */
    public EdgeNeon(GeglNode container)
    {
        super(container, "gegl:edge-neon");
    }
    /** Constructs a Neon Edge Detection.
     *
     * Performs edge detection using a Gaussian derivative method
     */
    public EdgeNeon(GeglFilter parent)
    {
        super(parent, "gegl:edge-neon");
    }

    
    /** Radius
     *
     * Radius of effect (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 5.00
     * Acceptable Range: 1.00 1500.00
     * */
    private double m_Radius  = 5.00;

    /** Radius
     *
     * Radius of effect (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 5.00
     * Acceptable Range: 1.00 1500.00
     */
    public EdgeNeon setRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 1500.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 1500.00);
	}

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * Radius of effect (in pixels)
     *
     * Unit: pixel-distance
     * Default value: 5.00
     * Acceptable Range: 1.00 1500.00
     */
    public double getRadius()
    {
        return m_Radius;
    }


    /** Intensity
     *
     * Strength of Effect
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_Amount  = 0.00;

    /** Intensity
     *
     * Strength of Effect
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 100.00
     */
    public EdgeNeon setAmount(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	}

        m_Amount = value;
        setProperty("amount", value);
        return this;
    }

    /** Intensity
     *
     * Strength of Effect
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 100.00
     */
    public double getAmount()
    {
        return m_Amount;
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
