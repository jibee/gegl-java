package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;

/**
 * Weighted Blend
 *
 * blend two images using alpha values as weights
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"compositors", "blend"})
public class WeightedBlend extends GeglFilter
{
    /** Constructs a Weighted Blend.
     *
     * blend two images using alpha values as weights
     */
    public WeightedBlend(GeglNode container)
    {
        super(container, "gegl:weighted-blend");
    }
    /** Constructs a Weighted Blend.
     *
     * blend two images using alpha values as weights
     */
    public WeightedBlend(GeglFilter parent)
    {
        super(parent, "gegl:weighted-blend");
    }

        public InputPad Aux()
    {
        return new InputPad(this, "aux");
    }

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

