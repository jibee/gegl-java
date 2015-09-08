package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**
Fractal Explorer

Rendering of multiple different fractal systems, with configurable coloring options.

License: GPL3+
Supports OpenCL: 
Position Dependant: true
*/
public class FractalExplorer extends GeglFilter
{
/** Constructs a Fractal Explorer.

Rendering of multiple different fractal systems, with configurable coloring options.
*/
    public FractalExplorer(GeglNode container)
    {
        super(container, "gegl:fractal-explorer");
    }
/** Constructs a Fractal Explorer.

Rendering of multiple different fractal systems, with configurable coloring options.
*/
    public FractalExplorer(GeglFilter parent)
    {
        super(parent, "gegl:fractal-explorer");
    }

    
/** Fractal type

Type of a fractal

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Fractaltype ;

/** Fractal type

Type of a fractal

Unit: 
Default value: 
Acceptable Range:  
*/
    public FractalExplorer setFractaltype(String value)
    {
	
        m_Fractaltype = value;
        setProperty("fractaltype", value);
        return this;
    }

/** Fractal type

Type of a fractal

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getFractaltype()
    {
        return m_Fractaltype;
    }


/** Iterations



Unit: 
Default value: 50
Acceptable Range: 1 1000
*/
    private int m_Iter  = 50;

/** Iterations



Unit: 
Default value: 50
Acceptable Range: 1 1000
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



Unit: 
Default value: 50
Acceptable Range: 1 1000
*/
    public int getIter()
    {
        return m_Iter;
    }


/** Zoom

Zoom in the fractal space

Unit: 
Default value: 300.00
Acceptable Range: 0.00 10000000.00
*/
    private double m_Zoom  = 300.00;

/** Zoom

Zoom in the fractal space

Unit: 
Default value: 300.00
Acceptable Range: 0.00 10000000.00
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

Zoom in the fractal space

Unit: 
Default value: 300.00
Acceptable Range: 0.00 10000000.00
*/
    public double getZoom()
    {
        return m_Zoom;
    }


/** Shift X

X shift in the fractal space

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    private double m_Shiftx  = 0.00;

/** Shift X

X shift in the fractal space

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public FractalExplorer setShiftx(double value)
    {
	
        m_Shiftx = value;
        setProperty("shiftx", value);
        return this;
    }

/** Shift X

X shift in the fractal space

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public double getShiftx()
    {
        return m_Shiftx;
    }


/** Shift Y

Y shift in the fractal space

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    private double m_Shifty  = 0.00;

/** Shift Y

Y shift in the fractal space

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public FractalExplorer setShifty(double value)
    {
	
        m_Shifty = value;
        setProperty("shifty", value);
        return this;
    }

/** Shift Y

Y shift in the fractal space

Unit: 
Default value: 0.00
Acceptable Range:  
*/
    public double getShifty()
    {
        return m_Shifty;
    }


/** CX

CX (No effect in Mandelbrot and Sierpinski)

Unit: 
Default value: -0.75
Acceptable Range: -2.50 2.50
*/
    private double m_Cx  = -0.75;

/** CX

CX (No effect in Mandelbrot and Sierpinski)

Unit: 
Default value: -0.75
Acceptable Range: -2.50 2.50
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

CX (No effect in Mandelbrot and Sierpinski)

Unit: 
Default value: -0.75
Acceptable Range: -2.50 2.50
*/
    public double getCx()
    {
        return m_Cx;
    }


/** CY

CY (No effect in Mandelbrot and Sierpinski)

Unit: 
Default value: -0.20
Acceptable Range: -2.50 2.50
*/
    private double m_Cy  = -0.20;

/** CY

CY (No effect in Mandelbrot and Sierpinski)

Unit: 
Default value: -0.20
Acceptable Range: -2.50 2.50
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

CY (No effect in Mandelbrot and Sierpinski)

Unit: 
Default value: -0.20
Acceptable Range: -2.50 2.50
*/
    public double getCy()
    {
        return m_Cy;
    }


/** Red stretching factor



Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
*/
    private double m_Redstretch  = 1.00;

/** Red stretching factor



Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
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



Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
*/
    public double getRedstretch()
    {
        return m_Redstretch;
    }


/** Green stretching factor



Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
*/
    private double m_Greenstretch  = 1.00;

/** Green stretching factor



Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
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



Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
*/
    public double getGreenstretch()
    {
        return m_Greenstretch;
    }


/** Blue stretching factor



Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
*/
    private double m_Bluestretch  = 1.00;

/** Blue stretching factor



Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
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



Unit: 
Default value: 1.00
Acceptable Range: 0.00 1.00
*/
    public double getBluestretch()
    {
        return m_Bluestretch;
    }


/** Red application mode



Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Redmode ;

/** Red application mode



Unit: 
Default value: 
Acceptable Range:  
*/
    public FractalExplorer setRedmode(String value)
    {
	
        m_Redmode = value;
        setProperty("redmode", value);
        return this;
    }

/** Red application mode



Unit: 
Default value: 
Acceptable Range:  
*/
    public String getRedmode()
    {
        return m_Redmode;
    }


/** Green application mode



Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Greenmode ;

/** Green application mode



Unit: 
Default value: 
Acceptable Range:  
*/
    public FractalExplorer setGreenmode(String value)
    {
	
        m_Greenmode = value;
        setProperty("greenmode", value);
        return this;
    }

/** Green application mode



Unit: 
Default value: 
Acceptable Range:  
*/
    public String getGreenmode()
    {
        return m_Greenmode;
    }


/** Blue application mode



Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_Bluemode ;

/** Blue application mode



Unit: 
Default value: 
Acceptable Range:  
*/
    public FractalExplorer setBluemode(String value)
    {
	
        m_Bluemode = value;
        setProperty("bluemode", value);
        return this;
    }

/** Blue application mode



Unit: 
Default value: 
Acceptable Range:  
*/
    public String getBluemode()
    {
        return m_Bluemode;
    }


/** Red inversion



Unit: 
Default value: false
Acceptable Range:  
*/
    private boolean m_Redinvert  = false;

/** Red inversion



Unit: 
Default value: false
Acceptable Range:  
*/
    public FractalExplorer setRedinvert(boolean value)
    {
	
        m_Redinvert = value;
        setProperty("redinvert", value);
        return this;
    }

/** Red inversion



Unit: 
Default value: false
Acceptable Range:  
*/
    public boolean getRedinvert()
    {
        return m_Redinvert;
    }


/** Green inversion



Unit: 
Default value: false
Acceptable Range:  
*/
    private boolean m_Greeninvert  = false;

/** Green inversion



Unit: 
Default value: false
Acceptable Range:  
*/
    public FractalExplorer setGreeninvert(boolean value)
    {
	
        m_Greeninvert = value;
        setProperty("greeninvert", value);
        return this;
    }

/** Green inversion



Unit: 
Default value: false
Acceptable Range:  
*/
    public boolean getGreeninvert()
    {
        return m_Greeninvert;
    }


/** Blue inversion



Unit: 
Default value: false
Acceptable Range:  
*/
    private boolean m_Blueinvert  = false;

/** Blue inversion



Unit: 
Default value: false
Acceptable Range:  
*/
    public FractalExplorer setBlueinvert(boolean value)
    {
	
        m_Blueinvert = value;
        setProperty("blueinvert", value);
        return this;
    }

/** Blue inversion



Unit: 
Default value: false
Acceptable Range:  
*/
    public boolean getBlueinvert()
    {
        return m_Blueinvert;
    }


/** Number of colors



Unit: 
Default value: 256
Acceptable Range: 2 8192
*/
    private int m_Ncolors  = 256;

/** Number of colors



Unit: 
Default value: 256
Acceptable Range: 2 8192
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



Unit: 
Default value: 256
Acceptable Range: 2 8192
*/
    public int getNcolors()
    {
        return m_Ncolors;
    }


/** Loglog smoothing



Unit: 
Default value: false
Acceptable Range:  
*/
    private boolean m_Useloglog  = false;

/** Loglog smoothing



Unit: 
Default value: false
Acceptable Range:  
*/
    public FractalExplorer setUseloglog(boolean value)
    {
	
        m_Useloglog = value;
        setProperty("useloglog", value);
        return this;
    }

/** Loglog smoothing



Unit: 
Default value: false
Acceptable Range:  
*/
    public boolean getUseloglog()
    {
        return m_Useloglog;
    }


}

