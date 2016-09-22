package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

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
public class ComponentExtract extends GeglFilter implements Source, Sink
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

    @Override
    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}
