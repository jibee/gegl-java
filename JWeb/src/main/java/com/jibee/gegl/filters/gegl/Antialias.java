package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Scale3X Antialiasing
 *
 * Antialias using the Scale3X edge-extrapolation algorithm
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"enhance"})
public class Antialias extends GeglFilter
{
    /** Constructs a Scale3X Antialiasing.
     *
     * Antialias using the Scale3X edge-extrapolation algorithm
     */
    public Antialias(GeglNode container)
    {
        super(container, "gegl:antialias");
    }
    /** Constructs a Scale3X Antialiasing.
     *
     * Antialias using the Scale3X edge-extrapolation algorithm
     */
    public Antialias(GeglFilter parent)
    {
        super(parent, "gegl:antialias");
    }

        public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

