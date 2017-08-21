package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;

/**
 * TIFF File Saver
 *
 * TIFF image saver using libtiff
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"output"})
public class TiffSave extends GeglFilter implements Sink
{
    /** Constructs a TIFF File Saver.
     *
     * TIFF image saver using libtiff
     *
     * @param container container node
     */
    public TiffSave(GeglNode container)
    {
        super(container, "gegl:tiff-save");
    }
    /** Constructs a TIFF File Saver.
     *
     * TIFF image saver using libtiff
     *
     * @param parent parent filter node
     */
    public TiffSave(GeglFilter parent)
    {
        super(parent, "gegl:tiff-save");
    }

    
    /** File
     *
     * Target path and filename, use '-' for stdout
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** File
     *
     * Target path and filename, use '-' for stdout
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
     */
    public TiffSave setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Target path and filename, use '-' for stdout
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
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }

}

