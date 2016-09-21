package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * JPEG File Loader
 *
 * JPEG image loader using libjpeg
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class JpgLoad extends GeglFilter implements Source
{
    /** Constructs a JPEG File Loader.
     *
     * JPEG image loader using libjpeg
     */
    public JpgLoad(GeglNode container)
    {
        super(container, "gegl:jpg-load");
    }
    /** Constructs a JPEG File Loader.
     *
     * JPEG image loader using libjpeg
     */
    public JpgLoad(GeglFilter parent)
    {
        super(parent, "gegl:jpg-load");
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
    public JpgLoad setPath(String value)
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
     * URI of file to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Uri ;

    /** URI
     *
     * URI of file to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public JpgLoad setUri(String value)
    {
	
        m_Uri = value;
        setProperty("uri", value);
        return this;
    }

    /** URI
     *
     * URI of file to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getUri()
    {
        return m_Uri;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

