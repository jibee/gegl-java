package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Spherize
 *
 * Wrap image around a spherical cap
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"distort", "map"})
public class Spherize extends GeglFilter implements Filter
{
    /** Constructs a Spherize.
     *
     * Wrap image around a spherical cap
     *
     * @param container container node
     */
    public Spherize(GeglNode container)
    {
        super(container, "gegl:spherize");
    }
    /** Constructs a Spherize.
     *
     * Wrap image around a spherical cap
     *
     * @param parent parent filter node
     */
    public Spherize(GeglFilter parent)
    {
        super(parent, "gegl:spherize");
    }

    
    /** Mode
     *
     * Displacement mode
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Mode ;

    /** Mode
     *
     * Displacement mode
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Mode
     * @return this filter (for chaining operations)
     * 
     */
    public Spherize setMode(String value)
    {
	
        m_Mode = value;
        setProperty("mode", value);
        return this;
    }

    /** Mode
     *
     * Displacement mode
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Mode
     * 
     */
    public String getMode()
    {
        return m_Mode;
    }


    /** Angle of view
     *
     * Camera angle of view
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 180.00
     * */
    private double m_AngleOfView  = 0.00;

    /** Angle of view
     *
     * Camera angle of view
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 180.00
     *
     * @param value new value for Angle of view
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Spherize setAngleOfView(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 180.00);
	    }

        m_AngleOfView = value;
        setProperty("angle-of-view", value);
        return this;
    }

    /** Angle of view
     *
     * Camera angle of view
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 180.00
     *
     * @return value of Angle of view
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getAngleOfView()
    {
        return m_AngleOfView;
    }


    /** Curvature
     *
     * Spherical cap apex angle, as a fraction of the co-angle of view
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Curvature  = 1.00;

    /** Curvature
     *
     * Spherical cap apex angle, as a fraction of the co-angle of view
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Curvature
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Spherize setCurvature(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Curvature = value;
        setProperty("curvature", value);
        return this;
    }

    /** Curvature
     *
     * Spherical cap apex angle, as a fraction of the co-angle of view
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Curvature
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCurvature()
    {
        return m_Curvature;
    }


    /** Amount
     *
     * Displacement scaling factor (negative values refer to the inverse displacement)
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_Amount  = 1.00;

    /** Amount
     *
     * Displacement scaling factor (negative values refer to the inverse displacement)
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -1.00 1.00
     *
     * @param value new value for Amount
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Spherize setAmount(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	    {
	        throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	    }

        m_Amount = value;
        setProperty("amount", value);
        return this;
    }

    /** Amount
     *
     * Displacement scaling factor (negative values refer to the inverse displacement)
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: -1.00 1.00
     *
     * @return value of Amount
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getAmount()
    {
        return m_Amount;
    }


    /** Resampling method
     *
     * Mathematical method for reconstructing pixel values
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_SamplerType ;

    /** Resampling method
     *
     * Mathematical method for reconstructing pixel values
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Resampling method
     * @return this filter (for chaining operations)
     * 
     */
    public Spherize setSamplerType(String value)
    {
	
        m_SamplerType = value;
        setProperty("sampler-type", value);
        return this;
    }

    /** Resampling method
     *
     * Mathematical method for reconstructing pixel values
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Resampling method
     * 
     */
    public String getSamplerType()
    {
        return m_SamplerType;
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

