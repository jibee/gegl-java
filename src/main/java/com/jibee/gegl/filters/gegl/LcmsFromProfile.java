package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;
import com.sun.jna.Pointer;

/**
 * LCMS From Profile
 *
 * Converts the input from an ICC color profile to a well defined babl format. The buffer's data will then be correctly managed by GEGL for further processing.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class LcmsFromProfile extends GeglFilter implements Filter
{
    /** Constructs a LCMS From Profile.
     *
     * Converts the input from an ICC color profile to a well defined babl format. The buffer's data will then be correctly managed by GEGL for further processing.
     *
     * @param container container node
     */
    public LcmsFromProfile(GeglNode container)
    {
        super(container, "gegl:lcms-from-profile");
    }
    /** Constructs a LCMS From Profile.
     *
     * Converts the input from an ICC color profile to a well defined babl format. The buffer's data will then be correctly managed by GEGL for further processing.
     *
     * @param parent parent filter node
     */
    public LcmsFromProfile(GeglFilter parent)
    {
        super(parent, "gegl:lcms-from-profile");
    }

    
    /** Source Profile
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private Pointer m_SrcProfile ;

    /** Source Profile
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Source Profile
     * @return this filter (for chaining operations)
     * 
     */
    public LcmsFromProfile setSrcProfile(Pointer value)
    {
	
        m_SrcProfile = value;
        setProperty("src-profile", value);
        return this;
    }

    /** Source Profile
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Source Profile
     * 
     */
    public Pointer getSrcProfile()
    {
        return m_SrcProfile;
    }


    /** Rendering intent
     *
     * The rendering intent to use in the conversion.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Intent ;

    /** Rendering intent
     *
     * The rendering intent to use in the conversion.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Rendering intent
     * @return this filter (for chaining operations)
     * 
     */
    public LcmsFromProfile setIntent(String value)
    {
	
        m_Intent = value;
        setProperty("intent", value);
        return this;
    }

    /** Rendering intent
     *
     * The rendering intent to use in the conversion.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Rendering intent
     * 
     */
    public String getIntent()
    {
        return m_Intent;
    }


    /** Black point compensation
     *
     * Convert using black point compensation.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_BlackPointCompensation  = false;

    /** Black point compensation
     *
     * Convert using black point compensation.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Black point compensation
     * @return this filter (for chaining operations)
     * 
     */
    public LcmsFromProfile setBlackPointCompensation(boolean value)
    {
	
        m_BlackPointCompensation = value;
        setProperty("black-point-compensation", value);
        return this;
    }

    /** Black point compensation
     *
     * Convert using black point compensation.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Black point compensation
     * 
     */
    public boolean getBlackPointCompensation()
    {
        return m_BlackPointCompensation;
    }

    @Override
    public InputPad<LcmsFromProfile> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<LcmsFromProfile> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

