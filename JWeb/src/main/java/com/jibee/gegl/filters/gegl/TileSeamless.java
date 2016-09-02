package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Make Seamlessly tileable
 *
 * Make the input buffer seamlessly tileable. The algorithm is not content-aware, so the result may need post-processing.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@Filter(license="", opencl=false, position_dependant=true, categories={"tile"})
public class TileSeamless extends GeglFilter
{
    /** Constructs a Make Seamlessly tileable.
     *
     * Make the input buffer seamlessly tileable. The algorithm is not content-aware, so the result may need post-processing.
     */
    public TileSeamless(GeglNode container)
    {
        super(container, "gegl:tile-seamless");
    }
    /** Constructs a Make Seamlessly tileable.
     *
     * Make the input buffer seamlessly tileable. The algorithm is not content-aware, so the result may need post-processing.
     */
    public TileSeamless(GeglFilter parent)
    {
        super(parent, "gegl:tile-seamless");
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

