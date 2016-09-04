package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;

/**
 * Simplex Noise
 *
 * Generates a solid noise texture.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: true
 */
@Filter(license="", opencl=true, position_dependant=true, categories={"render"})
public class SimplexNoise extends GeglFilter implements Source
{
    /** Constructs a Simplex Noise.
     *
     * Generates a solid noise texture.
     */
    public SimplexNoise(GeglNode container)
    {
        super(container, "gegl:simplex-noise");
    }
    /** Constructs a Simplex Noise.
     *
     * Generates a solid noise texture.
     */
    public SimplexNoise(GeglFilter parent)
    {
        super(parent, "gegl:simplex-noise");
    }

    
    /** Scale
     *
     * The scale of the noise function
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     * */
    private double m_Scale  = 1.00;

    /** Scale
     *
     * The scale of the noise function
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     */
    public SimplexNoise setScale(double value) throws ParameterOutOfRangeException
    {
		if(value > 20.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 20.00);
	}

        m_Scale = value;
        setProperty("scale", value);
        return this;
    }

    /** Scale
     *
     * The scale of the noise function
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     */
    public double getScale()
    {
        return m_Scale;
    }


    /** Iterations
     *
     * The number of noise octaves.
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 20
     * */
    private int m_Iterations  = 1;

    /** Iterations
     *
     * The number of noise octaves.
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 20
     */
    public SimplexNoise setIterations(int value) throws ParameterOutOfRangeException
    {
		if(value > 20 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 20);
	}

        m_Iterations = value;
        setProperty("iterations", value);
        return this;
    }

    /** Iterations
     *
     * The number of noise octaves.
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 20
     */
    public int getIterations()
    {
        return m_Iterations;
    }


    /** Random seed
     *
     * The random seed for the noise function
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Seed ;

    /** Random seed
     *
     * The random seed for the noise function
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public SimplexNoise setSeed(int value)
    {
	
        m_Seed = value;
        setProperty("seed", value);
        return this;
    }

    /** Random seed
     *
     * The random seed for the noise function
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public int getSeed()
    {
        return m_Seed;
    }

    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

