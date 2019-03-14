package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Waterpixels
 *
 * Superpixels based on the watershed transformation
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"segmentation"})
public class Waterpixels extends GeglFilter implements Filter
{
    /** Constructs a Waterpixels.
     *
     * Superpixels based on the watershed transformation
     *
     * @param container container node
     */
    public Waterpixels(GeglNode container)
    {
        super(container, "gegl:waterpixels");
    }
    /** Constructs a Waterpixels.
     *
     * Superpixels based on the watershed transformation
     *
     * @param parent parent filter node
     */
    public Waterpixels(GeglFilter parent)
    {
        super(parent, "gegl:waterpixels");
    }

    
    /** Superpixels size
     *
     * 
     *
     * Unit: 
     * Default value: 32
     * Acceptable Range: 8 
     * */
    private int m_Size  = 32;

    /** Superpixels size
     *
     * 
     *
     * Unit: 
     * Default value: 32
     * Acceptable Range: 8 
     *
     * @param value new value for Superpixels size
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Waterpixels setSize(int value) throws ParameterOutOfRangeException
    {
		if(value < 8)
	    {
	        throw new ParameterOutOfRangeException(value, 8, Double.POSITIVE_INFINITY);
	    }

        m_Size = value;
        setProperty("size", value);
        return this;
    }

    /** Superpixels size
     *
     * 
     *
     * Unit: 
     * Default value: 32
     * Acceptable Range: 8 
     *
     * @return value of Superpixels size
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getSize()
    {
        return m_Size;
    }


    /** Gradient smoothness
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1000.00
     * */
    private double m_Smoothness  = 1.00;

    /** Gradient smoothness
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1000.00
     *
     * @param value new value for Gradient smoothness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Waterpixels setSmoothness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1000.00);
	    }

        m_Smoothness = value;
        setProperty("smoothness", value);
        return this;
    }

    /** Gradient smoothness
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1000.00
     *
     * @return value of Gradient smoothness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getSmoothness()
    {
        return m_Smoothness;
    }


    /** Spatial regularization
     *
     * trade-off between superpixel regularity and adherence to object boundaries
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  50
     * */
    private int m_Regularization ;

    /** Spatial regularization
     *
     * trade-off between superpixel regularity and adherence to object boundaries
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  50
     *
     * @param value new value for Spatial regularization
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Waterpixels setRegularization(int value) throws ParameterOutOfRangeException
    {
		if(value > 50)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 50);
	    }

        m_Regularization = value;
        setProperty("regularization", value);
        return this;
    }

    /** Spatial regularization
     *
     * trade-off between superpixel regularity and adherence to object boundaries
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  50
     *
     * @return value of Spatial regularization
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getRegularization()
    {
        return m_Regularization;
    }


    /** Superpixels color
     *
     * How to fill superpixels
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Fill ;

    /** Superpixels color
     *
     * How to fill superpixels
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Superpixels color
     * @return this filter (for chaining operations)
     * 
     */
    public Waterpixels setFill(String value)
    {
	
        m_Fill = value;
        setProperty("fill", value);
        return this;
    }

    /** Superpixels color
     *
     * How to fill superpixels
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Superpixels color
     * 
     */
    public String getFill()
    {
        return m_Fill;
    }

    @Override
    public InputPad<Waterpixels> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Waterpixels> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

