package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * GIF File Loader
 *
 * GIF image loader.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"hidden"})
public class GifLoad extends GeglFilter implements Source
{
    /** Constructs a GIF File Loader.
     *
     * GIF image loader.
     *
     * @param container container node
     */
    public GifLoad(GeglNode container)
    {
        super(container, "gegl:gif-load");
    }
    /** Constructs a GIF File Loader.
     *
     * GIF image loader.
     *
     * @param parent parent filter node
     */
    public GifLoad(GeglFilter parent)
    {
        super(parent, "gegl:gif-load");
    }

    
    /** File
     *
     * Path of file to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** File
     *
     * Path of file to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for File
     * @return this filter (for chaining operations)
     * 
     */
    public GifLoad setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** File
     *
     * Path of file to load
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


    /** frame
     *
     * frame number to decode
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Frame ;

    /** frame
     *
     * frame number to decode
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for frame
     * @return this filter (for chaining operations)
     * 
     */
    public GifLoad setFrame(int value)
    {
	
        m_Frame = value;
        setProperty("frame", value);
        return this;
    }

    /** frame
     *
     * frame number to decode
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of frame
     * 
     */
    public int getFrame()
    {
        return m_Frame;
    }


    /** frames
     *
     * Number of frames in gif animation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Frames ;

    /** frames
     *
     * Number of frames in gif animation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for frames
     * @return this filter (for chaining operations)
     * 
     */
    public GifLoad setFrames(int value)
    {
	
        m_Frames = value;
        setProperty("frames", value);
        return this;
    }

    /** frames
     *
     * Number of frames in gif animation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of frames
     * 
     */
    public int getFrames()
    {
        return m_Frames;
    }


    /** frame-delay
     *
     * Delay in ms for last decoded frame
     *
     * Unit: 
     * Default value: 100
     * Acceptable Range:  
     * */
    private int m_FrameDelay  = 100;

    /** frame-delay
     *
     * Delay in ms for last decoded frame
     *
     * Unit: 
     * Default value: 100
     * Acceptable Range:  
     *
     * @param value new value for frame-delay
     * @return this filter (for chaining operations)
     * 
     */
    public GifLoad setFrameDelay(int value)
    {
	
        m_FrameDelay = value;
        setProperty("frame-delay", value);
        return this;
    }

    /** frame-delay
     *
     * Delay in ms for last decoded frame
     *
     * Unit: 
     * Default value: 100
     * Acceptable Range:  
     *
     * @return value of frame-delay
     * 
     */
    public int getFrameDelay()
    {
        return m_FrameDelay;
    }

    @Override
    public OutputPad<GifLoad> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

