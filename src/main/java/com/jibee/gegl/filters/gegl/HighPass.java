package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * High Pass Filter
 *
 * Enhances fine details.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"frequency"})
public class HighPass extends GeglFilter implements Filter
{
    /** Constructs a High Pass Filter.
     *
     * Enhances fine details.
     *
     * @param container container node
     */
    public HighPass(GeglNode container)
    {
        super(container, "gegl:high-pass");
    }
    /** Constructs a High Pass Filter.
     *
     * Enhances fine details.
     *
     * @param parent parent filter node
     */
    public HighPass(GeglFilter parent)
    {
        super(parent, "gegl:high-pass");
    }

    
    /** Std. Dev.
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 0.00 10000.00
     * */
    private double m_StdDev  = 4.00;

    /** Std. Dev.
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 0.00 10000.00
     *
     * @param value new value for Std. Dev.
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public HighPass setStdDev(double value) throws ParameterOutOfRangeException
    {
		if(value > 10000.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 10000.00);
	    }

        m_StdDev = value;
        setProperty("std-dev", value);
        return this;
    }

    /** Std. Dev.
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 0.00 10000.00
     *
     * @return value of Std. Dev.
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getStdDev()
    {
        return m_StdDev;
    }


    /** Contrast
     *
     * Contrast of high-pass
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 5.00
     * */
    private double m_Contrast  = 1.00;

    /** Contrast
     *
     * Contrast of high-pass
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 5.00
     *
     * @param value new value for Contrast
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public HighPass setContrast(double value) throws ParameterOutOfRangeException
    {
		if(value > 5.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 5.00);
	    }

        m_Contrast = value;
        setProperty("contrast", value);
        return this;
    }

    /** Contrast
     *
     * Contrast of high-pass
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 5.00
     *
     * @return value of Contrast
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getContrast()
    {
        return m_Contrast;
    }

    @Override
    public InputPad<HighPass> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<HighPass> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

