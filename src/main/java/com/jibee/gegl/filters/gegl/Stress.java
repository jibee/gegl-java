package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Spatio Temporal Retinex-like Envelope with Stochastic Sampling
 *
 * Spatio Temporal Retinex-like Envelope with Stochastic Sampling
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"enhance", "tonemapping"})
public class Stress extends GeglFilter implements Filter
{
    /** Constructs a Spatio Temporal Retinex-like Envelope with Stochastic Sampling.
     *
     * Spatio Temporal Retinex-like Envelope with Stochastic Sampling
     *
     * @param container container node
     */
    public Stress(GeglNode container)
    {
        super(container, "gegl:stress");
    }
    /** Constructs a Spatio Temporal Retinex-like Envelope with Stochastic Sampling.
     *
     * Spatio Temporal Retinex-like Envelope with Stochastic Sampling
     *
     * @param parent parent filter node
     */
    public Stress(GeglFilter parent)
    {
        super(parent, "gegl:stress");
    }

    
    /** Radius
     *
     * Neighborhood taken into account, for enhancement ideal values are close to the longest side of the image, increasing this increases the runtime
     *
     * Unit: pixel-distance
     * Default value: 300
     * Acceptable Range: 2 6000
     * */
    private int m_Radius  = 300;

    /** Radius
     *
     * Neighborhood taken into account, for enhancement ideal values are close to the longest side of the image, increasing this increases the runtime
     *
     * Unit: pixel-distance
     * Default value: 300
     * Acceptable Range: 2 6000
     *
     * @param value new value for Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Stress setRadius(int value) throws ParameterOutOfRangeException
    {
		if(value > 6000 || value < 2)
	    {
	        throw new ParameterOutOfRangeException(value, 2, 6000);
	    }

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * Neighborhood taken into account, for enhancement ideal values are close to the longest side of the image, increasing this increases the runtime
     *
     * Unit: pixel-distance
     * Default value: 300
     * Acceptable Range: 2 6000
     *
     * @return value of Radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getRadius()
    {
        return m_Radius;
    }


    /** Samples
     *
     * Number of samples to do per iteration looking for the range of colors
     *
     * Unit: 
     * Default value: 5
     * Acceptable Range: 2 500
     * */
    private int m_Samples  = 5;

    /** Samples
     *
     * Number of samples to do per iteration looking for the range of colors
     *
     * Unit: 
     * Default value: 5
     * Acceptable Range: 2 500
     *
     * @param value new value for Samples
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Stress setSamples(int value) throws ParameterOutOfRangeException
    {
		if(value > 500 || value < 2)
	    {
	        throw new ParameterOutOfRangeException(value, 2, 500);
	    }

        m_Samples = value;
        setProperty("samples", value);
        return this;
    }

    /** Samples
     *
     * Number of samples to do per iteration looking for the range of colors
     *
     * Unit: 
     * Default value: 5
     * Acceptable Range: 2 500
     *
     * @return value of Samples
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getSamples()
    {
        return m_Samples;
    }


    /** Iterations
     *
     * Number of iterations, a higher number of iterations provides a less noisy rendering at a computational cost
     *
     * Unit: 
     * Default value: 5
     * Acceptable Range: 1 1000
     * */
    private int m_Iterations  = 5;

    /** Iterations
     *
     * Number of iterations, a higher number of iterations provides a less noisy rendering at a computational cost
     *
     * Unit: 
     * Default value: 5
     * Acceptable Range: 1 1000
     *
     * @param value new value for Iterations
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Stress setIterations(int value) throws ParameterOutOfRangeException
    {
		if(value > 1000 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 1000);
	    }

        m_Iterations = value;
        setProperty("iterations", value);
        return this;
    }

    /** Iterations
     *
     * Number of iterations, a higher number of iterations provides a less noisy rendering at a computational cost
     *
     * Unit: 
     * Default value: 5
     * Acceptable Range: 1 1000
     *
     * @return value of Iterations
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getIterations()
    {
        return m_Iterations;
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

