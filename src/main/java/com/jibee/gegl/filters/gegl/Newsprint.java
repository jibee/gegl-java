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
 * Newsprint
 *
 * Digital halftoning with optional modulations. 
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="", opencl=false, position_dependant=true, categories={"render"})
public class Newsprint extends GeglFilter implements Source, Sink
{
    /** Constructs a Newsprint.
     *
     * Digital halftoning with optional modulations. 
     */
    public Newsprint(GeglNode container)
    {
        super(container, "gegl:newsprint");
    }
    /** Constructs a Newsprint.
     *
     * Digital halftoning with optional modulations. 
     */
    public Newsprint(GeglFilter parent)
    {
        super(parent, "gegl:newsprint");
    }

    
    /** Color Model
     *
     * How many inks to use just black, rg, rgb(additive) or cmyk
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_ColorModel ;

    /** Color Model
     *
     * How many inks to use just black, rg, rgb(additive) or cmyk
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Newsprint setColorModel(String value)
    {
	
        m_ColorModel = value;
        setProperty("color-model", value);
        return this;
    }

    /** Color Model
     *
     * How many inks to use just black, rg, rgb(additive) or cmyk
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getColorModel()
    {
        return m_ColorModel;
    }


    /** Pattern
     *
     * halftoning/dot pattern to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Pattern ;

    /** Pattern
     *
     * halftoning/dot pattern to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Newsprint setPattern(String value)
    {
	
        m_Pattern = value;
        setProperty("pattern", value);
        return this;
    }

    /** Pattern
     *
     * halftoning/dot pattern to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getPattern()
    {
        return m_Pattern;
    }


    /** Period
     *
     * The number of pixels across one repetition of a base pattern at base resolution.
     *
     * Unit: 
     * Default value: 12.00
     * Acceptable Range: 0.00 200.00
     * */
    private double m_Period  = 12.00;

    /** Period
     *
     * The number of pixels across one repetition of a base pattern at base resolution.
     *
     * Unit: 
     * Default value: 12.00
     * Acceptable Range: 0.00 200.00
     */
    public Newsprint setPeriod(double value) throws ParameterOutOfRangeException
    {
		if(value > 200.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 200.00);
	}

