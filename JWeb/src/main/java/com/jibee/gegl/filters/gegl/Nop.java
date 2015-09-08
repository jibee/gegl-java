package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
No Operation

No operation (can be used as a routing point)

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Nop extends GeglFilter
{
/** Constructs a No Operation.

No operation (can be used as a routing point)
*/
    public Nop(GeglNode container)
    {
        super(container, "gegl:nop");
    }
/** Constructs a No Operation.

No operation (can be used as a routing point)
*/
    public Nop(GeglFilter parent)
    {
        super(parent, "gegl:nop");
    }

    
}

