package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * 
 *
 * Repositions the buffer (with subpixel precision), if integer coordinates are passed a fast-path without resampling is used
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"transform"})
public class Translate extends GeglFilter
{
    /** Constructs a .
     *
     * Repositions the buffer (with subpixel precision), if integer coordinates are passed a fast-path without resampling is used
     */
    public Translate(GeglNode container)
    {
        super(container, "gegl:translate");
    }
    /** Constructs a .
     *
     * Repositions the buffer (with subpixel precision), if integer coordinates are passed a fast-path without resampling is used
     */
    public Translate(GeglFilter parent)
    {
        super(parent, "gegl:translate");
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
    public Translate setOriginX(double value)
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
    public Translate setOriginY(double value)
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
    public Translate setSampler(String value)
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
     * Horizontal translation
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_X  = 0.00;

    /** x
     *
     * Horizontal translation
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public Translate setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** x
     *
     * Horizontal translation
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getX()
    {
        return m_X;
    }


    /** y
     *
     * Vertical translation
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Y  = 0.00;

    /** y
     *
     * Vertical translation
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public Translate setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** y
     *
     * Vertical translation
     *
     * Unit: 
     * Default value: 0.00
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

