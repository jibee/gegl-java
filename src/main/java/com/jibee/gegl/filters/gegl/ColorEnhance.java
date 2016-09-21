package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Color Enhance
 *
 * Stretch color chroma to cover maximum possible range, keeping hue and lightness untouched.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color", "enhance"})
public class ColorEnhance extends GeglFilter implements Source, Sink
{
    /** Constructs a Color Enhance.
     *
     * Stretch color chroma to cover maximum possible range, keeping hue and lightness untouched.
     */
    public ColorEnhance(GeglNode container)
    {
        super(container, "gegl:color-enhance");
    }
    /** Constructs a Color Enhance.
     *
     * Stretch color chroma to cover maximum possible range, keeping hue and lightness untouched.
     */
    public ColorEnhance(GeglFilter parent)
    {
        super(parent, "gegl:color-enhance");
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

