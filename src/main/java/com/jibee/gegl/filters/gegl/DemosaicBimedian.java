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
 * Demosaic With Bimedian Interpolation
 *
 * Performs a grayscale2color demosaicing of an image, using bimedian interpolation.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"blur"})
public class DemosaicBimedian extends GeglFilter implements Source, Sink
{
    /** Constructs a Demosaic With Bimedian Interpolation.
     *
     * Performs a grayscale2color demosaicing of an image, using bimedian interpolation.
     */
    public DemosaicBimedian(GeglNode container)
    {
        super(container, "gegl:demosaic-bimedian");
    }
    /** Constructs a Demosaic With Bimedian Interpolation.
     *
     * Performs a grayscale2color demosaicing of an image, using bimedian interpolation.
     */
    public DemosaicBimedian(GeglFilter parent)
    {
        super(parent, "gegl:demosaic-bimedian");
    }

    
    /** Bayer pattern
     *
     * Bayer pattern used, 0 seems to work for some nikon files, 2 for some Fuji files.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  3
     * */
    private int m_Pattern ;

    /** Bayer pattern
     *
     * Bayer pattern used, 0 seems to work for some nikon files, 2 for some Fuji files.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  3
     */
    public DemosaicBimedian setPattern(int value) throws ParameterOutOfRangeException
    {
		if(value > 3)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 3);
	}

        m_Pattern = value;
        setProperty("pattern", value);
        return this;
    }

    /** Bayer pattern
     *
     * Bayer pattern used, 0 seems to work for some nikon files, 2 for some Fuji files.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  3
     */
    public int getPattern()
    {
        return m_Pattern;
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
