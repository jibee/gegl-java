package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;

/**
 * 
 *
 * Image blending operation 'blend-reflect' (<tt>c = cB>=1.0?1.0:cA*cA / (1.0-cB)</tt>)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "blend"})
public class BlendReflect extends GeglFilter
{
    /** Constructs a .
     *
     * Image blending operation 'blend-reflect' (<tt>c = cB>=1.0?1.0:cA*cA / (1.0-cB)</tt>)
     */
    public BlendReflect(GeglNode container)
    {
        super(container, "gegl:blend-reflect");
    }
    /** Constructs a .
     *
     * Image blending operation 'blend-reflect' (<tt>c = cB>=1.0?1.0:cA*cA / (1.0-cB)</tt>)
     */
    public BlendReflect(GeglFilter parent)
    {
        super(parent, "gegl:blend-reflect");
    }

        public InputPad Aux()
    {
        return new InputPad(this, "aux");
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

