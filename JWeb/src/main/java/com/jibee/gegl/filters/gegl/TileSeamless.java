package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

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
public class TileSeamless extends GeglFilter implements Source, Sink
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

        public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

