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
 * Image blending operation 'soft-burn' (<tt>c = (cA+cB<1.0)?0.5*cB / (1.0 - cA):1.0-0.5*(1.0 - cA) / cB</tt>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "blend"})
public class SoftBurn extends GeglFilter implements Source, DualSink
{
    /** Constructs a .
     *
     * Image blending operation 'soft-burn' (<tt>c = (cA+cB<1.0)?0.5*cB / (1.0 - cA):1.0-0.5*(1.0 - cA) / cB</tt>)
     */
    public SoftBurn(GeglNode container)
    {
        super(container, "gegl:soft-burn");
    }
    /** Constructs a .
     *
     * Image blending operation 'soft-burn' (<tt>c = (cA+cB<1.0)?0.5*cB / (1.0 - cA):1.0-0.5*(1.0 - cA) / cB</tt>)
     */
    public SoftBurn(GeglFilter parent)
    {
        super(parent, "gegl:soft-burn");
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

