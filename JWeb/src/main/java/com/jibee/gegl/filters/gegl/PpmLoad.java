package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * PPM File Loader
 *
 * PPM image loader.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class PpmLoad extends GeglFilter
{
    /** Constructs a PPM File Loader.
     *
     * PPM image loader.
     */
    public PpmLoad(GeglNode container)
    {
        super(container, "gegl:ppm-load");
    }
    /** Constructs a PPM File Loader.
     *
     * PPM image loader.
     */
    public PpmLoad(GeglFilter parent)
    {
        super(parent, "gegl:ppm-load");
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
    public PpmLoad setPath(String value)
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

    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

