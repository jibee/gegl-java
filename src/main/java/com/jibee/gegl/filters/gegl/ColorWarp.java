package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Color warp
 *
 * Warps the colors of an image between colors with weighted distortion factors, color pairs which are black to black get ignored when constructing the mapping.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color"})
public class ColorWarp extends GeglFilter implements Filter
{
    /** Constructs a Color warp.
     *
     * Warps the colors of an image between colors with weighted distortion factors, color pairs which are black to black get ignored when constructing the mapping.
     *
     * @param container container node
     */
    public ColorWarp(GeglNode container)
    {
        super(container, "gegl:color-warp");
    }
    /** Constructs a Color warp.
     *
     * Warps the colors of an image between colors with weighted distortion factors, color pairs which are black to black get ignored when constructing the mapping.
     *
     * @param parent parent filter node
     */
    public ColorWarp(GeglFilter parent)
    {
        super(parent, "gegl:color-warp");
    }

    
    /** From 0
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_From0  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** From 0
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for From 0
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setFrom0(GeglColor value)
    {
	
        m_From0 = value;
        setProperty("from-0", value);
        return this;
    }

    /** From 0
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of From 0
     * 
     */
    public GeglColor getFrom0()
    {
        return m_From0;
    }


    /** To 0
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_To0  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** To 0
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for To 0
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setTo0(GeglColor value)
    {
	
        m_To0 = value;
        setProperty("to-0", value);
        return this;
    }

    /** To 0
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of To 0
     * 
     */
    public GeglColor getTo0()
    {
        return m_To0;
    }


    /** weight 0
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     * */
    private double m_Weight0  = 100.00;

    /** weight 0
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @param value new value for weight 0
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setWeight0(double value)
    {
	
        m_Weight0 = value;
        setProperty("weight-0", value);
        return this;
    }

    /** weight 0
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @return value of weight 0
     * 
     */
    public double getWeight0()
    {
        return m_Weight0;
    }


    /** From 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_From1  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** From 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for From 1
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setFrom1(GeglColor value)
    {
	
        m_From1 = value;
        setProperty("from-1", value);
        return this;
    }

    /** From 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of From 1
     * 
     */
    public GeglColor getFrom1()
    {
        return m_From1;
    }


    /** To 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_To1  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** To 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for To 1
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setTo1(GeglColor value)
    {
	
        m_To1 = value;
        setProperty("to-1", value);
        return this;
    }

    /** To 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of To 1
     * 
     */
    public GeglColor getTo1()
    {
        return m_To1;
    }


    /** weight 1
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     * */
    private double m_Weight1  = 100.00;

    /** weight 1
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @param value new value for weight 1
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setWeight1(double value)
    {
	
        m_Weight1 = value;
        setProperty("weight-1", value);
        return this;
    }

    /** weight 1
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @return value of weight 1
     * 
     */
    public double getWeight1()
    {
        return m_Weight1;
    }


    /** From 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_From2  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** From 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for From 2
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setFrom2(GeglColor value)
    {
	
        m_From2 = value;
        setProperty("from-2", value);
        return this;
    }

    /** From 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of From 2
     * 
     */
    public GeglColor getFrom2()
    {
        return m_From2;
    }


    /** To 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_To2  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** To 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for To 2
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setTo2(GeglColor value)
    {
	
        m_To2 = value;
        setProperty("to-2", value);
        return this;
    }

    /** To 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of To 2
     * 
     */
    public GeglColor getTo2()
    {
        return m_To2;
    }


    /** weight 2
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     * */
    private double m_Weight2  = 100.00;

    /** weight 2
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @param value new value for weight 2
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setWeight2(double value)
    {
	
        m_Weight2 = value;
        setProperty("weight-2", value);
        return this;
    }

    /** weight 2
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @return value of weight 2
     * 
     */
    public double getWeight2()
    {
        return m_Weight2;
    }


    /** From 3
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_From3  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** From 3
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for From 3
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setFrom3(GeglColor value)
    {
	
        m_From3 = value;
        setProperty("from-3", value);
        return this;
    }

    /** From 3
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of From 3
     * 
     */
    public GeglColor getFrom3()
    {
        return m_From3;
    }


    /** To 3
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_To3  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** To 3
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for To 3
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setTo3(GeglColor value)
    {
	
        m_To3 = value;
        setProperty("to-3", value);
        return this;
    }

    /** To 3
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of To 3
     * 
     */
    public GeglColor getTo3()
    {
        return m_To3;
    }


    /** weight 3
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     * */
    private double m_Weight3  = 100.00;

    /** weight 3
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @param value new value for weight 3
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setWeight3(double value)
    {
	
        m_Weight3 = value;
        setProperty("weight-3", value);
        return this;
    }

    /** weight 3
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @return value of weight 3
     * 
     */
    public double getWeight3()
    {
        return m_Weight3;
    }


