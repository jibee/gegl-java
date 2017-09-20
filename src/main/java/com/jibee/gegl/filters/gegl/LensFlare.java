package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Lens Flare
 *
 * Adds a lens flare effect.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"light"})
public class LensFlare extends GeglFilter implements Filter
{
    /** Constructs a Lens Flare.
     *
     * Adds a lens flare effect.
     *
     * @param container container node
     */
    public LensFlare(GeglNode container)
    {
        super(container, "gegl:lens-flare");
    }
    /** Constructs a Lens Flare.
     *
     * Adds a lens flare effect.
     *
     * @param parent parent filter node
     */
    public LensFlare(GeglFilter parent)
    {
        super(parent, "gegl:lens-flare");
    }

    
    /** X position
     *
     * X coordinates of the flare center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_PosX  = 0.50;

    /** X position
     *
     * X coordinates of the flare center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @param value new value for X position
     * @return this filter (for chaining operations)
     * 
     */
    public LensFlare setPosX(double value)
    {
	
        m_PosX = value;
        setProperty("pos-x", value);
        return this;
    }

    /** X position
     *
     * X coordinates of the flare center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @return value of X position
     * 
     */
    public double getPosX()
    {
        return m_PosX;
    }


    /** Y position
     *
     * Y coordinates of the flare center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_PosY  = 0.50;

    /** Y position
     *
     * Y coordinates of the flare center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @param value new value for Y position
     * @return this filter (for chaining operations)
     * 
     */
    public LensFlare setPosY(double value)
    {
	
        m_PosY = value;
        setProperty("pos-y", value);
        return this;
    }

    /** Y position
     *
     * Y coordinates of the flare center
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @return value of Y position
     * 
     */
    public double getPosY()
    {
        return m_PosY;
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

