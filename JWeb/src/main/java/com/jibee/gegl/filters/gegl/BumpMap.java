package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;

/**
 * Bump Map
 *
 * This plug-in uses the algorithm described by John Schlag, "Fast Embossing Effects on Raster Image Data" in Graphics GEMS IV (ISBN 0-12-336155-9). It takes a buffer to be applied as a bump map to another buffer and produces a nice embossing effect.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"light"})
public class BumpMap extends GeglFilter implements Source, DualSink
{
    /** Constructs a Bump Map.
     *
     * This plug-in uses the algorithm described by John Schlag, "Fast Embossing Effects on Raster Image Data" in Graphics GEMS IV (ISBN 0-12-336155-9). It takes a buffer to be applied as a bump map to another buffer and produces a nice embossing effect.
     */
    public BumpMap(GeglNode container)
    {
        super(container, "gegl:bump-map");
    }
    /** Constructs a Bump Map.
     *
     * This plug-in uses the algorithm described by John Schlag, "Fast Embossing Effects on Raster Image Data" in Graphics GEMS IV (ISBN 0-12-336155-9). It takes a buffer to be applied as a bump map to another buffer and produces a nice embossing effect.
     */
    public BumpMap(GeglFilter parent)
    {
        super(parent, "gegl:bump-map");
    }

    
    /** Type
     *
     * Type of map
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Type ;

    /** Type
     *
     * Type of map
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public BumpMap setType(String value)
    {
	
        m_Type = value;
        setProperty("type", value);
        return this;
    }

    /** Type
     *
     * Type of map
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getType()
    {
        return m_Type;
    }


    /** Compensate
     *
     * Compensate for darkening
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Compensate  = true;

    /** Compensate
     *
     * Compensate for darkening
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public BumpMap setCompensate(boolean value)
    {
	
        m_Compensate = value;
        setProperty("compensate", value);
        return this;
    }

    /** Compensate
     *
     * Compensate for darkening
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getCompensate()
    {
        return m_Compensate;
    }


    /** Invert
     *
     * Invert bumpmap
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Invert  = false;

    /** Invert
     *
     * Invert bumpmap
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public BumpMap setInvert(boolean value)
    {
	
        m_Invert = value;
        setProperty("invert", value);
        return this;
    }

    /** Invert
     *
     * Invert bumpmap
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getInvert()
    {
        return m_Invert;
    }


    /** Tiled
     *
     * Tiled bumpmap
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Tiled  = false;

    /** Tiled
     *
     * Tiled bumpmap
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public BumpMap setTiled(boolean value)
    {
	
        m_Tiled = value;
        setProperty("tiled", value);
        return this;
    }

    /** Tiled
     *
     * Tiled bumpmap
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getTiled()
    {
        return m_Tiled;
    }


    /** Azimuth
     *
     * 
     *
     * Unit: degree
     * Default value: 135.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Azimuth  = 135.00;

    /** Azimuth
     *
     * 
     *
     * Unit: degree
     * Default value: 135.00
     * Acceptable Range: 0.00 360.00
     */
    public BumpMap setAzimuth(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	}

        m_Azimuth = value;
        setProperty("azimuth", value);
        return this;
    }

    /** Azimuth
     *
     * 
     *
     * Unit: degree
     * Default value: 135.00
     * Acceptable Range: 0.00 360.00
     */
    public double getAzimuth()
    {
        return m_Azimuth;
    }


    /** Elevation
     *
     * 
     *
     * Unit: 
     * Default value: 45.00
     * Acceptable Range: 0.50 90.00
     * */
    private double m_Elevation  = 45.00;

    /** Elevation
     *
     * 
     *
     * Unit: 
     * Default value: 45.00
     * Acceptable Range: 0.50 90.00
     */
    public BumpMap setElevation(double value) throws ParameterOutOfRangeException
    {
		if(value > 90.00 || value < 0.50)
	{
	    throw new ParameterOutOfRangeException(value, 0.50, 90.00);
	}

        m_Elevation = value;
        setProperty("elevation", value);
        return this;
    }

    /** Elevation
     *
     * 
     *
     * Unit: 
     * Default value: 45.00
     * Acceptable Range: 0.50 90.00
     */
    public double getElevation()
    {
        return m_Elevation;
    }


    /** Depth
     *
     * 
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 65
     * */
    private int m_Depth  = 3;

    /** Depth
     *
     * 
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 65
     */
    public BumpMap setDepth(int value) throws ParameterOutOfRangeException
    {
		if(value > 65 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 65);
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
     * Acceptable Range: 1 65
     */
    public int getDepth()
    {
        return m_Depth;
    }


    /** Offset X
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range: -20000 20000
     * */
    private int m_OffsetX ;

    /** Offset X
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range: -20000 20000
     */
    public BumpMap setOffsetX(int value) throws ParameterOutOfRangeException
    {
		if(value > 20000 || value < -20000)
	{
	    throw new ParameterOutOfRangeException(value, -20000, 20000);
	}

        m_OffsetX = value;
        setProperty("offset-x", value);
        return this;
    }

    /** Offset X
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range: -20000 20000
     */
    public int getOffsetX()
    {
        return m_OffsetX;
    }


    /** Offset Y
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range: -20000 20000
     * */
    private int m_OffsetY ;

    /** Offset Y
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range: -20000 20000
     */
    public BumpMap setOffsetY(int value) throws ParameterOutOfRangeException
    {
		if(value > 20000 || value < -20000)
	{
	    throw new ParameterOutOfRangeException(value, -20000, 20000);
	}

        m_OffsetY = value;
        setProperty("offset-y", value);
        return this;
    }

    /** Offset Y
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range: -20000 20000
     */
    public int getOffsetY()
    {
        return m_OffsetY;
    }


    /** Waterlevel
     *
     * Level that full transparency should represent
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Waterlevel  = 0.00;

    /** Waterlevel
     *
     * Level that full transparency should represent
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public BumpMap setWaterlevel(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Waterlevel = value;
        setProperty("waterlevel", value);
        return this;
    }

    /** Waterlevel
     *
     * Level that full transparency should represent
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public double getWaterlevel()
    {
        return m_Waterlevel;
    }


    /** Ambient lighting factor
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Ambient  = 0.00;

    /** Ambient lighting factor
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public BumpMap setAmbient(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Ambient = value;
        setProperty("ambient", value);
        return this;
    }

    /** Ambient lighting factor
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public double getAmbient()
    {
        return m_Ambient;
    }

    public InputPad Aux()
    {
        return new InputPad(this, "aux");
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

