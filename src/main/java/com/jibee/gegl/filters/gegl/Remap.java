package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Remap
 *
 * stretch components of pixels individually based on luminance envelopes
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors"})
public class Remap extends GeglFilter implements CombiningFilter
{
    /** Constructs a Remap.
     *
     * stretch components of pixels individually based on luminance envelopes
     *
     * @param container container node
     */
    public Remap(GeglNode container)
    {
        super(container, "gegl:remap");
    }
    /** Constructs a Remap.
     *
     * stretch components of pixels individually based on luminance envelopes
     *
     * @param parent parent filter node
     */
    public Remap(GeglFilter parent)
    {
        super(parent, "gegl:remap");
    }

        /** Obtains the InputPad named aux2.
    * 
    * @return the InputPad named aux2
    */
    public InputPad<Remap> Aux2()
    {
        return new InputPad<>(this, "aux2");
    }

    @Override
    public InputPad<Remap> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<Remap> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Remap> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

