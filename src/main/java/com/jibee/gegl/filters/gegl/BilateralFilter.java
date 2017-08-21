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
 * Bilateral Filter
 *
 * Like a gaussian blur; but where the contribution for each neighbourhood pixel is also weighted by the color difference with the original center pixel. 
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"enhance", "noise-reduction"})
public class BilateralFilter extends GeglFilter implements Source, Sink
{
    /** Constructs a Bilateral Filter.
     *
     * Like a gaussian blur; but where the contribution for each neighbourhood pixel is also weighted by the color difference with the original center pixel. 
     *
     * @param container container node
     */
    public BilateralFilter(GeglNode container)
    {
        super(container, "gegl:bilateral-filter");
    }
    /** Constructs a Bilateral Filter.
     *
     * Like a gaussian blur; but where the contribution for each neighbourhood pixel is also weighted by the color difference with the original center pixel. 
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Blur radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Blur radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Edge preservation
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Edge preservation
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getEdgePreservation()
    {
        return m_EdgePreservation;
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

