package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Scale size keep aspect
 *
 * Scales the buffer to a size, preserving aspect ratio
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"transform"})
public class ScaleSizeKeepaspect extends GeglFilter implements Filter
{
    /** Constructs a Scale size keep aspect.
     *
     * Scales the buffer to a size, preserving aspect ratio
     *
     * @param container container node
     */
    public ScaleSizeKeepaspect(GeglNode container)
    {
        super(container, "gegl:scale-size-keepaspect");
    }
    /** Constructs a Scale size keep aspect.
     *
     * Scales the buffer to a size, preserving aspect ratio
     *
     * @param parent parent filter node
     */
    public ScaleSizeKeepaspect(GeglFilter parent)
    {
        super(parent, "gegl:scale-size-keepaspect");
    }

    
    /** Origin-x
     *
     * X coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_OriginX  = 0.00;

    /** Origin-x
     *
     * X coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for Origin-x
     * @return this filter (for chaining operations)
     * 
     */
    public ScaleSizeKeepaspect setOriginX(double value)
    {
	
        m_OriginX = value;
        setProperty("origin-x", value);
        return this;
    }

    /** Origin-x
     *
     * X coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of Origin-x
     * 
     */
    public double getOriginX()
    {
        return m_OriginX;
    }


    /** Origin-y
     *
     * Y coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_OriginY  = 0.00;

    /** Origin-y
     *
     * Y coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for Origin-y
     * @return this filter (for chaining operations)
     * 
     */
    public ScaleSizeKeepaspect setOriginY(double value)
    {
	
        m_OriginY = value;
        setProperty("origin-y", value);
        return this;
    }

    /** Origin-y
     *
     * Y coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of Origin-y
     * 
     */
    public double getOriginY()
    {
        return m_OriginY;
    }


    /** Near-z
     *
     * Z coordinate of the near clipping plane
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_NearZ  = 0.00;

    /** Near-z
     *
     * Z coordinate of the near clipping plane
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Near-z
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ScaleSizeKeepaspect setNearZ(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_NearZ = value;
        setProperty("near-z", value);
        return this;
    }

    /** Near-z
     *
     * Z coordinate of the near clipping plane
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Near-z
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getNearZ()
    {
        return m_NearZ;
    }


    /** Sampler
     *
     * Sampler used internally
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Sampler ;

    /** Sampler
     *
     * Sampler used internally
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Sampler
     * @return this filter (for chaining operations)
     * 
     */
    public ScaleSizeKeepaspect setSampler(String value)
    {
	
        m_Sampler = value;
        setProperty("sampler", value);
        return this;
    }

    /** Sampler
     *
     * Sampler used internally
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Sampler
     * 
     */
    public String getSampler()
    {
        return m_Sampler;
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
    public ScaleSizeKeepaspect setAbyssPolicy(String value)
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


    /** X
     *
     * Horizontal size
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -9000.00 9000.00
     * */
    private double m_X  = -1.00;

    /** X
     *
     * Horizontal size
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -9000.00 9000.00
     *
     * @param value new value for X
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ScaleSizeKeepaspect setX(double value) throws ParameterOutOfRangeException
    {
		if(value > 9000.00 || value < -9000.00)
	    {
	        throw new ParameterOutOfRangeException(value, -9000.00, 9000.00);
	    }

        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** X
     *
     * Horizontal size
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -9000.00 9000.00
     *
     * @return value of X
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getX()
    {
        return m_X;
    }


    /** Y
     *
     * Vertical size
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -9000.00 9000.00
     * */
    private double m_Y  = -1.00;

    /** Y
     *
     * Vertical size
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -9000.00 9000.00
     *
     * @param value new value for Y
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ScaleSizeKeepaspect setY(double value) throws ParameterOutOfRangeException
    {
		if(value > 9000.00 || value < -9000.00)
	    {
	        throw new ParameterOutOfRangeException(value, -9000.00, 9000.00);
	    }

        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Y
     *
     * Vertical size
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -9000.00 9000.00
     *
     * @return value of Y
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getY()
    {
        return m_Y;
    }

    @Override
    public InputPad<ScaleSizeKeepaspect> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ScaleSizeKeepaspect> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

