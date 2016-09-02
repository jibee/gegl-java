package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;

/**
 * Laplacian Edge Detection
 *
 * High-resolution edge detection
 * 
 * License: GPL3+
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=true, position_dependant=false, categories={"edge-detect"})
public class EdgeLaplace extends GeglFilter
{
    /** Constructs a Laplacian Edge Detection.
     *
     * High-resolution edge detection
     */
    public EdgeLaplace(GeglNode container)
    {
        super(container, "gegl:edge-laplace");
    }
    /** Constructs a Laplacian Edge Detection.
     *
     * High-resolution edge detection
     */
    public EdgeLaplace(GeglFilter parent)
    {
        super(parent, "gegl:edge-laplace");
    }

        public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

