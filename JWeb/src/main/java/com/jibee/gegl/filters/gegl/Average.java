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
 * Image blending operation 'average' (<tt>c = (cA + aB)/2</tt>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "blend"})
public class Average extends GeglFilter implements Source, DualSink
{
    /** Constructs a .
     *
     * Image blending operation 'average' (<tt>c = (cA + aB)/2</tt>)
     */
    public Average(GeglNode container)
    {
        super(container, "gegl:average");
    }
    /** Constructs a .
     *
     * Image blending operation 'average' (<tt>c = (cA + aB)/2</tt>)
     */
    public Average(GeglFilter parent)
    {
        super(parent, "gegl:average");
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

