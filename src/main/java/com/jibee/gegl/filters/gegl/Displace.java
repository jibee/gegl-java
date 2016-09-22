package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;

/**
 * Displace
 *
 * Displace pixels as indicated by displacement maps
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"map"})
public class Displace extends GeglFilter implements Source, DualSink
{
    /** Constructs a Displace.
     *
     * Displace pixels as indicated by displacement maps
     */
    public Displace(GeglNode container)
    {
        super(container, "gegl:displace");
    }
    /** Constructs a Displace.
     *
     * Displace pixels as indicated by displacement maps
     */
    public Displace(GeglFilter parent)
    {
        super(parent, "gegl:displace");
    }

    
    /** Displacement mode
     *
     * Mode of displacement
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_DisplaceMode ;

    /** Displacement mode
     *
     * Mode of displacement
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Displace setDisplaceMode(String value)
    {
	
        m_DisplaceMode = value;
        setProperty("displace-mode", value);
        return this;
    }

    /** Displacement mode
     *
     * Mode of displacement
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getDisplaceMode()
    {
        return m_DisplaceMode;
    }


    /** Sampler
     *
     * Type of GeglSampler used to fetch input pixels
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_SamplerType ;

    /** Sampler
     *
     * Type of GeglSampler used to fetch input pixels
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Displace setSamplerType(String value)
    {
	
        m_SamplerType = value;
        setProperty("sampler-type", value);
        return this;
    }

    /** Sampler
     *
     * Type of GeglSampler used to fetch input pixels
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getSamplerType()
    {
        return m_SamplerType;
    }


    /** Abyss policy
     *
     * How image edges are handled
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_AbyssPolicy ;

    /** Abyss policy
     *
     * How image edges are handled
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Displace setAbyssPolicy(String value)
    {
	
        m_AbyssPolicy = value;
        setProperty("abyss-policy", value);
        return this;
    }

    /** Abyss policy
     *
     * How image edges are handled
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getAbyssPolicy()
    {
        return m_AbyssPolicy;
    }


    /** X displacement
     *
     * Displace multiplier for X or radial direction
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     * */
    private double m_AmountX  = 0.00;

    /** X displacement
     *
     * Displace multiplier for X or radial direction
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     */
    public Displace setAmountX(double value) throws ParameterOutOfRangeException
    {
		if(value > 500.00 || value < -500.00)
	{
	    throw new ParameterOutOfRangeException(value, -500.00, 500.00);
	}

        m_AmountX = value;
        setProperty("amount-x", value);
        return this;
    }

    /** X displacement
     *
     * Displace multiplier for X or radial direction
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     */
    public double getAmountX()
    {
        return m_AmountX;
    }


    /** Y displacement
     *
     * Displace multiplier for Y or tangent (degrees) direction
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     * */
    private double m_AmountY  = 0.00;

    /** Y displacement
     *
     * Displace multiplier for Y or tangent (degrees) direction
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     */
    public Displace setAmountY(double value) throws ParameterOutOfRangeException
    {
		if(value > 500.00 || value < -500.00)
	{
	    throw new ParameterOutOfRangeException(value, -500.00, 500.00);
	}

        m_AmountY = value;
        setProperty("amount-y", value);
        return this;
    }

    /** Y displacement
     *
     * Displace multiplier for Y or tangent (degrees) direction
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     */
    public double getAmountY()
    {
        return m_AmountY;
    }

    public InputPad Aux2()
    {
        return new InputPad(this, "aux2");
    }

    @Override
    public InputPad Aux()
    {
        return new InputPad(this, "aux");
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
