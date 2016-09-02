package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * No Operation
 *
 * No operation (can be used as a routing point)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"core"})
public class Nop extends GeglFilter
{
    /** Constructs a No Operation.
     *
     * No operation (can be used as a routing point)
     */
    public Nop(GeglNode container)
    {
        super(container, "gegl:nop");
    }
    /** Constructs a No Operation.
     *
     * No operation (can be used as a routing point)
     */
    public Nop(GeglFilter parent)
    {
        super(parent, "gegl:nop");
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

