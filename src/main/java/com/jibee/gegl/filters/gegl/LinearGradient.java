package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Linear Gradient
 *
 * Linear gradient renderer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"render", "gradient"})
public class LinearGradient extends GeglFilter implements Source
{
    /** Constructs a Linear Gradient.
     *
     * Linear gradient renderer
     *
     * @param container container node
     */
    public LinearGradient(GeglNode container)
    {
        super(container, "gegl:linear-gradient");
    }
    /** Constructs a Linear Gradient.
     *
     * Linear gradient renderer
     *
     * @param parent parent filter node
     */
    public LinearGradient(GeglFilter parent)
    {
        super(parent, "gegl:linear-gradient");
    }

    
    /** X1
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 25.00
     * Acceptable Range:  
     * */
    private double m_StartX  = 25.00;

    /** X1
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 25.00
     * Acceptable Range:  
     *
     * @param value new value for X1
     * @return this filter (for chaining operations)
     * 
     */
    public LinearGradient setStartX(double value)
    {
	
        m_StartX = value;
        setProperty("start-x", value);
        return this;
    }

    /** X1
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 25.00
     * Acceptable Range:  
     *
     * @return value of X1
     * 
     */
    public double getStartX()
    {
        return m_StartX;
    }


    /** Y1
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 25.00
     * Acceptable Range:  
     * */
    private double m_StartY  = 25.00;

    /** Y1
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 25.00
     * Acceptable Range:  
     *
     * @param value new value for Y1
     * @return this filter (for chaining operations)
     * 
     */
    public LinearGradient setStartY(double value)
    {
	
        m_StartY = value;
        setProperty("start-y", value);
        return this;
    }

    /** Y1
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 25.00
     * Acceptable Range:  
     *
     * @return value of Y1
     * 
     */
    public double getStartY()
    {
        return m_StartY;
    }


    /** X2
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 150.00
     * Acceptable Range:  
     * */
    private double m_EndX  = 150.00;

    /** X2
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 150.00
     * Acceptable Range:  
     *
     * @param value new value for X2
     * @return this filter (for chaining operations)
     * 
     */
    public LinearGradient setEndX(double value)
    {
	
        m_EndX = value;
        setProperty("end-x", value);
        return this;
    }

    /** X2
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 150.00
     * Acceptable Range:  
     *
     * @return value of X2
     * 
     */
    public double getEndX()
    {
        return m_EndX;
    }


    /** Y2
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 150.00
     * Acceptable Range:  
     * */
    private double m_EndY  = 150.00;

    /** Y2
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 150.00
     * Acceptable Range:  
     *
     * @param value new value for Y2
     * @return this filter (for chaining operations)
     * 
     */
    public LinearGradient setEndY(double value)
    {
	
        m_EndY = value;
        setProperty("end-y", value);
        return this;
    }

    /** Y2
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 150.00
     * Acceptable Range:  
     *
     * @return value of Y2
     * 
     */
    public double getEndY()
    {
        return m_EndY;
    }


    /** Start Color
     *
     * The color at (x1, y1)
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_StartColor  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Start Color
     *
     * The color at (x1, y1)
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Start Color
     * @return this filter (for chaining operations)
     * 
     */
    public LinearGradient setStartColor(GeglColor value)
    {
	
        m_StartColor = value;
        setProperty("start-color", value);
        return this;
    }

    /** Start Color
     *
     * The color at (x1, y1)
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of Start Color
     * 
     */
    public GeglColor getStartColor()
    {
        return m_StartColor;
    }


    /** End Color
     *
     * The color at (x2, y2)
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_EndColor  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** End Color
     *
     * The color at (x2, y2)
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @param value new value for End Color
     * @return this filter (for chaining operations)
     * 
     */
    public LinearGradient setEndColor(GeglColor value)
    {
	
        m_EndColor = value;
        setProperty("end-color", value);
        return this;
    }

    /** End Color
     *
     * The color at (x2, y2)
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @return value of End Color
     * 
     */
    public GeglColor getEndColor()
    {
        return m_EndColor;
    }

    @Override
    public OutputPad<LinearGradient> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

