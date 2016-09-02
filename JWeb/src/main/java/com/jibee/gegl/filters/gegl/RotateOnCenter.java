package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;

/**
 * 
 *
 * Rotate the buffer around its center, taking care of possible offsets.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"transform"})
public class RotateOnCenter extends GeglFilter
{
    /** Constructs a .
     *
     * Rotate the buffer around its center, taking care of possible offsets.
     */
    public RotateOnCenter(GeglNode container)
    {
        super(container, "gegl:rotate-on-center");
    }
    /** Constructs a .
     *
     * Rotate the buffer around its center, taking care of possible offsets.
     */
    public RotateOnCenter(GeglFilter parent)
    {
        super(parent, "gegl:rotate-on-center");
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
     */
    public String getSampler()
    {
        return m_Sampler;
    }


    /** degrees
     *
     * Angle to rotate (clockwise)
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Degrees  = 0.00;

    /** degrees
     *
     * Angle to rotate (clockwise)
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public RotateOnCenter setDegrees(double value)
    {
	
        m_Degrees = value;
        setProperty("degrees", value);
        return this;
    }

    /** degrees
     *
     * Angle to rotate (clockwise)
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getDegrees()
    {
        return m_Degrees;
    }


    /** origin_x
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_OriginX  = 0.00;

    /** origin_x
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public RotateOnCenter setOriginX(double value)
    {
	
        m_OriginX = value;
        setProperty("origin-x", value);
        return this;
    }

    /** origin_x
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getOriginX()
    {
        return m_OriginX;
    }


    /** origin_y
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_OriginY  = 0.00;

    /** origin_y
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public RotateOnCenter setOriginY(double value)
    {
	
        m_OriginY = value;
        setProperty("origin-y", value);
        return this;
    }

    /** origin_y
     *
     * Ignored. Always uses center of input buffer
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getOriginY()
    {
        return m_OriginY;
    }

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

