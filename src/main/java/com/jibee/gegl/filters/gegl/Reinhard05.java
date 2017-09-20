package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Reinhard 2005 Tone Mapping
 *
 * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This is an efficient global operator derived from simple physiological observations, producing luminance within the range 0.0-1.0
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"tonemapping"})
public class Reinhard05 extends GeglFilter implements Filter
{
    /** Constructs a Reinhard 2005 Tone Mapping.
     *
     * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This is an efficient global operator derived from simple physiological observations, producing luminance within the range 0.0-1.0
     *
     * @param container container node
     */
    public Reinhard05(GeglNode container)
    {
        super(container, "gegl:reinhard05");
    }
    /** Constructs a Reinhard 2005 Tone Mapping.
     *
     * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This is an efficient global operator derived from simple physiological observations, producing luminance within the range 0.0-1.0
     *
     * @param parent parent filter node
     */
    public Reinhard05(GeglFilter parent)
    {
        super(parent, "gegl:reinhard05");
    }

    
    /** Brightness
     *
     * Overall brightness of the image
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_Brightness  = 0.00;

    /** Brightness
     *
     * Overall brightness of the image
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Brightness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Reinhard05 setBrightness(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_Brightness = value;
        setProperty("brightness", value);
        return this;
    }

    /** Brightness
     *
     * Overall brightness of the image
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Brightness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBrightness()
    {
        return m_Brightness;
    }


    /** Chromatic adaptation
     *
     * Adaptation to color variation across the image
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Chromatic  = 0.00;

    /** Chromatic adaptation
     *
     * Adaptation to color variation across the image
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Chromatic adaptation
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Reinhard05 setChromatic(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Chromatic = value;
        setProperty("chromatic", value);
        return this;
    }

    /** Chromatic adaptation
     *
     * Adaptation to color variation across the image
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Chromatic adaptation
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getChromatic()
    {
        return m_Chromatic;
    }


    /** Light adaptation
     *
     * Adaptation to light variation across the image
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Light  = 1.00;

    /** Light adaptation
     *
     * Adaptation to light variation across the image
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Light adaptation
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Reinhard05 setLight(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Light = value;
        setProperty("light", value);
        return this;
    }

    /** Light adaptation
     *
     * Adaptation to light variation across the image
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Light adaptation
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getLight()
    {
        return m_Light;
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

