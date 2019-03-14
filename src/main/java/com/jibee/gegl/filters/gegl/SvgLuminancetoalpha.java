package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * SVG Luminance to Alpha
 *
 * SVG color matrix operation svg_luminancetoalpha
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class SvgLuminancetoalpha extends GeglFilter implements Filter
{
    /** Constructs a SVG Luminance to Alpha.
     *
     * SVG color matrix operation svg_luminancetoalpha
     *
     * @param container container node
     */
    public SvgLuminancetoalpha(GeglNode container)
    {
        super(container, "gegl:svg-luminancetoalpha");
    }
    /** Constructs a SVG Luminance to Alpha.
     *
     * SVG color matrix operation svg_luminancetoalpha
     *
     * @param parent parent filter node
     */
    public SvgLuminancetoalpha(GeglFilter parent)
    {
        super(parent, "gegl:svg-luminancetoalpha");
    }

        @Override
    public InputPad<SvgLuminancetoalpha> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<SvgLuminancetoalpha> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

