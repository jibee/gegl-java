package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Posterize
 *
 * Reduces the number of levels in each color component of the image.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=true, position_dependant=false, categories={"color"})
public class Posterize extends GeglFilter implements Filter
{
    /** Constructs a Posterize.
     *
     * Reduces the number of levels in each color component of the image.
     *
     * @param container container node
     */
    public Posterize(GeglNode container)
    {
        super(container, "gegl:posterize");
    }
    /** Constructs a Posterize.
     *
     * Reduces the number of levels in each color component of the image.
     *
     * @param parent parent filter node
     */
    public Posterize(GeglFilter parent)
    {
        super(parent, "gegl:posterize");
    }

    
    /** Levels
     *
     * number of levels per component
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 64
     * */
    private int m_Levels  = 8;

    /** Levels
     *
     * number of levels per component
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 64
     *
     * @param value new value for Levels
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Posterize setLevels(int value) throws ParameterOutOfRangeException
    {
		if(value > 64 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 64);
	    }

        m_Levels = value;
        setProperty("levels", value);
        return this;
    }

    /** Levels
     *
     * number of levels per component
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 64
     *
     * @return value of Levels
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getLevels()
    {
        return m_Levels;
    }

    @Override
    public InputPad<Posterize> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Posterize> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

