package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Stretch Contrast HSV
 *
 * Scales the components of the buffer to be in the 0.0-1.0 range. This improves images that make poor use of the available contrast (little contrast, very dark, or very bright images). This version differs from Contrast Autostretch in that it works in HSV space, and preserves hue.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color", "enhance"})
public class StretchContrastHsv extends GeglFilter implements Filter
{
    /** Constructs a Stretch Contrast HSV.
     *
     * Scales the components of the buffer to be in the 0.0-1.0 range. This improves images that make poor use of the available contrast (little contrast, very dark, or very bright images). This version differs from Contrast Autostretch in that it works in HSV space, and preserves hue.
     *
     * @param container container node
     */
    public StretchContrastHsv(GeglNode container)
    {
        super(container, "gegl:stretch-contrast-hsv");
    }
    /** Constructs a Stretch Contrast HSV.
     *
     * Scales the components of the buffer to be in the 0.0-1.0 range. This improves images that make poor use of the available contrast (little contrast, very dark, or very bright images). This version differs from Contrast Autostretch in that it works in HSV space, and preserves hue.
     *
     * @param parent parent filter node
     */
    public StretchContrastHsv(GeglFilter parent)
    {
        super(parent, "gegl:stretch-contrast-hsv");
    }

        @Override
    public InputPad<StretchContrastHsv> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<StretchContrastHsv> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

