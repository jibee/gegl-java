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
 * Red Eye Removal
 *
 * Remove the red eye effect caused by camera flashes
 * 
 * License: GPL3+
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=true, position_dependant=false, categories={"enhance"})
public class RedEyeRemoval extends GeglFilter implements Source, Sink
{
    /** Constructs a Red Eye Removal.
     *
     * Remove the red eye effect caused by camera flashes
     */
    public RedEyeRemoval(GeglNode container)
    {
        super(container, "gegl:red-eye-removal");
    }
    /** Constructs a Red Eye Removal.
     *
     * Remove the red eye effect caused by camera flashes
     */
    public RedEyeRemoval(GeglFilter parent)
    {
        super(parent, "gegl:red-eye-removal");
    }

    
    /** Threshold
     *
     * Red eye threshold
     *
     * Unit: 
     * Default value: 0.40
     * Acceptable Range: 0.00 0.80
     * */
    private double m_Threshold  = 0.40;

    /** Threshold
     *
     * Red eye threshold
     *
     * Unit: 
     * Default value: 0.40
     * Acceptable Range: 0.00 0.80
     */
    public RedEyeRemoval setThreshold(double value) throws ParameterOutOfRangeException
    {
		if(value > 0.80 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 0.80);
	}

        m_Threshold = value;
        setProperty("threshold", value);
        return this;
    }

    /** Threshold
     *
     * Red eye threshold
     *
     * Unit: 
     * Default value: 0.40
     * Acceptable Range: 0.00 0.80
     */
    public double getThreshold()
    {
        return m_Threshold;
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

