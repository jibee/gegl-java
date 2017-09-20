package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Shear
 *
 * Shears the buffer. 
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"transform"})
public class Shear extends GeglFilter implements Filter
{
    /** Constructs a Shear.
     *
     * Shears the buffer. 
     *
     * @param container container node
     */
    public Shear(GeglNode container)
    {
        super(container, "gegl:shear");
    }
    /** Constructs a Shear.
     *
     * Shears the buffer. 
     *
     * @param parent parent filter node
     */
    public Shear(GeglFilter parent)
    {
        super(parent, "gegl:shear");
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
    public Shear setOriginX(double value)
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
    public Shear setOriginY(double value)
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
    public Shear setSampler(String value)
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
    public Shear setClipToInput(boolean value)
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
     * Horizontal shear amount
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_X  = 0.00;

    /** X
     *
     * Horizontal shear amount
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for X
     * @return this filter (for chaining operations)
     * 
     */
    public Shear setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** X
     *
     * Horizontal shear amount
     *
     * Unit: 
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
     * Vertical shear amount
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Y  = 0.00;

    /** Y
     *
     * Vertical shear amount
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     *
     * @param value new value for Y
     * @return this filter (for chaining operations)
     * 
     */
    public Shear setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Y
     *
     * Vertical shear amount
     *
     * Unit: 
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

