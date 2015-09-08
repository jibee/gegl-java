package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Make Seamlessly tileable

Make the input buffer seamlessly tileable. The algorithm is not content-aware, so the result may need post-processing.

License: 
Supports OpenCL: 
Position Dependant: true
*/
public class TileSeamless extends GeglFilter
{
/** Constructs a Make Seamlessly tileable.

Make the input buffer seamlessly tileable. The algorithm is not content-aware, so the result may need post-processing.
*/
    public TileSeamless(GeglNode container)
    {
        super(container, "gegl:tile-seamless");
    }
/** Constructs a Make Seamlessly tileable.

Make the input buffer seamlessly tileable. The algorithm is not content-aware, so the result may need post-processing.
*/
    public TileSeamless(GeglFilter parent)
    {
        super(parent, "gegl:tile-seamless");
    }

    
}

