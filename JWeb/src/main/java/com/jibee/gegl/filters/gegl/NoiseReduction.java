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
 * Noise Reduction
 *
 * Anisotropic smoothing operation
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"enhance", "noise-reduction"})
public class NoiseReduction extends GeglFilter implements Source, Sink
{
    /** Constructs a Noise Reduction.
     *
     * Anisotropic smoothing operation
     */
    public NoiseReduction(GeglNode container)
    {
        super(container, "gegl:noise-reduction");
    }
    /** Constructs a Noise Reduction.
     *
     * Anisotropic smoothing operation
     */
    public NoiseReduction(GeglFilter parent)
    {
        super(parent, "gegl:noise-reduction");
    }

    
    /** Strength
     *
     * Controls the number of iterations; lower values give less plastic results
     *
     * Unit: 
     * Default value: 4
     * Acceptable Range:  32
     * */
    private int m_Iterations  = 4;

    /** Strength
     *
     * Controls the number of iterations; lower values give less plastic results
     *
     * Unit: 
     * Default value: 4
     * Acceptable Range:  32
     */
    public NoiseReduction setIterations(int value) throws ParameterOutOfRangeException
    {
		if(value > 32)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 32);
	}

        m_Iterations = value;
        setProperty("iterations", value);
        return this;
    }

    /** Strength
     *
     * Controls the number of iterations; lower values give less plastic results
     *
     * Unit: 
     * Default value: 4
     * Acceptable Range:  32
     */
    public int getIterations()
    {
        return m_Iterations;
    }

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

