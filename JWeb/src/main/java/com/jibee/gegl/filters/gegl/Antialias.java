package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

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
public class Antialias extends GeglFilter implements Source, Sink
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

        public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

