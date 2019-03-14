package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Scale3X Antialiasing
 *
 * Antialias using the Scale3X edge-extrapolation algorithm
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"enhance"})
public class Antialias extends GeglFilter implements Filter
{
    /** Constructs a Scale3X Antialiasing.
     *
     * Antialias using the Scale3X edge-extrapolation algorithm
     *
     * @param container container node
     */
    public Antialias(GeglNode container)
    {
        super(container, "gegl:antialias");
    }
    /** Constructs a Scale3X Antialiasing.
     *
     * Antialias using the Scale3X edge-extrapolation algorithm
     *
     * @param parent parent filter node
     */
    public Antialias(GeglFilter parent)
    {
        super(parent, "gegl:antialias");
    }

        @Override
    public InputPad<Antialias> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Antialias> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

