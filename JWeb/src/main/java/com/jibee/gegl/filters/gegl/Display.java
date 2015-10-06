package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;

import com.jibee.gegl.GeglNode;

/**


Display the input buffer in a window.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class Display extends GeglFilter
{
/** Constructs a .

Display the input buffer in a window.
*/
    public Display(GeglNode container)
    {
        super(container, "gegl:display");
    }
/** Constructs a .

Display the input buffer in a window.
*/
    public Display(GeglFilter parent)
    {
        super(parent, "gegl:display");
    }

    
/** Window title

Title to be given to output window

Unit: 
Default value: "window_title"
Acceptable Range:  
*/
    private String m_WindowTitle  = "window_title";

/** Window title

Title to be given to output window

Unit: 
Default value: "window_title"
Acceptable Range:  
*/
    public Display setWindowTitle(String value)
    {
	
        m_WindowTitle = value;
        setProperty("window-title", value);
        return this;
    }

/** Window title

Title to be given to output window

Unit: 
Default value: "window_title"
Acceptable Range:  
*/
    public String getWindowTitle()
    {
        return m_WindowTitle;
    }


}
