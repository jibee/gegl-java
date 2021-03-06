package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Watershed Transform
 *
 * Labels propagation by watershed transformation. Output and expected input are "YA u32" grayscale buffers. The Y value represents a label. When a pixel is not labelled, its alpha value has to be set to 0. The mandatory aux buffer is a "Y u8" image representing the priority levels.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class WatershedTransform extends GeglFilter implements CombiningFilter
{
    /** Constructs a Watershed Transform.
     *
     * Labels propagation by watershed transformation. Output and expected input are "YA u32" grayscale buffers. The Y value represents a label. When a pixel is not labelled, its alpha value has to be set to 0. The mandatory aux buffer is a "Y u8" image representing the priority levels.
     *
     * @param container container node
     */
    public WatershedTransform(GeglNode container)
    {
        super(container, "gegl:watershed-transform");
    }
    /** Constructs a Watershed Transform.
     *
     * Labels propagation by watershed transformation. Output and expected input are "YA u32" grayscale buffers. The Y value represents a label. When a pixel is not labelled, its alpha value has to be set to 0. The mandatory aux buffer is a "Y u8" image representing the priority levels.
     *
     * @param parent parent filter node
     */
    public WatershedTransform(GeglFilter parent)
    {
        super(parent, "gegl:watershed-transform");
    }

        @Override
    public InputPad<WatershedTransform> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<WatershedTransform> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<WatershedTransform> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

