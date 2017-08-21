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
 * Gaussian Blur
 *
 * Performs an averaging of neighboring pixels with the normal distribution as weighting
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"blur"})
public class GaussianBlur extends GeglFilter implements Source, Sink
{
    /** Constructs a Gaussian Blur.
     *
     * Performs an averaging of neighboring pixels with the normal distribution as weighting
     *
     * @param container container node
     */
    public GaussianBlur(GeglNode container)
    {
        super(container, "gegl:gaussian-blur");
    }
    /** Constructs a Gaussian Blur.
     *
     * Performs an averaging of neighboring pixels with the normal distribution as weighting
     *
     * @param parent parent filter node
     */
    public GaussianBlur(GeglFilter parent)
    {
        super(parent, "gegl:gaussian-blur");
    }

    
    /** Size X
     *
     * Standard deviation for the horizontal axis
     *
     * Unit: pixel-distance
     * Default value: 1.50
     * Acceptable Range: 0.00 1500.00
     * */
    private double m_StdDevX  = 1.50;

    /** Size X
     *
     * Standard deviation for the horizontal axis
     *
     * Unit: pixel-distance
     * Default value: 1.50
     * Acceptable Range: 0.00 1500.00
     *
     * @param value new value for Size X
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public GaussianBlur setStdDevX(double value) throws ParameterOutOfRangeException
    {
		if(value > 1500.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1500.00);
	    }

        m_StdDevX = value;
        setProperty("std-dev-x", value);
        return this;
    }

    /** Size X
     *
     * Standard deviation for the horizontal axis
     *
     * Unit: pixel-distance
     * Default value: 1.50
     * Acceptable Range: 0.00 1500.00
     *
     * @return value of Size X
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getStdDevX()
    {
        return m_StdDevX;
    }


    /** Size Y
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: pixel-distance
     * Default value: 1.50
     * Acceptable Range: 0.00 1500.00
     * */
    private double m_StdDevY  = 1.50;

    /** Size Y
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: pixel-distance
     * Default value: 1.50
     * Acceptable Range: 0.00 1500.00
     *
     * @param value new value for Size Y
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public GaussianBlur setStdDevY(double value) throws ParameterOutOfRangeException
    {
		if(value > 1500.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1500.00);
	    }

        m_StdDevY = value;
        setProperty("std-dev-y", value);
        return this;
    }

    /** Size Y
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: pixel-distance
     * Default value: 1.50
     * Acceptable Range: 0.00 1500.00
     *
     * @return value of Size Y
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getStdDevY()
    {
        return m_StdDevY;
    }


    /** Filter
     *
     * How the gaussian kernel is discretized
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Filter ;

    /** Filter
     *
     * How the gaussian kernel is discretized
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Filter
     * @return this filter (for chaining operations)
     * 
     */
    public GaussianBlur setFilter(String value)
    {
	
        m_Filter = value;
        setProperty("filter", value);
        return this;
    }

    /** Filter
     *
     * How the gaussian kernel is discretized
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Filter
     * 
     */
    public String getFilter()
    {
        return m_Filter;
    }


    /** Abyss policy
     *
     * How image edges are handled
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_AbyssPolicy ;

    /** Abyss policy
     *
     * How image edges are handled
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Abyss policy
     * @return this filter (for chaining operations)
     * 
     */
    public GaussianBlur setAbyssPolicy(String value)
    {
	
        m_AbyssPolicy = value;
        setProperty("abyss-policy", value);
        return this;
    }

    /** Abyss policy
     *
     * How image edges are handled
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Abyss policy
     * 
     */
    public String getAbyssPolicy()
    {
        return m_AbyssPolicy;
    }


    /** Clip to the input extent
     *
     * Should the output extent be clipped to the input extent
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_ClipExtent  = true;

    /** Clip to the input extent
     *
     * Should the output extent be clipped to the input extent
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Clip to the input extent
     * @return this filter (for chaining operations)
     * 
     */
    public GaussianBlur setClipExtent(boolean value)
    {
	
        m_ClipExtent = value;
        setProperty("clip-extent", value);
        return this;
    }

    /** Clip to the input extent
     *
     * Should the output extent be clipped to the input extent
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Clip to the input extent
     * 
     */
    public boolean getClipExtent()
    {
        return m_ClipExtent;
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

