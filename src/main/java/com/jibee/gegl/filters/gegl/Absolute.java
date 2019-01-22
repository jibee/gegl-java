package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Absolute
 *
 * makes each linear RGB component be the absolute of its value, fabs(input_value)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class Absolute extends GeglFilter implements Filter
{
    /** Constructs a Absolute.
     *
     * makes each linear RGB component be the absolute of its value, fabs(input_value)
     *
     * @param container container node
     */
    public Absolute(GeglNode container)
    {
        super(container, "gegl:absolute");
    }
    /** Constructs a Absolute.
     *
     * makes each linear RGB component be the absolute of its value, fabs(input_value)
     *
     * @param parent parent filter node
     */
    public Absolute(GeglFilter parent)
    {
        super(parent, "gegl:absolute");
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

