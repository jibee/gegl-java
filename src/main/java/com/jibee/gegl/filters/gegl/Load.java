package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Load Image
 *
 * Multipurpose file loader, that uses other native handlers, and fallback conversion using Image Magick's convert.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"meta", "input"})
public class Load extends GeglFilter implements Source
{
    /** Constructs a Load Image.
     *
     * Multipurpose file loader, that uses other native handlers, and fallback conversion using Image Magick's convert.
     *
     * @param container container node
     */
    public Load(GeglNode container)
    {
        super(container, "gegl:load");
    }
    /** Constructs a Load Image.
     *
     * Multipurpose file loader, that uses other native handlers, and fallback conversion using Image Magick's convert.
     *
     * @param parent parent filter node
     */
    public Load(GeglFilter parent)
    {
        super(parent, "gegl:load");
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
    public Load setPath(String value)
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


    /** URI
     *
     * URI of file to load.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Uri ;

    /** URI
     *
     * URI of file to load.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for URI
     * @return this filter (for chaining operations)
     * 
     */
    public Load setUri(String value)
    {
	
        m_Uri = value;
        setProperty("uri", value);
        return this;
    }

    /** URI
     *
     * URI of file to load.
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
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

