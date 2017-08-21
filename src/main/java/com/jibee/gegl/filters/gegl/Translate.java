package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Translate
 *
 * Repositions the buffer (with subpixel precision), if integer coordinates are passed a fast-path without resampling is used
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"transform"})
public class Translate extends GeglFilter implements Source, Sink
{
    /** Constructs a Translate.
     *
     * Repositions the buffer (with subpixel precision), if integer coordinates are passed a fast-path without resampling is used
     *
     * @param container container node
     */
    public Translate(GeglNode container)
    {
        super(container, "gegl:translate");
    }
    /** Constructs a Translate.
     *
     * Repositions the buffer (with subpixel precision), if integer coordinates are passed a fast-path without resampling is used
     *
     * @param parent parent filter node
     */
    public Translate(GeglFilter parent)
    {
        super(parent, "gegl:translate");
    }

    
    /** Origin-x
     *
     * X coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_OriginX  = 0.00;

    /** Origin-x
     *
     * X coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for Origin-x
     * @return this filter (for chaining operations)
     * 
     */
    public Translate setOriginX(double value)
    {
	
        m_OriginX = value;
        setProperty("origin-x", value);
        return this;
    }

    /** Origin-x
     *
     * X coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of Origin-x
     * 
     */
    public double getOriginX()
    {
        return m_OriginX;
    }


    /** Origin-y
     *
     * Y coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_OriginY  = 0.00;

    /** Origin-y
     *
     * Y coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for Origin-y
     * @return this filter (for chaining operations)
     * 
     */
    public Translate setOriginY(double value)
    {
	
        m_OriginY = value;
        setProperty("origin-y", value);
        return this;
    }

    /** Origin-y
     *
     * Y coordinate of origin
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of Origin-y
     * 
     */
    public double getOriginY()
    {
        return m_OriginY;
    }


    /** Sampler
     *
     * Sampler used internally
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Sampler ;

    /** Sampler
     *
     * Sampler used internally
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Sampler
     * @return this filter (for chaining operations)
     * 
     */
    public Translate setSampler(String value)
    {
	
        m_Sampler = value;
        setProperty("sampler", value);
        return this;
    }

    /** Sampler
     *
     * Sampler used internally
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Sampler
     * 
     */
    public String getSampler()
    {
        return m_Sampler;
    }


    /** Clip to input
     *
     * Force output bounding box to be input bounding box.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_ClipToInput  = false;

    /** Clip to input
     *
     * Force output bounding box to be input bounding box.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Clip to input
     * @return this filter (for chaining operations)
     * 
     */
    public Translate setClipToInput(boolean value)
    {
	
        m_ClipToInput = value;
        setProperty("clip-to-input", value);
        return this;
    }

    /** Clip to input
     *
     * Force output bounding box to be input bounding box.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Clip to input
     * 
     */
    public boolean getClipToInput()
    {
        return m_ClipToInput;
    }


    /** X
     *
     * Horizontal translation
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_X  = 0.00;

    /** X
     *
     * Horizontal translation
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for X
     * @return this filter (for chaining operations)
     * 
     */
    public Translate setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** X
     *
     * Horizontal translation
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of X
     * 
     */
    public double getX()
    {
        return m_X;
    }


    /** Y
     *
     * Vertical translation
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Y  = 0.00;

    /** Y
     *
     * Vertical translation
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for Y
     * @return this filter (for chaining operations)
     * 
     */
    public Translate setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Y
     *
     * Vertical translation
     *
     * Unit: pixel-distance
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @return value of Y
     * 
     */
    public double getY()
    {
        return m_Y;
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

