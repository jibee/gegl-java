package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Simple Linear Iterative Clustering
 *
 * Superpixels based on k-means clustering
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"color", "segmentation"})
public class Slic extends GeglFilter implements Filter
{
    /** Constructs a Simple Linear Iterative Clustering.
     *
     * Superpixels based on k-means clustering
     *
     * @param container container node
     */
    public Slic(GeglNode container)
    {
        super(container, "gegl:slic");
    }
    /** Constructs a Simple Linear Iterative Clustering.
     *
     * Superpixels based on k-means clustering
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Regions size
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Regions size
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Compactness
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Compactness
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Iterations
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Iterations
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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

