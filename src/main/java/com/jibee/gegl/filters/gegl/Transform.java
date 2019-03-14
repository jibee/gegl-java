package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Transform
 *
 * Do a transformation using SVG syntax transformation.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"transform"})
public class Transform extends GeglFilter implements Filter
{
    /** Constructs a Transform.
     *
     * Do a transformation using SVG syntax transformation.
     *
     * @param container container node
     */
    public Transform(GeglNode container)
    {
        super(container, "gegl:transform");
    }
    /** Constructs a Transform.
     *
     * Do a transformation using SVG syntax transformation.
     *
     * @param parent parent filter node
     */
    public Transform(GeglFilter parent)
    {
        super(parent, "gegl:transform");
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
    public Transform setOriginX(double value)
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
    public Transform setOriginY(double value)
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
    public Transform setNearZ(double value) throws ParameterOutOfRangeException
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
    public Transform setSampler(String value)
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


    /** Transform
     *
     * Transformation SVG syntax transformation string
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Transform ;

    /** Transform
     *
     * Transformation SVG syntax transformation string
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Transform
     * @return this filter (for chaining operations)
     * 
     */
    public Transform setTransform(String value)
    {
	
        m_Transform = value;
        setProperty("transform", value);
        return this;
    }

    /** Transform
     *
     * Transformation SVG syntax transformation string
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Transform
     * 
     */
    public String getTransform()
    {
        return m_Transform;
    }

    @Override
    public InputPad<Transform> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Transform> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

