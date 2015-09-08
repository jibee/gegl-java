package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;

/**
Engrave

Simulate an antique engraving

License: GPL3+
Supports OpenCL: 
Position Dependant: 
*/
public class Engrave extends GeglFilter
{
/** Constructs a Engrave.

Simulate an antique engraving
*/
    public Engrave(GeglNode container)
    {
        super(container, "gegl:engrave");
    }
/** Constructs a Engrave.

Simulate an antique engraving
*/
    public Engrave(GeglFilter parent)
    {
        super(parent, "gegl:engrave");
    }

    
/** Height

Resolution in pixels

Unit: 
Default value: 10
Acceptable Range: 2 16
*/
    private int m_RowHeight  = 10;

/** Height

Resolution in pixels

Unit: 
Default value: 10
Acceptable Range: 2 16
*/
    public Engrave setRowHeight(int value) throws ParameterOutOfRangeException
    {
		if(value > 16 || value < 2)
	{
	    throw new ParameterOutOfRangeException(value, 2, 16);
	}

        m_RowHeight = value;
        setProperty("row-height", value);
        return this;
    }

/** Height

Resolution in pixels

Unit: 
Default value: 10
Acceptable Range: 2 16
*/
    public int getRowHeight()
    {
        return m_RowHeight;
    }


/** Limit line width

Limit line width

Unit: 
Default value: false
Acceptable Range:  
*/
    private boolean m_Limit  = false;

/** Limit line width

Limit line width

Unit: 
Default value: false
Acceptable Range:  
*/
    public Engrave setLimit(boolean value)
    {
	
        m_Limit = value;
        setProperty("limit", value);
        return this;
    }

/** Limit line width

Limit line width

Unit: 
Default value: false
Acceptable Range:  
*/
    public boolean getLimit()
    {
        return m_Limit;
    }


}

