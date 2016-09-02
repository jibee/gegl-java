package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * 
 *
 * SVG color matrix operation svg_luminancetoalpha
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "svgfilter"})
public class SvgLuminancetoalpha extends GeglFilter
{
    /** Constructs a .
     *
     * SVG color matrix operation svg_luminancetoalpha
     */
    public SvgLuminancetoalpha(GeglNode container)
    {
        super(container, "gegl:svg-luminancetoalpha");
    }
    /** Constructs a .
     *
     * SVG color matrix operation svg_luminancetoalpha
     */
    public SvgLuminancetoalpha(GeglFilter parent)
    {
        super(parent, "gegl:svg-luminancetoalpha");
    }

        public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

