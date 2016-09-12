package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;

/**
 * NPY File Saver
 *
 * NPY image saver (Numerical python file saver.)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"output"})
public class NpySave extends GeglFilter implements Sink
{
    /** Constructs a NPY File Saver.
     *
     * NPY image saver (Numerical python file saver.)
     */
    public NpySave(GeglNode container)
    {
        super(container, "gegl:npy-save");
    }
    /** Constructs a NPY File Saver.
     *
     * NPY image saver (Numerical python file saver.)
     */
    public NpySave(GeglFilter parent)
    {
        super(parent, "gegl:npy-save");
    }

    
    /** File
     *
     * Target path and filename, use '-' for stdout.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** File
     *
     * Target path and filename, use '-' for stdout.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public NpySave setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Target path and filename, use '-' for stdout.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
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

