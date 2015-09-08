package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Color Enhance

Stretch color chroma to cover maximum possible range, keeping hue and lightness untouched.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class ColorEnhance extends GeglFilter
{
/** Constructs a Color Enhance.

Stretch color chroma to cover maximum possible range, keeping hue and lightness untouched.
*/
    public ColorEnhance(GeglNode container)
    {
        super(container, "gegl:color-enhance");
    }
/** Constructs a Color Enhance.

Stretch color chroma to cover maximum possible range, keeping hue and lightness untouched.
*/
    public ColorEnhance(GeglFilter parent)
    {
        super(parent, "gegl:color-enhance");
    }

    
}

