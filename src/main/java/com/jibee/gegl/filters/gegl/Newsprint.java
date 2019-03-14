package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Newsprint
 *
 * Digital halftoning with optional modulations. 
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"render"})
public class Newsprint extends GeglFilter implements Filter
{
    /** Constructs a Newsprint.
     *
     * Digital halftoning with optional modulations. 
     *
     * @param container container node
     */
    public Newsprint(GeglNode container)
    {
        super(container, "gegl:newsprint");
    }
    /** Constructs a Newsprint.
     *
     * Digital halftoning with optional modulations. 
     *
     * @param parent parent filter node
     */
    public Newsprint(GeglFilter parent)
    {
        super(parent, "gegl:newsprint");
    }

    
    /** Color Model
     *
     * How many inks to use just black, rg, rgb (additive), or cmyk
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_ColorModel ;

    /** Color Model
     *
     * How many inks to use just black, rg, rgb (additive), or cmyk
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Color Model
     * @return this filter (for chaining operations)
     * 
     */
    public Newsprint setColorModel(String value)
    {
	
        m_ColorModel = value;
        setProperty("color-model", value);
        return this;
    }

    /** Color Model
     *
     * How many inks to use just black, rg, rgb (additive), or cmyk
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Color Model
     * 
     */
    public String getColorModel()
    {
        return m_ColorModel;
    }


    /** Pattern
     *
     * Halftoning/dot pattern to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Pattern ;

    /** Pattern
     *
     * Halftoning/dot pattern to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Pattern
     * @return this filter (for chaining operations)
     * 
     */
    public Newsprint setPattern(String value)
    {
	
        m_Pattern = value;
        setProperty("pattern", value);
        return this;
    }

    /** Pattern
     *
     * Halftoning/dot pattern to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Pattern
     * 
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
     *
     * @param value new value for Period
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Period
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Turbulence
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Turbulence
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getTurbulence()
    {
        return m_Turbulence;
    }


    /** Blocksize
     *
     * Number of periods per tile, this tiling avoids high frequency anomaly that angle boost causes
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -1.00 64.00
     * */
    private double m_Blocksize  = -1.00;

    /** Blocksize
     *
     * Number of periods per tile, this tiling avoids high frequency anomaly that angle boost causes
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -1.00 64.00
     *
     * @param value new value for Blocksize
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     * Number of periods per tile, this tiling avoids high frequency anomaly that angle boost causes
     *
     * Unit: 
     * Default value: -1.00
     * Acceptable Range: -1.00 64.00
     *
     * @return value of Blocksize
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBlocksize()
    {
        return m_Blocksize;
    }


    /** Angle Boost
     *
     * Multiplication factor for desired rotation of the local space for texture, the way this is computed makes it weak for desaturated colors and possibly stronger where there is color.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 4.00
     * */
    private double m_Angleboost  = 0.00;

    /** Angle Boost
     *
     * Multiplication factor for desired rotation of the local space for texture, the way this is computed makes it weak for desaturated colors and possibly stronger where there is color.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 4.00
     *
     * @param value new value for Angle Boost
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

    /** Angle Boost
     *
     * Multiplication factor for desired rotation of the local space for texture, the way this is computed makes it weak for desaturated colors and possibly stronger where there is color.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 4.00
     *
     * @return value of Angle Boost
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for [color-model {white-on-black,              black-on-white} : bw-label, color-model {rgb}            : rgb-label, color-model {cmyk}           : cmyk-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of [color-model {white-on-black,              black-on-white} : bw-label, color-model {rgb}            : rgb-label, color-model {cmyk}           : cmyk-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for [color-model {rgb}  : rgb-label, color-model {cmyk} : cmyk-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of [color-model {rgb}  : rgb-label, color-model {cmyk} : cmyk-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for [color-model {rgb}  : rgb-label, color-model {cmyk} : cmyk-label]
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of [color-model {rgb}  : rgb-label, color-model {cmyk} : cmyk-label]
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Yellow angle
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Yellow angle
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getTwist4()
    {
        return m_Twist4;
    }

    @Override
    public InputPad<Newsprint> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Newsprint> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

