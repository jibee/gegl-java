package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Mean Curvature Blur
 *
 * Regularize geometry at a speed proportional to the local mean curvature value
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"blur"})
public class MeanCurvatureBlur extends GeglFilter implements Filter
{
    /** Constructs a Mean Curvature Blur.
     *
     * Regularize geometry at a speed proportional to the local mean curvature value
     *
     * @param container container node
     */
    public MeanCurvatureBlur(GeglNode container)
    {
        super(container, "gegl:mean-curvature-blur");
    }
    /** Constructs a Mean Curvature Blur.
     *
     * Regularize geometry at a speed proportional to the local mean curvature value
     *
     * @param parent parent filter node
     */
    public MeanCurvatureBlur(GeglFilter parent)
    {
        super(parent, "gegl:mean-curvature-blur");
    }

    
    /** Iterations
     *
     * Controls the number of iterations
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range:  500
     * */
    private int m_Iterations  = 20;

    /** Iterations
     *
     * Controls the number of iterations
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range:  500
     *
     * @param value new value for Iterations
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public MeanCurvatureBlur setIterations(int value) throws ParameterOutOfRangeException
    {
		if(value > 500)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 500);
	    }

        m_Iterations = value;
        setProperty("iterations", value);
        return this;
    }

    /** Iterations
     *
     * Controls the number of iterations
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range:  500
     *
     * @return value of Iterations
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getIterations()
    {
        return m_Iterations;
    }

    @Override
    public InputPad<MeanCurvatureBlur> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<MeanCurvatureBlur> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

