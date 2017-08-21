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
 * Shift
 *
 * Shift each row or column of pixels by a random amount
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"distort"})
public class Shift extends GeglFilter implements Source, Sink
{
    /** Constructs a Shift.
     *
     * Shift each row or column of pixels by a random amount
     *
     * @param container container node
     */
    public Shift(GeglNode container)
    {
        super(container, "gegl:shift");
    }
    /** Constructs a Shift.
     *
     * Shift each row or column of pixels by a random amount
     *
     * @param parent parent filter node
     */
    public Shift(GeglFilter parent)
    {
        super(parent, "gegl:shift");
    }

    
    /** Shift
     *
     * Maximum amount to shift
     *
     * Unit: pixel-distance
     * Default value: 5
     * Acceptable Range:  200
     * */
    private int m_Shift  = 5;

    /** Shift
     *
     * Maximum amount to shift
     *
     * Unit: pixel-distance
     * Default value: 5
     * Acceptable Range:  200
     *
     * @param value new value for Shift
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Shift setShift(int value) throws ParameterOutOfRangeException
    {
		if(value > 200)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 200);
	    }

        m_Shift = value;
        setProperty("shift", value);
        return this;
    }

    /** Shift
     *
     * Maximum amount to shift
     *
     * Unit: pixel-distance
     * Default value: 5
     * Acceptable Range:  200
     *
     * @return value of Shift
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getShift()
    {
        return m_Shift;
    }


    /** Shift direction
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Direction ;

    /** Shift direction
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Shift direction
     * @return this filter (for chaining operations)
     * 
     */
    public Shift setDirection(String value)
    {
	
        m_Direction = value;
        setProperty("direction", value);
        return this;
    }

    /** Shift direction
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Shift direction
     * 
     */
    public String getDirection()
    {
        return m_Direction;
    }


    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Seed ;

    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
     */
    public Shift setSeed(int value)
    {
	
        m_Seed = value;
        setProperty("seed", value);
        return this;
    }

    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Random seed
     * 
     */
    public int getSeed()
    {
        return m_Seed;
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

