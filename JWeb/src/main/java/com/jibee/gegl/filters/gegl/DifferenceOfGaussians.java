package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;

/**
 * Difference of Gaussians
 *
 * Edge detection with control of edge thickness, based on the difference of two gaussian blurs
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"edge-detect"})
public class DifferenceOfGaussians extends GeglFilter
{
    /** Constructs a Difference of Gaussians.
     *
     * Edge detection with control of edge thickness, based on the difference of two gaussian blurs
     */
    public DifferenceOfGaussians(GeglNode container)
    {
        super(container, "gegl:difference-of-gaussians");
    }
    /** Constructs a Difference of Gaussians.
     *
     * Edge detection with control of edge thickness, based on the difference of two gaussian blurs
     */
    public DifferenceOfGaussians(GeglFilter parent)
    {
        super(parent, "gegl:difference-of-gaussians");
    }

    
    /** Radius 1
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1000.00
     * */
    private double m_Radius1  = 1.00;

    /** Radius 1
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1000.00
     */
    public DifferenceOfGaussians setRadius1(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1000.00);
	}

        m_Radius1 = value;
        setProperty("radius1", value);
        return this;
    }

    /** Radius 1
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1000.00
     */
    public double getRadius1()
    {
        return m_Radius1;
    }


    /** Radius 2
     *
     * 
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 0.00 1000.00
     * */
    private double m_Radius2  = 2.00;

    /** Radius 2
     *
     * 
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 0.00 1000.00
     */
    public DifferenceOfGaussians setRadius2(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1000.00);
	}

        m_Radius2 = value;
        setProperty("radius2", value);
        return this;
    }

    /** Radius 2
     *
     * 
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 0.00 1000.00
     */
    public double getRadius2()
    {
        return m_Radius2;
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

