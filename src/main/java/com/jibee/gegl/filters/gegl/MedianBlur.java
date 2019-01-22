package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Median Blur
 *
 * Blur resulting from computing the median color in the neighborhood of each pixel.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"blur"})
public class MedianBlur extends GeglFilter implements Filter
{
    /** Constructs a Median Blur.
     *
     * Blur resulting from computing the median color in the neighborhood of each pixel.
     *
     * @param container container node
     */
    public MedianBlur(GeglNode container)
    {
        super(container, "gegl:median-blur");
    }
    /** Constructs a Median Blur.
     *
     * Blur resulting from computing the median color in the neighborhood of each pixel.
     *
     * @param parent parent filter node
     */
    public MedianBlur(GeglFilter parent)
    {
        super(parent, "gegl:median-blur");
    }

    
    /** Neighborhood
     *
     * Neighborhood type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Neighborhood ;

    /** Neighborhood
     *
     * Neighborhood type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Neighborhood
     * @return this filter (for chaining operations)
     * 
     */
    public MedianBlur setNeighborhood(String value)
    {
	
        m_Neighborhood = value;
        setProperty("neighborhood", value);
        return this;
    }

    /** Neighborhood
     *
     * Neighborhood type
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Neighborhood
     * 
     */
    public String getNeighborhood()
    {
        return m_Neighborhood;
    }


    /** Radius
     *
     * Neighborhood radius
     *
     * Unit: pixel-distance
     * Default value: 3
     * Acceptable Range:  100
     * */
    private int m_Radius  = 3;

    /** Radius
     *
     * Neighborhood radius
     *
     * Unit: pixel-distance
     * Default value: 3
     * Acceptable Range:  100
     *
     * @param value new value for Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public MedianBlur setRadius(int value) throws ParameterOutOfRangeException
    {
		if(value > 100)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 100);
	    }

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * Neighborhood radius
     *
     * Unit: pixel-distance
     * Default value: 3
     * Acceptable Range:  100
     *
     * @return value of Radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getRadius()
    {
        return m_Radius;
    }


    /** Percentile
     *
     * Neighborhood color percentile
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_Percentile  = 50.00;

    /** Percentile
     *
     * Neighborhood color percentile
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Percentile
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public MedianBlur setPercentile(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_Percentile = value;
        setProperty("percentile", value);
        return this;
    }

    /** Percentile
     *
     * Neighborhood color percentile
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Percentile
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getPercentile()
    {
        return m_Percentile;
    }


    /** Alpha percentile
     *
     * Neighborhood alpha percentile
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_AlphaPercentile  = 50.00;

    /** Alpha percentile
     *
     * Neighborhood alpha percentile
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Alpha percentile
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public MedianBlur setAlphaPercentile(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_AlphaPercentile = value;
        setProperty("alpha-percentile", value);
        return this;
    }

    /** Alpha percentile
     *
     * Neighborhood alpha percentile
     *
     * Unit: 
     * Default value: 50.00
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Alpha percentile
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getAlphaPercentile()
    {
        return m_AlphaPercentile;
    }


    /** Abyss policy
     *
     * How image edges are handled
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_AbyssPolicy ;

    /** Abyss policy
     *
     * How image edges are handled
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Abyss policy
     * @return this filter (for chaining operations)
     * 
     */
    public MedianBlur setAbyssPolicy(String value)
    {
	
        m_AbyssPolicy = value;
        setProperty("abyss-policy", value);
        return this;
    }

    /** Abyss policy
     *
     * How image edges are handled
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Abyss policy
     * 
     */
    public String getAbyssPolicy()
    {
        return m_AbyssPolicy;
    }


    /** High precision
     *
     * Avoid clipping and quantization (slower)
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_HighPrecision  = false;

    /** High precision
     *
     * Avoid clipping and quantization (slower)
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for High precision
     * @return this filter (for chaining operations)
     * 
     */
    public MedianBlur setHighPrecision(boolean value)
    {
	
        m_HighPrecision = value;
        setProperty("high-precision", value);
        return this;
    }

    /** High precision
     *
     * Avoid clipping and quantization (slower)
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of High precision
     * 
     */
    public boolean getHighPrecision()
    {
        return m_HighPrecision;
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

