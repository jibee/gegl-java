package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Stretch Contrast
 *
 * Scales the components of the buffer to be in the 0.0-1.0 range. This improves images that make poor use of the available contrast (little contrast, very dark, or very bright images).
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=true, position_dependant=false, categories={"color", "enhance"})
public class StretchContrast extends GeglFilter implements Filter
{
    /** Constructs a Stretch Contrast.
     *
     * Scales the components of the buffer to be in the 0.0-1.0 range. This improves images that make poor use of the available contrast (little contrast, very dark, or very bright images).
     *
     * @param container container node
     */
    public StretchContrast(GeglNode container)
    {
        super(container, "gegl:stretch-contrast");
    }
    /** Constructs a Stretch Contrast.
     *
     * Scales the components of the buffer to be in the 0.0-1.0 range. This improves images that make poor use of the available contrast (little contrast, very dark, or very bright images).
     *
     * @param parent parent filter node
     */
    public StretchContrast(GeglFilter parent)
    {
        super(parent, "gegl:stretch-contrast");
    }

    
    /** Keep colors
     *
     * Impact each channel with the same amount
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_KeepColors  = true;

    /** Keep colors
     *
     * Impact each channel with the same amount
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Keep colors
     * @return this filter (for chaining operations)
     * 
     */
    public StretchContrast setKeepColors(boolean value)
    {
	
        m_KeepColors = value;
        setProperty("keep-colors", value);
        return this;
    }

    /** Keep colors
     *
     * Impact each channel with the same amount
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Keep colors
     * 
     */
    public boolean getKeepColors()
    {
        return m_KeepColors;
    }


    /** Non-linear components
     *
     * When set operate on gamma corrected values instead of linear RGB - acting like the old normalize filter in GIMP
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Perceptual  = false;

    /** Non-linear components
     *
     * When set operate on gamma corrected values instead of linear RGB - acting like the old normalize filter in GIMP
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Non-linear components
     * @return this filter (for chaining operations)
     * 
     */
    public StretchContrast setPerceptual(boolean value)
    {
	
        m_Perceptual = value;
        setProperty("perceptual", value);
        return this;
    }

    /** Non-linear components
     *
     * When set operate on gamma corrected values instead of linear RGB - acting like the old normalize filter in GIMP
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Non-linear components
     * 
     */
    public boolean getPerceptual()
    {
        return m_Perceptual;
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

