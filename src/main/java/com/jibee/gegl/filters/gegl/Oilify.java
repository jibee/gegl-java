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
 * Oilify
 *
 * Emulate an oil painting
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"artistic"})
public class Oilify extends GeglFilter implements Source, Sink
{
    /** Constructs a Oilify.
     *
     * Emulate an oil painting
     *
     * @param container container node
     */
    public Oilify(GeglNode container)
    {
        super(container, "gegl:oilify");
    }
    /** Constructs a Oilify.
     *
     * Emulate an oil painting
     *
     * @param parent parent filter node
     */
    public Oilify(GeglFilter parent)
    {
        super(parent, "gegl:oilify");
    }

    
    /** Mask Radius
     *
     * Radius of circle around pixel
     *
     * Unit: pixel-distance
     * Default value: 4
     * Acceptable Range: 1 100
     * */
    private int m_MaskRadius  = 4;

    /** Mask Radius
     *
     * Radius of circle around pixel
     *
     * Unit: pixel-distance
     * Default value: 4
     * Acceptable Range: 1 100
     *
     * @param value new value for Mask Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Oilify setMaskRadius(int value) throws ParameterOutOfRangeException
    {
		if(value > 100 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 100);
	    }

        m_MaskRadius = value;
        setProperty("mask-radius", value);
        return this;
    }

    /** Mask Radius
     *
     * Radius of circle around pixel
     *
     * Unit: pixel-distance
     * Default value: 4
     * Acceptable Range: 1 100
     *
     * @return value of Mask Radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getMaskRadius()
    {
        return m_MaskRadius;
    }


    /** Exponent
     *
     * 
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 20
     * */
    private int m_Exponent  = 8;

    /** Exponent
     *
     * 
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 20
     *
     * @param value new value for Exponent
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Oilify setExponent(int value) throws ParameterOutOfRangeException
    {
		if(value > 20 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 20);
	    }

        m_Exponent = value;
        setProperty("exponent", value);
        return this;
    }

    /** Exponent
     *
     * 
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 20
     *
     * @return value of Exponent
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getExponent()
    {
        return m_Exponent;
    }


    /** Number of intensities
     *
     * Histogram size
     *
     * Unit: 
     * Default value: 128
     * Acceptable Range: 8 256
     * */
    private int m_Intensities  = 128;

    /** Number of intensities
     *
     * Histogram size
     *
     * Unit: 
     * Default value: 128
     * Acceptable Range: 8 256
     *
     * @param value new value for Number of intensities
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Oilify setIntensities(int value) throws ParameterOutOfRangeException
    {
		if(value > 256 || value < 8)
	    {
	        throw new ParameterOutOfRangeException(value, 8, 256);
	    }

        m_Intensities = value;
        setProperty("intensities", value);
        return this;
    }

    /** Number of intensities
     *
     * Histogram size
     *
     * Unit: 
     * Default value: 128
     * Acceptable Range: 8 256
     *
     * @return value of Number of intensities
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getIntensities()
    {
        return m_Intensities;
    }


    /** Intensity Mode
     *
     * Use pixel luminance values
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_UseInten  = true;

    /** Intensity Mode
     *
     * Use pixel luminance values
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Intensity Mode
     * @return this filter (for chaining operations)
     * 
     */
    public Oilify setUseInten(boolean value)
    {
	
        m_UseInten = value;
        setProperty("use-inten", value);
        return this;
    }

    /** Intensity Mode
     *
     * Use pixel luminance values
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Intensity Mode
     * 
     */
    public boolean getUseInten()
    {
        return m_UseInten;
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

