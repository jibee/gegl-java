package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Make Seamlessly tileable
 *
 * Make the input buffer seamlessly tileable. The algorithm is not content-aware, so the result may need post-processing.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"tile"})
public class TileSeamless extends GeglFilter implements Filter
{
    /** Constructs a Make Seamlessly tileable.
     *
     * Make the input buffer seamlessly tileable. The algorithm is not content-aware, so the result may need post-processing.
     *
     * @param container container node
     */
    public TileSeamless(GeglNode container)
    {
        super(container, "gegl:tile-seamless");
    }
    /** Constructs a Make Seamlessly tileable.
     *
     * Make the input buffer seamlessly tileable. The algorithm is not content-aware, so the result may need post-processing.
     *
     * @param parent parent filter node
     */
    public TileSeamless(GeglFilter parent)
    {
        super(parent, "gegl:tile-seamless");
    }

        @Override
    public InputPad<TileSeamless> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<TileSeamless> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

