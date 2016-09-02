package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * 
 *
 * Scales the buffer according to a size.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"transform"})
public class ScaleSize extends GeglFilter
{
    /** Constructs a .
     *
     * Scales the buffer according to a size.
     */
    public ScaleSize(GeglNode container)
    {
        super(container, "gegl:scale-size");
    }
    /** Constructs a .
     *
     * Scales the buffer according to a size.
     */
    public ScaleSize(GeglFilter parent)
    {
        super(parent, "gegl:scale-size");
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
     */
    public ScaleSize setOriginX(double value)
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
     */
    public ScaleSize setOriginY(double value)
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
     */
    public double getOriginY()
    {
        return m_OriginY;
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
    public ScaleSize setSampler(String value)
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


    /** x
     *
     * Horizontal size
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     * */
    private double m_X  = 100.00;

    /** x
     *
     * Horizontal size
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     */
    public ScaleSize setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** x
     *
     * Horizontal size
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     */
    public double getX()
    {
        return m_X;
    }


    /** y
     *
     * Vertical size
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     * */
    private double m_Y  = 100.00;

    /** y
     *
     * Vertical size
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     */
    public ScaleSize setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** y
     *
     * Vertical size
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     */
    public double getY()
    {
        return m_Y;
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

