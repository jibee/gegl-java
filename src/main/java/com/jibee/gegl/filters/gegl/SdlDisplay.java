package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;

/**
 * SDL Display
 *
 * Displays the input buffer in an SDL window (restricted to one display op/process, due to SDL implementation issues).
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"display"})
public class SdlDisplay extends GeglFilter implements Sink
{
    /** Constructs a SDL Display.
     *
     * Displays the input buffer in an SDL window (restricted to one display op/process, due to SDL implementation issues).
     */
    public SdlDisplay(GeglNode container)
    {
        super(container, "gegl:sdl-display");
    }
    /** Constructs a SDL Display.
     *
     * Displays the input buffer in an SDL window (restricted to one display op/process, due to SDL implementation issues).
     */
    public SdlDisplay(GeglFilter parent)
    {
        super(parent, "gegl:sdl-display");
    }

    
    /** Window title
     *
     * Title to be given to output window
     *
     * Unit: 
     * Default value: "window_title"
     * Acceptable Range:  
     * */
    private String m_WindowTitle  = "window_title";

    /** Window title
     *
     * Title to be given to output window
     *
     * Unit: 
     * Default value: "window_title"
     * Acceptable Range:  
     */
    public SdlDisplay setWindowTitle(String value)
    {
	
        m_WindowTitle = value;
        setProperty("window-title", value);
        return this;
    }

    /** Window title
     *
     * Title to be given to output window
     *
     * Unit: 
     * Default value: "window_title"
     * Acceptable Range:  
     */
    public String getWindowTitle()
    {
        return m_WindowTitle;
    }


    /** Icon title
     *
     * Icon to be used for output window
     *
     * Unit: 
     * Default value: "icon_title"
     * Acceptable Range:  
     * */
    private String m_IconTitle  = "icon_title";

    /** Icon title
     *
     * Icon to be used for output window
     *
     * Unit: 
     * Default value: "icon_title"
     * Acceptable Range:  
     */
    public SdlDisplay setIconTitle(String value)
    {
	
        m_IconTitle = value;
        setProperty("icon-title", value);
        return this;
    }

    /** Icon title
     *
     * Icon to be used for output window
     *
     * Unit: 
     * Default value: "icon_title"
     * Acceptable Range:  
     */
    public String getIconTitle()
    {
        return m_IconTitle;
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }

}

