package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.GeglVector;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Warp
 *
 * Compute a relative displacement mapping from a stroke
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"transform"})
public class Warp extends GeglFilter implements Filter
{
    /** Constructs a Warp.
     *
     * Compute a relative displacement mapping from a stroke
     *
     * @param container container node
     */
    public Warp(GeglNode container)
    {
        super(container, "gegl:warp");
    }
    /** Constructs a Warp.
     *
     * Compute a relative displacement mapping from a stroke
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Strength
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Strength
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Size
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Size
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Hardness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Hardness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getHardness()
    {
        return m_Hardness;
    }


    /** Spacing
     *
     * 
     *
     * Unit: 
     * Default value: 0.01
     * Acceptable Range: 0.00 100.00
     * */
    private double m_Spacing  = 0.01;

    /** Spacing
     *
     * 
     *
     * Unit: 
     * Default value: 0.01
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Spacing
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Warp setSpacing(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_Spacing = value;
        setProperty("spacing", value);
        return this;
    }

    /** Spacing
     *
     * 
     *
     * Unit: 
     * Default value: 0.01
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Spacing
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getSpacing()
    {
        return m_Spacing;
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
     *
     * @param value new value for Stroke
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Stroke
     * 
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
     *
     * @param value new value for Behavior
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Behavior
     * 
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

