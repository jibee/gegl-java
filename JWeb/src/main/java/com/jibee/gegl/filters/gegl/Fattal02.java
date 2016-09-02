package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Fattal et al. 2002 Tone Mapping
 *
 * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator attenuates the magnitudes of local image gradients, producing luminance within the range 0.0-1.0. This tonemapping approach was originally presented by Raanan Fattal, in the 2002 SIGGRAPH paper: Gradient Domain High Dynamic Range Compression.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"tonemapping", "enhance"})
public class Fattal02 extends GeglFilter
{
    /** Constructs a Fattal et al. 2002 Tone Mapping.
     *
     * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator attenuates the magnitudes of local image gradients, producing luminance within the range 0.0-1.0. This tonemapping approach was originally presented by Raanan Fattal, in the 2002 SIGGRAPH paper: Gradient Domain High Dynamic Range Compression.
     */
    public Fattal02(GeglNode container)
    {
        super(container, "gegl:fattal02");
    }
    /** Constructs a Fattal et al. 2002 Tone Mapping.
     *
     * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator attenuates the magnitudes of local image gradients, producing luminance within the range 0.0-1.0. This tonemapping approach was originally presented by Raanan Fattal, in the 2002 SIGGRAPH paper: Gradient Domain High Dynamic Range Compression.
     */
    public Fattal02(GeglFilter parent)
    {
        super(parent, "gegl:fattal02");
    }

    
    /** Alpha
     *
     * Gradient threshold for detail enhancement
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     * */
    private double m_Alpha  = 1.00;

    /** Alpha
     *
     * Gradient threshold for detail enhancement
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public Fattal02 setAlpha(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 2.00);
	}

        m_Alpha = value;
        setProperty("alpha", value);
        return this;
    }

    /** Alpha
     *
     * Gradient threshold for detail enhancement
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public double getAlpha()
    {
        return m_Alpha;
    }


    /** Beta
     *
     * Strength of local detail enhancement
     *
     * Unit: 
     * Default value: 0.90
     * Acceptable Range: 0.10 2.00
     * */
    private double m_Beta  = 0.90;

    /** Beta
     *
     * Strength of local detail enhancement
     *
     * Unit: 
     * Default value: 0.90
     * Acceptable Range: 0.10 2.00
     */
    public Fattal02 setBeta(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.10)
	{
	    throw new ParameterOutOfRangeException(value, 0.10, 2.00);
	}

        m_Beta = value;
        setProperty("beta", value);
        return this;
    }

    /** Beta
     *
     * Strength of local detail enhancement
     *
     * Unit: 
     * Default value: 0.90
     * Acceptable Range: 0.10 2.00
     */
    public double getBeta()
    {
        return m_Beta;
    }


    /** Saturation
     *
     * Global color saturation factor
     *
     * Unit: 
     * Default value: 0.80
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Saturation  = 0.80;

    /** Saturation
     *
     * Global color saturation factor
     *
     * Unit: 
     * Default value: 0.80
     * Acceptable Range: 0.00 1.00
     */
    public Fattal02 setSaturation(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
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
     * Acceptable Range: 0.00 1.00
     */
    public double getSaturation()
    {
        return m_Saturation;
    }


    /** Noise
     *
     * Gradient threshold for lowering detail enhancement
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Noise  = 0.00;

    /** Noise
     *
     * Gradient threshold for lowering detail enhancement
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public Fattal02 setNoise(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Noise = value;
        setProperty("noise", value);
        return this;
    }

    /** Noise
     *
     * Gradient threshold for lowering detail enhancement
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public double getNoise()
    {
        return m_Noise;
    }

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

