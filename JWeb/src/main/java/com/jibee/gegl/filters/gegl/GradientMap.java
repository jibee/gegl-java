package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;

/**
 * Gradient Map
 *
 * Applies a color gradient.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color"})
public class GradientMap extends GeglFilter
{
    /** Constructs a Gradient Map.
     *
     * Applies a color gradient.
     */
    public GradientMap(GeglNode container)
    {
        super(container, "gegl:gradient-map");
    }
    /** Constructs a Gradient Map.
     *
     * Applies a color gradient.
     */
    public GradientMap(GeglFilter parent)
    {
        super(parent, "gegl:gradient-map");
    }

    
    /** Color 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color1  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Color 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public GradientMap setColor1(GeglColor value)
    {
	
        m_Color1 = value;
        setProperty("color1", value);
        return this;
    }

    /** Color 1
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor1()
    {
        return m_Color1;
    }


    /** Stop 1
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_Stop1  = 0.00;

    /** Stop 1
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public GradientMap setStop1(double value)
    {
	
        m_Stop1 = value;
        setProperty("stop1", value);
        return this;
    }

    /** Stop 1
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getStop1()
    {
        return m_Stop1;
    }


    /** Color 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color2  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** Color 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GradientMap setColor2(GeglColor value)
    {
	
        m_Color2 = value;
        setProperty("color2", value);
        return this;
    }

    /** Color 2
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor2()
    {
        return m_Color2;
    }


    /** Stop 2
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     * */
    private double m_Stop2  = 1.00;

    /** Stop 2
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public GradientMap setStop2(double value)
    {
	
        m_Stop2 = value;
        setProperty("stop2", value);
        return this;
    }

    /** Stop 2
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public double getStop2()
    {
        return m_Stop2;
    }


    /** Color 3
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color3  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** Color 3
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GradientMap setColor3(GeglColor value)
    {
	
        m_Color3 = value;
        setProperty("color3", value);
        return this;
    }

    /** Color 3
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor3()
    {
        return m_Color3;
    }


    /** Stop 3
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     * */
    private double m_Stop3  = 1.00;

    /** Stop 3
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public GradientMap setStop3(double value)
    {
	
        m_Stop3 = value;
        setProperty("stop3", value);
        return this;
    }

    /** Stop 3
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public double getStop3()
    {
        return m_Stop3;
    }


    /** Color 4
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color4  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** Color 4
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GradientMap setColor4(GeglColor value)
    {
	
        m_Color4 = value;
        setProperty("color4", value);
        return this;
    }

    /** Color 4
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor4()
    {
        return m_Color4;
    }


    /** Stop 4
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     * */
    private double m_Stop4  = 1.00;

    /** Stop 4
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public GradientMap setStop4(double value)
    {
	
        m_Stop4 = value;
        setProperty("stop4", value);
        return this;
    }

    /** Stop 4
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public double getStop4()
    {
        return m_Stop4;
    }


    /** Color 5
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color5  = makeColor("rgb(1.0000, 1.0000, 1.0000)");

    /** Color 5
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GradientMap setColor5(GeglColor value)
    {
	
        m_Color5 = value;
        setProperty("color5", value);
        return this;
    }

    /** Color 5
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgb(1.0000, 1.0000, 1.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor5()
    {
        return m_Color5;
    }


    /** Stop 5
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     * */
    private double m_Stop5  = 1.00;

    /** Stop 5
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public GradientMap setStop5(double value)
    {
	
        m_Stop5 = value;
        setProperty("stop5", value);
        return this;
    }

    /** Stop 5
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public double getStop5()
    {
        return m_Stop5;
    }


    /** sRGB
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Srgb  = false;

    /** sRGB
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public GradientMap setSrgb(boolean value)
    {
	
        m_Srgb = value;
        setProperty("srgb", value);
        return this;
    }

    /** sRGB
     *
     * 
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getSrgb()
    {
        return m_Srgb;
    }

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

