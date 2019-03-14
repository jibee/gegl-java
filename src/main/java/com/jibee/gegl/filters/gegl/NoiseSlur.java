package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Noise Slur
 *
 * Randomly slide some pixels downward (similar to melting)
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"noise"})
public class NoiseSlur extends GeglFilter implements Filter
{
    /** Constructs a Noise Slur.
     *
     * Randomly slide some pixels downward (similar to melting)
     *
     * @param container container node
     */
    public NoiseSlur(GeglNode container)
    {
        super(container, "gegl:noise-slur");
    }
    /** Constructs a Noise Slur.
     *
     * Randomly slide some pixels downward (similar to melting)
     *
     * @param parent parent filter node
     */
    public NoiseSlur(GeglFilter parent)
    {
        super(parent, "gegl:noise-slur");
    }

    
    /** Randomization (%)
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_PctRandom  = 50.00;

    /** Randomization (%)
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Randomization (%)
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public NoiseSlur setPctRandom(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_PctRandom = value;
        setProperty("pct-random", value);
        return this;
    }

    /** Randomization (%)
     *
     * 
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Randomization (%)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getPctRandom()
    {
        return m_PctRandom;
    }


    /** Repeat
     *
     * 
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 100
     * */
    private int m_Repeat  = 1;

    /** Repeat
     *
     * 
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 100
     *
     * @param value new value for Repeat
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public NoiseSlur setRepeat(int value) throws ParameterOutOfRangeException
    {
		if(value > 100 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 100);
	    }

        m_Repeat = value;
        setProperty("repeat", value);
        return this;
    }

    /** Repeat
     *
     * 
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 100
     *
     * @return value of Repeat
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getRepeat()
    {
        return m_Repeat;
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
    public NoiseSlur setSeed(int value)
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
    public InputPad<NoiseSlur> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<NoiseSlur> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

