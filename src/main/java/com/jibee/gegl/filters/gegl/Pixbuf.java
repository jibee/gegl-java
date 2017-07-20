package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * GdkPixbuf Source
 *
 * Uses the GdkPixbuf located at the memory location in <em>pixbuf</em>.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"programming", "input"})
public class Pixbuf extends GeglFilter implements Source
{
    /** Constructs a GdkPixbuf Source.
     *
     * Uses the GdkPixbuf located at the memory location in <em>pixbuf</em>.
     */
    public Pixbuf(GeglNode container)
    {
        super(container, "gegl:pixbuf");
    }
    /** Constructs a GdkPixbuf Source.
     *
     * Uses the GdkPixbuf located at the memory location in <em>pixbuf</em>.
     */
    public Pixbuf(GeglFilter parent)
    {
        super(parent, "gegl:pixbuf");
    }

    
    /** Pixbuf
     *
     * GdkPixbuf to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private GeglBuffer m_Pixbuf ;

    /** Pixbuf
     *
     * GdkPixbuf to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Pixbuf setPixbuf(GeglBuffer value)
    {
	
        m_Pixbuf = value;
        setProperty("pixbuf", value);
        return this;
    }

    /** Pixbuf
     *
     * GdkPixbuf to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public GeglBuffer getPixbuf()
    {
        return m_Pixbuf;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

