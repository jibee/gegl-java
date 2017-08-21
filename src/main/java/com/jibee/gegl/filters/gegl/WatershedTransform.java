package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * Watershed Transform
 *
 * Labels propagation by watershed transformation
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class WatershedTransform extends GeglFilter implements Source, DualSink
{
    /** Constructs a Watershed Transform.
     *
     * Labels propagation by watershed transformation
     *
     * @param container container node
     */
    public WatershedTransform(GeglNode container)
    {
        super(container, "gegl:watershed-transform");
    }
    /** Constructs a Watershed Transform.
     *
     * Labels propagation by watershed transformation
     *
     * @param parent parent filter node
     */
    public WatershedTransform(GeglFilter parent)
    {
        super(parent, "gegl:watershed-transform");
    }

        @Override
    public InputPad Aux()
    {
        return new InputPad(this, "aux");
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

