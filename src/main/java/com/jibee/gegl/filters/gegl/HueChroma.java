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
 * Hue-Chroma
 *
 * Adjust LCH Hue, Chroma, and Lightness
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class HueChroma extends GeglFilter implements Source, Sink
{
    /** Constructs a Hue-Chroma.
     *
     * Adjust LCH Hue, Chroma, and Lightness
     *
     * @param container container node
     */
    public HueChroma(GeglNode container)
    {
        super(container, "gegl:hue-chroma");
    }
    /** Constructs a Hue-Chroma.
     *
     * Adjust LCH Hue, Chroma, and Lightness
     *
     * @param parent parent filter node
     */
    public HueChroma(GeglFilter parent)
    {
        super(parent, "gegl:hue-chroma");
    }

    
    /** Hue
     *
     * Hue adjustment
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Hue  = 0.00;

    /** Hue
     *
     * Hue adjustment
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     *
     * @param value new value for Hue
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public HueChroma setHue(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < -180.00)
	    {
	        throw new ParameterOutOfRangeException(value, -180.00, 180.00);
	    }

        m_Hue = value;
        setProperty("hue", value);
        return this;
    }

    /** Hue
     *
     * Hue adjustment
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     *
     * @return value of Hue
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getHue()
    {
        return m_Hue;
    }


    /** Chroma
     *
     * Chroma adjustment
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_Chroma  = 0.00;

    /** Chroma
     *
     * Chroma adjustment
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Chroma
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public HueChroma setChroma(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_Chroma = value;
        setProperty("chroma", value);
        return this;
    }

    /** Chroma
     *
     * Chroma adjustment
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Chroma
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getChroma()
    {
        return m_Chroma;
    }


    /** Lightness
     *
     * Lightness adjustment
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_Lightness  = 0.00;

    /** Lightness
     *
     * Lightness adjustment
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Lightness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public HueChroma setLightness(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_Lightness = value;
        setProperty("lightness", value);
        return this;
    }

    /** Lightness
     *
     * Lightness adjustment
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Lightness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getLightness()
    {
        return m_Lightness;
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

