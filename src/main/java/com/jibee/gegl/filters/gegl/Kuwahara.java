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
 * 
 *
 * Edge preserving blur
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"misc"})
public class Kuwahara extends GeglFilter implements Source, Sink
{
    /** Constructs a .
     *
     * Edge preserving blur
     */
    public Kuwahara(GeglNode container)
    {
        super(container, "gegl:kuwahara");
    }
    /** Constructs a .
     *
     * Edge preserving blur
     */
    public Kuwahara(GeglFilter parent)
    {
        super(parent, "gegl:kuwahara");
    }

    
    /** Radius
     *
     * Radius of square pixel region (width and height will be radius*2+1)
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range: 0.00 50.00
     * */
    private double m_Radius  = 10.00;

    /** Radius
     *
     * Radius of square pixel region (width and height will be radius*2+1)
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range: 0.00 50.00
     */
    public Kuwahara setRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 50.00);
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
     * Default value: 10.00
     * Acceptable Range: 0.00 50.00
     */
    public double getRadius()
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

