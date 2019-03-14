package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * 
 *
 * Image Magick wrapper using the png op.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class MagickLoad extends GeglFilter implements Source
{
    /** Constructs a .
     *
     * Image Magick wrapper using the png op.
     *
     * @param container container node
     */
    public MagickLoad(GeglNode container)
    {
        super(container, "gegl:magick-load");
    }
    /** Constructs a .
     *
     * Image Magick wrapper using the png op.
     *
     * @param parent parent filter node
     */
    public MagickLoad(GeglFilter parent)
    {
        super(parent, "gegl:magick-load");
    }

    
    /** File
     *
     * Path of file to load.
     *
     * Unit: 
     * Default value: "/tmp/gegl-logo.svg"
     * Acceptable Range:  
     * */
    private String m_Path  = "/tmp/gegl-logo.svg";

    /** File
     *
     * Path of file to load.
     *
     * Unit: 
     * Default value: "/tmp/gegl-logo.svg"
     * Acceptable Range:  
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
     */
    public MagickLoad setPath(String value)
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
     * Default value: "/tmp/gegl-logo.svg"
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
    public OutputPad<MagickLoad> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

