package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Fattal et al. 2002 Tone Mapping
 *
 * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator attenuates the magnitudes of local image gradients, producing luminance within the range 0.0-1.0. This tonemapping approach was originally presented by Raanan Fattal, in the 2002 SIGGRAPH paper: Gradient Domain High Dynamic Range Compression.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"tonemapping", "enhance"})
public class Fattal02 extends GeglFilter implements Filter
{
    /** Constructs a Fattal et al. 2002 Tone Mapping.
     *
     * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator attenuates the magnitudes of local image gradients, producing luminance within the range 0.0-1.0. This tonemapping approach was originally presented by Raanan Fattal, in the 2002 SIGGRAPH paper: Gradient Domain High Dynamic Range Compression.
     *
     * @param container container node
     */
    public Fattal02(GeglNode container)
    {
        super(container, "gegl:fattal02");
    }
    /** Constructs a Fattal et al. 2002 Tone Mapping.
     *
     * Adapt an image, which may have a high dynamic range, for presentation using a low dynamic range. This operator attenuates the magnitudes of local image gradients, producing luminance within the range 0.0-1.0. This tonemapping approach was originally presented by Raanan Fattal, in the 2002 SIGGRAPH paper: Gradient Domain High Dynamic Range Compression.
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Alpha
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Alpha
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Beta
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Beta
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Saturation
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Saturation
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Noise
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Noise
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getNoise()
    {
        return m_Noise;
    }

    @Override
    public InputPad<Fattal02> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Fattal02> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

