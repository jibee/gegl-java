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
 * Median Blur
 *
 * Blur resulting from computing the median color of in a square neighbourhood.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"blur"})
public class MedianBlur extends GeglFilter implements Source, Sink
{
    /** Constructs a Median Blur.
     *
     * Blur resulting from computing the median color of in a square neighbourhood.
     */
    public MedianBlur(GeglNode container)
    {
        super(container, "gegl:median-blur");
    }
    /** Constructs a Median Blur.
     *
     * Blur resulting from computing the median color of in a square neighbourhood.
     */
    public MedianBlur(GeglFilter parent)
    {
        super(parent, "gegl:median-blur");
    }

    
    /** Radius
     *
     * Radius of square pixel region (width and height will be radius*2+1)
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 100
     * */
    private int m_Radius  = 3;

    /** Radius
     *
     * Radius of square pixel region (width and height will be radius*2+1)
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 100
     */
    public MedianBlur setRadius(int value) throws ParameterOutOfRangeException
    {
		if(value > 100 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 100);
	}

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * Radius of square pixel region (width and height will be radius*2+1)
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 100
     */
    public int getRadius()
    {
        return m_Radius;
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

