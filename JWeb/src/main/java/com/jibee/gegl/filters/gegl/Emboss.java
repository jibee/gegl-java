package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;

/**
 * Emboss
 *
 * Simulates an image created by embossing
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"light"})
public class Emboss extends GeglFilter
{
    /** Constructs a Emboss.
     *
     * Simulates an image created by embossing
     */
    public Emboss(GeglNode container)
    {
        super(container, "gegl:emboss");
    }
    /** Constructs a Emboss.
     *
     * Simulates an image created by embossing
     */
    public Emboss(GeglFilter parent)
    {
        super(parent, "gegl:emboss");
    }

    
    /** Emboss Type
     *
     * Rendering type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Type ;

    /** Emboss Type
     *
     * Rendering type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Emboss setType(String value)
    {
	
        m_Type = value;
        setProperty("type", value);
        return this;
    }

    /** Emboss Type
     *
     * Rendering type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getType()
    {
        return m_Type;
    }


    /** Azimuth
     *
     * Light angle (degrees)
     *
     * Unit: degree
     * Default value: 30.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Azimuth  = 30.00;

    /** Azimuth
     *
     * Light angle (degrees)
     *
     * Unit: degree
     * Default value: 30.00
     * Acceptable Range: 0.00 360.00
     */
    public Emboss setAzimuth(double value) throws ParameterOutOfRangeException
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
     * Light angle (degrees)
     *
     * Unit: degree
     * Default value: 30.00
     * Acceptable Range: 0.00 360.00
     */
    public double getAzimuth()
    {
        return m_Azimuth;
    }


    /** Elevation
     *
     * Elevation angle (degrees)
     *
     * Unit: degree
     * Default value: 45.00
     * Acceptable Range: 0.00 180.00
     * */
    private double m_Elevation  = 45.00;

    /** Elevation
     *
     * Elevation angle (degrees)
     *
     * Unit: degree
     * Default value: 45.00
     * Acceptable Range: 0.00 180.00
     */
    public Emboss setElevation(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 180.00);
	}

        m_Elevation = value;
        setProperty("elevation", value);
        return this;
    }

    /** Elevation
     *
     * Elevation angle (degrees)
     *
     * Unit: degree
     * Default value: 45.00
     * Acceptable Range: 0.00 180.00
     */
    public double getElevation()
    {
        return m_Elevation;
    }


    /** Depth
     *
     * Filter width
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range: 1 100
     * */
    private int m_Depth  = 20;

    /** Depth
     *
     * Filter width
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range: 1 100
     */
    public Emboss setDepth(int value) throws ParameterOutOfRangeException
    {
		if(value > 100 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 100);
	}

        m_Depth = value;
        setProperty("depth", value);
        return this;
    }

    /** Depth
     *
     * Filter width
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range: 1 100
     */
    public int getDepth()
    {
        return m_Depth;
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

