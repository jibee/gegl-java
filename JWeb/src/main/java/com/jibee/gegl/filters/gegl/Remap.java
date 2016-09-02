package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;

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

        public InputPad Aux2()
    {
        return new InputPad(this, "aux2");
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

