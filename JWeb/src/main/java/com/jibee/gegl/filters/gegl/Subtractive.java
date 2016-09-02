package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * 
 *
 * Image blending operation 'subtractive' (<tt>c = cA+cB-1.0</tt>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "blend"})
public class Subtractive extends GeglFilter
{
    /** Constructs a .
     *
     * Image blending operation 'subtractive' (<tt>c = cA+cB-1.0</tt>)
     */
    public Subtractive(GeglNode container)
    {
        super(container, "gegl:subtractive");
    }
    /** Constructs a .
     *
     * Image blending operation 'subtractive' (<tt>c = cA+cB-1.0</tt>)
     */
    public Subtractive(GeglFilter parent)
    {
        super(parent, "gegl:subtractive");
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

