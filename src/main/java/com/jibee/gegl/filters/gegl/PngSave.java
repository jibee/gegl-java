package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * PNG File Saver
 *
 * PNG image saver, using libpng
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"output"})
public class PngSave extends GeglFilter implements Sink
{
    /** Constructs a PNG File Saver.
     *
     * PNG image saver, using libpng
     *
     * @param container container node
     */
    public PngSave(GeglNode container)
    {
        super(container, "gegl:png-save");
    }
    /** Constructs a PNG File Saver.
     *
     * PNG image saver, using libpng
     *
     * @param parent parent filter node
     */
    public PngSave(GeglFilter parent)
    {
        super(parent, "gegl:png-save");
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
    public PngSave setPath(String value)
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


    /** Compression
     *
     * PNG compression level from 1 to 9
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 9
     * */
    private int m_Compression  = 3;

    /** Compression
     *
     * PNG compression level from 1 to 9
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 9
     *
     * @param value new value for Compression
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public PngSave setCompression(int value) throws ParameterOutOfRangeException
    {
		if(value > 9 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 9);
	    }

        m_Compression = value;
        setProperty("compression", value);
        return this;
    }

    /** Compression
     *
     * PNG compression level from 1 to 9
     *
     * Unit: 
     * Default value: 3
     * Acceptable Range: 1 9
     *
     * @return value of Compression
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getCompression()
    {
        return m_Compression;
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
    public PngSave setBitdepth(int value) throws ParameterOutOfRangeException
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
    public InputPad<PngSave> Input()
    {
        return new InputPad<>(this, "input");
    }

}

