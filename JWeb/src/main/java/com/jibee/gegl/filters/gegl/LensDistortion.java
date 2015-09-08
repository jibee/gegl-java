package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglNode;

/**
Lens Distortion

Corrects barrel or pincushion lens distortion.

License: GPL3+
Supports OpenCL: 
Position Dependant: true
*/
public class LensDistortion extends GeglFilter
{
/** Constructs a Lens Distortion.

Corrects barrel or pincushion lens distortion.
*/
    public LensDistortion(GeglNode container)
    {
        super(container, "gegl:lens-distortion");
    }
/** Constructs a Lens Distortion.

Corrects barrel or pincushion lens distortion.
*/
    public LensDistortion(GeglFilter parent)
    {
        super(parent, "gegl:lens-distortion");
    }

    
/** Main

Amount of second-order distortion

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    private double m_Main  = 0.00;

/** Main

Amount of second-order distortion

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public LensDistortion setMain(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	{
	    throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	}

        m_Main = value;
        setProperty("main", value);
        return this;
    }

/** Main

Amount of second-order distortion

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public double getMain()
    {
        return m_Main;
    }


/** Edge

Amount of fourth-order distortion

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    private double m_Edge  = 0.00;

/** Edge

Amount of fourth-order distortion

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public LensDistortion setEdge(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	{
	    throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	}

        m_Edge = value;
        setProperty("edge", value);
        return this;
    }

/** Edge

Amount of fourth-order distortion

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public double getEdge()
    {
        return m_Edge;
    }


/** Zoom

Rescale overall image size

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    private double m_Zoom  = 0.00;

/** Zoom

Rescale overall image size

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public LensDistortion setZoom(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	{
	    throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	}

        m_Zoom = value;
        setProperty("zoom", value);
        return this;
    }

/** Zoom

Rescale overall image size

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public double getZoom()
    {
        return m_Zoom;
    }


/** Shift X

Effect centre offset in X

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    private double m_XShift  = 0.00;

/** Shift X

Effect centre offset in X

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public LensDistortion setXShift(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	{
	    throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	}

        m_XShift = value;
        setProperty("x-shift", value);
        return this;
    }

/** Shift X

Effect centre offset in X

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public double getXShift()
    {
        return m_XShift;
    }


/** Shift Y

Effect centre offset in Y

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    private double m_YShift  = 0.00;

/** Shift Y

Effect centre offset in Y

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public LensDistortion setYShift(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	{
	    throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	}

        m_YShift = value;
        setProperty("y-shift", value);
        return this;
    }

/** Shift Y

Effect centre offset in Y

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public double getYShift()
    {
        return m_YShift;
    }


/** Brighten

Adjust brightness in corners

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    private double m_Brighten  = 0.00;

/** Brighten

Adjust brightness in corners

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public LensDistortion setBrighten(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	{
	    throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	}

        m_Brighten = value;
        setProperty("brighten", value);
        return this;
    }

/** Brighten

Adjust brightness in corners

Unit: 
Default value: 0.00
Acceptable Range: -100.00 100.00
*/
    public double getBrighten()
    {
        return m_Brighten;
    }


/** Background color



Unit: 
Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
Acceptable Range:  
*/
    private GeglColor m_Background  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

/** Background color



Unit: 
Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
Acceptable Range:  
*/
    public LensDistortion setBackground(GeglColor value)
    {
	
        m_Background = value;
        setProperty("background", value);
        return this;
    }

/** Background color



Unit: 
Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
Acceptable Range:  
*/
    public GeglColor getBackground()
    {
        return m_Background;
    }


}

