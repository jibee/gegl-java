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
 * 1D Gaussian-blur
 *
 * Performs an averaging of neighboring pixels with the normal distribution as weighting
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"hidden", "blur"})
public class Gblur1d extends GeglFilter implements Source, Sink
{
    /** Constructs a 1D Gaussian-blur.
     *
     * Performs an averaging of neighboring pixels with the normal distribution as weighting
     *
     * @param container container node
     */
    public Gblur1d(GeglNode container)
    {
        super(container, "gegl:gblur-1d");
    }
    /** Constructs a 1D Gaussian-blur.
     *
     * Performs an averaging of neighboring pixels with the normal distribution as weighting
     *
     * @param parent parent filter node
     */
    public Gblur1d(GeglFilter parent)
    {
        super(parent, "gegl:gblur-1d");
    }

    
    /** Size
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: 
     * Default value: 1.50
     * Acceptable Range: 0.00 1500.00
     * */
    private double m_StdDev  = 1.50;

    /** Size
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: 
     * Default value: 1.50
     * Acceptable Range: 0.00 1500.00
     *
     * @param value new value for Size
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Gblur1d setStdDev(double value) throws ParameterOutOfRangeException
    {
		if(value > 1500.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1500.00);
	    }

        m_StdDev = value;
        setProperty("std-dev", value);
        return this;
    }

    /** Size
     *
     * Standard deviation (spatial scale factor)
     *
     * Unit: 
     * Default value: 1.50
     * Acceptable Range: 0.00 1500.00
     *
     * @return value of Size
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getStdDev()
    {
        return m_StdDev;
    }


    /** Orientation
     *
     * The orientation of the blur - hor/ver
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Orientation ;

    /** Orientation
     *
     * The orientation of the blur - hor/ver
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Orientation
     * @return this filter (for chaining operations)
     * 
     */
    public Gblur1d setOrientation(String value)
    {
	
        m_Orientation = value;
        setProperty("orientation", value);
        return this;
    }

    /** Orientation
     *
     * The orientation of the blur - hor/ver
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Orientation
     * 
     */
    public String getOrientation()
    {
        return m_Orientation;
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
    public Gblur1d setFilter(String value)
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
    public Gblur1d setAbyssPolicy(String value)
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
    public Gblur1d setClipExtent(boolean value)
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

