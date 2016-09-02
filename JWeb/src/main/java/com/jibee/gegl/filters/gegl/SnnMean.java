package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Symmetric Nearest Neighbour
 *
 * Noise reducing edge preserving blur filter based  on Symmetric Nearest Neighbours
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: false
 */
@Filter(license="", opencl=true, position_dependant=false, categories={"enhance", "noise-reduction"})
public class SnnMean extends GeglFilter
{
    /** Constructs a Symmetric Nearest Neighbour.
     *
     * Noise reducing edge preserving blur filter based  on Symmetric Nearest Neighbours
     */
    public SnnMean(GeglNode container)
    {
        super(container, "gegl:snn-mean");
    }
    /** Constructs a Symmetric Nearest Neighbour.
     *
     * Noise reducing edge preserving blur filter based  on Symmetric Nearest Neighbours
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
     */
    public int getPairs()
    {
        return m_Pairs;
    }

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

