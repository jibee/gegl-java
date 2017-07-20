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
 * Simple Linear Iterative Clustering
 *
 * Superpixels based on k-means clustering
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"color", "segmentation"})
public class Slic extends GeglFilter implements Source, Sink
{
    /** Constructs a Simple Linear Iterative Clustering.
     *
     * Superpixels based on k-means clustering
     */
    public Slic(GeglNode container)
    {
        super(container, "gegl:slic");
    }
    /** Constructs a Simple Linear Iterative Clustering.
     *
     * Superpixels based on k-means clustering
     */
    public Slic(GeglFilter parent)
    {
        super(parent, "gegl:slic");
    }

    
    /** Regions size
     *
     * Size of a region side
     *
     * Unit: 
     * Default value: 32
     * Acceptable Range: 2 
     * */
    private int m_ClusterSize  = 32;

    /** Regions size
     *
     * Size of a region side
     *
     * Unit: 
     * Default value: 32
     * Acceptable Range: 2 
     */
    public Slic setClusterSize(int value) throws ParameterOutOfRangeException
    {
		if(value < 2)
	{
	    throw new ParameterOutOfRangeException(value, 2, Double.POSITIVE_INFINITY);
	}

        m_ClusterSize = value;
        setProperty("cluster-size", value);
        return this;
    }

    /** Regions size
     *
     * Size of a region side
     *
     * Unit: 
     * Default value: 32
     * Acceptable Range: 2 
     */
    public int getClusterSize()
    {
        return m_ClusterSize;
    }


    /** Compactness
     *
     * Cluster size
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range: 1 40
     * */
    private int m_Compactness  = 20;

    /** Compactness
     *
     * Cluster size
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range: 1 40
     */
    public Slic setCompactness(int value) throws ParameterOutOfRangeException
    {
		if(value > 40 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 40);
	}

        m_Compactness = value;
        setProperty("compactness", value);
        return this;
    }

    /** Compactness
     *
     * Cluster size
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range: 1 40
     */
    public int getCompactness()
    {
        return m_Compactness;
    }


    /** Iterations
     *
     * Number of iterations
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 30
     * */
    private int m_Iterations  = 1;

    /** Iterations
     *
     * Number of iterations
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 30
     */
    public Slic setIterations(int value) throws ParameterOutOfRangeException
    {
		if(value > 30 || value < 1)
	{
	    throw new ParameterOutOfRangeException(value, 1, 30);
	}

        m_Iterations = value;
        setProperty("iterations", value);
        return this;
    }

    /** Iterations
     *
     * Number of iterations
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 30
     */
    public int getIterations()
    {
        return m_Iterations;
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

