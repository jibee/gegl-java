package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * 
 *
 * Raw image loader, wrapping dcraw with pipes, provides the raw bayer grid as grayscale, if the fileformat is .rawbayer it will use this loader instead of the normal dcraw loader, if the fileformat is .rawbayerS it will swap the returned 16bit numbers (the pnm loader is apparently buggy)
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class RawbayerLoad extends GeglFilter implements Source
{
    /** Constructs a .
     *
     * Raw image loader, wrapping dcraw with pipes, provides the raw bayer grid as grayscale, if the fileformat is .rawbayer it will use this loader instead of the normal dcraw loader, if the fileformat is .rawbayerS it will swap the returned 16bit numbers (the pnm loader is apparently buggy)
     */
    public RawbayerLoad(GeglNode container)
    {
        super(container, "gegl:rawbayer-load");
    }
    /** Constructs a .
     *
     * Raw image loader, wrapping dcraw with pipes, provides the raw bayer grid as grayscale, if the fileformat is .rawbayer it will use this loader instead of the normal dcraw loader, if the fileformat is .rawbayerS it will swap the returned 16bit numbers (the pnm loader is apparently buggy)
     */
    public RawbayerLoad(GeglFilter parent)
    {
        super(parent, "gegl:rawbayer-load");
    }

    
    /** File
     *
     * Path of file to load.
     *
     * Unit: 
     * Default value: "/tmp/test.raw"
     * Acceptable Range:  
     * */
    private String m_Path  = "/tmp/test.raw";

    /** File
     *
     * Path of file to load.
     *
     * Unit: 
     * Default value: "/tmp/test.raw"
     * Acceptable Range:  
     */
    public RawbayerLoad setPath(String value)
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
     * Default value: "/tmp/test.raw"
     * Acceptable Range:  
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

