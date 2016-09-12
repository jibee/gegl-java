package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Color warp
 *
 * Warps the colors of an image between colors with weighted distortion factors.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class ColorWarp extends GeglFilter implements Source, Sink
{
    /** Constructs a Color warp.
     *
     * Warps the colors of an image between colors with weighted distortion factors.
     */
    public ColorWarp(GeglNode container)
    {
        super(container, "gegl:color-warp");
    }
    /** Constructs a Color warp.
     *
     * Warps the colors of an image between colors with weighted distortion factors.
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
     */
    public double getAmount()
    {
        return m_Amount;
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

