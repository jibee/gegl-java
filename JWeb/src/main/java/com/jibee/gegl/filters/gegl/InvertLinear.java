package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Invert

Inverts the components (except alpha), the result is the corresponding "negative" image.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class InvertLinear extends GeglFilter
{
/** Constructs a Invert.

Inverts the components (except alpha), the result is the corresponding "negative" image.
*/
    public InvertLinear(GeglNode container)
    {
        super(container, "gegl:invert-linear");
    }
/** Constructs a Invert.

Inverts the components (except alpha), the result is the corresponding "negative" image.
*/
    public InvertLinear(GeglFilter parent)
    {
        super(parent, "gegl:invert-linear");
    }

    
}

