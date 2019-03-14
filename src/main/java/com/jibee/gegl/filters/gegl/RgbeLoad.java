package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * RGBE File Loader
 *
 * RGBE image loader (Radiance HDR format).
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class RgbeLoad extends GeglFilter implements Source
{
    /** Constructs a RGBE File Loader.
     *
     * RGBE image loader (Radiance HDR format).
     *
     * @param container container node
     */
    public RgbeLoad(GeglNode container)
    {
        super(container, "gegl:rgbe-load");
    }
    /** Constructs a RGBE File Loader.
     *
     * RGBE image loader (Radiance HDR format).
     *
     * @param parent parent filter node
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
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of File
     * 
     */
    public String getPath()
    {
        return m_Path;
    }

    @Override
    public OutputPad<RgbeLoad> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

