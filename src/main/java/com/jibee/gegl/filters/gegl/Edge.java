package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Edge Detection
 *
 * Several simple methods for detecting edges
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"edge-detect"})
public class Edge extends GeglFilter implements Filter
{
    /** Constructs a Edge Detection.
     *
     * Several simple methods for detecting edges
     *
     * @param container container node
     */
    public Edge(GeglNode container)
    {
        super(container, "gegl:edge");
    }
    /** Constructs a Edge Detection.
     *
     * Several simple methods for detecting edges
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Algorithm
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Algorithm
     * 
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
     *
     * @param value new value for Amount
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Amount
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Border behavior
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Border behavior
     * 
     */
    public String getBorderBehavior()
    {
        return m_BorderBehavior;
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

