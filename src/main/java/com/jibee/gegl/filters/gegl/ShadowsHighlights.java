package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Shadows-Highlights
 *
 * Perform shadows and highlights correction
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"light"})
public class ShadowsHighlights extends GeglFilter implements Filter
{
    /** Constructs a Shadows-Highlights.
     *
     * Perform shadows and highlights correction
     *
     * @param container container node
     */
    public ShadowsHighlights(GeglNode container)
    {
        super(container, "gegl:shadows-highlights");
    }
    /** Constructs a Shadows-Highlights.
     *
     * Perform shadows and highlights correction
     *
     * @param parent parent filter node
     */
    public ShadowsHighlights(GeglFilter parent)
    {
        super(parent, "gegl:shadows-highlights");
    }

    
    /** Shadows
     *
     * Adjust exposure of shadows
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_Shadows  = 0.00;

    /** Shadows
     *
     * Adjust exposure of shadows
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Shadows
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ShadowsHighlights setShadows(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_Shadows = value;
        setProperty("shadows", value);
        return this;
    }

    /** Shadows
     *
     * Adjust exposure of shadows
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Shadows
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getShadows()
    {
        return m_Shadows;
    }


    /** Highlights
     *
     * Adjust exposure of highlights
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_Highlights  = 0.00;

    /** Highlights
     *
     * Adjust exposure of highlights
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Highlights
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ShadowsHighlights setHighlights(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_Highlights = value;
        setProperty("highlights", value);
        return this;
    }

    /** Highlights
     *
     * Adjust exposure of highlights
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Highlights
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getHighlights()
    {
        return m_Highlights;
    }


    /** White point adjustment
     *
     * Shift white point
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -10.00 10.00
     * */
    private double m_Whitepoint  = 0.00;

    /** White point adjustment
     *
     * Shift white point
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -10.00 10.00
     *
     * @param value new value for White point adjustment
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ShadowsHighlights setWhitepoint(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < -10.00)
	    {
	        throw new ParameterOutOfRangeException(value, -10.00, 10.00);
	    }

        m_Whitepoint = value;
        setProperty("whitepoint", value);
        return this;
    }

    /** White point adjustment
     *
     * Shift white point
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -10.00 10.00
     *
     * @return value of White point adjustment
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getWhitepoint()
    {
        return m_Whitepoint;
    }


    /** Radius
     *
     * Spatial extent
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.10 1500.00
     * */
    private double m_Radius  = 100.00;

    /** Radius
     *
     * Spatial extent
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.10 1500.00
     *
     * @param value new value for Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ShadowsHighlights setRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 1500.00 || value < 0.10)
	    {
	        throw new ParameterOutOfRangeException(value, 0.10, 1500.00);
	    }

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * Spatial extent
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.10 1500.00
     *
     * @return value of Radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRadius()
    {
        return m_Radius;
    }


    /** Compress
     *
     * Compress the effect on shadows/highlights and preserve midtones
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_Compress  = 50.00;

    /** Compress
     *
     * Compress the effect on shadows/highlights and preserve midtones
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Compress
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ShadowsHighlights setCompress(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_Compress = value;
        setProperty("compress", value);
        return this;
    }

    /** Compress
     *
     * Compress the effect on shadows/highlights and preserve midtones
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Compress
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCompress()
    {
        return m_Compress;
    }


    /** Shadows color adjustment
     *
     * Adjust saturation of shadows
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_ShadowsCcorrect  = 100.00;

    /** Shadows color adjustment
     *
     * Adjust saturation of shadows
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Shadows color adjustment
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ShadowsHighlights setShadowsCcorrect(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_ShadowsCcorrect = value;
        setProperty("shadows-ccorrect", value);
        return this;
    }

    /** Shadows color adjustment
     *
     * Adjust saturation of shadows
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Shadows color adjustment
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getShadowsCcorrect()
    {
        return m_ShadowsCcorrect;
    }


    /** Highlights color adjustment
     *
     * Adjust saturation of highlights
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_HighlightsCcorrect  = 50.00;

    /** Highlights color adjustment
     *
     * Adjust saturation of highlights
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Highlights color adjustment
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ShadowsHighlights setHighlightsCcorrect(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_HighlightsCcorrect = value;
        setProperty("highlights-ccorrect", value);
        return this;
    }

    /** Highlights color adjustment
     *
     * Adjust saturation of highlights
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Highlights color adjustment
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getHighlightsCcorrect()
    {
        return m_HighlightsCcorrect;
    }

    @Override
    public InputPad<ShadowsHighlights> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ShadowsHighlights> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

