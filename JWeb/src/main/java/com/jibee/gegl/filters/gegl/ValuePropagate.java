package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Value Propagate
 *
 * Propagate certain colors to neighboring pixels.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"distort"})
public class ValuePropagate extends GeglFilter
{
    /** Constructs a Value Propagate.
     *
     * Propagate certain colors to neighboring pixels.
     */
    public ValuePropagate(GeglNode container)
    {
        super(container, "gegl:value-propagate");
    }
    /** Constructs a Value Propagate.
     *
     * Propagate certain colors to neighboring pixels.
     */
    public ValuePropagate(GeglFilter parent)
    {
        super(parent, "gegl:value-propagate");
    }

    
    /** Mode
     *
     * Mode of value propagation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Mode ;

    /** Mode
     *
     * Mode of value propagation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public ValuePropagate setMode(String value)
    {
	
        m_Mode = value;
        setProperty("mode", value);
        return this;
    }

    /** Mode
     *
     * Mode of value propagation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getMode()
    {
        return m_Mode;
    }


    /** Lower threshold
     *
     * Lower threshold
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_LowerThreshold  = 0.00;

    /** Lower threshold
     *
     * Lower threshold
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public ValuePropagate setLowerThreshold(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_LowerThreshold = value;
        setProperty("lower-threshold", value);
        return this;
    }

    /** Lower threshold
     *
     * Lower threshold
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public double getLowerThreshold()
    {
        return m_LowerThreshold;
    }


    /** Upper threshold
     *
     * Upper threshold
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_UpperThreshold  = 1.00;

    /** Upper threshold
     *
     * Upper threshold
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     */
    public ValuePropagate setUpperThreshold(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_UpperThreshold = value;
        setProperty("upper-threshold", value);
        return this;
    }

    /** Upper threshold
     *
     * Upper threshold
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     */
    public double getUpperThreshold()
    {
        return m_UpperThreshold;
    }


    /** Propagating rate
     *
     * Upper threshold
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Rate  = 1.00;

    /** Propagating rate
     *
     * Upper threshold
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     */
    public ValuePropagate setRate(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Rate = value;
        setProperty("rate", value);
        return this;
    }

    /** Propagating rate
     *
     * Upper threshold
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     */
    public double getRate()
    {
        return m_Rate;
    }


    /** Color
     *
     * Color to use for the "Only color" and "Color to peaks" modes
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 1.0000)");

    /** Color
     *
     * Color to use for the "Only color" and "Color to peaks" modes
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     */
    public ValuePropagate setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

    /** Color
     *
     * Color to use for the "Only color" and "Color to peaks" modes
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor()
    {
        return m_Color;
    }


    /** To top
     *
     * Propagate to top
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Top  = true;

    /** To top
     *
     * Propagate to top
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ValuePropagate setTop(boolean value)
    {
	
        m_Top = value;
        setProperty("top", value);
        return this;
    }

    /** To top
     *
     * Propagate to top
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getTop()
    {
        return m_Top;
    }


    /** To left
     *
     * Propagate to left
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Left  = true;

    /** To left
     *
     * Propagate to left
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ValuePropagate setLeft(boolean value)
    {
	
        m_Left = value;
        setProperty("left", value);
        return this;
    }

    /** To left
     *
     * Propagate to left
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getLeft()
    {
        return m_Left;
    }


    /** To right
     *
     * Propagate to right
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Right  = true;

    /** To right
     *
     * Propagate to right
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ValuePropagate setRight(boolean value)
    {
	
        m_Right = value;
        setProperty("right", value);
        return this;
    }

    /** To right
     *
     * Propagate to right
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getRight()
    {
        return m_Right;
    }


    /** To bottom
     *
     * Propagate to bottom
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Bottom  = true;

    /** To bottom
     *
     * Propagate to bottom
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ValuePropagate setBottom(boolean value)
    {
	
        m_Bottom = value;
        setProperty("bottom", value);
        return this;
    }

    /** To bottom
     *
     * Propagate to bottom
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getBottom()
    {
        return m_Bottom;
    }


    /** Propagating value channel
     *
     * Propagating value channel
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Value  = true;

    /** Propagating value channel
     *
     * Propagating value channel
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ValuePropagate setValue(boolean value)
    {
	
        m_Value = value;
        setProperty("value", value);
        return this;
    }

    /** Propagating value channel
     *
     * Propagating value channel
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getValue()
    {
        return m_Value;
    }


    /** Propagating alpha channel
     *
     * Propagating alpha channel
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Alpha  = true;

    /** Propagating alpha channel
     *
     * Propagating alpha channel
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ValuePropagate setAlpha(boolean value)
    {
	
        m_Alpha = value;
        setProperty("alpha", value);
        return this;
    }

    /** Propagating alpha channel
     *
     * Propagating alpha channel
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getAlpha()
    {
        return m_Alpha;
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

