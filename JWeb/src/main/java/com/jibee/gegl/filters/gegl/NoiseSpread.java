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
 * Noise Spread
 *
 * Move pixels around randomly
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"noise"})
public class NoiseSpread extends GeglFilter implements Source, Sink
{
    /** Constructs a Noise Spread.
     *
     * Move pixels around randomly
     */
    public NoiseSpread(GeglNode container)
    {
        super(container, "gegl:noise-spread");
    }
    /** Constructs a Noise Spread.
     *
     * Move pixels around randomly
     */
    public NoiseSpread(GeglFilter parent)
    {
        super(parent, "gegl:noise-spread");
    }

    
    /** Horizontal
     *
     * Horizontal spread amount
     *
     * Unit: pixel-distance
     * Default value: 5
     * Acceptable Range:  512
     * */
    private int m_AmountX  = 5;

    /** Horizontal
     *
     * Horizontal spread amount
     *
     * Unit: pixel-distance
     * Default value: 5
     * Acceptable Range:  512
     */
    public NoiseSpread setAmountX(int value) throws ParameterOutOfRangeException
    {
		if(value > 512)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 512);
	}

        m_AmountX = value;
        setProperty("amount-x", value);
        return this;
    }

    /** Horizontal
     *
     * Horizontal spread amount
     *
     * Unit: pixel-distance
     * Default value: 5
     * Acceptable Range:  512
     */
    public int getAmountX()
    {
        return m_AmountX;
    }


    /** Vertical
     *
     * Vertical spread amount
     *
     * Unit: pixel-distance
     * Default value: 5
     * Acceptable Range:  512
     * */
    private int m_AmountY  = 5;

    /** Vertical
     *
     * Vertical spread amount
     *
     * Unit: pixel-distance
     * Default value: 5
     * Acceptable Range:  512
     */
    public NoiseSpread setAmountY(int value) throws ParameterOutOfRangeException
    {
		if(value > 512)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 512);
	}

        m_AmountY = value;
        setProperty("amount-y", value);
        return this;
    }

    /** Vertical
     *
     * Vertical spread amount
     *
     * Unit: pixel-distance
     * Default value: 5
     * Acceptable Range:  512
     */
    public int getAmountY()
    {
        return m_AmountY;
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
    public NoiseSpread setSeed(int value)
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

