package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * PPM File Saver
 *
 * PPM image saver (Portable pixmap saver.)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"output"})
public class PpmSave extends GeglFilter implements Sink
{
    /** Constructs a PPM File Saver.
     *
     * PPM image saver (Portable pixmap saver.)
     *
     * @param container container node
     */
    public PpmSave(GeglNode container)
    {
        super(container, "gegl:ppm-save");
    }
    /** Constructs a PPM File Saver.
     *
     * PPM image saver (Portable pixmap saver.)
     *
     * @param parent parent filter node
     */
    public PpmSave(GeglFilter parent)
    {
        super(parent, "gegl:ppm-save");
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
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
     */
    public PpmSave setPath(String value)
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
     *
     * @return value of File
     * 
     */
    public String getPath()
    {
        return m_Path;
    }


    /** Raw format
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Rawformat  = true;

    /** Raw format
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Raw format
     * @return this filter (for chaining operations)
     * 
     */
    public PpmSave setRawformat(boolean value)
    {
	
        m_Rawformat = value;
        setProperty("rawformat", value);
        return this;
    }

    /** Raw format
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Raw format
     * 
     */
    public boolean getRawformat()
    {
        return m_Rawformat;
    }


    /** Bitdepth
     *
     * 8 and 16 are the currently accepted values.
     *
     * Unit: 
     * Default value: 16
     * Acceptable Range: 8 16
     * */
    private int m_Bitdepth  = 16;

    /** Bitdepth
     *
     * 8 and 16 are the currently accepted values.
     *
     * Unit: 
     * Default value: 16
     * Acceptable Range: 8 16
     *
     * @param value new value for Bitdepth
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public PpmSave setBitdepth(int value) throws ParameterOutOfRangeException
    {
		if(value > 16 || value < 8)
	    {
	        throw new ParameterOutOfRangeException(value, 8, 16);
	    }

        m_Bitdepth = value;
        setProperty("bitdepth", value);
        return this;
    }

    /** Bitdepth
     *
     * 8 and 16 are the currently accepted values.
     *
     * Unit: 
     * Default value: 16
     * Acceptable Range: 8 16
     *
     * @return value of Bitdepth
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getBitdepth()
    {
        return m_Bitdepth;
    }

    @Override
    public InputPad<PpmSave> Input()
    {
        return new InputPad<>(this, "input");
    }

}

