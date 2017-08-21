package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;

/**
 * NumPy File Saver
 *
 * NumPy (Numerical Python) image saver
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"output"})
public class NpySave extends GeglFilter implements Sink
{
    /** Constructs a NumPy File Saver.
     *
     * NumPy (Numerical Python) image saver
     *
     * @param container container node
     */
    public NpySave(GeglNode container)
    {
        super(container, "gegl:npy-save");
    }
    /** Constructs a NumPy File Saver.
     *
     * NumPy (Numerical Python) image saver
     *
     * @param parent parent filter node
     */
    public NpySave(GeglFilter parent)
    {
        super(parent, "gegl:npy-save");
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
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
     */
    public NpySave setPath(String value)
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

