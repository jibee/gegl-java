package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.ParameterOutOfRangeException;

import com.jibee.gegl.GeglNode;

/**


Seamless cloning operation

License: GPL3+
Supports OpenCL: 
Position Dependant: 
*/
public class SeamlessClone extends GeglFilter
{
/** Constructs a .

Seamless cloning operation
*/
    public SeamlessClone(GeglNode container)
    {
        super(container, "gegl:seamless-clone");
    }
/** Constructs a .

Seamless cloning operation
*/
    public SeamlessClone(GeglFilter parent)
    {
        super(parent, "gegl:seamless-clone");
    }

    
/** Refinement steps

Maximal amount of refinement points to be used for the interpolation mesh

Unit: 
Default value: 2000
Acceptable Range:  100000
*/
    private int m_MaxRefineSteps  = 2000;

/** Refinement steps

Maximal amount of refinement points to be used for the interpolation mesh

Unit: 
Default value: 2000
Acceptable Range:  100000
*/
    public SeamlessClone setMaxRefineSteps(int value) throws ParameterOutOfRangeException
    {
		if(value > 100000)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 100000);
	}

        m_MaxRefineSteps = value;
        setProperty("max-refine-steps", value);
        return this;
    }

/** Refinement steps

Maximal amount of refinement points to be used for the interpolation mesh

Unit: 
Default value: 2000
Acceptable Range:  100000
*/
    public int getMaxRefineSteps()
    {
        return m_MaxRefineSteps;
    }


/** Offset X

How much horizontal offset should applied to the paste

Unit: pixel-coordinate
Default value: 
Acceptable Range: -100000 100000
*/
    private int m_Xoff ;

/** Offset X

How much horizontal offset should applied to the paste

Unit: pixel-coordinate
Default value: 
Acceptable Range: -100000 100000
*/
    public SeamlessClone setXoff(int value) throws ParameterOutOfRangeException
    {
		if(value > 100000 || value < -100000)
	{
	    throw new ParameterOutOfRangeException(value, -100000, 100000);
	}

        m_Xoff = value;
        setProperty("xoff", value);
        return this;
    }

/** Offset X

How much horizontal offset should applied to the paste

Unit: pixel-coordinate
Default value: 
Acceptable Range: -100000 100000
*/
    public int getXoff()
    {
        return m_Xoff;
    }


/** Offset Y

How much horizontal offset should applied to the paste

Unit: pixel-coordinate
Default value: 
Acceptable Range: -100000 100000
*/
    private int m_Yoff ;

/** Offset Y

How much horizontal offset should applied to the paste

Unit: pixel-coordinate
Default value: 
Acceptable Range: -100000 100000
*/
    public SeamlessClone setYoff(int value) throws ParameterOutOfRangeException
    {
		if(value > 100000 || value < -100000)
	{
	    throw new ParameterOutOfRangeException(value, -100000, 100000);
	}

        m_Yoff = value;
        setProperty("yoff", value);
        return this;
    }

/** Offset Y

How much horizontal offset should applied to the paste

Unit: pixel-coordinate
Default value: 
Acceptable Range: -100000 100000
*/
    public int getYoff()
    {
        return m_Yoff;
    }


/** Error message

An error message in case of a failure

Unit: 
Default value: 
Acceptable Range:  
*/
    private String m_ErrorMsg ;

/** Error message

An error message in case of a failure

Unit: 
Default value: 
Acceptable Range:  
*/
    public SeamlessClone setErrorMsg(String value)
    {
	
        m_ErrorMsg = value;
        setProperty("error-msg", value);
        return this;
    }

/** Error message

An error message in case of a failure

Unit: 
Default value: 
Acceptable Range:  
*/
    public String getErrorMsg()
    {
        return m_ErrorMsg;
    }


}

