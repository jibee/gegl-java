package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * RGBE File Loader
 *
 * RGBE image loader (Radiance HDR format).
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class RgbeLoad extends GeglFilter implements Source
{
    /** Constructs a RGBE File Loader.
     *
     * RGBE image loader (Radiance HDR format).
     */
    public RgbeLoad(GeglNode container)
    {
        super(container, "gegl:rgbe-load");
    }
    /** Constructs a RGBE File Loader.
     *
     * RGBE image loader (Radiance HDR format).
     */
    public RgbeLoad(GeglFilter parent)
    {
        super(parent, "gegl:rgbe-load");
    }

    
    /** File
     *
     * Path of file to load.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** File
     *
     * Path of file to load.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public RgbeLoad setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Path of file to load.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getPath()
    {
        return m_Path;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

