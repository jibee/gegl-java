package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Extract Component
 *
 * Extract a color model component
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class ComponentExtract extends GeglFilter
{
    /** Constructs a Extract Component.
     *
     * Extract a color model component
     */
    public ComponentExtract(GeglNode container)
    {
        super(container, "gegl:component-extract");
    }
    /** Constructs a Extract Component.
     *
     * Extract a color model component
     */
    public ComponentExtract(GeglFilter parent)
    {
        super(parent, "gegl:component-extract");
    }

    
    /** Component
     *
     * Component to extract
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Component ;

    /** Component
     *
     * Component to extract
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public ComponentExtract setComponent(String value)
    {
	
        m_Component = value;
        setProperty("component", value);
        return this;
    }

    /** Component
     *
     * Component to extract
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getComponent()
    {
        return m_Component;
    }


    /** Invert component
     *
     * Invert the extracted component
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Invert  = false;

    /** Invert component
     *
     * Invert the extracted component
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public ComponentExtract setInvert(boolean value)
    {
	
        m_Invert = value;
        setProperty("invert", value);
        return this;
    }

    /** Invert component
     *
     * Invert the extracted component
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getInvert()
    {
        return m_Invert;
    }


    /** Linear output
     *
     * Use linear output instead of gamma corrected
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Linear  = false;

    /** Linear output
     *
     * Use linear output instead of gamma corrected
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public ComponentExtract setLinear(boolean value)
    {
	
        m_Linear = value;
        setProperty("linear", value);
        return this;
    }

    /** Linear output
     *
     * Use linear output instead of gamma corrected
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getLinear()
    {
        return m_Linear;
    }

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

