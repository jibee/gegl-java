package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

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
public class ValuePropagate extends GeglFilter implements Source, Sink
{
    /** Constructs a Value Propagate.
     *
     * Propagate certain colors to neighboring pixels.
     *
     * @param container container node
     */
    public ValuePropagate(GeglNode container)
    {
        super(container, "gegl:value-propagate");
    }
    /** Constructs a Value Propagate.
     *
     * Propagate certain colors to neighboring pixels.
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Mode
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Mode
     * 
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
     *
     * @param value new value for Lower threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Lower threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Upper threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Upper threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Propagating rate
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Propagating rate
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRate()
    {
        return m_Rate;
    }


    /** Color
     *
     * ''
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 1.0000)");

    /** Color
     *
     * ''
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Color
     * @return this filter (for chaining operations)
     * 
     */
    public ValuePropagate setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

    /** Color
     *
     * ''
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @return value of Color
     * 
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
     *
     * @param value new value for To top
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of To top
     * 
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
     *
     * @param value new value for To left
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of To left
     * 
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
     *
     * @param value new value for To right
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of To right
     * 
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
     *
     * @param value new value for To bottom
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of To bottom
     * 
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
     *
     * @param value new value for Propagating value channel
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Propagating value channel
     * 
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
     *
     * @param value new value for Propagating alpha channel
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Propagating alpha channel
     * 
     */
    public boolean getAlpha()
    {
        return m_Alpha;
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

