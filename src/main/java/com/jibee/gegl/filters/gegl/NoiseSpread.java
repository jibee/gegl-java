package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Noise Spread
 *
 * Move pixels around randomly
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"noise"})
public class NoiseSpread extends GeglFilter implements Filter
{
    /** Constructs a Noise Spread.
     *
     * Move pixels around randomly
     *
     * @param container container node
     */
    public NoiseSpread(GeglNode container)
    {
        super(container, "gegl:noise-spread");
    }
    /** Constructs a Noise Spread.
     *
     * Move pixels around randomly
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Horizontal
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Horizontal
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Vertical
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Vertical
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Random seed
     * 
     */
    public int getSeed()
    {
        return m_Seed;
    }

    @Override
    public InputPad<NoiseSpread> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<NoiseSpread> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

