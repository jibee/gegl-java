package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;

/**
 * Save
 *
 * Multipurpose file saver, that uses other native save handlers depending on extension, use the format specific save ops to specify additional parameters.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"meta", "output"})
public class Save extends GeglFilter implements Sink
{
    /** Constructs a Save.
     *
     * Multipurpose file saver, that uses other native save handlers depending on extension, use the format specific save ops to specify additional parameters.
     *
     * @param container container node
     */
    public Save(GeglNode container)
    {
        super(container, "gegl:save");
    }
    /** Constructs a Save.
     *
     * Multipurpose file saver, that uses other native save handlers depending on extension, use the format specific save ops to specify additional parameters.
     *
     * @param parent parent filter node
     */
    public Save(GeglFilter parent)
    {
        super(parent, "gegl:save");
    }

    
    /** File
     *
     * Path of file to save.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** File
     *
     * Path of file to save.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
     */
    public Save setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Path of file to save.
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
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }

}

