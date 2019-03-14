package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Color Enhance
 *
 * Stretch color chroma to cover maximum possible range, keeping hue and lightness untouched.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color", "enhance"})
public class ColorEnhance extends GeglFilter implements Filter
{
    /** Constructs a Color Enhance.
     *
     * Stretch color chroma to cover maximum possible range, keeping hue and lightness untouched.
     *
     * @param container container node
     */
    public ColorEnhance(GeglNode container)
    {
        super(container, "gegl:color-enhance");
    }
    /** Constructs a Color Enhance.
     *
     * Stretch color chroma to cover maximum possible range, keeping hue and lightness untouched.
     *
     * @param parent parent filter node
     */
    public ColorEnhance(GeglFilter parent)
    {
        super(parent, "gegl:color-enhance");
    }

        @Override
    public InputPad<ColorEnhance> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ColorEnhance> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

