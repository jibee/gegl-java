package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Invert
 *
 * Invert the components (except alpha) in linear light, the result is the corresponding "negative" image.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class InvertLinear extends GeglFilter implements Filter
{
    /** Constructs a Invert.
     *
     * Invert the components (except alpha) in linear light, the result is the corresponding "negative" image.
     *
     * @param container container node
     */
    public InvertLinear(GeglNode container)
    {
        super(container, "gegl:invert-linear");
    }
    /** Constructs a Invert.
     *
     * Invert the components (except alpha) in linear light, the result is the corresponding "negative" image.
     *
     * @param parent parent filter node
     */
    public InvertLinear(GeglFilter parent)
    {
        super(parent, "gegl:invert-linear");
    }

        @Override
    public InputPad<InvertLinear> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<InvertLinear> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

