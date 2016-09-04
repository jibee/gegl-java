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
 * Edge Detection
 *
 * Several simple methods for detecting edges
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"edge-detect"})
public class Edge extends GeglFilter implements Source, Sink
{
    /** Constructs a Edge Detection.
     *
     * Several simple methods for detecting edges
     */
    public Edge(GeglNode container)
    {
        super(container, "gegl:edge");
    }
    /** Constructs a Edge Detection.
     *
     * Several simple methods for detecting edges
     */
    public Edge(GeglFilter parent)
    {
        super(parent, "gegl:edge");
    }

    
    /** Algorithm
     *
     * Edge detection algorithm
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Algorithm ;

    /** Algorithm
     *
     * Edge detection algorithm
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Edge setAlgorithm(String value)
    {
	
        m_Algorithm = value;
        setProperty("algorithm", value);
        return this;
    }

    /** Algorithm
     *
     * Edge detection algorithm
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getAlgorithm()
    {
        return m_Algorithm;
    }


    /** Amount
     *
     * Edge detection amount
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 10.00
     * */
    private double m_Amount  = 2.00;

    /** Amount
     *
     * Edge detection amount
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 10.00
     */
    public Edge setAmount(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 10.00);
	}

        m_Amount = value;
        setProperty("amount", value);
        return this;
    }

    /** Amount
     *
     * Edge detection amount
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 10.00
     */
    public double getAmount()
    {
        return m_Amount;
    }


    /** Border behavior
     *
     * Edge detection behavior
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_BorderBehavior ;

    /** Border behavior
     *
     * Edge detection behavior
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Edge setBorderBehavior(String value)
    {
	
        m_BorderBehavior = value;
        setProperty("border-behavior", value);
        return this;
    }

    /** Border behavior
     *
     * Edge detection behavior
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getBorderBehavior()
    {
        return m_BorderBehavior;
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

