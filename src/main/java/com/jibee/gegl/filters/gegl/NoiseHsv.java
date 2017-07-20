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
 * Add HSV Noise
 *
 * Randomize hue, saturation and value independently
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"noise"})
public class NoiseHsv extends GeglFilter implements Source, Sink
{
    /** Constructs a Add HSV Noise.
     *
     * Randomize hue, saturation and value independently
     */
    public NoiseHsv(GeglNode container)
    {
        super(container, "gegl:noise-hsv");
    }
    /** Constructs a Add HSV Noise.
     *
     * Randomize hue, saturation and value independently
     */
    public NoiseHsv(GeglFilter parent)
    {
        super(parent, "gegl:noise-hsv");
    }

    
    /** Holdness
     *
     * 
     *
     * Unit: 
     * Default value: 2
     * Acceptable Range: 1 8
     * */
    private int m_Holdness  = 2;

    /** Holdness
     *
     * 
     *
     * Unit: 
     * Default value: 2
     * Acceptable Range: 1 8
     */
    public NoiseHsv setHoldness(int value) throws ParameterOutOfRangeException
    {
		if(value > 8 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 8);
	}

        m_Holdness = value;
        setProperty("holdness", value);
        return this;
    }

    /** Holdness
     *
     * 
     *
     * Unit: 
     * Default value: 2
     * Acceptable Range: 1 8
     */
    public int getHoldness()
    {
        return m_Holdness;
    }


    /** Hue
     *
     * 
     *
     * Unit: 
     * Default value: 3.00
     * Acceptable Range: 0.00 180.00
     * */
    private double m_HueDistance  = 3.00;

    /** Hue
     *
     * 
     *
     * Unit: 
     * Default value: 3.00
     * Acceptable Range: 0.00 180.00
     */
    public NoiseHsv setHueDistance(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 180.00);
	}

        m_HueDistance = value;
        setProperty("hue-distance", value);
        return this;
    }

    /** Hue
     *
     * 
     *
     * Unit: 
     * Default value: 3.00
     * Acceptable Range: 0.00 180.00
     */
    public double getHueDistance()
    {
        return m_HueDistance;
    }


    /** Saturation
     *
     * 
     *
     * Unit: 
     * Default value: 0.04
     * Acceptable Range: 0.00 1.00
     * */
    private double m_SaturationDistance  = 0.04;

    /** Saturation
     *
     * 
     *
     * Unit: 
     * Default value: 0.04
     * Acceptable Range: 0.00 1.00
     */
    public NoiseHsv setSaturationDistance(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_SaturationDistance = value;
        setProperty("saturation-distance", value);
        return this;
    }

    /** Saturation
     *
     * 
     *
     * Unit: 
     * Default value: 0.04
     * Acceptable Range: 0.00 1.00
     */
    public double getSaturationDistance()
    {
        return m_SaturationDistance;
    }


    /** Value
     *
     * 
     *
     * Unit: 
     * Default value: 0.04
     * Acceptable Range: 0.00 1.00
     * */
    private double m_ValueDistance  = 0.04;

    /** Value
     *
     * 
     *
     * Unit: 
     * Default value: 0.04
     * Acceptable Range: 0.00 1.00
     */
    public NoiseHsv setValueDistance(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_ValueDistance = value;
        setProperty("value-distance", value);
        return this;
    }

    /** Value
     *
     * 
     *
     * Unit: 
     * Default value: 0.04
     * Acceptable Range: 0.00 1.00
     */
    public double getValueDistance()
    {
        return m_ValueDistance;
    }


    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Seed ;

    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public NoiseHsv setSeed(int value)
    {
	
        m_Seed = value;
        setProperty("seed", value);
        return this;
    }

    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public int getSeed()
    {
        return m_Seed;
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

