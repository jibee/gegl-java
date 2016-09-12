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
 * Clip RGB
 *
 * Keep RGB pixels values inside a specific range
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class RgbClip extends GeglFilter implements Source, Sink
{
    /** Constructs a Clip RGB.
     *
     * Keep RGB pixels values inside a specific range
     */
    public RgbClip(GeglNode container)
    {
        super(container, "gegl:rgb-clip");
    }
    /** Constructs a Clip RGB.
     *
     * Keep RGB pixels values inside a specific range
     */
    public RgbClip(GeglFilter parent)
    {
        super(parent, "gegl:rgb-clip");
    }

    
    /** Clip low pixel values
     *
     * Clip low pixel values
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_ClipLow  = true;

    /** Clip low pixel values
     *
     * Clip low pixel values
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public RgbClip setClipLow(boolean value)
    {
	
        m_ClipLow = value;
        setProperty("clip-low", value);
        return this;
    }

    /** Clip low pixel values
     *
     * Clip low pixel values
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getClipLow()
    {
        return m_ClipLow;
    }


    /** Low limit
     *
     * Pixels values lower than this limit will be set to it
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  0.00
     * */
    private double m_LowLimit  = 0.00;

    /** Low limit
     *
     * Pixels values lower than this limit will be set to it
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  0.00
     */
    public RgbClip setLowLimit(double value) throws ParameterOutOfRangeException
    {
		if(value > 0.00)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 0.00);
	}

        m_LowLimit = value;
        setProperty("low-limit", value);
        return this;
    }

    /** Low limit
     *
     * Pixels values lower than this limit will be set to it
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  0.00
     */
    public double getLowLimit()
    {
        return m_LowLimit;
    }


    /** Clip high pixel values
     *
     * Clip high pixel values
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_ClipHigh  = true;

    /** Clip high pixel values
     *
     * Clip high pixel values
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public RgbClip setClipHigh(boolean value)
    {
	
        m_ClipHigh = value;
        setProperty("clip-high", value);
        return this;
    }

    /** Clip high pixel values
     *
     * Clip high pixel values
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getClipHigh()
    {
        return m_ClipHigh;
    }


    /** High limit
     *
     * Pixels values higher than this limit will be set to it
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 1.00 
     * */
    private double m_HighLimit  = 1.00;

    /** High limit
     *
     * Pixels values higher than this limit will be set to it
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 1.00 
     */
    public RgbClip setHighLimit(double value) throws ParameterOutOfRangeException
    {
		if(value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, Double.POSITIVE_INFINITY);
	}

        m_HighLimit = value;
        setProperty("high-limit", value);
        return this;
    }

    /** High limit
     *
     * Pixels values higher than this limit will be set to it
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 1.00 
     */
    public double getHighLimit()
    {
        return m_HighLimit;
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

