package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Color to Grayscale
 *
 * Color to grayscale conversion, uses envelopes formed with the STRESS approach to perform local color-difference preserving grayscale generation.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=true, position_dependant=false, categories={"grayscale", "color"})
public class C2g extends GeglFilter implements Filter
{
    /** Constructs a Color to Grayscale.
     *
     * Color to grayscale conversion, uses envelopes formed with the STRESS approach to perform local color-difference preserving grayscale generation.
     *
     * @param container container node
     */
    public C2g(GeglNode container)
    {
        super(container, "gegl:c2g");
    }
    /** Constructs a Color to Grayscale.
     *
     * Color to grayscale conversion, uses envelopes formed with the STRESS approach to perform local color-difference preserving grayscale generation.
     *
     * @param parent parent filter node
     */
    public C2g(GeglFilter parent)
    {
        super(parent, "gegl:c2g");
    }

    
    /** Radius
     *
     * Neighborhood taken into account, this is the radius in pixels taken into account when deciding which colors map to which gray values
     *
     * Unit: pixel-distance
     * Default value: 300
     * Acceptable Range: 2 6000
     * */
    private int m_Radius  = 300;

    /** Radius
     *
     * Neighborhood taken into account, this is the radius in pixels taken into account when deciding which colors map to which gray values
     *
     * Unit: pixel-distance
     * Default value: 300
     * Acceptable Range: 2 6000
     *
     * @param value new value for Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public C2g setRadius(int value) throws ParameterOutOfRangeException
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
     * Neighborhood taken into account, this is the radius in pixels taken into account when deciding which colors map to which gray values
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
     * Default value: 4
     * Acceptable Range: 1 1000
     * */
    private int m_Samples  = 4;

    /** Samples
     *
     * Number of samples to do per iteration looking for the range of colors
     *
     * Unit: 
     * Default value: 4
     * Acceptable Range: 1 1000
     *
     * @param value new value for Samples
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public C2g setSamples(int value) throws ParameterOutOfRangeException
    {
		if(value > 1000 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 1000);
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
     * Default value: 4
     * Acceptable Range: 1 1000
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
     * Number of iterations, a higher number of iterations provides less noisy results at a computational cost
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range: 1 1000
     * */
    private int m_Iterations  = 10;

    /** Iterations
     *
     * Number of iterations, a higher number of iterations provides less noisy results at a computational cost
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range: 1 1000
     *
     * @param value new value for Iterations
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public C2g setIterations(int value) throws ParameterOutOfRangeException
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
     * Number of iterations, a higher number of iterations provides less noisy results at a computational cost
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range: 1 1000
     *
     * @return value of Iterations
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getIterations()
    {
        return m_Iterations;
    }


    /** Enhance Shadows
     *
     * When enabled details in shadows are boosted at the expense of noise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_EnhanceShadows  = false;

    /** Enhance Shadows
     *
     * When enabled details in shadows are boosted at the expense of noise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Enhance Shadows
     * @return this filter (for chaining operations)
     * 
     */
    public C2g setEnhanceShadows(boolean value)
    {
	
        m_EnhanceShadows = value;
        setProperty("enhance-shadows", value);
        return this;
    }

    /** Enhance Shadows
     *
     * When enabled details in shadows are boosted at the expense of noise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Enhance Shadows
     * 
     */
    public boolean getEnhanceShadows()
    {
        return m_EnhanceShadows;
    }

    @Override
    public InputPad<C2g> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<C2g> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

