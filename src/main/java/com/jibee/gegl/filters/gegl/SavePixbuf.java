package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.Sink;
import com.sun.jna.Pointer;

/**
 * Store in GdkPixbuf
 *
 * Store image in a GdkPixbuf.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"programming", "output"})
public class SavePixbuf extends GeglFilter implements Sink
{
    /** Constructs a Store in GdkPixbuf.
     *
     * Store image in a GdkPixbuf.
     */
    public SavePixbuf(GeglNode container)
    {
        super(container, "gegl:save-pixbuf");
    }
    /** Constructs a Store in GdkPixbuf.
     *
     * Store image in a GdkPixbuf.
     */
    public SavePixbuf(GeglFilter parent)
    {
        super(parent, "gegl:save-pixbuf");
    }

    
    /** Pixbuf location
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private Pointer m_Pixbuf ;

    /** Pixbuf location
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public SavePixbuf setPixbuf(Pointer value)
    {
	
        m_Pixbuf = value;
        setProperty("pixbuf", value);
        return this;
    }

    /** Pixbuf location
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Pointer getPixbuf()
    {
        return m_Pixbuf;
    }

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }

}

