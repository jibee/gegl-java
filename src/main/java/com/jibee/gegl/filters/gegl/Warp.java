package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.GeglVector;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Warp
 *
 * Compute a relative displacement mapping from a stroke
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="", opencl=false, position_dependant=true, categories={"transform"})
public class Warp extends GeglFilter implements Source, Sink
{
    /** Constructs a Warp.
     *
     * Compute a relative displacement mapping from a stroke
     */
    public Warp(GeglNode container)
    {
        super(container, "gegl:warp");
    }
    /** Constructs a Warp.
     *
     * Compute a relative displacement mapping from a stroke
     */
    public Warp(GeglFilter parent)
    {
        super(parent, "gegl:warp");
    }

    
    /** Strength
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_Strength  = 50.00;

    /** Strength
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     */
    public Warp setStrength(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	}

        m_Strength = value;
        setProperty("strength", value);
        return this;
    }

    /** Strength
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     */
    public double getStrength()
    {
        return m_Strength;
    }


    /** Size
     *
     * 
     *
     * Unit: 
     * Default value: 40.00
     * Acceptable Range: 1.00 10000.00
     * */
    private double m_Size  = 40.00;

    /** Size
     *
     * 
     *
     * Unit: 
     * Default value: 40.00
     * Acceptable Range: 1.00 10000.00
     */
    public Warp setSize(double value) throws ParameterOutOfRangeException
    {
		if(value > 10000.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 10000.00);
	}

        m_Size = value;
        setProperty("size", value);
        return this;
    }

    /** Size
     *
     * 
     *
     * Unit: 
     * Default value: 40.00
     * Acceptable Range: 1.00 10000.00
     */
    public double getSize()
    {
        return m_Size;
    }


    /** Hardness
     *
     * 
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Hardness  = 0.50;

    /** Hardness
     *
     * 
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     */
    public Warp setHardness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Hardness = value;
        setProperty("hardness", value);
        return this;
    }

    /** Hardness
     *
     * 
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     */
    public double getHardness()
    {
        return m_Hardness;
    }


    /** Stroke
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private GeglVector m_Stroke ;

    /** Stroke
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Warp setStroke(GeglVector value)
    {
	
        m_Stroke = value;
        setProperty("stroke", value);
        return this;
    }

    /** Stroke
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public GeglVector getStroke()
    {
        return m_Stroke;
    }


    /** Behavior
     *
     * Behavior of the op
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Behavior ;

    /** Behavior
     *
     * Behavior of the op
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Warp setBehavior(String value)
    {
	
        m_Behavior = value;
        setProperty("behavior", value);
        return this;
    }

    /** Behavior
     *
     * Behavior of the op
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getBehavior()
    {
        return m_Behavior;
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

