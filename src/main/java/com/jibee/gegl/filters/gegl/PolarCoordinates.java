package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Polar Coordinates
 *
 * Convert image to or from polar coordinates
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"transform", "map"})
public class PolarCoordinates extends GeglFilter implements Source, Sink
{
    /** Constructs a Polar Coordinates.
     *
     * Convert image to or from polar coordinates
     */
    public PolarCoordinates(GeglNode container)
    {
        super(container, "gegl:polar-coordinates");
    }
    /** Constructs a Polar Coordinates.
     *
     * Convert image to or from polar coordinates
     */
    public PolarCoordinates(GeglFilter parent)
    {
        super(parent, "gegl:polar-coordinates");
    }

    
    /** Circle depth in percent
     *
     * 
     *
     * Unit: percent
     * Default value: 100.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_Depth  = 100.00;

    /** Circle depth in percent
     *
     * 
     *
     * Unit: percent
     * Default value: 100.00
     * Acceptable Range: 0.00 100.00
     */
    public PolarCoordinates setDepth(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	}

        m_Depth = value;
        setProperty("depth", value);
        return this;
    }

    /** Circle depth in percent
     *
     * 
     *
     * Unit: percent
     * Default value: 100.00
     * Acceptable Range: 0.00 100.00
     */
    public double getDepth()
    {
        return m_Depth;
    }


    /** Offset angle
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Angle  = 0.00;

    /** Offset angle
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     */
    public PolarCoordinates setAngle(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	}

        m_Angle = value;
        setProperty("angle", value);
        return this;
    }

    /** Offset angle
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     */
    public double getAngle()
    {
        return m_Angle;
    }


    /** Map backwards
     *
     * Start from the right instead of the left
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Bw  = false;

    /** Map backwards
     *
     * Start from the right instead of the left
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public PolarCoordinates setBw(boolean value)
    {
	
        m_Bw = value;
        setProperty("bw", value);
        return this;
    }

    /** Map backwards
     *
     * Start from the right instead of the left
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getBw()
    {
        return m_Bw;
    }


    /** Map from top
     *
     * Put the top row in the middle and the bottom row on the outside
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Top  = true;

    /** Map from top
     *
     * Put the top row in the middle and the bottom row on the outside
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public PolarCoordinates setTop(boolean value)
    {
	
        m_Top = value;
        setProperty("top", value);
        return this;
    }

    /** Map from top
     *
     * Put the top row in the middle and the bottom row on the outside
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getTop()
    {
        return m_Top;
    }


    /** To polar
     *
     * Map the image to a circle
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Polar  = true;

    /** To polar
     *
     * Map the image to a circle
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public PolarCoordinates setPolar(boolean value)
    {
	
        m_Polar = value;
        setProperty("polar", value);
        return this;
    }

    /** To polar
     *
     * Map the image to a circle
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getPolar()
    {
        return m_Polar;
    }


    /** X
     *
     * Origin point for the polar coordinates
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_PoleX ;

    /** X
     *
     * Origin point for the polar coordinates
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     */
    public PolarCoordinates setPoleX(int value)
    {
	
        m_PoleX = value;
        setProperty("pole-x", value);
        return this;
    }

    /** X
     *
     * Origin point for the polar coordinates
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     */
    public int getPoleX()
    {
        return m_PoleX;
    }


    /** Y
     *
     * Origin point for the polar coordinates
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_PoleY ;

    /** Y
     *
     * Origin point for the polar coordinates
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     */
    public PolarCoordinates setPoleY(int value)
    {
	
        m_PoleY = value;
        setProperty("pole-y", value);
        return this;
    }

    /** Y
     *
     * Origin point for the polar coordinates
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     */
    public int getPoleY()
    {
        return m_PoleY;
    }


    /** Choose middle
     *
     * Let origin point to be the middle one
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Middle  = true;

    /** Choose middle
     *
     * Let origin point to be the middle one
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public PolarCoordinates setMiddle(boolean value)
    {
	
        m_Middle = value;
        setProperty("middle", value);
        return this;
    }

    /** Choose middle
     *
     * Let origin point to be the middle one
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getMiddle()
    {
        return m_Middle;
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

