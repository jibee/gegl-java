package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * No Operation
 *
 * No operation (can be used as a routing point)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"core"})
public class Nop extends GeglFilter implements Filter
{
    /** Constructs a No Operation.
     *
     * No operation (can be used as a routing point)
     *
     * @param container container node
     */
    public Nop(GeglNode container)
    {
        super(container, "gegl:nop");
    }
    /** Constructs a No Operation.
     *
     * No operation (can be used as a routing point)
     *
     * @param parent parent filter node
     */
    public Nop(GeglFilter parent)
    {
        super(parent, "gegl:nop");
    }

        @Override
    public InputPad<Nop> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Nop> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

