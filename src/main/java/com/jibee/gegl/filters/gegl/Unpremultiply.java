package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Unpremultiply alpha
 *
 * Unpremultiplies a buffer that contains pre-multiplied colors (but according to the babl format is not.)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class Unpremultiply extends GeglFilter implements Filter
{
    /** Constructs a Unpremultiply alpha.
     *
     * Unpremultiplies a buffer that contains pre-multiplied colors (but according to the babl format is not.)
     *
     * @param container container node
     */
    public Unpremultiply(GeglNode container)
    {
        super(container, "gegl:unpremultiply");
    }
    /** Constructs a Unpremultiply alpha.
     *
     * Unpremultiplies a buffer that contains pre-multiplied colors (but according to the babl format is not.)
     *
     * @param parent parent filter node
     */
    public Unpremultiply(GeglFilter parent)
    {
        super(parent, "gegl:unpremultiply");
    }

        @Override
    public InputPad<Unpremultiply> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Unpremultiply> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

