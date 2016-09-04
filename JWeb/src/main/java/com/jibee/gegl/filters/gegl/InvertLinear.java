package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Invert
 *
 * Inverts the components (except alpha), the result is the corresponding "negative" image.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class InvertLinear extends GeglFilter implements Source, Sink
{
    /** Constructs a Invert.
     *
     * Inverts the components (except alpha), the result is the corresponding "negative" image.
     */
    public InvertLinear(GeglNode container)
    {
        super(container, "gegl:invert-linear");
    }
    /** Constructs a Invert.
     *
     * Inverts the components (except alpha), the result is the corresponding "negative" image.
     */
    public InvertLinear(GeglFilter parent)
    {
        super(parent, "gegl:invert-linear");
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

