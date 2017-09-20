package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Softglow
 *
 * Simulate glow by making highlights intense and fuzzy
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"artistic"})
public class Softglow extends GeglFilter implements Filter
{
    /** Constructs a Softglow.
     *
     * Simulate glow by making highlights intense and fuzzy
     *
     * @param container container node
     */
    public Softglow(GeglNode container)
    {
        super(container, "gegl:softglow");
    }
    /** Constructs a Softglow.
     *
     * Simulate glow by making highlights intense and fuzzy
     *
     * @param parent parent filter node
     */
    public Softglow(GeglFilter parent)
    {
        super(parent, "gegl:softglow");
    }

    
    /** Glow radius
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 1.00 50.00
     * */
    private double m_GlowRadius  = 10.00;

    /** Glow radius
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 1.00 50.00
     *
     * @param value new value for Glow radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Softglow setGlowRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < 1.00)
	    {
	        throw new ParameterOutOfRangeException(value, 1.00, 50.00);
	    }

        m_GlowRadius = value;
        setProperty("glow-radius", value);
        return this;
    }

    /** Glow radius
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range: 1.00 50.00
     *
     * @return value of Glow radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getGlowRadius()
    {
        return m_GlowRadius;
    }


    /** Brightness
     *
     * 
     *
     * Unit: 
     * Default value: 0.30
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Brightness  = 0.30;

    /** Brightness
     *
     * 
     *
     * Unit: 
     * Default value: 0.30
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Brightness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Softglow setBrightness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Brightness = value;
        setProperty("brightness", value);
        return this;
    }

    /** Brightness
     *
     * 
     *
     * Unit: 
     * Default value: 0.30
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Brightness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBrightness()
    {
        return m_Brightness;
    }


    /** Sharpness
     *
     * 
     *
     * Unit: 
     * Default value: 0.85
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Sharpness  = 0.85;

    /** Sharpness
     *
     * 
     *
     * Unit: 
     * Default value: 0.85
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Sharpness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Softglow setSharpness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Sharpness = value;
        setProperty("sharpness", value);
        return this;
    }

    /** Sharpness
     *
     * 
     *
     * Unit: 
     * Default value: 0.85
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Sharpness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getSharpness()
    {
        return m_Sharpness;
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

