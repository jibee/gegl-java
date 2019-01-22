package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Rotate on center
 *
 * Rotate the buffer around its center, taking care of possible offsets.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"transform"})
public class RotateOnCenter extends GeglFilter implements Filter
{
    /** Constructs a Rotate on center.
     *
     * Rotate the buffer around its center, taking care of possible offsets.
     *
     * @param container container node
     */
    public RotateOnCenter(GeglNode container)
    {
        super(container, "gegl:rotate-on-center");
    }
    /** Constructs a Rotate on center.
     *
     * Rotate the buffer around its center, taking care of possible offsets.
     *
     * @param parent parent filter node
     */
    public RotateOnCenter(GeglFilter parent)
    {
        super(parent, "gegl:rotate-on-center");
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
    public RotateOnCenter setNearZ(double value) throws ParameterOutOfRangeException
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
    public RotateOnCenter setSampler(String value)
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


    /** Degrees
     *
     * Angle to rotate (counter-clockwise)
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Degrees  = 0.00;

    /** Degrees
     *
     * Angle to rotate (counter-clockwise)
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for Degrees
     * @return this filter (for chaining operations)
     * 
     */
    public RotateOnCenter setDegrees(double value)
    {
	
        m_Degrees = value;
        setProperty("degrees", value);
        return this;
    }

    /** Degrees
     *
     * Angle to rotate (counter-clockwise)
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of Degrees
     * 
     */
    public double getDegrees()
    {
        return m_Degrees;
    }


    /** origin-x
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_OriginX  = 0.00;

    /** origin-x
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for origin-x
     * @return this filter (for chaining operations)
     * 
     */
    public RotateOnCenter setOriginX(double value)
    {
	
        m_OriginX = value;
        setProperty("origin-x", value);
        return this;
    }

    /** origin-x
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of origin-x
     * 
     */
    public double getOriginX()
    {
        return m_OriginX;
    }


    /** origin-y
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_OriginY  = 0.00;

    /** origin-y
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for origin-y
     * @return this filter (for chaining operations)
     * 
     */
    public RotateOnCenter setOriginY(double value)
    {
	
        m_OriginY = value;
        setProperty("origin-y", value);
        return this;
    }

    /** origin-y
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of origin-y
     * 
     */
    public double getOriginY()
    {
        return m_OriginY;
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

