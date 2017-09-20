package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Open GEGL Buffer
 *
 * Use an on-disk GeglBuffer as data source.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"input"})
public class OpenBuffer extends GeglFilter implements Source
{
    /** Constructs a Open GEGL Buffer.
     *
     * Use an on-disk GeglBuffer as data source.
     *
     * @param container container node
     */
    public OpenBuffer(GeglNode container)
    {
        super(container, "gegl:open-buffer");
    }
    /** Constructs a Open GEGL Buffer.
     *
     * Use an on-disk GeglBuffer as data source.
     *
     * @param parent parent filter node
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
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of File
     * 
     */
    public String getPath()
    {
        return m_Path;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

