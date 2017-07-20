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
 * Scale ratio
 *
 * Scales the buffer according to a ratio.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"transform"})
public class ScaleRatio extends GeglFilter implements Source, Sink
{
    /** Constructs a Scale ratio.
     *
     * Scales the buffer according to a ratio.
     */
    public ScaleRatio(GeglNode container)
    {
        super(container, "gegl:scale-ratio");
    }
    /** Constructs a Scale ratio.
     *
     * Scales the buffer according to a ratio.
     */
    public ScaleRatio(GeglFilter parent)
    {
        super(parent, "gegl:scale-ratio");
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
     */
    public ScaleRatio setOriginX(double value)
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
     */
    public ScaleRatio setOriginY(double value)
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
     */
    public ScaleRatio setSampler(String value)
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
     */
    public ScaleRatio setClipToInput(boolean value)
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
     */
    public boolean getClipToInput()
    {
        return m_ClipToInput;
    }


    /** X
     *
     * Horizontal scale factor
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -9000.00 9000.00
     * */
    private double m_X  = 0.00;

    /** X
     *
     * Horizontal scale factor
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -9000.00 9000.00
     */
    public ScaleRatio setX(double value) throws ParameterOutOfRangeException
    {
		if(value > 9000.00 || value < -9000.00)
	{
	    throw new ParameterOutOfRangeException(value, -9000.00, 9000.00);
	}

        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** X
     *
     * Horizontal scale factor
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -9000.00 9000.00
     */
    public double getX()
    {
        return m_X;
    }


    /** Y
     *
     * Vertical scale factor
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -9000.00 9000.00
     * */
    private double m_Y  = 0.00;

    /** Y
     *
     * Vertical scale factor
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -9000.00 9000.00
     */
    public ScaleRatio setY(double value) throws ParameterOutOfRangeException
    {
		if(value > 9000.00 || value < -9000.00)
	{
	    throw new ParameterOutOfRangeException(value, -9000.00, 9000.00);
	}

        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Y
     *
     * Vertical scale factor
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -9000.00 9000.00
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

