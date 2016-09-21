package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Make Grey
 *
 * Turns the image grayscale
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"grayscale", "color"})
public class Gray extends GeglFilter implements Source, Sink
{
    /** Constructs a Make Grey.
     *
     * Turns the image grayscale
     */
    public Gray(GeglNode container)
    {
        super(container, "gegl:gray");
    }
    /** Constructs a Make Grey.
     *
     * Turns the image grayscale
     */
    public Gray(GeglFilter parent)
    {
        super(parent, "gegl:gray");
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

