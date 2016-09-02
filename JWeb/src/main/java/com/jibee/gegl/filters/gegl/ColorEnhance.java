package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

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
public class ColorEnhance extends GeglFilter
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

        public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