        m_Period = value;
        setProperty("period", value);
        return this;
    }

    /** Period
     *
     * The number of pixels across one repetition of a base pattern at base resolution.
     *
     * Unit: 
     * Default value: 12.00
     * Acceptable Range: 0.00 200.00
     */
    public double getPeriod()
    {
        return m_Period;
    }


    /** Turbulence
     *
     * Color saturation dependent compression of period
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Turbulence  = 0.00;

    /** Turbulence
     *
     * Color saturation dependent compression of period
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public Newsprint setTurbulence(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Turbulence = value;
        setProperty("turbulence", value);
        return this;
    }

    /** Turbulence
     *
     * Color saturation dependent compression of period
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public double getTurbulence()
    {
        return m_Turbulence;
    }


    /** Blocksize
     *
     * number of periods per tile, this tiling avoids high frequency anomaly that angleboost causes
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -1.00 64.00
     * */
    private double m_Blocksize  = -1.00;

    /** Blocksize
     *
     * number of periods per tile, this tiling avoids high frequency anomaly that angleboost causes
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -1.00 64.00
     */
    public Newsprint setBlocksize(double value) throws ParameterOutOfRangeException
    {
		if(value > 64.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 64.00);
	}

        m_Blocksize = value;
        setProperty("blocksize", value);
        return this;
    }

    /** Blocksize
     *
     * number of periods per tile, this tiling avoids high frequency anomaly that angleboost causes
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -1.00 64.00
     */
    public double getBlocksize()
    {
        return m_Blocksize;
    }


    /** Angleboost
     *
     * multiplication factor for desired rotation of the local space for texture, the way this is computed makes it weak for desaturated colors and possibly stronger where there is color.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 4.00
     * */
    private double m_Angleboost  = 0.00;

    /** Angleboost
     *
     * multiplication factor for desired rotation of the local space for texture, the way this is computed makes it weak for desaturated colors and possibly stronger where there is color.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 4.00
     */
    public Newsprint setAngleboost(double value) throws ParameterOutOfRangeException
    {
		if(value > 4.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 4.00);
	}

        m_Angleboost = value;
        setProperty("angleboost", value);
        return this;
    }

    /** Angleboost
     *
     * multiplication factor for desired rotation of the local space for texture, the way this is computed makes it weak for desaturated colors and possibly stronger where there is color.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 4.00
     */
    public double getAngleboost()
    {
        return m_Angleboost;
    }


    /** [color-model {white-on-black,              black-on-white} : bw-label, color-model {rgb}            : rgb-label, color-model {cmyk}           : cmyk-label]
     *
     * angle offset for patterns
     *
     * Unit: degree
     * Default value: 75.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Twist  = 75.00;

    /** [color-model {white-on-black,              black-on-white} : bw-label, color-model {rgb}            : rgb-label, color-model {cmyk}           : cmyk-label]
     *
     * angle offset for patterns
     *
     * Unit: degree
     * Default value: 75.00
     * Acceptable Range: -180.00 180.00
     */
    public Newsprint setTwist(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < -180.00)
	{
	    throw new ParameterOutOfRangeException(value, -180.00, 180.00);
	}

        m_Twist = value;
        setProperty("twist", value);
        return this;
    }

    /** [color-model {white-on-black,              black-on-white} : bw-label, color-model {rgb}            : rgb-label, color-model {cmyk}           : cmyk-label]
     *
     * angle offset for patterns
     *
     * Unit: degree
     * Default value: 75.00
     * Acceptable Range: -180.00 180.00
     */
    public double getTwist()
    {
        return m_Twist;
    }


    /** [color-model {rgb}  : rgb-label, color-model {cmyk} : cmyk-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 15.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Twist2  = 15.00;

    /** [color-model {rgb}  : rgb-label, color-model {cmyk} : cmyk-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 15.00
     * Acceptable Range: -180.00 180.00
     */
    public Newsprint setTwist2(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < -180.00)
	{
	    throw new ParameterOutOfRangeException(value, -180.00, 180.00);
	}

        m_Twist2 = value;
        setProperty("twist2", value);
        return this;
    }

    /** [color-model {rgb}  : rgb-label, color-model {cmyk} : cmyk-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 15.00
     * Acceptable Range: -180.00 180.00
     */
    public double getTwist2()
    {
        return m_Twist2;
    }


    /** [color-model {rgb}  : rgb-label, color-model {cmyk} : cmyk-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 45.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Twist3  = 45.00;

    /** [color-model {rgb}  : rgb-label, color-model {cmyk} : cmyk-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 45.00
     * Acceptable Range: -180.00 180.00
     */
    public Newsprint setTwist3(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < -180.00)
	{
	    throw new ParameterOutOfRangeException(value, -180.00, 180.00);
	}

        m_Twist3 = value;
        setProperty("twist3", value);
        return this;
    }

    /** [color-model {rgb}  : rgb-label, color-model {cmyk} : cmyk-label]
     *
     * 
     *
     * Unit: degree
     * Default value: 45.00
     * Acceptable Range: -180.00 180.00
     */
    public double getTwist3()
    {
        return m_Twist3;
    }


    /** Yellow angle
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Twist4  = 0.00;

    /** Yellow angle
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     */
    public Newsprint setTwist4(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < -180.00)
	{
	    throw new ParameterOutOfRangeException(value, -180.00, 180.00);
	}

        m_Twist4 = value;
        setProperty("twist4", value);
        return this;
    }

    /** Yellow angle
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     */
    public double getTwist4()
    {
        return m_Twist4;
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

