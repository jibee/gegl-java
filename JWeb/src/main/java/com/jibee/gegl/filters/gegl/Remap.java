package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * 
 *
 * stretch components of pixels individually based on luminance envelopes
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors"})
public class Remap extends GeglFilter
{
    /** Constructs a .
     *
     * stretch components of pixels individually based on luminance envelopes
     */
    public Remap(GeglNode container)
    {
        super(container, "gegl:remap");
    }
    /** Constructs a .
     *
     * stretch components of pixels individually based on luminance envelopes
     */
    public Remap(GeglFilter parent)
    {
        super(parent, "gegl:remap");
    }

        public InputPad aux2()
    {
        return new InputPad(this, "aux2");
    }

    public InputPad aux()
    {
        return new InputPad(this, "aux");
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

