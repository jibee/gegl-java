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
 * Color Temperature
 *
 * Change the color temperature of the image, from an assumed original color temperature to an intended one.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"color"})
public class ColorTemperature extends GeglFilter implements Source, Sink
{
    /** Constructs a Color Temperature.
     *
     * Change the color temperature of the image, from an assumed original color temperature to an intended one.
     *
     * @param container container node
     */
    public ColorTemperature(GeglNode container)
    {
        super(container, "gegl:color-temperature");
    }
    /** Constructs a Color Temperature.
     *
     * Change the color temperature of the image, from an assumed original color temperature to an intended one.
     *
     * @param parent parent filter node
     */
    public ColorTemperature(GeglFilter parent)
    {
        super(parent, "gegl:color-temperature");
    }

    
    /** Original temperature
     *
     * Estimated temperature of the light source in Kelvin the image was taken with.
     *
     * Unit: kelvin
     * Default value: 6500.00
     * Acceptable Range: 1000.00 12000.00
     * */
    private double m_OriginalTemperature  = 6500.00;

    /** Original temperature
     *
     * Estimated temperature of the light source in Kelvin the image was taken with.
     *
     * Unit: kelvin
     * Default value: 6500.00
     * Acceptable Range: 1000.00 12000.00
     *
     * @param value new value for Original temperature
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorTemperature setOriginalTemperature(double value) throws ParameterOutOfRangeException
    {
		if(value > 12000.00 || value < 1000.00)
	    {
	        throw new ParameterOutOfRangeException(value, 1000.00, 12000.00);
	    }

        m_OriginalTemperature = value;
        setProperty("original-temperature", value);
        return this;
    }

    /** Original temperature
     *
     * Estimated temperature of the light source in Kelvin the image was taken with.
     *
     * Unit: kelvin
     * Default value: 6500.00
     * Acceptable Range: 1000.00 12000.00
     *
     * @return value of Original temperature
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getOriginalTemperature()
    {
        return m_OriginalTemperature;
    }


    /** Intended temperature
     *
     * Corrected estimation of the temperature of the light source in Kelvin.
     *
     * Unit: kelvin
     * Default value: 6500.00
     * Acceptable Range: 1000.00 12000.00
     * */
    private double m_IntendedTemperature  = 6500.00;

    /** Intended temperature
     *
     * Corrected estimation of the temperature of the light source in Kelvin.
     *
     * Unit: kelvin
     * Default value: 6500.00
     * Acceptable Range: 1000.00 12000.00
     *
     * @param value new value for Intended temperature
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ColorTemperature setIntendedTemperature(double value) throws ParameterOutOfRangeException
    {
		if(value > 12000.00 || value < 1000.00)
	    {
	        throw new ParameterOutOfRangeException(value, 1000.00, 12000.00);
	    }

        m_IntendedTemperature = value;
        setProperty("intended-temperature", value);
        return this;
    }

    /** Intended temperature
     *
     * Corrected estimation of the temperature of the light source in Kelvin.
     *
     * Unit: kelvin
     * Default value: 6500.00
     * Acceptable Range: 1000.00 12000.00
     *
     * @return value of Intended temperature
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getIntendedTemperature()
    {
        return m_IntendedTemperature;
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

