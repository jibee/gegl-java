package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Symmetric Nearest Neighbour
 *
 * Noise reducing edge preserving blur filter based on Symmetric Nearest Neighbours
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=true, position_dependant=false, categories={"enhance", "noise-reduction"})
public class SnnMean extends GeglFilter implements Filter
{
    /** Constructs a Symmetric Nearest Neighbour.
     *
     * Noise reducing edge preserving blur filter based on Symmetric Nearest Neighbours
     *
     * @param container container node
     */
    public SnnMean(GeglNode container)
    {
        super(container, "gegl:snn-mean");
    }
    /** Constructs a Symmetric Nearest Neighbour.
     *
     * Noise reducing edge preserving blur filter based on Symmetric Nearest Neighbours
     *
     * @param parent parent filter node
     */
    public SnnMean(GeglFilter parent)
    {
        super(parent, "gegl:snn-mean");
    }

    
    /** Radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1)
     *
     * Unit: pixel-distance
     * Default value: 8
     * Acceptable Range:  100
     * */
    private int m_Radius  = 8;

    /** Radius
     *
     * Radius of square pixel region, (width and height will be radius*2+1)
     *
     * Unit: pixel-distance
     * Default value: 8
     * Acceptable Range:  100
     *
     * @param value new value for Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public SnnMean setRadius(int value) throws ParameterOutOfRangeException
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
     * Radius of square pixel region, (width and height will be radius*2+1)
     *
     * Unit: pixel-distance
     * Default value: 8
     * Acceptable Range:  100
     *
     * @return value of Radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getRadius()
    {
        return m_Radius;
    }


    /** Pairs
     *
     * Number of pairs; higher number preserves more acute features
     *
     * Unit: 
     * Default value: 2
     * Acceptable Range: 1 2
     * */
    private int m_Pairs  = 2;

    /** Pairs
     *
     * Number of pairs; higher number preserves more acute features
     *
     * Unit: 
     * Default value: 2
     * Acceptable Range: 1 2
     *
     * @param value new value for Pairs
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public SnnMean setPairs(int value) throws ParameterOutOfRangeException
    {
		if(value > 2 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 2);
	    }

        m_Pairs = value;
        setProperty("pairs", value);
        return this;
    }

    /** Pairs
     *
     * Number of pairs; higher number preserves more acute features
     *
     * Unit: 
     * Default value: 2
     * Acceptable Range: 1 2
     *
     * @return value of Pairs
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getPairs()
    {
        return m_Pairs;
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

