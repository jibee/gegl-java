package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Convolution Matrix
 *
 * Apply a generic 5x5 convolution matrix
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"generic"})
public class ConvolutionMatrix extends GeglFilter implements Source, Sink
{
    /** Constructs a Convolution Matrix.
     *
     * Apply a generic 5x5 convolution matrix
     */
    public ConvolutionMatrix(GeglNode container)
    {
        super(container, "gegl:convolution-matrix");
    }
    /** Constructs a Convolution Matrix.
     *
     * Apply a generic 5x5 convolution matrix
     */
    public ConvolutionMatrix(GeglFilter parent)
    {
        super(parent, "gegl:convolution-matrix");
    }

    
    /** (1,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_A1  = 0.00;

    /** (1,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setA1(double value)
    {
	
        m_A1 = value;
        setProperty("a1", value);
        return this;
    }

    /** (1,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getA1()
    {
        return m_A1;
    }


    /** (1,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_A2  = 0.00;

    /** (1,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setA2(double value)
    {
	
        m_A2 = value;
        setProperty("a2", value);
        return this;
    }

    /** (1,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getA2()
    {
        return m_A2;
    }


    /** (1,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_A3  = 0.00;

    /** (1,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setA3(double value)
    {
	
        m_A3 = value;
        setProperty("a3", value);
        return this;
    }

    /** (1,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getA3()
    {
        return m_A3;
    }


    /** (1,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_A4  = 0.00;

    /** (1,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setA4(double value)
    {
	
        m_A4 = value;
        setProperty("a4", value);
        return this;
    }

    /** (1,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getA4()
    {
        return m_A4;
    }


    /** (1,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_A5  = 0.00;

    /** (1,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setA5(double value)
    {
	
        m_A5 = value;
        setProperty("a5", value);
        return this;
    }

    /** (1,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getA5()
    {
        return m_A5;
    }


    /** (2,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_B1  = 0.00;

    /** (2,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setB1(double value)
    {
	
        m_B1 = value;
        setProperty("b1", value);
        return this;
    }

    /** (2,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getB1()
    {
        return m_B1;
    }


    /** (2,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_B2  = 0.00;

    /** (2,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setB2(double value)
    {
	
        m_B2 = value;
        setProperty("b2", value);
        return this;
    }

    /** (2,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getB2()
    {
        return m_B2;
    }


    /** (2,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_B3  = 0.00;

    /** (2,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setB3(double value)
    {
	
        m_B3 = value;
        setProperty("b3", value);
        return this;
    }

    /** (2,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getB3()
    {
        return m_B3;
    }


    /** (2,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_B4  = 0.00;

    /** (2,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setB4(double value)
    {
	
        m_B4 = value;
        setProperty("b4", value);
        return this;
    }

    /** (2,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getB4()
    {
        return m_B4;
    }


    /** (2,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_B5  = 0.00;

    /** (2,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setB5(double value)
    {
	
        m_B5 = value;
        setProperty("b5", value);
        return this;
    }

    /** (2,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getB5()
    {
        return m_B5;
    }


    /** (3,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_C1  = 0.00;

    /** (3,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setC1(double value)
    {
	
        m_C1 = value;
        setProperty("c1", value);
        return this;
    }

    /** (3,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getC1()
    {
        return m_C1;
    }


    /** (3,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_C2  = 0.00;

    /** (3,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setC2(double value)
    {
	
        m_C2 = value;
        setProperty("c2", value);
        return this;
    }

    /** (3,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getC2()
    {
        return m_C2;
    }


    /** (3,3)
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     * */
    private double m_C3  = 1.00;

