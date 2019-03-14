package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Video Degradation
 *
 * This function simulates the degradation of being on an old low-dotpitch RGB video monitor.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"distort"})
public class VideoDegradation extends GeglFilter implements Filter
{
    /** Constructs a Video Degradation.
     *
     * This function simulates the degradation of being on an old low-dotpitch RGB video monitor.
     *
     * @param container container node
     */
    public VideoDegradation(GeglNode container)
    {
        super(container, "gegl:video-degradation");
    }
    /** Constructs a Video Degradation.
     *
     * This function simulates the degradation of being on an old low-dotpitch RGB video monitor.
     *
     * @param parent parent filter node
     */
    public VideoDegradation(GeglFilter parent)
    {
        super(parent, "gegl:video-degradation");
    }

    
    /** Pattern
     *
     * Type of RGB pattern to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Pattern ;

    /** Pattern
     *
     * Type of RGB pattern to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Pattern
     * @return this filter (for chaining operations)
     * 
     */
    public VideoDegradation setPattern(String value)
    {
	
        m_Pattern = value;
        setProperty("pattern", value);
        return this;
    }

    /** Pattern
     *
     * Type of RGB pattern to use
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


    /** Additive
     *
     * Whether the function adds the result to the original image.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Additive  = true;

    /** Additive
     *
     * Whether the function adds the result to the original image.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Additive
     * @return this filter (for chaining operations)
     * 
     */
    public VideoDegradation setAdditive(boolean value)
    {
	
        m_Additive = value;
        setProperty("additive", value);
        return this;
    }

    /** Additive
     *
     * Whether the function adds the result to the original image.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Additive
     * 
     */
    public boolean getAdditive()
    {
        return m_Additive;
    }


    /** Rotated
     *
     * Whether to rotate the RGB pattern by ninety degrees.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Rotated  = false;

    /** Rotated
     *
     * Whether to rotate the RGB pattern by ninety degrees.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Rotated
     * @return this filter (for chaining operations)
     * 
     */
    public VideoDegradation setRotated(boolean value)
    {
	
        m_Rotated = value;
        setProperty("rotated", value);
        return this;
    }

    /** Rotated
     *
     * Whether to rotate the RGB pattern by ninety degrees.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Rotated
     * 
     */
    public boolean getRotated()
    {
        return m_Rotated;
    }

    @Override
    public InputPad<VideoDegradation> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<VideoDegradation> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

