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
 * Demosaic Without Interpolation
 *
 * Performs a naive grayscale2color demosaicing of an image, no interpolation.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"blur"})
public class DemosaicSimple extends GeglFilter implements Source, Sink
{
    /** Constructs a Demosaic Without Interpolation.
     *
     * Performs a naive grayscale2color demosaicing of an image, no interpolation.
     */
    public DemosaicSimple(GeglNode container)
    {
        super(container, "gegl:demosaic-simple");
    }
    /** Constructs a Demosaic Without Interpolation.
     *
     * Performs a naive grayscale2color demosaicing of an image, no interpolation.
     */
    public DemosaicSimple(GeglFilter parent)
    {
        super(parent, "gegl:demosaic-simple");
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
    public DemosaicSimple setPattern(int value) throws ParameterOutOfRangeException
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

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

