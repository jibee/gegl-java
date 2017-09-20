package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * TIFF File Loader
 *
 * TIFF image loader using libtiff
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class TiffLoad extends GeglFilter implements Source
{
    /** Constructs a TIFF File Loader.
     *
     * TIFF image loader using libtiff
     *
     * @param container container node
     */
    public TiffLoad(GeglNode container)
    {
        super(container, "gegl:tiff-load");
    }
    /** Constructs a TIFF File Loader.
     *
     * TIFF image loader using libtiff
     *
     * @param parent parent filter node
     */
    public TiffLoad(GeglFilter parent)
    {
        super(parent, "gegl:tiff-load");
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
    public TiffLoad setPath(String value)
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
    public TiffLoad setUri(String value)
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


    /** Directory
     *
     * Image file directory (subfile)
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 
     * */
    private int m_Directory  = 1;

    /** Directory
     *
     * Image file directory (subfile)
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 
     *
     * @param value new value for Directory
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public TiffLoad setDirectory(int value) throws ParameterOutOfRangeException
    {
		if(value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, Double.POSITIVE_INFINITY);
	    }

        m_Directory = value;
        setProperty("directory", value);
        return this;
    }

    /** Directory
     *
     * Image file directory (subfile)
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 
     *
     * @return value of Directory
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getDirectory()
    {
        return m_Directory;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

