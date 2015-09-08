package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Weighted Blend

blend two images using alpha values as weights

License: 
Supports OpenCL: true
Position Dependant: 
*/
public class WeightedBlend extends GeglFilter
{
/** Constructs a Weighted Blend.

blend two images using alpha values as weights
*/
    public WeightedBlend(GeglNode container)
    {
        super(container, "gegl:weighted-blend");
    }
/** Constructs a Weighted Blend.

blend two images using alpha values as weights
*/
    public WeightedBlend(GeglFilter parent)
    {
        super(parent, "gegl:weighted-blend");
    }

    
}

