package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Laplacian Edge Detection

High-resolution edge detection

License: GPL3+
Supports OpenCL: true
Position Dependant: 
*/
public class EdgeLaplace extends GeglFilter
{
/** Constructs a Laplacian Edge Detection.

High-resolution edge detection
*/
    public EdgeLaplace(GeglNode container)
    {
        super(container, "gegl:edge-laplace");
    }
/** Constructs a Laplacian Edge Detection.

High-resolution edge detection
*/
    public EdgeLaplace(GeglFilter parent)
    {
        super(parent, "gegl:edge-laplace");
    }

    
}

