package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Weighted Blend
 *
 * blend two images using alpha values as weights
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=true, position_dependant=false, categories={"compositors", "blend"})
public class WeightedBlend extends GeglFilter implements CombiningFilter
{
    /** Constructs a Weighted Blend.
     *
     * blend two images using alpha values as weights
     *
     * @param container container node
     */
    public WeightedBlend(GeglNode container)
    {
        super(container, "gegl:weighted-blend");
    }
    /** Constructs a Weighted Blend.
     *
     * blend two images using alpha values as weights
     *
     * @param parent parent filter node
     */
    public WeightedBlend(GeglFilter parent)
    {
        super(parent, "gegl:weighted-blend");
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

