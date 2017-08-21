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
     *
     * @param container container node
     */
    public ComponentExtract(GeglNode container)
    {
        super(container, "gegl:component-extract");
    }
    /** Constructs a Extract Component.
     *
     * Extract a color model component
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Component
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Component
     * 
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
     *
     * @param value new value for Invert component
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Invert component
     * 
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
     *
     * @param value new value for Linear output
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Linear output
     * 
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

