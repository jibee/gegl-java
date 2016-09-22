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
 * Image blending operation 'subtractive' (<tt>c = cA+cB-1.0</tt>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "blend"})
public class Subtractive extends GeglFilter implements Source, DualSink
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
