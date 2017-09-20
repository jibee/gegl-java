package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Wind
 *
 * Wind-like bleed effect
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"distort"})
public class Wind extends GeglFilter implements Filter
{
    /** Constructs a Wind.
     *
     * Wind-like bleed effect
     *
     * @param container container node
     */
    public Wind(GeglNode container)
    {
        super(container, "gegl:wind");
    }
    /** Constructs a Wind.
     *
     * Wind-like bleed effect
     *
     * @param parent parent filter node
     */
    public Wind(GeglFilter parent)
    {
        super(parent, "gegl:wind");
    }

    
    /** Style
     *
     * Style of effect
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Style ;

    /** Style
     *
     * Style of effect
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Style
     * @return this filter (for chaining operations)
     * 
     */
    public Wind setStyle(String value)
    {
	
        m_Style = value;
        setProperty("style", value);
        return this;
    }

    /** Style
     *
     * Style of effect
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Style
     * 
     */
    public String getStyle()
    {
        return m_Style;
    }


    /** Direction
     *
     * Direction of the effect
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Direction ;

    /** Direction
     *
     * Direction of the effect
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Direction
     * @return this filter (for chaining operations)
     * 
     */
    public Wind setDirection(String value)
    {
	
        m_Direction = value;
        setProperty("direction", value);
        return this;
    }

    /** Direction
     *
     * Direction of the effect
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Direction
     * 
     */
    public String getDirection()
    {
        return m_Direction;
    }


    /** Edge Affected
     *
     * Edge behavior
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Edge ;

    /** Edge Affected
     *
     * Edge behavior
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Edge Affected
     * @return this filter (for chaining operations)
     * 
     */
    public Wind setEdge(String value)
    {
	
        m_Edge = value;
        setProperty("edge", value);
        return this;
    }

    /** Edge Affected
     *
     * Edge behavior
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Edge Affected
     * 
     */
    public String getEdge()
    {
        return m_Edge;
    }


    /** Threshold
     *
     * Higher values restrict the effect to fewer areas of the image
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range:  50
     * */
    private int m_Threshold  = 10;

    /** Threshold
     *
     * Higher values restrict the effect to fewer areas of the image
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range:  50
     *
     * @param value new value for Threshold
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Wind setThreshold(int value) throws ParameterOutOfRangeException
    {
		if(value > 50)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 50);
	    }

        m_Threshold = value;
        setProperty("threshold", value);
        return this;
    }

    /** Threshold
     *
     * Higher values restrict the effect to fewer areas of the image
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range:  50
     *
     * @return value of Threshold
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getThreshold()
    {
        return m_Threshold;
    }


    /** Strength
     *
     * Higher values increase the magnitude of the effect
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range: 1 100
     * */
    private int m_Strength  = 10;

    /** Strength
     *
     * Higher values increase the magnitude of the effect
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range: 1 100
     *
     * @param value new value for Strength
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Wind setStrength(int value) throws ParameterOutOfRangeException
    {
		if(value > 100 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 100);
	    }

        m_Strength = value;
        setProperty("strength", value);
        return this;
    }

    /** Strength
     *
     * Higher values increase the magnitude of the effect
     *
     * Unit: 
     * Default value: 10
     * Acceptable Range: 1 100
     *
     * @return value of Strength
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getStrength()
    {
        return m_Strength;
    }


    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Seed ;

    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
     */
    public Wind setSeed(int value)
    {
	
        m_Seed = value;
        setProperty("seed", value);
        return this;
    }

    /** Random seed
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Random seed
     * 
     */
    public int getSeed()
    {
        return m_Seed;
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

