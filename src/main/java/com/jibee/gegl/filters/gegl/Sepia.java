package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Sepia
 *
 * Apply a sepia tone to the input image
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class Sepia extends GeglFilter implements Filter
{
    /** Constructs a Sepia.
     *
     * Apply a sepia tone to the input image
     *
     * @param container container node
     */
    public Sepia(GeglNode container)
    {
        super(container, "gegl:sepia");
    }
    /** Constructs a Sepia.
     *
     * Apply a sepia tone to the input image
     *
     * @param parent parent filter node
     */
    public Sepia(GeglFilter parent)
    {
        super(parent, "gegl:sepia");
    }

    
    /** Effect strength
     *
     * Strength of the sepia effect
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Scale  = 1.00;

    /** Effect strength
     *
     * Strength of the sepia effect
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Effect strength
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Sepia setScale(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Scale = value;
        setProperty("scale", value);
        return this;
    }

    /** Effect strength
     *
     * Strength of the sepia effect
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Effect strength
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getScale()
    {
        return m_Scale;
    }


    /** sRGB
     *
     * Use sRGB gamma instead of linear
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Srgb  = true;

    /** sRGB
     *
     * Use sRGB gamma instead of linear
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for sRGB
     * @return this filter (for chaining operations)
     * 
     */
    public Sepia setSrgb(boolean value)
    {
	
        m_Srgb = value;
        setProperty("srgb", value);
        return this;
    }

    /** sRGB
     *
     * Use sRGB gamma instead of linear
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of sRGB
     * 
     */
    public boolean getSrgb()
    {
        return m_Srgb;
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

