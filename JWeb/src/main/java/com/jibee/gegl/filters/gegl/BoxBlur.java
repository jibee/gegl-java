package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Box Blur
 *
 * Blur resulting from averaging the colors of a square neighbourhood.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"blur"})
public class BoxBlur extends GeglFilter
{
    /** Constructs a Box Blur.
     *
     * Blur resulting from averaging the colors of a square neighbourhood.
     */
    public BoxBlur(GeglNode container)
    {
        super(container, "gegl:box-blur");
    }
    /** Constructs a Box Blur.
     *
     * Blur resulting from averaging the colors of a square neighbourhood.
     */
    public BoxBlur(GeglFilter parent)
    {
        super(parent, "gegl:box-blur");
    }

    
    /** Radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1)
     *
     * Unit: 
     * Default value: 4
     * Acceptable Range:  1000
     * */
    private int m_Radius  = 4;

    /** Radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1)
     *
     * Unit: 
     * Default value: 4
     * Acceptable Range:  1000
     */
    public BoxBlur setRadius(int value) throws ParameterOutOfRangeException
    {
		if(value > 1000)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 1000);
	}

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1)
     *
     * Unit: 
     * Default value: 4
     * Acceptable Range:  1000
     */
    public int getRadius()
    {
        return m_Radius;
    }

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

