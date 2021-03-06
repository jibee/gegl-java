package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Babl;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Convert color space
 *
 * set color space which subsequent babl-formats in the pipeline are created with, and the ICC profile potentially embedded for external color management, setting a pointer to a format override the string property and setting an aux pad overrides both. 
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"core", "color"})
public class ConvertSpace extends GeglFilter implements Filter
{
    /** Constructs a Convert color space.
     *
     * set color space which subsequent babl-formats in the pipeline are created with, and the ICC profile potentially embedded for external color management, setting a pointer to a format override the string property and setting an aux pad overrides both. 
     *
     * @param container container node
     */
    public ConvertSpace(GeglNode container)
    {
        super(container, "gegl:convert-space");
    }
    /** Constructs a Convert color space.
     *
     * set color space which subsequent babl-formats in the pipeline are created with, and the ICC profile potentially embedded for external color management, setting a pointer to a format override the string property and setting an aux pad overrides both. 
     *
     * @param parent parent filter node
     */
    public ConvertSpace(GeglFilter parent)
    {
        super(parent, "gegl:convert-space");
    }

    
    /** Name
     *
     * One of: sRGB, Adobish, Rec2020, ProPhoto, Apple, ACEScg, ACES2065-1
     *
     * Unit: 
     * Default value: "sRGB"
     * Acceptable Range:  
     * */
    private String m_Name  = "sRGB";

    /** Name
     *
     * One of: sRGB, Adobish, Rec2020, ProPhoto, Apple, ACEScg, ACES2065-1
     *
     * Unit: 
     * Default value: "sRGB"
     * Acceptable Range:  
     *
     * @param value new value for Name
     * @return this filter (for chaining operations)
     * 
     */
    public ConvertSpace setName(String value)
    {
	
        m_Name = value;
        setProperty("name", value);
        return this;
    }

    /** Name
     *
     * One of: sRGB, Adobish, Rec2020, ProPhoto, Apple, ACEScg, ACES2065-1
     *
     * Unit: 
     * Default value: "sRGB"
     * Acceptable Range:  
     *
     * @return value of Name
     * 
     */
    public String getName()
    {
        return m_Name;
    }


    /** Pointer
     *
     * pointer to a const * Babl space
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private Babl m_Pointer ;

    /** Pointer
     *
     * pointer to a const * Babl space
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Pointer
     * @return this filter (for chaining operations)
     * 
     */
    public ConvertSpace setPointer(Babl value)
    {
	
        m_Pointer = value;
        setProperty("pointer", value);
        return this;
    }

    /** Pointer
     *
     * pointer to a const * Babl space
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Pointer
     * 
     */
    public Babl getPointer()
    {
        return m_Pointer;
    }


    /** Path
     *
     * File system path to ICC matrix profile to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Path ;

    /** Path
     *
     * File system path to ICC matrix profile to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Path
     * @return this filter (for chaining operations)
     * 
     */
    public ConvertSpace setPath(String value)
    {
	
        m_Path = value;
        setProperty("path", value);
        return this;
    }

    /** Path
     *
     * File system path to ICC matrix profile to load
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Path
     * 
     */
    public String getPath()
    {
        return m_Path;
    }

    @Override
    public InputPad<ConvertSpace> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ConvertSpace> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

