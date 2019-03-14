package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Fractal Explorer
 *
 * Rendering of multiple different fractal systems, with configurable coloring options.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=true, categories={"render", "fractal"})
public class FractalExplorer extends GeglFilter implements Source
{
    /** Constructs a Fractal Explorer.
     *
     * Rendering of multiple different fractal systems, with configurable coloring options.
     *
     * @param container container node
     */
    public FractalExplorer(GeglNode container)
    {
        super(container, "gegl:fractal-explorer");
    }
    /** Constructs a Fractal Explorer.
     *
     * Rendering of multiple different fractal systems, with configurable coloring options.
     *
     * @param parent parent filter node
     */
    public FractalExplorer(GeglFilter parent)
    {
        super(parent, "gegl:fractal-explorer");
    }

    
    /** Fractal type
     *
     * Type of a fractal
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Fractaltype ;

    /** Fractal type
     *
     * Type of a fractal
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Fractal type
     * @return this filter (for chaining operations)
     * 
     */
    public FractalExplorer setFractaltype(String value)
    {
	
        m_Fractaltype = value;
        setProperty("fractaltype", value);
        return this;
    }

    /** Fractal type
     *
     * Type of a fractal
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Fractal type
     * 
     */
    public String getFractaltype()
    {
        return m_Fractaltype;
    }


    /** Iterations
     *
     * 
     *
     * Unit: 
     * Default value: 50
     * Acceptable Range: 1 1000
     * */
    private int m_Iter  = 50;

    /** Iterations
     *
     * 
     *
     * Unit: 
     * Default value: 50
     * Acceptable Range: 1 1000
     *
     * @param value new value for Iterations
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public FractalExplorer setIter(int value) throws ParameterOutOfRangeException
    {
		if(value > 1000 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 1000);
	    }

        m_Iter = value;
        setProperty("iter", value);
        return this;
    }

    /** Iterations
     *
     * 
     *
     * Unit: 
     * Default value: 50
     * Acceptable Range: 1 1000
     *
     * @return value of Iterations
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getIter()
    {
        return m_Iter;
    }


    /** Zoom
     *
     * Zoom in the fractal space
     *
     * Unit: 
     * Default value: 300.00
     * Acceptable Range: 0.00 10000000.00
     * */
    private double m_Zoom  = 300.00;

    /** Zoom
     *
     * Zoom in the fractal space
     *
     * Unit: 
     * Default value: 300.00
     * Acceptable Range: 0.00 10000000.00
     *
     * @param value new value for Zoom
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public FractalExplorer setZoom(double value) throws ParameterOutOfRangeException
    {
		if(value > 10000000.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 10000000.00);
	    }

        m_Zoom = value;
        setProperty("zoom", value);
        return this;
    }

    /** Zoom
     *
     * Zoom in the fractal space
     *
     * Unit: 
     * Default value: 300.00
     * Acceptable Range: 0.00 10000000.00
     *
     * @return value of Zoom
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getZoom()
    {
        return m_Zoom;
    }


    /** Shift X
     *
     * X shift in the fractal space
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Shiftx  = 0.00;

    /** Shift X
     *
     * X shift in the fractal space
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for Shift X
     * @return this filter (for chaining operations)
     * 
     */
    public FractalExplorer setShiftx(double value)
    {
	
        m_Shiftx = value;
        setProperty("shiftx", value);
        return this;
    }

    /** Shift X
     *
     * X shift in the fractal space
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of Shift X
     * 
     */
    public double getShiftx()
    {
        return m_Shiftx;
    }


    /** Shift Y
     *
     * Y shift in the fractal space
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Shifty  = 0.00;

    /** Shift Y
     *
     * Y shift in the fractal space
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for Shift Y
     * @return this filter (for chaining operations)
     * 
     */
    public FractalExplorer setShifty(double value)
    {
	
        m_Shifty = value;
        setProperty("shifty", value);
        return this;
    }

    /** Shift Y
     *
     * Y shift in the fractal space
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of Shift Y
     * 
     */
    public double getShifty()
    {
        return m_Shifty;
    }


    /** CX
     *
     * ''
     *
     * Unit: 
     * Default value: -0.75
     * Acceptable Range: -2.50 2.50
     * */
    private double m_Cx  = -0.75;

    /** CX
     *
     * ''
     *
     * Unit: 
     * Default value: -0.75
     * Acceptable Range: -2.50 2.50
     *
     * @param value new value for CX
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public FractalExplorer setCx(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.50 || value < -2.50)
	    {
	        throw new ParameterOutOfRangeException(value, -2.50, 2.50);
	    }

        m_Cx = value;
        setProperty("cx", value);
        return this;
    }

    /** CX
     *
     * ''
     *
     * Unit: 
     * Default value: -0.75
     * Acceptable Range: -2.50 2.50
     *
     * @return value of CX
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCx()
    {
        return m_Cx;
    }


    /** CY
     *
     * ''
     *
     * Unit: 
     * Default value: -0.20
     * Acceptable Range: -2.50 2.50
     * */
    private double m_Cy  = -0.20;

