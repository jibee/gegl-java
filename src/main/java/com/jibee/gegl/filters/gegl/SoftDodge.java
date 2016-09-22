package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

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
public class SoftDodge extends GeglFilter implements Source, DualSink
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
