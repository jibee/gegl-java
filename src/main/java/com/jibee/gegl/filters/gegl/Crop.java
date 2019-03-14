package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Crop
 *
 * Crop a buffer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"core"})
public class Crop extends GeglFilter implements Filter
{
    /** Constructs a Crop.
     *
     * Crop a buffer
     *
     * @param container container node
     */
    public Crop(GeglNode container)
    {
        super(container, "gegl:crop");
    }
    /** Constructs a Crop.
     *
     * Crop a buffer
     *
     * @param parent parent filter node
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
     *
     * @param value new value for X
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of X
     * 
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
     *
     * @param value new value for Y
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Y
     * 
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
     *
     * @param value new value for Width
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Width
     * 
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
     *
     * @param value new value for Height
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Height
     * 
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
     *
     * @param value new value for Reset origin
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Reset origin
     * 
     */
    public boolean getResetOrigin()
    {
        return m_ResetOrigin;
    }

    @Override
    public InputPad<Crop> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Crop> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

