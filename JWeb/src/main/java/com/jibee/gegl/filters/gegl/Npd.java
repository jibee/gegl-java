package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.sun.jna.Pointer;

/**
 * 
 *
 * Performs n-point image deformation
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"transform"})
public class Npd extends GeglFilter
{
    /** Constructs a .
     *
     * Performs n-point image deformation
     */
    public Npd(GeglNode container)
    {
        super(container, "gegl:npd");
    }
    /** Constructs a .
     *
     * Performs n-point image deformation
     */
    public Npd(GeglFilter parent)
    {
        super(parent, "gegl:npd");
    }

    
    /** Model
     *
     * Model - basic element we operate on
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private Pointer m_Model ;

    /** Model
     *
     * Model - basic element we operate on
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Npd setModel(Pointer value)
    {
	
        m_Model = value;
        setProperty("model", value);
        return this;
    }

    /** Model
     *
     * Model - basic element we operate on
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Pointer getModel()
    {
        return m_Model;
    }


    /** Square Size
     *
     * Size of an edge of square the mesh consists of
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range: 5 1000
     * */
    private int m_SquareSize  = 20;

    /** Square Size
     *
     * Size of an edge of square the mesh consists of
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range: 5 1000
     */
    public Npd setSquareSize(int value) throws ParameterOutOfRangeException
    {
		if(value > 1000 || value < 5)
	{
	    throw new ParameterOutOfRangeException(value, 5, 1000);
	}

        m_SquareSize = value;
        setProperty("square-size", value);
        return this;
    }

    /** Square Size
     *
     * Size of an edge of square the mesh consists of
     *
     * Unit: 
     * Default value: 20
     * Acceptable Range: 5 1000
     */
    public int getSquareSize()
    {
        return m_SquareSize;
    }


    /** Rigidity
     *
     * The number of deformation iterations
     *
     * Unit: 
     * Default value: 100
     * Acceptable Range:  10000
     * */
    private int m_Rigidity  = 100;

    /** Rigidity
     *
     * The number of deformation iterations
     *
     * Unit: 
     * Default value: 100
     * Acceptable Range:  10000
     */
    public Npd setRigidity(int value) throws ParameterOutOfRangeException
    {
		if(value > 10000)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 10000);
	}

        m_Rigidity = value;
        setProperty("rigidity", value);
        return this;
    }

    /** Rigidity
     *
     * The number of deformation iterations
     *
     * Unit: 
     * Default value: 100
     * Acceptable Range:  10000
     */
    public int getRigidity()
    {
        return m_Rigidity;
    }


    /** ASAP Deformation
     *
     * ASAP deformation is performed when TRUE, ARAP deformation otherwise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_AsapDeformation  = false;

    /** ASAP Deformation
     *
     * ASAP deformation is performed when TRUE, ARAP deformation otherwise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public Npd setAsapDeformation(boolean value)
    {
	
        m_AsapDeformation = value;
        setProperty("asap-deformation", value);
        return this;
    }

    /** ASAP Deformation
     *
     * ASAP deformation is performed when TRUE, ARAP deformation otherwise
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getAsapDeformation()
    {
        return m_AsapDeformation;
    }


    /** MLS Weights
     *
     * Use MLS weights
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_MlsWeights  = false;

    /** MLS Weights
     *
     * Use MLS weights
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public Npd setMlsWeights(boolean value)
    {
	
        m_MlsWeights = value;
        setProperty("mls-weights", value);
        return this;
    }

    /** MLS Weights
     *
     * Use MLS weights
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getMlsWeights()
    {
        return m_MlsWeights;
    }


    /** MLS Weights Alpha
     *
     * Alpha parameter of MLS weights
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.10 2.00
     * */
    private double m_MlsWeightsAlpha  = 1.00;

    /** MLS Weights Alpha
     *
     * Alpha parameter of MLS weights
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.10 2.00
     */
    public Npd setMlsWeightsAlpha(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.10)
	{
	    throw new ParameterOutOfRangeException(value, 0.10, 2.00);
	}

        m_MlsWeightsAlpha = value;
        setProperty("mls-weights-alpha", value);
        return this;
    }

    /** MLS Weights Alpha
     *
     * Alpha parameter of MLS weights
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.10 2.00
     */
    public double getMlsWeightsAlpha()
    {
        return m_MlsWeightsAlpha;
    }


    /** Preserve Model
     *
     * When TRUE the model will not be freed
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_PreserveModel  = false;

    /** Preserve Model
     *
     * When TRUE the model will not be freed
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public Npd setPreserveModel(boolean value)
    {
	
        m_PreserveModel = value;
        setProperty("preserve-model", value);
        return this;
    }

    /** Preserve Model
     *
     * When TRUE the model will not be freed
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     */
    public boolean getPreserveModel()
    {
        return m_PreserveModel;
    }


    /** Sampler
     *
     * Sampler used internally
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_SamplerType ;

    /** Sampler
     *
     * Sampler used internally
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Npd setSamplerType(String value)
    {
	
        m_SamplerType = value;
        setProperty("sampler-type", value);
        return this;
    }

    /** Sampler
     *
     * Sampler used internally
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getSamplerType()
    {
        return m_SamplerType;
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

