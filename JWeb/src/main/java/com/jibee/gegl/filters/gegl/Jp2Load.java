package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * JPEG 2000 File Loader
 *
 * JPEG 2000 image loader using jasper.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class Jp2Load extends GeglFilter
{
    /** Constructs a JPEG 2000 File Loader.
     *
     * JPEG 2000 image loader using jasper.
     */
    public Jp2Load(GeglNode container)
    {
        super(container, "gegl:jp2-load");
    }
    /** Constructs a JPEG 2000 File Loader.
     *
     * JPEG 2000 image loader using jasper.
     */
    public Jp2Load(GeglFilter parent)
    {
        super(parent, "gegl:jp2-load");
    }

    
    /** File
     *
     * Path of file to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** File
     *
     * Path of file to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Jp2Load setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Path of file to load
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
     * URI for file to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Uri ;

    /** URI
     *
     * URI for file to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Jp2Load setUri(String value)
    {
	
        m_Uri = value;
        setProperty("uri", value);
        return this;
    }

    /** URI
     *
     * URI for file to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getUri()
    {
        return m_Uri;
    }

    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

