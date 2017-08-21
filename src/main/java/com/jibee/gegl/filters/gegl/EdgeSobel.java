package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Sobel Edge Detection
 *
 * Specialized direction-dependent edge detection
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"edge-detect"})
public class EdgeSobel extends GeglFilter implements Source, Sink
{
    /** Constructs a Sobel Edge Detection.
     *
     * Specialized direction-dependent edge detection
     *
     * @param container container node
     */
    public EdgeSobel(GeglNode container)
    {
        super(container, "gegl:edge-sobel");
    }
    /** Constructs a Sobel Edge Detection.
     *
     * Specialized direction-dependent edge detection
     *
     * @param parent parent filter node
     */
    public EdgeSobel(GeglFilter parent)
    {
        super(parent, "gegl:edge-sobel");
    }

    
    /** Horizontal
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Horizontal  = true;

    /** Horizontal
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Horizontal
     * @return this filter (for chaining operations)
     * 
     */
    public EdgeSobel setHorizontal(boolean value)
    {
	
        m_Horizontal = value;
        setProperty("horizontal", value);
        return this;
    }

    /** Horizontal
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Horizontal
     * 
     */
    public boolean getHorizontal()
    {
        return m_Horizontal;
    }


    /** Vertical
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Vertical  = true;

    /** Vertical
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Vertical
     * @return this filter (for chaining operations)
     * 
     */
    public EdgeSobel setVertical(boolean value)
    {
	
        m_Vertical = value;
        setProperty("vertical", value);
        return this;
    }

    /** Vertical
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Vertical
     * 
     */
    public boolean getVertical()
    {
        return m_Vertical;
    }


    /** Keep Sign
     *
     * Keep negative values in result; when off, the absolute value of the result is used instead.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_KeepSign  = true;

    /** Keep Sign
     *
     * Keep negative values in result; when off, the absolute value of the result is used instead.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Keep Sign
     * @return this filter (for chaining operations)
     * 
     */
    public EdgeSobel setKeepSign(boolean value)
    {
	
        m_KeepSign = value;
        setProperty("keep-sign", value);
        return this;
    }

    /** Keep Sign
     *
     * Keep negative values in result; when off, the absolute value of the result is used instead.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Keep Sign
     * 
     */
    public boolean getKeepSign()
    {
        return m_KeepSign;
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

