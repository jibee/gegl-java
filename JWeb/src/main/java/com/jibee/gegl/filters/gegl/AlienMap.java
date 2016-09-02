package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Alien Map
 *
 * Heavily distort images colors by applying trigonometric functions to map color values.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"artistic"})
public class AlienMap extends GeglFilter
{
    /** Constructs a Alien Map.
     *
     * Heavily distort images colors by applying trigonometric functions to map color values.
     */
    public AlienMap(GeglNode container)
    {
        super(container, "gegl:alien-map");
    }
    /** Constructs a Alien Map.
     *
     * Heavily distort images colors by applying trigonometric functions to map color values.
     */
    public AlienMap(GeglFilter parent)
    {
        super(parent, "gegl:alien-map");
    }

    
    /** Color model
     *
     * What color model used for the transformation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_ColorModel ;

    /** Color model
     *
     * What color model used for the transformation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public AlienMap setColorModel(String value)
    {
	
        m_ColorModel = value;
        setProperty("color-model", value);
        return this;
    }

    /** Color model
     *
     * What color model used for the transformation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getColorModel()
    {
        return m_ColorModel;
    }


    /** Component 1 frequency
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     * */
    private double m_Cpn1Frequency  = 1.00;

    /** Component 1 frequency
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     */
    public AlienMap setCpn1Frequency(double value) throws ParameterOutOfRangeException
    {
		if(value > 20.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 20.00);
	}

        m_Cpn1Frequency = value;
        setProperty("cpn-1-frequency", value);
        return this;
    }

    /** Component 1 frequency
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     */
    public double getCpn1Frequency()
    {
        return m_Cpn1Frequency;
    }


    /** Component 2 frequency
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     * */
    private double m_Cpn2Frequency  = 1.00;

    /** Component 2 frequency
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     */
    public AlienMap setCpn2Frequency(double value) throws ParameterOutOfRangeException
    {
		if(value > 20.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 20.00);
	}

        m_Cpn2Frequency = value;
        setProperty("cpn-2-frequency", value);
        return this;
    }

    /** Component 2 frequency
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     */
    public double getCpn2Frequency()
    {
        return m_Cpn2Frequency;
    }


    /** Component 3 frequency
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     * */
    private double m_Cpn3Frequency  = 1.00;

    /** Component 3 frequency
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     */
    public AlienMap setCpn3Frequency(double value) throws ParameterOutOfRangeException
    {
		if(value > 20.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 20.00);
	}

        m_Cpn3Frequency = value;
        setProperty("cpn-3-frequency", value);
        return this;
    }

    /** Component 3 frequency
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     */
    public double getCpn3Frequency()
    {
        return m_Cpn3Frequency;
    }


    /** Component 1 phase shift
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Cpn1Phaseshift  = 0.00;

    /** Component 1 phase shift
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     */
    public AlienMap setCpn1Phaseshift(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	}

        m_Cpn1Phaseshift = value;
        setProperty("cpn-1-phaseshift", value);
        return this;
    }

    /** Component 1 phase shift
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     */
    public double getCpn1Phaseshift()
    {
        return m_Cpn1Phaseshift;
    }


    /** Component 2 phase shift
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Cpn2Phaseshift  = 0.00;

    /** Component 2 phase shift
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     */
    public AlienMap setCpn2Phaseshift(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	}

        m_Cpn2Phaseshift = value;
        setProperty("cpn-2-phaseshift", value);
        return this;
    }

    /** Component 2 phase shift
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     */
    public double getCpn2Phaseshift()
    {
        return m_Cpn2Phaseshift;
    }


    /** Component 3 phase shift
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Cpn3Phaseshift  = 0.00;

    /** Component 3 phase shift
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     */
    public AlienMap setCpn3Phaseshift(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	}

        m_Cpn3Phaseshift = value;
        setProperty("cpn-3-phaseshift", value);
        return this;
    }

    /** Component 3 phase shift
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     */
    public double getCpn3Phaseshift()
    {
        return m_Cpn3Phaseshift;
    }


    /** Keep component 1
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Cpn1Keep  = false;

    /** Keep component 1
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public AlienMap setCpn1Keep(boolean value)
    {
	
        m_Cpn1Keep = value;
        setProperty("cpn-1-keep", value);
        return this;
    }

    /** Keep component 1
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getCpn1Keep()
    {
        return m_Cpn1Keep;
    }


    /** Keep component 2
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Cpn2Keep  = false;

    /** Keep component 2
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public AlienMap setCpn2Keep(boolean value)
    {
	
        m_Cpn2Keep = value;
        setProperty("cpn-2-keep", value);
        return this;
    }

    /** Keep component 2
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getCpn2Keep()
    {
        return m_Cpn2Keep;
    }


    /** Keep component 3
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Cpn3Keep  = false;

    /** Keep component 3
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public AlienMap setCpn3Keep(boolean value)
    {
	
        m_Cpn3Keep = value;
        setProperty("cpn-3-keep", value);
        return this;
    }

    /** Keep component 3
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getCpn3Keep()
    {
        return m_Cpn3Keep;
    }

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

