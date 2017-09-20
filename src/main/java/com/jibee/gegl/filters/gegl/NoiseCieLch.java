package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Add CIE Lch Noise
 *
 * Randomize lightness, chroma and hue independently
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"noise"})
public class NoiseCieLch extends GeglFilter implements Filter
{
    /** Constructs a Add CIE Lch Noise.
     *
     * Randomize lightness, chroma and hue independently
     *
     * @param container container node
     */
    public NoiseCieLch(GeglNode container)
    {
        super(container, "gegl:noise-cie-lch");
    }
    /** Constructs a Add CIE Lch Noise.
     *
     * Randomize lightness, chroma and hue independently
     *
     * @param parent parent filter node
     */
    public NoiseCieLch(GeglFilter parent)
    {
        super(parent, "gegl:noise-cie-lch");
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
     *
     * @param value new value for Holdness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public NoiseCieLch setHoldness(int value) throws ParameterOutOfRangeException
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
     *
     * @return value of Holdness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getHoldness()
    {
        return m_Holdness;
    }


    /** Lightness
     *
     * 
     *
     * Unit: 
     * Default value: 40.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_LightnessDistance  = 40.00;

    /** Lightness
     *
     * 
     *
     * Unit: 
     * Default value: 40.00
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Lightness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public NoiseCieLch setLightnessDistance(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_LightnessDistance = value;
        setProperty("lightness-distance", value);
        return this;
    }

    /** Lightness
     *
     * 
     *
     * Unit: 
     * Default value: 40.00
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Lightness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getLightnessDistance()
    {
        return m_LightnessDistance;
    }


    /** Chroma
     *
     * 
     *
     * Unit: 
     * Default value: 40.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_ChromaDistance  = 40.00;

    /** Chroma
     *
     * 
     *
     * Unit: 
     * Default value: 40.00
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Chroma
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public NoiseCieLch setChromaDistance(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_ChromaDistance = value;
        setProperty("chroma-distance", value);
        return this;
    }

    /** Chroma
     *
     * 
     *
     * Unit: 
     * Default value: 40.00
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Chroma
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getChromaDistance()
    {
        return m_ChromaDistance;
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
     *
     * @param value new value for Hue
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public NoiseCieLch setHueDistance(double value) throws ParameterOutOfRangeException
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
     *
     * @return value of Hue
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getHueDistance()
    {
        return m_HueDistance;
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
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
     */
    public NoiseCieLch setSeed(int value)
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
     *
     * @return value of Random seed
     * 
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