    /** From 4
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_From4  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** From 4
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for From 4
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setFrom4(GeglColor value)
    {
	
        m_From4 = value;
        setProperty("from-4", value);
        return this;
    }

    /** From 4
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of From 4
     * 
     */
    public GeglColor getFrom4()
    {
        return m_From4;
    }


    /** To 4
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_To4  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** To 4
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for To 4
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setTo4(GeglColor value)
    {
	
        m_To4 = value;
        setProperty("to-4", value);
        return this;
    }

    /** To 4
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of To 4
     * 
     */
    public GeglColor getTo4()
    {
        return m_To4;
    }


    /** weight 4
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     * */
    private double m_Weight4  = 100.00;

    /** weight 4
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @param value new value for weight 4
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setWeight4(double value)
    {
	
        m_Weight4 = value;
        setProperty("weight-4", value);
        return this;
    }

    /** weight 4
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @return value of weight 4
     * 
     */
    public double getWeight4()
    {
        return m_Weight4;
    }


    /** From 5
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_From5  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** From 5
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for From 5
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setFrom5(GeglColor value)
    {
	
        m_From5 = value;
        setProperty("from-5", value);
        return this;
    }

    /** From 5
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of From 5
     * 
     */
    public GeglColor getFrom5()
    {
        return m_From5;
    }


    /** To 5
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_To5  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** To 5
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for To 5
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setTo5(GeglColor value)
    {
	
        m_To5 = value;
        setProperty("to-5", value);
        return this;
    }

    /** To 5
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of To 5
     * 
     */
    public GeglColor getTo5()
    {
        return m_To5;
    }


    /** weight 5
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     * */
    private double m_Weight5  = 100.00;

    /** weight 5
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @param value new value for weight 5
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setWeight5(double value)
    {
	
        m_Weight5 = value;
        setProperty("weight-5", value);
        return this;
    }

    /** weight 5
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @return value of weight 5
     * 
     */
    public double getWeight5()
    {
        return m_Weight5;
    }


    /** From 6
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_From6  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** From 6
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for From 6
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setFrom6(GeglColor value)
    {
	
        m_From6 = value;
        setProperty("from-6", value);
        return this;
    }

    /** From 6
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of From 6
     * 
     */
    public GeglColor getFrom6()
    {
        return m_From6;
    }


    /** To 6
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_To6  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** To 6
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for To 6
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setTo6(GeglColor value)
    {
	
        m_To6 = value;
        setProperty("to-6", value);
        return this;
    }

    /** To 6
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of To 6
     * 
     */
    public GeglColor getTo6()
    {
        return m_To6;
    }


    /** weight 6
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     * */
    private double m_Weight6  = 100.00;

    /** weight 6
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @param value new value for weight 6
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setWeight6(double value)
    {
	
        m_Weight6 = value;
        setProperty("weight-6", value);
        return this;
    }

    /** weight 6
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @return value of weight 6
     * 
     */
    public double getWeight6()
    {
        return m_Weight6;
    }


    /** From 7
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_From7  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** From 7
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for From 7
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setFrom7(GeglColor value)
    {
	
        m_From7 = value;
        setProperty("from-7", value);
        return this;
    }

    /** From 7
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of From 7
     * 
     */
    public GeglColor getFrom7()
    {
        return m_From7;
    }


    /** To 7
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_To7  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** To 7
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for To 7
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setTo7(GeglColor value)
    {
	
        m_To7 = value;
        setProperty("to-7", value);
        return this;
    }

    /** To 7
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of To 7
     * 
     */
    public GeglColor getTo7()
    {
        return m_To7;
    }


    /** weight 7
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     * */
    private double m_Weight7  = 100.00;

    /** weight 7
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @param value new value for weight 7
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setWeight7(double value)
    {
	
        m_Weight7 = value;
        setProperty("weight-7", value);
        return this;
    }

    /** weight 7
     *
     * 
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range:  
     *
     * @return value of weight 7
     * 
     */
    public double getWeight7()
    {
        return m_Weight7;
    }


    /** global weight scale
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     * */
    private double m_Weight  = 1.00;

    /** global weight scale
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     *
     * @param value new value for global weight scale
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setWeight(double value)
    {
	
        m_Weight = value;
        setProperty("weight", value);
        return this;
    }

    /** global weight scale
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     *
     * @return value of global weight scale
     * 
     */
    public double getWeight()
    {
        return m_Weight;
    }


    /** amount
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     * */
    private double m_Amount  = 1.00;

    /** amount
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     *
     * @param value new value for amount
     * @return this filter (for chaining operations)
     * 
     */
    public ColorWarp setAmount(double value)
    {
	
        m_Amount = value;
        setProperty("amount", value);
        return this;
    }

    /** amount
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     *
     * @return value of amount
     * 
     */
    public double getAmount()
    {
        return m_Amount;
    }

    @Override
    public InputPad<ColorWarp> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ColorWarp> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

