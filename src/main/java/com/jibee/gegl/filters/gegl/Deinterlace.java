package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Deinterlace
 *
 * Fix images where every other row or column is missing
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=true, categories={"enhance"})
public class Deinterlace extends GeglFilter implements Filter
{
    /** Constructs a Deinterlace.
     *
     * Fix images where every other row or column is missing
     *
     * @param container container node
     */
    public Deinterlace(GeglNode container)
    {
        super(container, "gegl:deinterlace");
    }
    /** Constructs a Deinterlace.
     *
     * Fix images where every other row or column is missing
     *
     * @param parent parent filter node
     */
    public Deinterlace(GeglFilter parent)
    {
        super(parent, "gegl:deinterlace");
    }

    
    /** Keep
     *
     * Keep even or odd fields
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Keep ;

    /** Keep
     *
     * Keep even or odd fields
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Keep
     * @return this filter (for chaining operations)
     * 
     */
    public Deinterlace setKeep(String value)
    {
	
        m_Keep = value;
        setProperty("keep", value);
        return this;
    }

    /** Keep
     *
     * Keep even or odd fields
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Keep
     * 
     */
    public String getKeep()
    {
        return m_Keep;
    }


    /** Orientation
     *
     * Deinterlace horizontally or vertically
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Orientation ;

    /** Orientation
     *
     * Deinterlace horizontally or vertically
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Orientation
     * @return this filter (for chaining operations)
     * 
     */
    public Deinterlace setOrientation(String value)
    {
	
        m_Orientation = value;
        setProperty("orientation", value);
        return this;
    }

    /** Orientation
     *
     * Deinterlace horizontally or vertically
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Orientation
     * 
     */
    public String getOrientation()
    {
        return m_Orientation;
    }


    /** Block size
     *
     * Block size of deinterlacing rows/columns
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range:  100
     * */
    private int m_Size  = 1;

    /** Block size
     *
     * Block size of deinterlacing rows/columns
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range:  100
     *
     * @param value new value for Block size
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Deinterlace setSize(int value) throws ParameterOutOfRangeException
    {
		if(value > 100)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 100);
	    }

        m_Size = value;
        setProperty("size", value);
        return this;
    }

    /** Block size
     *
     * Block size of deinterlacing rows/columns
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range:  100
     *
     * @return value of Block size
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getSize()
    {
        return m_Size;
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

