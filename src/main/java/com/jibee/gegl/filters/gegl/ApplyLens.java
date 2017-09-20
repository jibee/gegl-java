package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Apply Lens
 *
 * Simulates the optical distortion caused by having an elliptical lens over the image
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"map"})
public class ApplyLens extends GeglFilter implements Filter
{
    /** Constructs a Apply Lens.
     *
     * Simulates the optical distortion caused by having an elliptical lens over the image
     *
     * @param container container node
     */
    public ApplyLens(GeglNode container)
    {
        super(container, "gegl:apply-lens");
    }
    /** Constructs a Apply Lens.
     *
     * Simulates the optical distortion caused by having an elliptical lens over the image
     *
     * @param parent parent filter node
     */
    public ApplyLens(GeglFilter parent)
    {
        super(parent, "gegl:apply-lens");
    }

    
    /** Lens refraction index
     *
     * 
     *
     * Unit: 
     * Default value: 1.70
     * Acceptable Range: 1.00 100.00
     * */
    private double m_RefractionIndex  = 1.70;

    /** Lens refraction index
     *
     * 
     *
     * Unit: 
     * Default value: 1.70
     * Acceptable Range: 1.00 100.00
     *
     * @param value new value for Lens refraction index
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public ApplyLens setRefractionIndex(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 1.00)
	    {
	        throw new ParameterOutOfRangeException(value, 1.00, 100.00);
	    }

        m_RefractionIndex = value;
        setProperty("refraction-index", value);
        return this;
    }

    /** Lens refraction index
     *
     * 
     *
     * Unit: 
     * Default value: 1.70
     * Acceptable Range: 1.00 100.00
     *
     * @return value of Lens refraction index
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRefractionIndex()
    {
        return m_RefractionIndex;
    }


    /** Keep original surroundings
     *
     * Keep image unchanged, where not affected by the lens.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_KeepSurroundings  = false;

    /** Keep original surroundings
     *
     * Keep image unchanged, where not affected by the lens.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Keep original surroundings
     * @return this filter (for chaining operations)
     * 
     */
    public ApplyLens setKeepSurroundings(boolean value)
    {
	
        m_KeepSurroundings = value;
        setProperty("keep-surroundings", value);
        return this;
    }

    /** Keep original surroundings
     *
     * Keep image unchanged, where not affected by the lens.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Keep original surroundings
     * 
     */
    public boolean getKeepSurroundings()
    {
        return m_KeepSurroundings;
    }


    /** Background color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_BackgroundColor  = makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)");

    /** Background color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Background color
     * @return this filter (for chaining operations)
     * 
     */
    public ApplyLens setBackgroundColor(GeglColor value)
    {
	
        m_BackgroundColor = value;
        setProperty("background-color", value);
        return this;
    }

    /** Background color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of Background color
     * 
     */
    public GeglColor getBackgroundColor()
    {
        return m_BackgroundColor;
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

