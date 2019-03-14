package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Image Gradient
 *
 * Compute gradient magnitude and/or direction by central differencies
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"edge-detect"})
public class ImageGradient extends GeglFilter implements Filter
{
    /** Constructs a Image Gradient.
     *
     * Compute gradient magnitude and/or direction by central differencies
     *
     * @param container container node
     */
    public ImageGradient(GeglNode container)
    {
        super(container, "gegl:image-gradient");
    }
    /** Constructs a Image Gradient.
     *
     * Compute gradient magnitude and/or direction by central differencies
     *
     * @param parent parent filter node
     */
    public ImageGradient(GeglFilter parent)
    {
        super(parent, "gegl:image-gradient");
    }

    
    /** Output mode
     *
     * Output Mode
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_OutputMode ;

    /** Output mode
     *
     * Output Mode
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Output mode
     * @return this filter (for chaining operations)
     * 
     */
    public ImageGradient setOutputMode(String value)
    {
	
        m_OutputMode = value;
        setProperty("output-mode", value);
        return this;
    }

    /** Output mode
     *
     * Output Mode
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Output mode
     * 
     */
    public String getOutputMode()
    {
        return m_OutputMode;
    }

    @Override
    public InputPad<ImageGradient> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ImageGradient> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