    /** CY
     *
     * ''
     *
     * Unit: 
     * Default value: -0.20
     * Acceptable Range: -2.50 2.50
     *
     * @param value new value for CY
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public FractalExplorer setCy(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.50 || value < -2.50)
	    {
	        throw new ParameterOutOfRangeException(value, -2.50, 2.50);
	    }

        m_Cy = value;
        setProperty("cy", value);
        return this;
    }

    /** CY
     *
     * ''
     *
     * Unit: 
     * Default value: -0.20
     * Acceptable Range: -2.50 2.50
     *
     * @return value of CY
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCy()
    {
        return m_Cy;
    }


    /** Red stretching factor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Redstretch  = 1.00;

    /** Red stretching factor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Red stretching factor
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public FractalExplorer setRedstretch(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Redstretch = value;
        setProperty("redstretch", value);
        return this;
    }

    /** Red stretching factor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Red stretching factor
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRedstretch()
    {
        return m_Redstretch;
    }


    /** Green stretching factor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Greenstretch  = 1.00;

    /** Green stretching factor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Green stretching factor
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public FractalExplorer setGreenstretch(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Greenstretch = value;
        setProperty("greenstretch", value);
        return this;
    }

    /** Green stretching factor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Green stretching factor
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getGreenstretch()
    {
        return m_Greenstretch;
    }


    /** Blue stretching factor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Bluestretch  = 1.00;

    /** Blue stretching factor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Blue stretching factor
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public FractalExplorer setBluestretch(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Bluestretch = value;
        setProperty("bluestretch", value);
        return this;
    }

    /** Blue stretching factor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Blue stretching factor
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBluestretch()
    {
        return m_Bluestretch;
    }


    /** Red application mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Redmode ;

    /** Red application mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Red application mode
     * @return this filter (for chaining operations)
     * 
     */
    public FractalExplorer setRedmode(String value)
    {
	
        m_Redmode = value;
        setProperty("redmode", value);
        return this;
    }

    /** Red application mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Red application mode
     * 
     */
    public String getRedmode()
    {
        return m_Redmode;
    }


    /** Green application mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Greenmode ;

    /** Green application mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Green application mode
     * @return this filter (for chaining operations)
     * 
     */
    public FractalExplorer setGreenmode(String value)
    {
	
        m_Greenmode = value;
        setProperty("greenmode", value);
        return this;
    }

    /** Green application mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Green application mode
     * 
     */
    public String getGreenmode()
    {
        return m_Greenmode;
    }


    /** Blue application mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Bluemode ;

    /** Blue application mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Blue application mode
     * @return this filter (for chaining operations)
     * 
     */
    public FractalExplorer setBluemode(String value)
    {
	
        m_Bluemode = value;
        setProperty("bluemode", value);
        return this;
    }

    /** Blue application mode
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Blue application mode
     * 
     */
    public String getBluemode()
    {
        return m_Bluemode;
    }


    /** Red inversion
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Redinvert  = false;

    /** Red inversion
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Red inversion
     * @return this filter (for chaining operations)
     * 
     */
    public FractalExplorer setRedinvert(boolean value)
    {
	
        m_Redinvert = value;
        setProperty("redinvert", value);
        return this;
    }

    /** Red inversion
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Red inversion
     * 
     */
    public boolean getRedinvert()
    {
        return m_Redinvert;
    }


    /** Green inversion
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Greeninvert  = false;

    /** Green inversion
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Green inversion
     * @return this filter (for chaining operations)
     * 
     */
    public FractalExplorer setGreeninvert(boolean value)
    {
	
        m_Greeninvert = value;
        setProperty("greeninvert", value);
        return this;
    }

    /** Green inversion
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Green inversion
     * 
     */
    public boolean getGreeninvert()
    {
        return m_Greeninvert;
    }


    /** Blue inversion
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Blueinvert  = false;

    /** Blue inversion
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Blue inversion
     * @return this filter (for chaining operations)
     * 
     */
    public FractalExplorer setBlueinvert(boolean value)
    {
	
        m_Blueinvert = value;
        setProperty("blueinvert", value);
        return this;
    }

    /** Blue inversion
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Blue inversion
     * 
     */
    public boolean getBlueinvert()
    {
        return m_Blueinvert;
    }


    /** Number of colors
     *
     * 
     *
     * Unit: 
     * Default value: 256
     * Acceptable Range: 2 8192
     * */
    private int m_Ncolors  = 256;

    /** Number of colors
     *
     * 
     *
     * Unit: 
     * Default value: 256
     * Acceptable Range: 2 8192
     *
     * @param value new value for Number of colors
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public FractalExplorer setNcolors(int value) throws ParameterOutOfRangeException
    {
		if(value > 8192 || value < 2)
	    {
	        throw new ParameterOutOfRangeException(value, 2, 8192);
	    }

        m_Ncolors = value;
        setProperty("ncolors", value);
        return this;
    }

    /** Number of colors
     *
     * 
     *
     * Unit: 
     * Default value: 256
     * Acceptable Range: 2 8192
     *
     * @return value of Number of colors
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getNcolors()
    {
        return m_Ncolors;
    }


    /** Loglog smoothing
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Useloglog  = false;

    /** Loglog smoothing
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Loglog smoothing
     * @return this filter (for chaining operations)
     * 
     */
    public FractalExplorer setUseloglog(boolean value)
    {
	
        m_Useloglog = value;
        setProperty("useloglog", value);
        return this;
    }

    /** Loglog smoothing
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Loglog smoothing
     * 
     */
    public boolean getUseloglog()
    {
        return m_Useloglog;
    }

    @Override
    public OutputPad<FractalExplorer> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

