package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * libraw File Loader
 *
 * Camera RAW image loader
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class RawLoad extends GeglFilter implements Source
{
    /** Constructs a libraw File Loader.
     *
     * Camera RAW image loader
     *
     * @param container container node
     */
    public RawLoad(GeglNode container)
    {
        super(container, "gegl:raw-load");
    }
    /** Constructs a libraw File Loader.
     *
     * Camera RAW image loader
     *
     * @param parent parent filter node
     */
    public RawLoad(GeglFilter parent)
    {
        super(parent, "gegl:raw-load");
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
    public RawLoad setPath(String value)
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


    /** Image number
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_ImageNum ;

    /** Image number
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Image number
     * @return this filter (for chaining operations)
     * 
     */
    public RawLoad setImageNum(int value)
    {
	
        m_ImageNum = value;
        setProperty("image-num", value);
        return this;
    }

    /** Image number
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Image number
     * 
     */
    public int getImageNum()
    {
        return m_ImageNum;
    }


    /** quality
     *
     * 
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range:  
     * */
    private int m_Quality  = 10;

    /** quality
     *
     * 
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range:  
     *
     * @param value new value for quality
     * @return this filter (for chaining operations)
     * 
     */
    public RawLoad setQuality(int value)
    {
	
        m_Quality = value;
        setProperty("quality", value);
        return this;
    }

    /** quality
     *
     * 
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range:  
     *
     * @return value of quality
     * 
     */
    public int getQuality()
    {
        return m_Quality;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

