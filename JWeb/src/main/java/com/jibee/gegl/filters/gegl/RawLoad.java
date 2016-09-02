package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;

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
public class RawLoad extends GeglFilter
{
    /** Constructs a libraw File Loader.
     *
     * Camera RAW image loader
     */
    public RawLoad(GeglNode container)
    {
        super(container, "gegl:raw-load");
    }
    /** Constructs a libraw File Loader.
     *
     * Camera RAW image loader
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
     */
    public int getQuality()
    {
        return m_Quality;
    }

    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

