package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * 
 *
 * Unpremultiplies a buffer that contains pre-multiplied colors (but is marked as not having it)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class Unpremul extends GeglFilter implements Source, Sink
{
    /** Constructs a .
     *
     * Unpremultiplies a buffer that contains pre-multiplied colors (but is marked as not having it)
     */
    public Unpremul(GeglNode container)
    {
        super(container, "gegl:unpremul");
    }
    /** Constructs a .
     *
     * Unpremultiplies a buffer that contains pre-multiplied colors (but is marked as not having it)
     */
    public Unpremul(GeglFilter parent)
    {
        super(parent, "gegl:unpremul");
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

