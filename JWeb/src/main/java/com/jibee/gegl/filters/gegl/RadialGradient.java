package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Radial Gradient
 *
 * Radial gradient renderer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"render", "gradient"})
public class RadialGradient extends GeglFilter
{
    /** Constructs a Radial Gradient.
     *
     * Radial gradient renderer
     */
    public RadialGradient(GeglNode container)
    {
        super(container, "gegl:radial-gradient");
    }
    /** Constructs a Radial Gradient.
     *
     * Radial gradient renderer
     */
    public RadialGradient(GeglFilter parent)
    {
        super(parent, "gegl:radial-gradient");
    }

    
    /** X1
     *
     * 
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range:  
     * */
    private double m_StartX  = 25.00;

    /** X1
     *
     * 
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range:  
     */
    public RadialGradient setStartX(double value)
    {
	
        m_StartX = value;
        setProperty("start-x", value);
        return this;
    }

    /** X1
     *
     * 
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range:  
     */
    public double getStartX()
    {
        return m_StartX;
    }


    /** Y1
     *
     * 
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range:  
     * */
    private double m_StartY  = 25.00;

    /** Y1
     *
     * 
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range:  
     */
    public RadialGradient setStartY(double value)
    {
	
        m_StartY = value;
        setProperty("start-y", value);
        return this;
    }

    /** Y1
     *
     * 
     *
     * Unit: 
     * Default value: 25.00
     * Acceptable Range:  
     */
    public double getStartY()
    {
        return m_StartY;
    }


    /** X2
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range:  
     * */
    private double m_EndX  = 50.00;

    /** X2
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range:  
     */
    public RadialGradient setEndX(double value)
    {
	
        m_EndX = value;
        setProperty("end-x", value);
        return this;
    }

    /** X2
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range:  
     */
    public double getEndX()
    {
        return m_EndX;
    }


    /** Y2
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range:  
     * */
    private double m_EndY  = 50.00;

    /** Y2
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range:  
     */
    public RadialGradient setEndY(double value)
    {
	
        m_EndY = value;
        setProperty("end-y", value);
        return this;
    }

    /** Y2
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range:  
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
     */
    public RadialGradient setStartColor(GeglColor value)
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
     */
    public RadialGradient setEndColor(GeglColor value)
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
     */
    public GeglColor getEndColor()
    {
        return m_EndColor;
    }

    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

