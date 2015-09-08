package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Invert in Perceptual space

Inverts the components (except alpha), the result is the corresponding "negative" image.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class InvertGamma extends GeglFilter
{
/** Constructs a Invert in Perceptual space.

Inverts the components (except alpha), the result is the corresponding "negative" image.
*/
    public InvertGamma(GeglNode container)
    {
        super(container, "gegl:invert-gamma");
    }
/** Constructs a Invert in Perceptual space.

Inverts the components (except alpha), the result is the corresponding "negative" image.
*/
    public InvertGamma(GeglFilter parent)
    {
        super(parent, "gegl:invert-gamma");
    }

    
}

