package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * 
 *
 * Image blending operation 'soft-dodge' (<tt>c = (cA+cB<1.0)?0.5*cA / (1.0 - cB):1.0-0.5*(1.0 - cB)/cA</tt>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "blend"})
public class SoftDodge extends GeglFilter
{
    /** Constructs a .
     *
     * Image blending operation 'soft-dodge' (<tt>c = (cA+cB<1.0)?0.5*cA / (1.0 - cB):1.0-0.5*(1.0 - cB)/cA</tt>)
     */
    public SoftDodge(GeglNode container)
    {
        super(container, "gegl:soft-dodge");
    }
    /** Constructs a .
     *
     * Image blending operation 'soft-dodge' (<tt>c = (cA+cB<1.0)?0.5*cA / (1.0 - cB):1.0-0.5*(1.0 - cB)/cA</tt>)
     */
    public SoftDodge(GeglFilter parent)
    {
        super(parent, "gegl:soft-dodge");
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

