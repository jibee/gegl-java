package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * Remap
 *
 * stretch components of pixels individually based on luminance envelopes
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors"})
public class Remap extends GeglFilter implements Source, DualSink
{
    /** Constructs a Remap.
     *
     * stretch components of pixels individually based on luminance envelopes
     */
    public Remap(GeglNode container)
    {
        super(container, "gegl:remap");
    }
    /** Constructs a Remap.
     *
     * stretch components of pixels individually based on luminance envelopes
     */
    public Remap(GeglFilter parent)
    {
        super(parent, "gegl:remap");
    }

        public InputPad Aux2()
    {
        return new InputPad(this, "aux2");
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

