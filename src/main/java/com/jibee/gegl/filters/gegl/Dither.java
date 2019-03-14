package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Dither
 *
 * Reduce the number of colors in the image, by reducing the levels per channel (colors and alpha). Different dithering methods can be specified to counteract quantization induced banding.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"dither"})
public class Dither extends GeglFilter implements Filter
{
    /** Constructs a Dither.
     *
     * Reduce the number of colors in the image, by reducing the levels per channel (colors and alpha). Different dithering methods can be specified to counteract quantization induced banding.
     *
     * @param container container node
     */
    public Dither(GeglNode container)
    {
        super(container, "gegl:dither");
    }
    /** Constructs a Dither.
     *
     * Reduce the number of colors in the image, by reducing the levels per channel (colors and alpha). Different dithering methods can be specified to counteract quantization induced banding.
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Red levels
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Red levels
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Green levels
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Green levels
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Blue levels
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Blue levels
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Alpha levels
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Alpha levels
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Dithering method
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Dithering method
     * 
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
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Random seed
     * 
     */
    public int getSeed()
    {
        return m_Seed;
    }

    @Override
    public InputPad<Dither> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Dither> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

