package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * RGBE File Saver
 *
 * RGBE image saver (Radiance HDR format)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"output"})
public class RgbeSave extends GeglFilter implements Sink
{
    /** Constructs a RGBE File Saver.
     *
     * RGBE image saver (Radiance HDR format)
     *
     * @param container container node
     */
    public RgbeSave(GeglNode container)
    {
        super(container, "gegl:rgbe-save");
    }
    /** Constructs a RGBE File Saver.
     *
     * RGBE image saver (Radiance HDR format)
     *
     * @param parent parent filter node
     */
    public RgbeSave(GeglFilter parent)
    {
        super(parent, "gegl:rgbe-save");
    }

    
    /** File
     *
     * Target path and filename, use '-' for stdout.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** File
     *
     * Target path and filename, use '-' for stdout.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
     */
    public RgbeSave setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Target path and filename, use '-' for stdout.
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
    public InputPad<RgbeSave> Input()
    {
        return new InputPad<>(this, "input");
    }

}

