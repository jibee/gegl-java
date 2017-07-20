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
 * Dither
 *
 * Reduce the number of colors in the image, by reducing the levels per channel (colors and alpha). Different dithering methods can be specified to counteract quantization induced banding.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"dither"})
public class Dither extends GeglFilter implements Source, Sink
{
    /** Constructs a Dither.
     *
     * Reduce the number of colors in the image, by reducing the levels per channel (colors and alpha). Different dithering methods can be specified to counteract quantization induced banding.
     */
    public Dither(GeglNode container)
    {
        super(container, "gegl:dither");
    }
    /** Constructs a Dither.
     *
     * Reduce the number of colors in the image, by reducing the levels per channel (colors and alpha). Different dithering methods can be specified to counteract quantization induced banding.
     */
    public Dither(GeglFilter parent)
    {
        super(parent, "gegl:dither");
    }

    
    /** Red levels
     *
     * Number of levels for red channel
     *
     * Unit: 
     * Default value: 6
     * Acceptable Range: 2 65536
     * */
    private int m_RedLevels  = 6;

    /** Red levels
     *
     * Number of levels for red channel
     *
     * Unit: 
     * Default value: 6
     * Acceptable Range: 2 65536
     */
    public Dither setRedLevels(int value) throws ParameterOutOfRangeException
    {
		if(value > 65536 || value < 2)
	{
	    throw new ParameterOutOfRangeException(value, 2, 65536);
	}

        m_RedLevels = value;
        setProperty("red-levels", value);
        return this;
    }

    /** Red levels
     *
     * Number of levels for red channel
     *
     * Unit: 
     * Default value: 6
     * Acceptable Range: 2 65536
     */
    public int getRedLevels()
    {
        return m_RedLevels;
    }


    /** Green levels
     *
     * Number of levels for green channel
     *
     * Unit: 
     * Default value: 7
     * Acceptable Range: 2 65536
     * */
    private int m_GreenLevels  = 7;

    /** Green levels
     *
     * Number of levels for green channel
     *
     * Unit: 
     * Default value: 7
     * Acceptable Range: 2 65536
     */
    public Dither setGreenLevels(int value) throws ParameterOutOfRangeException
    {
		if(value > 65536 || value < 2)
	{
	    throw new ParameterOutOfRangeException(value, 2, 65536);
	}

        m_GreenLevels = value;
        setProperty("green-levels", value);
        return this;
    }

    /** Green levels
     *
     * Number of levels for green channel
     *
     * Unit: 
     * Default value: 7
     * Acceptable Range: 2 65536
     */
    public int getGreenLevels()
    {
        return m_GreenLevels;
    }


    /** Blue levels
     *
     * Number of levels for blue channel
     *
     * Unit: 
     * Default value: 6
     * Acceptable Range: 2 65536
     * */
    private int m_BlueLevels  = 6;

    /** Blue levels
     *
     * Number of levels for blue channel
     *
     * Unit: 
     * Default value: 6
     * Acceptable Range: 2 65536
     */
    public Dither setBlueLevels(int value) throws ParameterOutOfRangeException
    {
		if(value > 65536 || value < 2)
	{
	    throw new ParameterOutOfRangeException(value, 2, 65536);
	}

        m_BlueLevels = value;
        setProperty("blue-levels", value);
        return this;
    }

    /** Blue levels
     *
     * Number of levels for blue channel
     *
     * Unit: 
     * Default value: 6
     * Acceptable Range: 2 65536
     */
    public int getBlueLevels()
    {
        return m_BlueLevels;
    }


    /** Alpha levels
     *
     * Number of levels for alpha channel
     *
     * Unit: 
     * Default value: 256
     * Acceptable Range: 2 65536
     * */
    private int m_AlphaLevels  = 256;

    /** Alpha levels
     *
     * Number of levels for alpha channel
     *
     * Unit: 
     * Default value: 256
     * Acceptable Range: 2 65536
     */
    public Dither setAlphaLevels(int value) throws ParameterOutOfRangeException
    {
		if(value > 65536 || value < 2)
	{
	    throw new ParameterOutOfRangeException(value, 2, 65536);
	}

        m_AlphaLevels = value;
        setProperty("alpha-levels", value);
        return this;
    }

    /** Alpha levels
     *
     * Number of levels for alpha channel
     *
     * Unit: 
     * Default value: 256
     * Acceptable Range: 2 65536
     */
    public int getAlphaLevels()
    {
        return m_AlphaLevels;
    }


    /** Dithering method
     *
     * The dithering method to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_DitherMethod ;

    /** Dithering method
     *
     * The dithering method to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Dither setDitherMethod(String value)
    {
	
        m_DitherMethod = value;
        setProperty("dither-method", value);
        return this;
    }

    /** Dithering method
     *
     * The dithering method to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getDitherMethod()
    {
        return m_DitherMethod;
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
    public Dither setSeed(int value)
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

