package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;

/**
 * PNG File Loader
 *
 * PNG image loader.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class PngLoad extends GeglFilter
{
    /** Constructs a PNG File Loader.
     *
     * PNG image loader.
     */
    public PngLoad(GeglNode container)
    {
        super(container, "gegl:png-load");
    }
    /** Constructs a PNG File Loader.
     *
     * PNG image loader.
     */
    public PngLoad(GeglFilter parent)
    {
        super(parent, "gegl:png-load");
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
    public PngLoad setPath(String value)
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


    /** URI
     *
     * URI for file to load.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Uri ;

    /** URI
     *
     * URI for file to load.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public PngLoad setUri(String value)
    {
	
        m_Uri = value;
        setProperty("uri", value);
        return this;
    }

    /** URI
     *
     * URI for file to load.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getUri()
    {
        return m_Uri;
    }

    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

