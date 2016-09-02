package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;

/**
 * Randomly Shuffle Pixels
 *
 * Completely randomize a fraction of pixels
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"noise"})
public class NoiseHurl extends GeglFilter
{
    /** Constructs a Randomly Shuffle Pixels.
     *
     * Completely randomize a fraction of pixels
     */
    public NoiseHurl(GeglNode container)
    {
        super(container, "gegl:noise-hurl");
    }
    /** Constructs a Randomly Shuffle Pixels.
     *
     * Completely randomize a fraction of pixels
     */
    public NoiseHurl(GeglFilter parent)
    {
        super(parent, "gegl:noise-hurl");
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
     */
    public NoiseHurl setPctRandom(double value) throws ParameterOutOfRangeException
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
     */
    public NoiseHurl setRepeat(int value) throws ParameterOutOfRangeException
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
     */
    public NoiseHurl setSeed(int value)
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
     */
    public int getSeed()
    {
        return m_Seed;
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

