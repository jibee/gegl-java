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
 * Alien Map
 *
 * Heavily distort images colors by applying trigonometric functions to map color values.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"artistic"})
public class AlienMap extends GeglFilter implements Source, Sink
{
    /** Constructs a Alien Map.
     *
     * Heavily distort images colors by applying trigonometric functions to map color values.
     *
     * @param container container node
     */
    public AlienMap(GeglNode container)
    {
        super(container, "gegl:alien-map");
    }
    /** Constructs a Alien Map.
     *
     * Heavily distort images colors by applying trigonometric functions to map color values.
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Color model
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Color model
     * 
     */
    public String getColorModel()
    {
        return m_ColorModel;
    }


    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     * */
    private double m_Cpn1Frequency  = 1.00;

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     *
     * @param value new value for [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     *
     * @return value of [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCpn1Frequency()
    {
        return m_Cpn1Frequency;
    }


    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     * */
    private double m_Cpn2Frequency  = 1.00;

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     *
     * @param value new value for [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     *
     * @return value of [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCpn2Frequency()
    {
        return m_Cpn2Frequency;
    }


    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     * */
    private double m_Cpn3Frequency  = 1.00;

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     *
     * @param value new value for [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     *
     * @return value of [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCpn3Frequency()
    {
        return m_Cpn3Frequency;
    }


    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Cpn1Phaseshift  = 0.00;

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @param value new value for [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @return value of [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCpn1Phaseshift()
    {
        return m_Cpn1Phaseshift;
    }


    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Cpn2Phaseshift  = 0.00;

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @param value new value for [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @return value of [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCpn2Phaseshift()
    {
        return m_Cpn2Phaseshift;
    }


    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Cpn3Phaseshift  = 0.00;

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @param value new value for [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @return value of [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCpn3Phaseshift()
    {
        return m_Cpn3Phaseshift;
    }


    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Cpn1Keep  = false;

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @return this filter (for chaining operations)
     * 
     */
    public AlienMap setCpn1Keep(boolean value)
    {
	
        m_Cpn1Keep = value;
        setProperty("cpn-1-keep", value);
        return this;
    }

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * 
     */
    public boolean getCpn1Keep()
    {
        return m_Cpn1Keep;
    }


    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Cpn2Keep  = false;

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @return this filter (for chaining operations)
     * 
     */
    public AlienMap setCpn2Keep(boolean value)
    {
	
        m_Cpn2Keep = value;
        setProperty("cpn-2-keep", value);
        return this;
    }

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * 
     */
    public boolean getCpn2Keep()
    {
        return m_Cpn2Keep;
    }


    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Cpn3Keep  = false;

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * @return this filter (for chaining operations)
     * 
     */
    public AlienMap setCpn3Keep(boolean value)
    {
	
        m_Cpn3Keep = value;
        setProperty("cpn-3-keep", value);
        return this;
    }

    /** [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of [color-model {rgb} : rgb-label, color-model {hsl} : hsl-label]
     * 
     */
    public boolean getCpn3Keep()
    {
        return m_Cpn3Keep;
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

