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
 * Fractal Trace
 *
 * Transform the image with the fractals
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="GPL3+", opencl=false, position_dependant=true, categories={"map"})
public class FractalTrace extends GeglFilter implements Source, Sink
{
    /** Constructs a Fractal Trace.
     *
     * Transform the image with the fractals
     */
    public FractalTrace(GeglNode container)
    {
        super(container, "gegl:fractal-trace");
    }
    /** Constructs a Fractal Trace.
     *
     * Transform the image with the fractals
     */
    public FractalTrace(GeglFilter parent)
    {
        super(parent, "gegl:fractal-trace");
    }

    
    /** Fractal type
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Fractal ;

    /** Fractal type
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public FractalTrace setFractal(String value)
    {
	
        m_Fractal = value;
        setProperty("fractal", value);
        return this;
    }

    /** Fractal type
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getFractal()
    {
        return m_Fractal;
    }


    /** X1
     *
     * X1 value, position
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -50.00 50.00
     * */
    private double m_X1  = -1.00;

    /** X1
     *
     * X1 value, position
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -50.00 50.00
     */
    public FractalTrace setX1(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < -50.00)
	{
	    throw new ParameterOutOfRangeException(value, -50.00, 50.00);
	}

        m_X1 = value;
        setProperty("X1", value);
        return this;
    }

    /** X1
     *
     * X1 value, position
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -50.00 50.00
     */
    public double getX1()
    {
        return m_X1;
    }


    /** X2
     *
     * X2 value, position
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -50.00 50.00
     * */
    private double m_X2  = 0.50;

    /** X2
     *
     * X2 value, position
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -50.00 50.00
     */
    public FractalTrace setX2(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < -50.00)
	{
	    throw new ParameterOutOfRangeException(value, -50.00, 50.00);
	}

        m_X2 = value;
        setProperty("X2", value);
        return this;
    }

    /** X2
     *
     * X2 value, position
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -50.00 50.00
     */
    public double getX2()
    {
        return m_X2;
    }


    /** Y1
     *
     * Y1 value, position
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -50.00 50.00
     * */
    private double m_Y1  = -1.00;

    /** Y1
     *
     * Y1 value, position
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -50.00 50.00
     */
    public FractalTrace setY1(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < -50.00)
	{
	    throw new ParameterOutOfRangeException(value, -50.00, 50.00);
	}

        m_Y1 = value;
        setProperty("Y1", value);
        return this;
    }

    /** Y1
     *
     * Y1 value, position
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -50.00 50.00
     */
    public double getY1()
    {
        return m_Y1;
    }


    /** Y2
     *
     * Y2 value, position
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -50.00 50.00
     * */
    private double m_Y2  = 1.00;

    /** Y2
     *
     * Y2 value, position
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -50.00 50.00
     */
    public FractalTrace setY2(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < -50.00)
	{
	    throw new ParameterOutOfRangeException(value, -50.00, 50.00);
	}

        m_Y2 = value;
        setProperty("Y2", value);
        return this;
    }

    /** Y2
     *
     * Y2 value, position
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -50.00 50.00
     */
    public double getY2()
    {
        return m_Y2;
    }


    /** JX
     *
     * Julia seed X value, position
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -50.00 50.00
     * */
    private double m_Jx  = 0.50;

    /** JX
     *
     * Julia seed X value, position
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -50.00 50.00
     */
    public FractalTrace setJx(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < -50.00)
	{
	    throw new ParameterOutOfRangeException(value, -50.00, 50.00);
	}

        m_Jx = value;
        setProperty("JX", value);
        return this;
    }

    /** JX
     *
     * Julia seed X value, position
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -50.00 50.00
     */
    public double getJx()
    {
        return m_Jx;
    }


    /** JY
     *
     * Julia seed Y value, position
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -50.00 50.00
     * */
    private double m_Jy  = 0.50;

    /** JY
     *
     * Julia seed Y value, position
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -50.00 50.00
     */
    public FractalTrace setJy(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < -50.00)
	{
	    throw new ParameterOutOfRangeException(value, -50.00, 50.00);
	}

        m_Jy = value;
        setProperty("JY", value);
        return this;
    }

    /** JY
     *
     * Julia seed Y value, position
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: -50.00 50.00
     */
    public double getJy()
    {
        return m_Jy;
    }


    /** Depth
     *
     * 
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 65536
     * */
    private int m_Depth  = 3;

    /** Depth
     *
     * 
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 65536
     */
    public FractalTrace setDepth(int value) throws ParameterOutOfRangeException
    {
		if(value > 65536 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 65536);
	}

        m_Depth = value;
        setProperty("depth", value);
        return this;
    }

    /** Depth
     *
     * 
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 65536
     */
    public int getDepth()
    {
        return m_Depth;
    }


    /** Bailout length
     *
     * 
     *
     * Unit: 
     * Default value: Double.POSITIVE_INFINITY
     * Acceptable Range: 0.00 
     * */
    private double m_Bailout  = Double.POSITIVE_INFINITY;

    /** Bailout length
     *
     * 
     *
     * Unit: 
     * Default value: Double.POSITIVE_INFINITY
     * Acceptable Range: 0.00 
     */
    public FractalTrace setBailout(double value) throws ParameterOutOfRangeException
    {
		if(value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, Double.POSITIVE_INFINITY);
	}

        m_Bailout = value;
        setProperty("bailout", value);
        return this;
    }

    /** Bailout length
     *
     * 
     *
     * Unit: 
     * Default value: Double.POSITIVE_INFINITY
     * Acceptable Range: 0.00 
     */
    public double getBailout()
    {
        return m_Bailout;
    }


    /** Abyss policy
     *
     * How to deal with pixels outside of the input buffer
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_AbyssPolicy ;

    /** Abyss policy
     *
     * How to deal with pixels outside of the input buffer
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public FractalTrace setAbyssPolicy(String value)
    {
	
        m_AbyssPolicy = value;
        setProperty("abyss-policy", value);
        return this;
    }

    /** Abyss policy
     *
     * How to deal with pixels outside of the input buffer
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getAbyssPolicy()
    {
        return m_AbyssPolicy;
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

