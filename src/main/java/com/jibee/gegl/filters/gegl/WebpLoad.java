package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * WebP File Loader
 *
 * WebP image loader.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class WebpLoad extends GeglFilter implements Source
{
    /** Constructs a WebP File Loader.
     *
     * WebP image loader.
     *
     * @param container container node
     */
    public WebpLoad(GeglNode container)
    {
        super(container, "gegl:webp-load");
    }
    /** Constructs a WebP File Loader.
     *
     * WebP image loader.
     *
     * @param parent parent filter node
     */
    public WebpLoad(GeglFilter parent)
    {
        super(parent, "gegl:webp-load");
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
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
     */
    public WebpLoad setPath(String value)
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
     *
     * @return value of File
     * 
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
     *
     * @param value new value for URI
     * @return this filter (for chaining operations)
     * 
     */
    public WebpLoad setUri(String value)
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
     *
     * @return value of URI
     * 
     */
    public String getUri()
    {
        return m_Uri;
    }

    @Override
    public OutputPad<WebpLoad> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

