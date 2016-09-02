package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;

/**
 * Bilateral Filter
 *
 * Like a gaussian blur; but where the contribution for each neighbourhood pixel is also weighted by the color difference with the original center pixel. 
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"enhance", "noise-reduction"})
public class BilateralFilter extends GeglFilter
{
    /** Constructs a Bilateral Filter.
     *
     * Like a gaussian blur; but where the contribution for each neighbourhood pixel is also weighted by the color difference with the original center pixel. 
     */
    public BilateralFilter(GeglNode container)
    {
        super(container, "gegl:bilateral-filter");
    }
    /** Constructs a Bilateral Filter.
     *
     * Like a gaussian blur; but where the contribution for each neighbourhood pixel is also weighted by the color difference with the original center pixel. 
     */
    public BilateralFilter(GeglFilter parent)
    {
        super(parent, "gegl:bilateral-filter");
    }

    
    /** Blur radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1).
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 0.00 1000.00
     * */
    private double m_BlurRadius  = 4.00;

    /** Blur radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1).
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 0.00 1000.00
     */
    public BilateralFilter setBlurRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1000.00);
	}

        m_BlurRadius = value;
        setProperty("blur-radius", value);
        return this;
    }

    /** Blur radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1).
     *
     * Unit: 
     * Default value: 4.00
     * Acceptable Range: 0.00 1000.00
     */
    public double getBlurRadius()
    {
        return m_BlurRadius;
    }


    /** Edge preservation
     *
     * Amount of edge preservation
     *
     * Unit: 
     * Default value: 8.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_EdgePreservation  = 8.00;

    /** Edge preservation
     *
     * Amount of edge preservation
     *
     * Unit: 
     * Default value: 8.00
     * Acceptable Range: 0.00 100.00
     */
    public BilateralFilter setEdgePreservation(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	}

        m_EdgePreservation = value;
        setProperty("edge-preservation", value);
        return this;
    }

    /** Edge preservation
     *
     * Amount of edge preservation
     *
     * Unit: 
     * Default value: 8.00
     * Acceptable Range: 0.00 100.00
     */
    public double getEdgePreservation()
    {
        return m_EdgePreservation;
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

