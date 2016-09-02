package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Crop
 *
 * Crop a buffer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"core"})
public class Crop extends GeglFilter
{
    /** Constructs a Crop.
     *
     * Crop a buffer
     */
    public Crop(GeglNode container)
    {
        super(container, "gegl:crop");
    }
    /** Constructs a Crop.
     *
     * Crop a buffer
     */
    public Crop(GeglFilter parent)
    {
        super(parent, "gegl:crop");
    }

    
    /** X
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_X  = 0.00;

    /** X
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     */
    public Crop setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** X
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getX()
    {
        return m_X;
    }


    /** Y
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Y  = 0.00;

    /** Y
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     */
    public Crop setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Y
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getY()
    {
        return m_Y;
    }


    /** Width
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range:  
     * */
    private double m_Width  = 10.00;

    /** Width
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range:  
     */
    public Crop setWidth(double value)
    {
	
        m_Width = value;
        setProperty("width", value);
        return this;
    }

    /** Width
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range:  
     */
    public double getWidth()
    {
        return m_Width;
    }


    /** Height
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range:  
     * */
    private double m_Height  = 10.00;

    /** Height
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range:  
     */
    public Crop setHeight(double value)
    {
	
        m_Height = value;
        setProperty("height", value);
        return this;
    }

    /** Height
     *
     * 
     *
     * Unit: pixel-distance
     * Default value: 10.00
     * Acceptable Range:  
     */
    public double getHeight()
    {
        return m_Height;
    }


    /** Reset origin
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_ResetOrigin  = false;

    /** Reset origin
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public Crop setResetOrigin(boolean value)
    {
	
        m_ResetOrigin = value;
        setProperty("reset-origin", value);
        return this;
    }

    /** Reset origin
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getResetOrigin()
    {
        return m_ResetOrigin;
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

