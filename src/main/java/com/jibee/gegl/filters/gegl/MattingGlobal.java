package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Matting Global
 *
 * Given a sparse user supplied tri-map and an input image, create a foreground alpha matte. Set white as foreground, black as background for the tri-map. Everything else will be treated as unknown and filled in.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"matting"})
public class MattingGlobal extends GeglFilter implements CombiningFilter
{
    /** Constructs a Matting Global.
     *
     * Given a sparse user supplied tri-map and an input image, create a foreground alpha matte. Set white as foreground, black as background for the tri-map. Everything else will be treated as unknown and filled in.
     *
     * @param container container node
     */
    public MattingGlobal(GeglNode container)
    {
        super(container, "gegl:matting-global");
    }
    /** Constructs a Matting Global.
     *
     * Given a sparse user supplied tri-map and an input image, create a foreground alpha matte. Set white as foreground, black as background for the tri-map. Everything else will be treated as unknown and filled in.
     *
     * @param parent parent filter node
     */
    public MattingGlobal(GeglFilter parent)
    {
        super(parent, "gegl:matting-global");
    }

    
    /** Iterations
     *
     * 
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range: 1 10000
     * */
    private int m_Iterations  = 10;

    /** Iterations
     *
     * 
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range: 1 10000
     *
     * @param value new value for Iterations
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public MattingGlobal setIterations(int value) throws ParameterOutOfRangeException
    {
		if(value > 10000 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 10000);
	    }

        m_Iterations = value;
        setProperty("iterations", value);
        return this;
    }

    /** Iterations
     *
     * 
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range: 1 10000
     *
     * @return value of Iterations
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getIterations()
    {
        return m_Iterations;
    }

    @Override
    public InputPad Aux()
    {
        return new InputPad(this, "aux");
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

