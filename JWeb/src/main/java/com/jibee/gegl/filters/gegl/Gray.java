package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Make Grey

Turns the image grayscale

License: 
Supports OpenCL: true
Position Dependant: 
*/
public class Gray extends GeglFilter
{
/** Constructs a Make Grey.

Turns the image grayscale
*/
    public Gray(GeglNode container)
    {
        super(container, "gegl:gray");
    }
/** Constructs a Make Grey.

Turns the image grayscale
*/
    public Gray(GeglFilter parent)
    {
        super(parent, "gegl:gray");
    }

    
}

