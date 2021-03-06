package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Simplex Noise
 *
 * Generates a solid noise texture.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=true, position_dependant=true, categories={"render"})
public class SimplexNoise extends GeglFilter implements Source
{
    /** Constructs a Simplex Noise.
     *
     * Generates a solid noise texture.
     *
     * @param container container node
     */
    public SimplexNoise(GeglNode container)
    {
        super(container, "gegl:simplex-noise");
    }
    /** Constructs a Simplex Noise.
     *
     * Generates a solid noise texture.
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Scale
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Scale
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Iterations
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Iterations
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Random seed
     * 
     */
    public int getSeed()
    {
        return m_Seed;
    }

    @Override
    public OutputPad<SimplexNoise> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

