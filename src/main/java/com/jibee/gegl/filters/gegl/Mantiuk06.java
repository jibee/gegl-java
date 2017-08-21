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
 * Mantiuk 2006 Tone Mapping
 *
 * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator constrains contrasts across multiple spatial frequencies, producing luminance within the range 0.0-1.0
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"tonemapping"})
public class Mantiuk06 extends GeglFilter implements Source, Sink
{
    /** Constructs a Mantiuk 2006 Tone Mapping.
     *
     * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator constrains contrasts across multiple spatial frequencies, producing luminance within the range 0.0-1.0
     *
     * @param container container node
     */
    public Mantiuk06(GeglNode container)
    {
        super(container, "gegl:mantiuk06");
    }
    /** Constructs a Mantiuk 2006 Tone Mapping.
     *
     * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator constrains contrasts across multiple spatial frequencies, producing luminance within the range 0.0-1.0
     *
     * @param parent parent filter node
     */
    public Mantiuk06(GeglFilter parent)
    {
        super(parent, "gegl:mantiuk06");
    }

    
    /** Contrast
     *
     * The amount of contrast compression
     *
     * Unit: 
     * Default value: 0.10
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Contrast  = 0.10;

    /** Contrast
     *
     * The amount of contrast compression
     *
     * Unit: 
     * Default value: 0.10
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Contrast
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mantiuk06 setContrast(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Contrast = value;
        setProperty("contrast", value);
        return this;
    }

    /** Contrast
     *
     * The amount of contrast compression
     *
     * Unit: 
     * Default value: 0.10
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Contrast
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getContrast()
    {
        return m_Contrast;
    }


    /** Saturation
     *
     * Global color saturation factor
     *
     * Unit: 
     * Default value: 0.80
     * Acceptable Range: 0.00 2.00
     * */
    private double m_Saturation  = 0.80;

    /** Saturation
     *
     * Global color saturation factor
     *
     * Unit: 
     * Default value: 0.80
     * Acceptable Range: 0.00 2.00
     *
     * @param value new value for Saturation
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mantiuk06 setSaturation(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 2.00);
	    }

        m_Saturation = value;
        setProperty("saturation", value);
        return this;
    }

    /** Saturation
     *
     * Global color saturation factor
     *
     * Unit: 
     * Default value: 0.80
     * Acceptable Range: 0.00 2.00
     *
     * @return value of Saturation
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getSaturation()
    {
        return m_Saturation;
    }


    /** Detail
     *
     * Level of emphasis on image gradient details
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 1.00 99.00
     * */
    private double m_Detail  = 1.00;

    /** Detail
     *
     * Level of emphasis on image gradient details
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 1.00 99.00
     *
     * @param value new value for Detail
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mantiuk06 setDetail(double value) throws ParameterOutOfRangeException
    {
		if(value > 99.00 || value < 1.00)
	    {
	        throw new ParameterOutOfRangeException(value, 1.00, 99.00);
	    }

        m_Detail = value;
        setProperty("detail", value);
        return this;
    }

    /** Detail
     *
     * Level of emphasis on image gradient details
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 1.00 99.00
     *
     * @return value of Detail
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getDetail()
    {
        return m_Detail;
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

