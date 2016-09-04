package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;

/**
 * RGBE File Saver
 *
 * RGBE image saver (Radiance HDR format)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"output"})
public class RgbeSave extends GeglFilter implements Sink
{
    /** Constructs a RGBE File Saver.
     *
     * RGBE image saver (Radiance HDR format)
     */
    public RgbeSave(GeglNode container)
    {
        super(container, "gegl:rgbe-save");
    }
    /** Constructs a RGBE File Saver.
     *
     * RGBE image saver (Radiance HDR format)
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
     */
    public String getPath()
    {
        return m_Path;
    }

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }

}

