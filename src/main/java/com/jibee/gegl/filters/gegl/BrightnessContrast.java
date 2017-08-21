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
 * Brightness Contrast
 *
 * Changes the light level and contrast. This operation operates in linear light, 'contrast' is a scale factor around 50%% gray, and 'brightness' a constant offset to apply after contrast scaling.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class BrightnessContrast extends GeglFilter implements Source, Sink
{
    /** Constructs a Brightness Contrast.
     *
     * Changes the light level and contrast. This operation operates in linear light, 'contrast' is a scale factor around 50%% gray, and 'brightness' a constant offset to apply after contrast scaling.
     *
     * @param container container node
     */
    public BrightnessContrast(GeglNode container)
    {
        super(container, "gegl:brightness-contrast");
    }
    /** Constructs a Brightness Contrast.
     *
     * Changes the light level and contrast. This operation operates in linear light, 'contrast' is a scale factor around 50%% gray, and 'brightness' a constant offset to apply after contrast scaling.
     *
     * @param parent parent filter node
     */
    public BrightnessContrast(GeglFilter parent)
    {
        super(parent, "gegl:brightness-contrast");
    }

    
    /** Contrast
     *
     * Magnitude of contrast scaling >1.0 brighten < 1.0 darken
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -5.00 5.00
     * */
    private double m_Contrast  = 1.00;

    /** Contrast
     *
     * Magnitude of contrast scaling >1.0 brighten < 1.0 darken
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -5.00 5.00
     *
     * @param value new value for Contrast
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public BrightnessContrast setContrast(double value) throws ParameterOutOfRangeException
    {
		if(value > 5.00 || value < -5.00)
	    {
	        throw new ParameterOutOfRangeException(value, -5.00, 5.00);
	    }

        m_Contrast = value;
        setProperty("contrast", value);
        return this;
    }

    /** Contrast
     *
     * Magnitude of contrast scaling >1.0 brighten < 1.0 darken
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -5.00 5.00
     *
     * @return value of Contrast
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getContrast()
    {
        return m_Contrast;
    }


    /** Brightness
     *
     * Amount to increase brightness
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -3.00 3.00
     * */
    private double m_Brightness  = 0.00;

    /** Brightness
     *
     * Amount to increase brightness
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -3.00 3.00
     *
     * @param value new value for Brightness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public BrightnessContrast setBrightness(double value) throws ParameterOutOfRangeException
    {
		if(value > 3.00 || value < -3.00)
	    {
	        throw new ParameterOutOfRangeException(value, -3.00, 3.00);
	    }

        m_Brightness = value;
        setProperty("brightness", value);
        return this;
    }

    /** Brightness
     *
     * Amount to increase brightness
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -3.00 3.00
     *
     * @return value of Brightness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBrightness()
    {
        return m_Brightness;
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

