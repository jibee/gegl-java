package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**


stretch components of pixels individually based on luminance envelopes

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Remap extends GeglFilter
{
/** Constructs a .

stretch components of pixels individually based on luminance envelopes
*/
    public Remap(GeglNode container)
    {
        super(container, "gegl:remap");
    }
/** Constructs a .

stretch components of pixels individually based on luminance envelopes
*/
    public Remap(GeglFilter parent)
    {
        super(parent, "gegl:remap");
    }

    
}

