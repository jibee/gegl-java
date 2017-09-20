package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Illusion
 *
 * Superimpose many altered copies of the image.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"map"})
public class Illusion extends GeglFilter implements Filter
{
    /** Constructs a Illusion.
     *
     * Superimpose many altered copies of the image.
     *
     * @param container container node
     */
    public Illusion(GeglNode container)
    {
        super(container, "gegl:illusion");
    }
    /** Constructs a Illusion.
     *
     * Superimpose many altered copies of the image.
     *
     * @param parent parent filter node
     */
    public Illusion(GeglFilter parent)
    {
        super(parent, "gegl:illusion");
    }

    
    /** Division
     *
     * The number of divisions
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range:  64
     * */
    private int m_Division  = 8;

    /** Division
     *
     * The number of divisions
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range:  64
     *
     * @param value new value for Division
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Illusion setDivision(int value) throws ParameterOutOfRangeException
    {
		if(value > 64)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 64);
	    }

        m_Division = value;
        setProperty("division", value);
        return this;
    }

    /** Division
     *
     * The number of divisions
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range:  64
     *
     * @return value of Division
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getDivision()
    {
        return m_Division;
    }


    /** Illusion type
     *
     * Type of illusion
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_IllusionType ;

    /** Illusion type
     *
     * Type of illusion
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Illusion type
     * @return this filter (for chaining operations)
     * 
     */
    public Illusion setIllusionType(String value)
    {
	
        m_IllusionType = value;
        setProperty("illusion-type", value);
        return this;
    }

    /** Illusion type
     *
     * Type of illusion
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Illusion type
     * 
     */
    public String getIllusionType()
    {
        return m_IllusionType;
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

