package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Photocopy
 *
 * Simulate color distortion produced by a copy machine
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"artistic"})
public class Photocopy extends GeglFilter implements Filter
{
    /** Constructs a Photocopy.
     *
     * Simulate color distortion produced by a copy machine
     *
     * @param container container node
     */
    public Photocopy(GeglNode container)
    {
        super(container, "gegl:photocopy");
    }
    /** Constructs a Photocopy.
     *
     * Simulate color distortion produced by a copy machine
     *
     * @param parent parent filter node
     */
    public Photocopy(GeglFilter parent)
    {
        super(parent, "gegl:photocopy");
    }

    
    /** Mask Radius
     *
     * 
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range: 0.00 50.00
     * */
    private double m_MaskRadius  = 10.00;

    /** Mask Radius
     *
     * 
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range: 0.00 50.00
     *
     * @param value new value for Mask Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Photocopy setMaskRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 50.00);
	    }

        m_MaskRadius = value;
        setProperty("mask-radius", value);
        return this;
    }

    /** Mask Radius
     *
     * 
     *
     * Unit: 
     * Default value: 10.00
     * Acceptable Range: 0.00 50.00
     *
     * @return value of Mask Radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getMaskRadius()
    {
        return m_MaskRadius;
    }


    /** Sharpness
     *
     * 
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Sharpness  = 0.50;

    /** Sharpness
     *
     * 
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Sharpness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Photocopy setSharpness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Sharpness = value;
        setProperty("sharpness", value);
        return this;
    }

    /** Sharpness
     *
     * 
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Sharpness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getSharpness()
    {
        return m_Sharpness;
    }


    /** Percent Black
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Black  = 0.20;

    /** Percent Black
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Percent Black
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Photocopy setBlack(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_Black = value;
        setProperty("black", value);
        return this;
    }

    /** Percent Black
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Percent Black
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBlack()
    {
        return m_Black;
    }


    /** Percent White
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     * */
    private double m_White  = 0.20;

    /** Percent White
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Percent White
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Photocopy setWhite(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_White = value;
        setProperty("white", value);
        return this;
    }

    /** Percent White
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Percent White
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getWhite()
    {
        return m_White;
    }

    @Override
    public InputPad<Photocopy> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Photocopy> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

