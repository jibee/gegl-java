package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Invert in Perceptual space
 *
 * Inverts the components (except alpha), the result is the corresponding "negative" image.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class InvertGamma extends GeglFilter implements Source, Sink
{
    /** Constructs a Invert in Perceptual space.
     *
     * Inverts the components (except alpha), the result is the corresponding "negative" image.
     */
    public InvertGamma(GeglNode container)
    {
        super(container, "gegl:invert-gamma");
    }
    /** Constructs a Invert in Perceptual space.
     *
     * Inverts the components (except alpha), the result is the corresponding "negative" image.
     */
    public InvertGamma(GeglFilter parent)
    {
        super(parent, "gegl:invert-gamma");
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

