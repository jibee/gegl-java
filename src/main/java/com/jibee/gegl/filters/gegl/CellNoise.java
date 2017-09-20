package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Cell Noise
 *
 * Generates a cellular texture.
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=true, position_dependant=true, categories={"render"})
public class CellNoise extends GeglFilter implements Source
{
    /** Constructs a Cell Noise.
     *
     * Generates a cellular texture.
     *
     * @param container container node
     */
    public CellNoise(GeglNode container)
    {
        super(container, "gegl:cell-noise");
    }
    /** Constructs a Cell Noise.
     *
     * Generates a cellular texture.
     *
     * @param parent parent filter node
     */
    public CellNoise(GeglFilter parent)
    {
        super(parent, "gegl:cell-noise");
    }

    
    /** Scale
     *
     * The scale of the noise function
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     * */
    private double m_Scale  = 1.00;

    /** Scale
     *
     * The scale of the noise function
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     *
     * @param value new value for Scale
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public CellNoise setScale(double value) throws ParameterOutOfRangeException
    {
		if(value > 20.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 20.00);
	    }

        m_Scale = value;
        setProperty("scale", value);
        return this;
    }

    /** Scale
     *
     * The scale of the noise function
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 20.00
     *
     * @return value of Scale
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getScale()
    {
        return m_Scale;
    }


    /** Shape
     *
     * Interpolate between Manhattan and Euclidean distance.
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 2.00
     * */
    private double m_Shape  = 2.00;

    /** Shape
     *
     * Interpolate between Manhattan and Euclidean distance.
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 2.00
     *
     * @param value new value for Shape
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public CellNoise setShape(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 1.00)
	    {
	        throw new ParameterOutOfRangeException(value, 1.00, 2.00);
	    }

        m_Shape = value;
        setProperty("shape", value);
        return this;
    }

    /** Shape
     *
     * Interpolate between Manhattan and Euclidean distance.
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 2.00
     *
     * @return value of Shape
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getShape()
    {
        return m_Shape;
    }


    /** Rank
     *
     * Select the n-th closest point
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 3
     * */
    private int m_Rank  = 1;

    /** Rank
     *
     * Select the n-th closest point
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 3
     *
     * @param value new value for Rank
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public CellNoise setRank(int value) throws ParameterOutOfRangeException
    {
		if(value > 3 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 3);
	    }

        m_Rank = value;
        setProperty("rank", value);
        return this;
    }

    /** Rank
     *
     * Select the n-th closest point
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 3
     *
     * @return value of Rank
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getRank()
    {
        return m_Rank;
    }


    /** Iterations
     *
     * The number of noise octaves.
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 20
     * */
    private int m_Iterations  = 1;

    /** Iterations
     *
     * The number of noise octaves.
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 20
     *
     * @param value new value for Iterations
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public CellNoise setIterations(int value) throws ParameterOutOfRangeException
    {
		if(value > 20 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 20);
	    }

        m_Iterations = value;
        setProperty("iterations", value);
        return this;
    }

    /** Iterations
     *
     * The number of noise octaves.
     *
     * Unit: 
     * Default value: 1
     * Acceptable Range: 1 20
     *
     * @return value of Iterations
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getIterations()
    {
        return m_Iterations;
    }


    /** Palettize
     *
     * Fill each cell with a random color
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Palettize  = false;

    /** Palettize
     *
     * Fill each cell with a random color
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Palettize
     * @return this filter (for chaining operations)
     * 
     */
    public CellNoise setPalettize(boolean value)
    {
	
        m_Palettize = value;
        setProperty("palettize", value);
        return this;
    }

    /** Palettize
     *
     * Fill each cell with a random color
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Palettize
     * 
     */
    public boolean getPalettize()
    {
        return m_Palettize;
    }


    /** Random seed
     *
     * The random seed for the noise function
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Seed ;

    /** Random seed
     *
     * The random seed for the noise function
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
     */
    public CellNoise setSeed(int value)
    {
	
        m_Seed = value;
        setProperty("seed", value);
        return this;
    }

    /** Random seed
     *
     * The random seed for the noise function
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Random seed
     * 
     */
    public int getSeed()
    {
        return m_Seed;
    }

    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

