package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Source;

/**
 * Mix
 *
 * do a lerp, linear interpolation (lerp) between input and aux
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={})
public class Mix extends GeglFilter implements Source, DualSink
{
    /** Constructs a Mix.
     *
     * do a lerp, linear interpolation (lerp) between input and aux
     *
     * @param container container node
     */
    public Mix(GeglNode container)
    {
        super(container, "gegl:mix");
    }
    /** Constructs a Mix.
     *
     * do a lerp, linear interpolation (lerp) between input and aux
     *
     * @param parent parent filter node
     */
    public Mix(GeglFilter parent)
    {
        super(parent, "gegl:mix");
    }

    
    /** Ratio
     *
     * mixing ratio, read as amount of aux, 0=input 0.5=half 1.0=aux
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_Ratio  = 0.50;

    /** Ratio
     *
     * mixing ratio, read as amount of aux, 0=input 0.5=half 1.0=aux
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @param value new value for Ratio
     * @return this filter (for chaining operations)
     * 
     */
    public Mix setRatio(double value)
    {
	
        m_Ratio = value;
        setProperty("ratio", value);
        return this;
    }

    /** Ratio
     *
     * mixing ratio, read as amount of aux, 0=input 0.5=half 1.0=aux
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @return value of Ratio
     * 
     */
    public double getRatio()
    {
        return m_Ratio;
    }

    @Override
    public InputPad Aux()
    {
        return new InputPad(this, "aux");
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

