package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Value Invert

Inverts just the value component, the result is the corresponding 'inverted' image.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class ValueInvert extends GeglFilter
{
/** Constructs a Value Invert.

Inverts just the value component, the result is the corresponding 'inverted' image.
*/
    public ValueInvert(GeglNode container)
    {
        super(container, "gegl:value-invert");
    }
/** Constructs a Value Invert.

Inverts just the value component, the result is the corresponding 'inverted' image.
*/
    public ValueInvert(GeglFilter parent)
    {
        super(parent, "gegl:value-invert");
    }

    
}

