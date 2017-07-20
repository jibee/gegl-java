package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;

/**
 * WebP File Saver
 *
 * WebP image saver
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"output"})
public class WebpSave extends GeglFilter implements Sink
{
    /** Constructs a WebP File Saver.
     *
     * WebP image saver
     */
    public WebpSave(GeglNode container)
    {
        super(container, "gegl:webp-save");
    }
    /** Constructs a WebP File Saver.
     *
     * WebP image saver
     */
    public WebpSave(GeglFilter parent)
    {
        super(parent, "gegl:webp-save");
    }

    
    /** File
     *
     * Target path and filename, use '-' for stdout
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** File
     *
     * Target path and filename, use '-' for stdout
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public WebpSave setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Target path and filename, use '-' for stdout
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getPath()
    {
        return m_Path;
    }


    /** Quality
     *
     * WebP compression quality
     *
     * Unit: 
     * Default value: 90
     * Acceptable Range: 1 100
     * */
    private int m_Quality  = 90;

    /** Quality
     *
     * WebP compression quality
     *
     * Unit: 
     * Default value: 90
     * Acceptable Range: 1 100
     */
    public WebpSave setQuality(int value) throws ParameterOutOfRangeException
    {
		if(value > 100 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 100);
	}

        m_Quality = value;
        setProperty("quality", value);
        return this;
    }

    /** Quality
     *
     * WebP compression quality
     *
     * Unit: 
     * Default value: 90
     * Acceptable Range: 1 100
     */
    public int getQuality()
    {
        return m_Quality;
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }

}
