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
 * Horizontally stack inputs, (in "output" "aux" is placed to the right of "input")
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"misc"})
public class Hstack extends GeglFilter implements Source, DualSink
{
    /** Constructs a .
     *
     * Horizontally stack inputs, (in "output" "aux" is placed to the right of "input")
     */
    public Hstack(GeglNode container)
    {
        super(container, "gegl:hstack");
    }
    /** Constructs a .
     *
     * Horizontally stack inputs, (in "output" "aux" is placed to the right of "input")
     */
    public Hstack(GeglFilter parent)
    {
        super(parent, "gegl:hstack");
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

