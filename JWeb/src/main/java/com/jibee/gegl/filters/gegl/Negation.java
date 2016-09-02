package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;

/**
 * 
 *
 * Image blending operation 'negation' (<tt>c = 1.0 - fabs(1.0-cA-cB)</tt>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "blend"})
public class Negation extends GeglFilter
{
    /** Constructs a .
     *
     * Image blending operation 'negation' (<tt>c = 1.0 - fabs(1.0-cA-cB)</tt>)
     */
    public Negation(GeglNode container)
    {
        super(container, "gegl:negation");
    }
    /** Constructs a .
     *
     * Image blending operation 'negation' (<tt>c = 1.0 - fabs(1.0-cA-cB)</tt>)
     */
    public Negation(GeglFilter parent)
    {
        super(parent, "gegl:negation");
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

