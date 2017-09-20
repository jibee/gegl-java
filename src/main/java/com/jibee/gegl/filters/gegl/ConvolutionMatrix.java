package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Convolution Matrix
 *
 * Apply a generic 5x5 convolution matrix
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"generic"})
public class ConvolutionMatrix extends GeglFilter implements Filter
{
    /** Constructs a Convolution Matrix.
     *
     * Apply a generic 5x5 convolution matrix
     *
     * @param container container node
     */
    public ConvolutionMatrix(GeglNode container)
    {
        super(container, "gegl:convolution-matrix");
    }
    /** Constructs a Convolution Matrix.
     *
     * Apply a generic 5x5 convolution matrix
     *
     * @param parent parent filter node
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
     *
     * @param value new value for (1,1)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (1,1)
     * 
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
     *
     * @param value new value for (1,2)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (1,2)
     * 
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
     *
     * @param value new value for (1,3)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (1,3)
     * 
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
     *
     * @param value new value for (1,4)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (1,4)
     * 
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
     *
     * @param value new value for (1,5)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (1,5)
     * 
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
     *
     * @param value new value for (2,1)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (2,1)
     * 
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
     *
     * @param value new value for (2,2)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (2,2)
     * 
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
     *
     * @param value new value for (2,3)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (2,3)
     * 
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
     *
     * @param value new value for (2,4)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (2,4)
     * 
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
     *
     * @param value new value for (2,5)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (2,5)
     * 
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
     *
     * @param value new value for (3,1)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (3,1)
     * 
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
     *
     * @param value new value for (3,2)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (3,2)
     * 
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
     *
     * @param value new value for (3,3)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (3,3)
     * 
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
     *
     * @param value new value for (3,4)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (3,4)
     * 
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
     *
     * @param value new value for (3,5)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (3,5)
     * 
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
     *
     * @param value new value for (4,1)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (4,1)
     * 
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
     *
     * @param value new value for (4,2)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (4,2)
     * 
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
     *
     * @param value new value for (4,3)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (4,3)
     * 
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
     *
     * @param value new value for (4,4)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (4,4)
     * 
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
     *
     * @param value new value for (4,5)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (4,5)
     * 
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
     *
     * @param value new value for (5,1)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (5,1)
     * 
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
     *
     * @param value new value for (5,2)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (5,2)
     * 
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
     *
     * @param value new value for (5,3)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (5,3)
     * 
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
     *
     * @param value new value for (5,4)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (5,4)
     * 
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
     *
     * @param value new value for (5,5)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of (5,5)
     * 
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
     *
     * @param value new value for Divisor
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Divisor
     * 
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
     *
     * @param value new value for Offset
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Offset
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Red channel
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Red channel
     * 
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
     *
     * @param value new value for Green channel
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Green channel
     * 
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
     *
     * @param value new value for Blue channel
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Blue channel
     * 
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
     *
     * @param value new value for Alpha channel
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Alpha channel
     * 
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
     *
     * @param value new value for Normalize
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Normalize
     * 
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
     *
     * @param value new value for Alpha-weighting
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Alpha-weighting
     * 
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
     *
     * @param value new value for Border
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Border
     * 
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