    /** (3,3)
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setC3(double value)
    {
	
        m_C3 = value;
        setProperty("c3", value);
        return this;
    }

    /** (3,3)
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public double getC3()
    {
        return m_C3;
    }


    /** (3,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_C4  = 0.00;

    /** (3,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setC4(double value)
    {
	
        m_C4 = value;
        setProperty("c4", value);
        return this;
    }

    /** (3,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getC4()
    {
        return m_C4;
    }


    /** (3,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_C5  = 0.00;

    /** (3,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setC5(double value)
    {
	
        m_C5 = value;
        setProperty("c5", value);
        return this;
    }

    /** (3,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getC5()
    {
        return m_C5;
    }


    /** (4,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_D1  = 0.00;

    /** (4,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setD1(double value)
    {
	
        m_D1 = value;
        setProperty("d1", value);
        return this;
    }

    /** (4,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getD1()
    {
        return m_D1;
    }


    /** (4,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_D2  = 0.00;

    /** (4,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setD2(double value)
    {
	
        m_D2 = value;
        setProperty("d2", value);
        return this;
    }

    /** (4,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getD2()
    {
        return m_D2;
    }


    /** (4,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_D3  = 0.00;

    /** (4,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setD3(double value)
    {
	
        m_D3 = value;
        setProperty("d3", value);
        return this;
    }

    /** (4,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getD3()
    {
        return m_D3;
    }


    /** (4,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_D4  = 0.00;

    /** (4,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setD4(double value)
    {
	
        m_D4 = value;
        setProperty("d4", value);
        return this;
    }

    /** (4,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getD4()
    {
        return m_D4;
    }


    /** (4,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_D5  = 0.00;

    /** (4,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setD5(double value)
    {
	
        m_D5 = value;
        setProperty("d5", value);
        return this;
    }

    /** (4,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getD5()
    {
        return m_D5;
    }


    /** (5,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_E1  = 0.00;

    /** (5,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setE1(double value)
    {
	
        m_E1 = value;
        setProperty("e1", value);
        return this;
    }

    /** (5,1)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getE1()
    {
        return m_E1;
    }


    /** (5,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_E2  = 0.00;

    /** (5,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setE2(double value)
    {
	
        m_E2 = value;
        setProperty("e2", value);
        return this;
    }

    /** (5,2)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getE2()
    {
        return m_E2;
    }


    /** (5,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_E3  = 0.00;

    /** (5,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setE3(double value)
    {
	
        m_E3 = value;
        setProperty("e3", value);
        return this;
    }

    /** (5,3)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getE3()
    {
        return m_E3;
    }


    /** (5,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_E4  = 0.00;

    /** (5,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setE4(double value)
    {
	
        m_E4 = value;
        setProperty("e4", value);
        return this;
    }

    /** (5,4)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getE4()
    {
        return m_E4;
    }


    /** (5,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_E5  = 0.00;

    /** (5,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setE5(double value)
    {
	
        m_E5 = value;
        setProperty("e5", value);
        return this;
    }

    /** (5,5)
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getE5()
    {
        return m_E5;
    }


    /** Divisor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     * */
    private double m_Divisor  = 1.00;

    /** Divisor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public ConvolutionMatrix setDivisor(double value)
    {
	
        m_Divisor = value;
        setProperty("divisor", value);
        return this;
    }

    /** Divisor
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range:  
     */
    public double getDivisor()
    {
        return m_Divisor;
    }


    /** Offset
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_Offset  = 0.00;

    /** Offset
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public ConvolutionMatrix setOffset(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_Offset = value;
        setProperty("offset", value);
        return this;
    }

    /** Offset
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getOffset()
    {
        return m_Offset;
    }


    /** Red channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Red  = true;

    /** Red channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ConvolutionMatrix setRed(boolean value)
    {
	
        m_Red = value;
        setProperty("red", value);
        return this;
    }

    /** Red channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getRed()
    {
        return m_Red;
    }


    /** Green channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Green  = true;

    /** Green channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ConvolutionMatrix setGreen(boolean value)
    {
	
        m_Green = value;
        setProperty("green", value);
        return this;
    }

    /** Green channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getGreen()
    {
        return m_Green;
    }


    /** Blue channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Blue  = true;

    /** Blue channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ConvolutionMatrix setBlue(boolean value)
    {
	
        m_Blue = value;
        setProperty("blue", value);
        return this;
    }

    /** Blue channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getBlue()
    {
        return m_Blue;
    }


    /** Alpha channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Alpha  = true;

    /** Alpha channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ConvolutionMatrix setAlpha(boolean value)
    {
	
        m_Alpha = value;
        setProperty("alpha", value);
        return this;
    }

    /** Alpha channel
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getAlpha()
    {
        return m_Alpha;
    }


    /** Normalize
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Normalize  = true;

    /** Normalize
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ConvolutionMatrix setNormalize(boolean value)
    {
	
        m_Normalize = value;
        setProperty("normalize", value);
        return this;
    }

    /** Normalize
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getNormalize()
    {
        return m_Normalize;
    }


    /** Alpha-weighting
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_AlphaWeight  = true;

    /** Alpha-weighting
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public ConvolutionMatrix setAlphaWeight(boolean value)
    {
	
        m_AlphaWeight = value;
        setProperty("alpha-weight", value);
        return this;
    }

    /** Alpha-weighting
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getAlphaWeight()
    {
        return m_AlphaWeight;
    }


    /** Border
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Border ;

    /** Border
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public ConvolutionMatrix setBorder(String value)
    {
	
        m_Border = value;
        setProperty("border", value);
        return this;
    }

    /** Border
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getBorder()
    {
        return m_Border;
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

