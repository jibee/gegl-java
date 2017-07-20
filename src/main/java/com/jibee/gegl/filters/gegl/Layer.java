package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;

/**
 * Layer
 *
 * A layer in the traditional sense
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"meta"})
public class Layer extends GeglFilter implements Source, DualSink
{
    /** Constructs a Layer.
     *
     * A layer in the traditional sense
     */
    public Layer(GeglNode container)
    {
        super(container, "gegl:layer");
    }
    /** Constructs a Layer.
     *
     * A layer in the traditional sense
     */
    public Layer(GeglFilter parent)
    {
        super(parent, "gegl:layer");
    }

    
    /** Operation
     *
     * Composite operation to use
     *
     * Unit: 
     * Default value: "gegl:over"
     * Acceptable Range:  
     * */
    private String m_CompositeOp  = "gegl:over";

    /** Operation
     *
     * Composite operation to use
     *
     * Unit: 
     * Default value: "gegl:over"
     * Acceptable Range:  
     */
    public Layer setCompositeOp(String value)
    {
	
        m_CompositeOp = value;
        setProperty("composite-op", value);
        return this;
    }

    /** Operation
     *
     * Composite operation to use
     *
     * Unit: 
     * Default value: "gegl:over"
     * Acceptable Range:  
     */
    public String getCompositeOp()
    {
        return m_CompositeOp;
    }


    /** Opacity
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Opacity  = 1.00;

    /** Opacity
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     */
    public Layer setOpacity(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Opacity = value;
        setProperty("opacity", value);
        return this;
    }

    /** Opacity
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     */
    public double getOpacity()
    {
        return m_Opacity;
    }


    /** X
     *
     * Horizontal position in pixels
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_X  = 0.00;

    /** X
     *
     * Horizontal position in pixels
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     */
    public Layer setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** X
     *
     * Horizontal position in pixels
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getX()
    {
        return m_X;
    }


    /** Y
     *
     * Vertical position in pixels
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Y  = 0.00;

    /** Y
     *
     * Vertical position in pixels
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     */
    public Layer setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Y
     *
     * Vertical position in pixels
     *
     * Unit: pixel-coordinate
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getY()
    {
        return m_Y;
    }


    /** Scale
     *
     * Scale 1:1 size
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     * */
    private double m_Scale  = 1.00;

    /** Scale
     *
     * Scale 1:1 size
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public Layer setScale(double value)
    {
	
        m_Scale = value;
        setProperty("scale", value);
        return this;
    }

    /** Scale
     *
     * Scale 1:1 size
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public double getScale()
    {
        return m_Scale;
    }


    /** Source
     *
     * Source image file path (png, jpg, raw, svg, bmp, tif, ...)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Src ;

    /** Source
     *
     * Source image file path (png, jpg, raw, svg, bmp, tif, ...)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Layer setSrc(String value)
    {
	
        m_Src = value;
        setProperty("src", value);
        return this;
    }

    /** Source
     *
     * Source image file path (png, jpg, raw, svg, bmp, tif, ...)
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getSrc()
    {
        return m_Src;
    }

    @Override
    public InputPad Aux()
    {
        return new InputPad(this, "aux");
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

