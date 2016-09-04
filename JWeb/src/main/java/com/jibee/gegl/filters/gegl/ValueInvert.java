package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Value Invert
 *
 * Inverts just the value component, the result is the corresponding 'inverted' image.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class ValueInvert extends GeglFilter implements Source, Sink
{
    /** Constructs a Value Invert.
     *
     * Inverts just the value component, the result is the corresponding 'inverted' image.
     */
    public ValueInvert(GeglNode container)
    {
        super(container, "gegl:value-invert");
    }
    /** Constructs a Value Invert.
     *
     * Inverts just the value component, the result is the corresponding 'inverted' image.
     */
    public ValueInvert(GeglFilter parent)
    {
        super(parent, "gegl:value-invert");
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

