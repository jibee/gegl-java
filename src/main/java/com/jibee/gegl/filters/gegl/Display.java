package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;

/**
 * Display
 *
 * Display the input buffer in a window.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"meta", "display"})
public class Display extends GeglFilter implements Sink
{
    /** Constructs a Display.
     *
     * Display the input buffer in a window.
     *
     * @param container container node
     */
    public Display(GeglNode container)
    {
        super(container, "gegl:display");
    }
    /** Constructs a Display.
     *
     * Display the input buffer in a window.
     *
     * @param parent parent filter node
     */
    public Display(GeglFilter parent)
    {
        super(parent, "gegl:display");
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
     *
     * @param value new value for Window title
     * @return this filter (for chaining operations)
     * 
     */
    public Display setWindowTitle(String value)
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
     *
     * @return value of Window title
     * 
     */
    public String getWindowTitle()
    {
        return m_WindowTitle;
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }

}

