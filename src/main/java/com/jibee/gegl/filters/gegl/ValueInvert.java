package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Value Invert
 *
 * Invert the value component, the result has the brightness inverted, keeping the color.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class ValueInvert extends GeglFilter implements Filter
{
    /** Constructs a Value Invert.
     *
     * Invert the value component, the result has the brightness inverted, keeping the color.
     *
     * @param container container node
     */
    public ValueInvert(GeglNode container)
    {
        super(container, "gegl:value-invert");
    }
    /** Constructs a Value Invert.
     *
     * Invert the value component, the result has the brightness inverted, keeping the color.
     *
     * @param parent parent filter node
     */
    public ValueInvert(GeglFilter parent)
    {
        super(parent, "gegl:value-invert");
    }

        @Override
    public InputPad<ValueInvert> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ValueInvert> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

