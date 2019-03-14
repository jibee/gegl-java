package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Invert in Perceptual space
 *
 * Invert the components (except alpha) perceptually, the result is the corresponding "negative" image.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class InvertGamma extends GeglFilter implements Filter
{
    /** Constructs a Invert in Perceptual space.
     *
     * Invert the components (except alpha) perceptually, the result is the corresponding "negative" image.
     *
     * @param container container node
     */
    public InvertGamma(GeglNode container)
    {
        super(container, "gegl:invert-gamma");
    }
    /** Constructs a Invert in Perceptual space.
     *
     * Invert the components (except alpha) perceptually, the result is the corresponding "negative" image.
     *
     * @param parent parent filter node
     */
    public InvertGamma(GeglFilter parent)
    {
        super(parent, "gegl:invert-gamma");
    }

        @Override
    public InputPad<InvertGamma> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<InvertGamma> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

