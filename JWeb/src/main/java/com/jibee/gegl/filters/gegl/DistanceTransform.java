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
 * Distance Transform
 *
 * Calculate a distance transform
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"map"})
public class DistanceTransform extends GeglFilter implements Source, Sink
{
    /** Constructs a Distance Transform.
     *
     * Calculate a distance transform
     */
    public DistanceTransform(GeglNode container)
    {
        super(container, "gegl:distance-transform");
    }
    /** Constructs a Distance Transform.
     *
     * Calculate a distance transform
     */
    public DistanceTransform(GeglFilter parent)
    {
        super(parent, "gegl:distance-transform");
    }

    
    /** Metric
     *
     * Metric to use for the distance calculation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Metric ;

    /** Metric
     *
     * Metric to use for the distance calculation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public DistanceTransform setMetric(String value)
    {
	
        m_Metric = value;
        setProperty("metric", value);
        return this;
    }

    /** Metric
     *
     * Metric to use for the distance calculation
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getMetric()
    {
        return m_Metric;
    }


    /** Threshold low
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_ThresholdLo  = 0.00;

    /** Threshold low
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public DistanceTransform setThresholdLo(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_ThresholdLo = value;
        setProperty("threshold-lo", value);
        return this;
    }

    /** Threshold low
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 1.00
     */
    public double getThresholdLo()
    {
        return m_ThresholdLo;
    }


    /** Threshold high
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_ThresholdHi  = 1.00;

    /** Threshold high
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     */
    public DistanceTransform setThresholdHi(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_ThresholdHi = value;
        setProperty("threshold-hi", value);
        return this;
    }

    /** Threshold high
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     */
    public double getThresholdHi()
    {
        return m_ThresholdHi;
    }


    /** Grayscale Averaging
     *
     * Number of computations for grayscale averaging
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  1000
     * */
    private int m_Averaging ;

    /** Grayscale Averaging
     *
     * Number of computations for grayscale averaging
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  1000
     */
    public DistanceTransform setAveraging(int value) throws ParameterOutOfRangeException
    {
		if(value > 1000)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 1000);
	}

        m_Averaging = value;
        setProperty("averaging", value);
        return this;
    }

    /** Grayscale Averaging
     *
     * Number of computations for grayscale averaging
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  1000
     */
    public int getAveraging()
    {
        return m_Averaging;
    }


    /** Normalize
     *
     * Normalize output to range 0.0 to 1.0.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Normalize  = true;

    /** Normalize
     *
     * Normalize output to range 0.0 to 1.0.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public DistanceTransform setNormalize(boolean value)
    {
	
        m_Normalize = value;
        setProperty("normalize", value);
        return this;
    }

    /** Normalize
     *
     * Normalize output to range 0.0 to 1.0.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getNormalize()
    {
        return m_Normalize;
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

