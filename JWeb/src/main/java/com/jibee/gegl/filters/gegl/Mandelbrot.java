package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;

/**
 * 
 *
 * Mandelbrot set renderer
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"render"})
public class Mandelbrot extends GeglFilter
{
    /** Constructs a .
     *
     * Mandelbrot set renderer
     */
    public Mandelbrot(GeglNode container)
    {
        super(container, "gegl:mandelbrot");
    }
    /** Constructs a .
     *
     * Mandelbrot set renderer
     */
    public Mandelbrot(GeglFilter parent)
    {
        super(parent, "gegl:mandelbrot");
    }

    
    /** Real coordinate
     *
     * 
     *
     * Unit: 
     * Default value: -1.77
     * Acceptable Range: -200.00 200.00
     * */
    private double m_Real  = -1.77;

    /** Real coordinate
     *
     * 
     *
     * Unit: 
     * Default value: -1.77
     * Acceptable Range: -200.00 200.00
     */
    public Mandelbrot setReal(double value) throws ParameterOutOfRangeException
    {
		if(value > 200.00 || value < -200.00)
	{
	    throw new ParameterOutOfRangeException(value, -200.00, 200.00);
	}

        m_Real = value;
        setProperty("real", value);
        return this;
    }

    /** Real coordinate
     *
     * 
     *
     * Unit: 
     * Default value: -1.77
     * Acceptable Range: -200.00 200.00
     */
    public double getReal()
    {
        return m_Real;
    }


    /** Imaginary coordinate
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -200.00 200.00
     * */
    private double m_Img  = 0.00;

    /** Imaginary coordinate
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -200.00 200.00
     */
    public Mandelbrot setImg(double value) throws ParameterOutOfRangeException
    {
		if(value > 200.00 || value < -200.00)
	{
	    throw new ParameterOutOfRangeException(value, -200.00, 200.00);
	}

        m_Img = value;
        setProperty("img", value);
        return this;
    }

    /** Imaginary coordinate
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -200.00 200.00
     */
    public double getImg()
    {
        return m_Img;
    }


    /** Water level
     *
     * 
     *
     * Unit: 
     * Default value: 3.50
     * Acceptable Range: -200.00 200.00
     * */
    private double m_Level  = 3.50;

    /** Water level
     *
     * 
     *
     * Unit: 
     * Default value: 3.50
     * Acceptable Range: -200.00 200.00
     */
    public Mandelbrot setLevel(double value) throws ParameterOutOfRangeException
    {
		if(value > 200.00 || value < -200.00)
	{
	    throw new ParameterOutOfRangeException(value, -200.00, 200.00);
	}

        m_Level = value;
        setProperty("level", value);
        return this;
    }

    /** Water level
     *
     * 
     *
     * Unit: 
     * Default value: 3.50
     * Acceptable Range: -200.00 200.00
     */
    public double getLevel()
    {
        return m_Level;
    }


    /** Iterations
     *
     * Maximum number of iterations
     *
     * Unit: 
     * Default value: 128
     * Acceptable Range:  512
     * */
    private int m_Maxiter  = 128;

    /** Iterations
     *
     * Maximum number of iterations
     *
     * Unit: 
     * Default value: 128
     * Acceptable Range:  512
     */
    public Mandelbrot setMaxiter(int value) throws ParameterOutOfRangeException
    {
		if(value > 512)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 512);
	}

        m_Maxiter = value;
        setProperty("maxiter", value);
        return this;
    }

    /** Iterations
     *
     * Maximum number of iterations
     *
     * Unit: 
     * Default value: 128
     * Acceptable Range:  512
     */
    public int getMaxiter()
    {
        return m_Maxiter;
    }

    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

