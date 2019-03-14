package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * ICC profile saver
 *
 * Stores the ICC profile that would be embedded if stored as an image.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"output"})
public class IccSave extends GeglFilter implements Sink
{
    /** Constructs a ICC profile saver.
     *
     * Stores the ICC profile that would be embedded if stored as an image.
     *
     * @param container container node
     */
    public IccSave(GeglNode container)
    {
        super(container, "gegl:icc-save");
    }
    /** Constructs a ICC profile saver.
     *
     * Stores the ICC profile that would be embedded if stored as an image.
     *
     * @param parent parent filter node
     */
    public IccSave(GeglFilter parent)
    {
        super(parent, "gegl:icc-save");
    }

    
    /** File
     *
     * Target path and filename
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** File
     *
     * Target path and filename
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
     */
    public IccSave setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Target path and filename
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of File
     * 
     */
    public String getPath()
    {
        return m_Path;
    }

    @Override
    public InputPad<IccSave> Input()
    {
        return new InputPad<>(this, "input");
    }

}

