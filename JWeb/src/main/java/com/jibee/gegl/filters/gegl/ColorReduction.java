package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Color Reduction
 *
 * Reduce the number of colors in the image, by reducing the bits per channel (colors and alpha). Different dithering methods can be specified to counteract quantization induced banding.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"dither"})
public class ColorReduction extends GeglFilter
{
    /** Constructs a Color Reduction.
     *
     * Reduce the number of colors in the image, by reducing the bits per channel (colors and alpha). Different dithering methods can be specified to counteract quantization induced banding.
     */
    public ColorReduction(GeglNode container)
    {
        super(container, "gegl:color-reduction");
    }
    /** Constructs a Color Reduction.
     *
     * Reduce the number of colors in the image, by reducing the bits per channel (colors and alpha). Different dithering methods can be specified to counteract quantization induced banding.
     */
    public ColorReduction(GeglFilter parent)
    {
        super(parent, "gegl:color-reduction");
    }

    
    /** Red bits
     *
     * Number of bits for red channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     * */
    private int m_RedBits  = 8;

    /** Red bits
     *
     * Number of bits for red channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     */
    public ColorReduction setRedBits(int value) throws ParameterOutOfRangeException
    {
		if(value > 16 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 16);
	}

        m_RedBits = value;
        setProperty("red-bits", value);
        return this;
    }

    /** Red bits
     *
     * Number of bits for red channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     */
    public int getRedBits()
    {
        return m_RedBits;
    }


    /** Green bits
     *
     * Number of bits for green channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     * */
    private int m_GreenBits  = 8;

    /** Green bits
     *
     * Number of bits for green channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     */
    public ColorReduction setGreenBits(int value) throws ParameterOutOfRangeException
    {
		if(value > 16 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 16);
	}

        m_GreenBits = value;
        setProperty("green-bits", value);
        return this;
    }

    /** Green bits
     *
     * Number of bits for green channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     */
    public int getGreenBits()
    {
        return m_GreenBits;
    }


    /** Blue bits
     *
     * Number of bits for blue channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     * */
    private int m_BlueBits  = 8;

    /** Blue bits
     *
     * Number of bits for blue channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     */
    public ColorReduction setBlueBits(int value) throws ParameterOutOfRangeException
    {
		if(value > 16 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 16);
	}

        m_BlueBits = value;
        setProperty("blue-bits", value);
        return this;
    }

    /** Blue bits
     *
     * Number of bits for blue channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     */
    public int getBlueBits()
    {
        return m_BlueBits;
    }


    /** Alpha bits
     *
     * Number of bits for alpha channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     * */
    private int m_AlphaBits  = 8;

    /** Alpha bits
     *
     * Number of bits for alpha channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     */
    public ColorReduction setAlphaBits(int value) throws ParameterOutOfRangeException
    {
		if(value > 16 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 16);
	}

        m_AlphaBits = value;
        setProperty("alpha-bits", value);
        return this;
    }

    /** Alpha bits
     *
     * Number of bits for alpha channel
     *
     * Unit: 
     * Default value: 8
     * Acceptable Range: 1 16
     */
    public int getAlphaBits()
    {
        return m_AlphaBits;
    }


    /** Dithering strategy
     *
     * The dithering strategy to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_DitherStrategy ;

    /** Dithering strategy
     *
     * The dithering strategy to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public ColorReduction setDitherStrategy(String value)
    {
	
        m_DitherStrategy = value;
        setProperty("dither-strategy", value);
        return this;
    }

    /** Dithering strategy
     *
     * The dithering strategy to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getDitherStrategy()
    {
        return m_DitherStrategy;
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
    public ColorReduction setSeed(int value)
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

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

