package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;

/**
 * Open GEGL Buffer
 *
 * Use an on-disk GeglBuffer as data source.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"input"})
public class OpenBuffer extends GeglFilter
{
    /** Constructs a Open GEGL Buffer.
     *
     * Use an on-disk GeglBuffer as data source.
     */
    public OpenBuffer(GeglNode container)
    {
        super(container, "gegl:open-buffer");
    }
    /** Constructs a Open GEGL Buffer.
     *
     * Use an on-disk GeglBuffer as data source.
     */
    public OpenBuffer(GeglFilter parent)
    {
        super(parent, "gegl:open-buffer");
    }

    
    /** File
     *
     * a GeglBuffer on disk to open
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** File
     *
     * a GeglBuffer on disk to open
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public OpenBuffer setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * a GeglBuffer on disk to open
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getPath()
    {
        return m_Path;
    }

    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

