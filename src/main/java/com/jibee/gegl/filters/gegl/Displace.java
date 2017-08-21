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
     *
     * @param container container node
     */
    public Displace(GeglNode container)
    {
        super(container, "gegl:displace");
    }
    /** Constructs a Displace.
     *
     * Displace pixels as indicated by displacement maps
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Displacement mode
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Displacement mode
     * 
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
     *
     * @param value new value for Sampler
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Sampler
     * 
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
     *
     * @param value new value for Abyss policy
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Abyss policy
     * 
     */
    public String getAbyssPolicy()
    {
        return m_AbyssPolicy;
    }


    /** [displace-mode {cartesian} : cartesian-label, displace-mode {polar}     : polar-label]
     *
     * [displace-mode {cartesian} : cartesian-description, displace-mode {polar}     : polar-description]
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     * */
    private double m_AmountX  = 0.00;

    /** [displace-mode {cartesian} : cartesian-label, displace-mode {polar}     : polar-label]
     *
     * [displace-mode {cartesian} : cartesian-description, displace-mode {polar}     : polar-description]
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     *
     * @param value new value for [displace-mode {cartesian} : cartesian-label, displace-mode {polar}     : polar-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

    /** [displace-mode {cartesian} : cartesian-label, displace-mode {polar}     : polar-label]
     *
     * [displace-mode {cartesian} : cartesian-description, displace-mode {polar}     : polar-description]
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     *
     * @return value of [displace-mode {cartesian} : cartesian-label, displace-mode {polar}     : polar-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getAmountX()
    {
        return m_AmountX;
    }


    /** [displace-mode {cartesian} : cartesian-label, displace-mode {polar}     : polar-label]
     *
     * [displace-mode {cartesian} : cartesian-description, displace-mode {polar}     : polar-description]
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     * */
    private double m_AmountY  = 0.00;

    /** [displace-mode {cartesian} : cartesian-label, displace-mode {polar}     : polar-label]
     *
     * [displace-mode {cartesian} : cartesian-description, displace-mode {polar}     : polar-description]
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     *
     * @param value new value for [displace-mode {cartesian} : cartesian-label, displace-mode {polar}     : polar-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

    /** [displace-mode {cartesian} : cartesian-label, displace-mode {polar}     : polar-label]
     *
     * [displace-mode {cartesian} : cartesian-description, displace-mode {polar}     : polar-description]
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range: -500.00 500.00
     *
     * @return value of [displace-mode {cartesian} : cartesian-label, displace-mode {polar}     : polar-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getAmountY()
    {
        return m_AmountY;
    }


    /** Center displacement
     *
     * Center the displacement around a specified point
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Center  = false;

    /** Center displacement
     *
     * Center the displacement around a specified point
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Center displacement
     * @return this filter (for chaining operations)
     * 
     */
    public Displace setCenter(boolean value)
    {
	
        m_Center = value;
        setProperty("center", value);
        return this;
    }

    /** Center displacement
     *
     * Center the displacement around a specified point
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Center displacement
     * 
     */
    public boolean getCenter()
    {
        return m_Center;
    }


    /** Center X
     *
     * X coordinate of the displacement center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_CenterX  = 0.50;

    /** Center X
     *
     * X coordinate of the displacement center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @param value new value for Center X
     * @return this filter (for chaining operations)
     * 
     */
    public Displace setCenterX(double value)
    {
	
        m_CenterX = value;
        setProperty("center-x", value);
        return this;
    }

    /** Center X
     *
     * X coordinate of the displacement center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @return value of Center X
     * 
     */
    public double getCenterX()
    {
        return m_CenterX;
    }


    /** Center Y
     *
     * Y coordinate of the displacement center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_CenterY  = 0.50;

    /** Center Y
     *
     * Y coordinate of the displacement center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @param value new value for Center Y
     * @return this filter (for chaining operations)
     * 
     */
    public Displace setCenterY(double value)
    {
	
        m_CenterY = value;
        setProperty("center-y", value);
        return this;
    }

    /** Center Y
     *
     * Y coordinate of the displacement center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @return value of Center Y
     * 
     */
    public double getCenterY()
    {
        return m_CenterY;
    }

    /** Obtains the InputPad named aux2.
    * 
    * @return the InputPad named aux2
    */
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

