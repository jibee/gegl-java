package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;

/**
 * Perlin Noise
 *
 * Perlin noise generator
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="", opencl=false, position_dependant=true, categories={"render"})
public class PerlinNoise extends GeglFilter implements Source
{
    /** Constructs a Perlin Noise.
     *
     * Perlin noise generator
     *
     * @param container container node
     */
    public PerlinNoise(GeglNode container)
    {
        super(container, "gegl:perlin-noise");
    }
    /** Constructs a Perlin Noise.
     *
     * Perlin noise generator
     *
     * @param parent parent filter node
     */
    public PerlinNoise(GeglFilter parent)
    {
        super(parent, "gegl:perlin-noise");
    }

    
    /** Alpha
     *
     * 
     *
     * Unit: 
     * Default value: 1.20
     * Acceptable Range:  
     * */
    private double m_Alpha  = 1.20;

    /** Alpha
     *
     * 
     *
     * Unit: 
     * Default value: 1.20
     * Acceptable Range:  
     *
     * @param value new value for Alpha
     * @return this filter (for chaining operations)
     * 
     */
    public PerlinNoise setAlpha(double value)
    {
	
        m_Alpha = value;
        setProperty("alpha", value);
        return this;
    }

    /** Alpha
     *
     * 
     *
     * Unit: 
     * Default value: 1.20
     * Acceptable Range:  
     *
     * @return value of Alpha
     * 
     */
    public double getAlpha()
    {
        return m_Alpha;
    }


    /** Scale
     *
     * 
     *
     * Unit: 
     * Default value: 1.80
     * Acceptable Range:  
     * */
    private double m_Scale  = 1.80;

    /** Scale
     *
     * 
     *
     * Unit: 
     * Default value: 1.80
     * Acceptable Range:  
     *
     * @param value new value for Scale
     * @return this filter (for chaining operations)
     * 
     */
    public PerlinNoise setScale(double value)
    {
	
        m_Scale = value;
        setProperty("scale", value);
        return this;
    }

    /** Scale
     *
     * 
     *
     * Unit: 
     * Default value: 1.80
     * Acceptable Range:  
     *
     * @return value of Scale
     * 
     */
    public double getScale()
    {
        return m_Scale;
    }


    /** Z offset
     *
     * 
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range:  
     * */
    private double m_Zoff  = -1.00;

    /** Z offset
     *
     * 
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range:  
     *
     * @param value new value for Z offset
     * @return this filter (for chaining operations)
     * 
     */
    public PerlinNoise setZoff(double value)
    {
	
        m_Zoff = value;
        setProperty("zoff", value);
        return this;
    }

    /** Z offset
     *
     * 
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range:  
     *
     * @return value of Z offset
     * 
     */
    public double getZoff()
    {
        return m_Zoff;
    }


    /** Iterations
     *
     * 
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range:  20
     * */
    private int m_N  = 3;

    /** Iterations
     *
     * 
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range:  20
     *
     * @param value new value for Iterations
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public PerlinNoise setN(int value) throws ParameterOutOfRangeException
    {
		if(value > 20)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 20);
	    }

        m_N = value;
        setProperty("n", value);
        return this;
    }

    /** Iterations
     *
     * 
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range:  20
     *
     * @return value of Iterations
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getN()
    {
        return m_N;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

