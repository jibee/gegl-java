package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Cartoon
 *
 * Simulates a cartoon, its result is similar to a black felt pen drawing subsequently shaded with color. This is achieved by enhancing edges and darkening areas that are already distinctly darker than their neighborhood
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"artistic"})
public class Cartoon extends GeglFilter implements Filter
{
    /** Constructs a Cartoon.
     *
     * Simulates a cartoon, its result is similar to a black felt pen drawing subsequently shaded with color. This is achieved by enhancing edges and darkening areas that are already distinctly darker than their neighborhood
     *
     * @param container container node
     */
    public Cartoon(GeglNode container)
    {
        super(container, "gegl:cartoon");
    }
    /** Constructs a Cartoon.
     *
     * Simulates a cartoon, its result is similar to a black felt pen drawing subsequently shaded with color. This is achieved by enhancing edges and darkening areas that are already distinctly darker than their neighborhood
     *
     * @param parent parent filter node
     */
    public Cartoon(GeglFilter parent)
    {
        super(parent, "gegl:cartoon");
    }

    
    /** Mask radius
     *
     * 
     *
     * Unit: 
     * Default value: 7.00
     * Acceptable Range: 0.00 50.00
     * */
    private double m_MaskRadius  = 7.00;

    /** Mask radius
     *
     * 
     *
     * Unit: 
     * Default value: 7.00
     * Acceptable Range: 0.00 50.00
     *
     * @param value new value for Mask radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Cartoon setMaskRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 50.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 50.00);
	    }

        m_MaskRadius = value;
        setProperty("mask-radius", value);
        return this;
    }

    /** Mask radius
     *
     * 
     *
     * Unit: 
     * Default value: 7.00
     * Acceptable Range: 0.00 50.00
     *
     * @return value of Mask radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getMaskRadius()
    {
        return m_MaskRadius;
    }


    /** Percent black
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     * */
    private double m_PctBlack  = 0.20;

    /** Percent black
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Percent black
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Cartoon setPctBlack(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_PctBlack = value;
        setProperty("pct-black", value);
        return this;
    }

    /** Percent black
     *
     * 
     *
     * Unit: 
     * Default value: 0.20
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Percent black
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getPctBlack()
    {
        return m_PctBlack;
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

