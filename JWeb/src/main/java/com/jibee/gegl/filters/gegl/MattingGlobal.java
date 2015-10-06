package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;

/**


Given a sparse user supplied tri-map and an input image, create a foreground alpha matte. Set white as foreground, black as background for the tri-map. Everything else will be treated as unknown and filled in.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class MattingGlobal extends GeglFilter
{
/** Constructs a .

Given a sparse user supplied tri-map and an input image, create a foreground alpha matte. Set white as foreground, black as background for the tri-map. Everything else will be treated as unknown and filled in.
*/
    public MattingGlobal(GeglNode container)
    {
        super(container, "gegl:matting-global");
    }
/** Constructs a .

Given a sparse user supplied tri-map and an input image, create a foreground alpha matte. Set white as foreground, black as background for the tri-map. Everything else will be treated as unknown and filled in.
*/
    public MattingGlobal(GeglFilter parent)
    {
        super(parent, "gegl:matting-global");
    }

    
/** Iterations



Unit: 
Default value: 10
Acceptable Range: 1 10000
*/
    private int m_Iterations  = 10;

/** Iterations



Unit: 
Default value: 10
Acceptable Range: 1 10000
*/
    public MattingGlobal setIterations(int value) throws ParameterOutOfRangeException
    {
		if(value > 10000 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 10000);
	}

        m_Iterations = value;
        setProperty("iterations", value);
        return this;
    }

/** Iterations



Unit: 
Default value: 10
Acceptable Range: 1 10000
*/
    public int getIterations()
    {
        return m_Iterations;
    }


}
