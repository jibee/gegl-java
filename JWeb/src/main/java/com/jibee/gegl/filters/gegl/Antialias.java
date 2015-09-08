package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Scale3X Antialiasing

Antialias using the Scale3X edge-extrapolation algorithm

License: GPL3+
Supports OpenCL: 
Position Dependant: 
*/
public class Antialias extends GeglFilter
{
/** Constructs a Scale3X Antialiasing.

Antialias using the Scale3X edge-extrapolation algorithm
*/
    public Antialias(GeglNode container)
    {
        super(container, "gegl:antialias");
    }
/** Constructs a Scale3X Antialiasing.

Antialias using the Scale3X edge-extrapolation algorithm
*/
    public Antialias(GeglFilter parent)
    {
        super(parent, "gegl:antialias");
    }

    
}

