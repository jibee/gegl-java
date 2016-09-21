package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.DualSink;
import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;

/**
 * 
 *
 * Seamless cloning composite operation
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors", "meta", "blend"})
public class SeamlessCloneCompose extends GeglFilter implements Source, DualSink
{
    /** Constructs a .
     *
     * Seamless cloning composite operation
     */
    public SeamlessCloneCompose(GeglNode container)
    {
        super(container, "gegl:seamless-clone-compose");
    }
    /** Constructs a .
     *
     * Seamless cloning composite operation
     */
    public SeamlessCloneCompose(GeglFilter parent)
    {
        super(parent, "gegl:seamless-clone-compose");
    }

    
    /** Refinement steps
     *
     * Maximal amount of refinement points to be used for the interpolation mesh
     *
     * Unit: 
     * Default value: 2000
     * Acceptable Range:  100000
     * */
    private int m_MaxRefineScale  = 2000;

    /** Refinement steps
     *
     * Maximal amount of refinement points to be used for the interpolation mesh
     *
     * Unit: 
     * Default value: 2000
     * Acceptable Range:  100000
     */
    public SeamlessCloneCompose setMaxRefineScale(int value) throws ParameterOutOfRangeException
    {
		if(value > 100000)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 100000);
	}

        m_MaxRefineScale = value;
        setProperty("max-refine-scale", value);
        return this;
    }

    /** Refinement steps
     *
     * Maximal amount of refinement points to be used for the interpolation mesh
     *
     * Unit: 
     * Default value: 2000
     * Acceptable Range:  100000
     */
    public int getMaxRefineScale()
    {
        return m_MaxRefineScale;
    }


    /** Offset X
     *
     * How much horizontal offset should applied to the paste
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  100000
     * */
    private int m_Xoff ;

    /** Offset X
     *
     * How much horizontal offset should applied to the paste
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  100000
     */
    public SeamlessCloneCompose setXoff(int value) throws ParameterOutOfRangeException
    {
		if(value > 100000)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 100000);
	}

        m_Xoff = value;
        setProperty("xoff", value);
        return this;
    }

    /** Offset X
     *
     * How much horizontal offset should applied to the paste
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  100000
     */
    public int getXoff()
    {
        return m_Xoff;
    }


    /** Offset Y
     *
     * How much vertical offset should applied to the paste
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  100000
     * */
    private int m_Yoff ;

    /** Offset Y
     *
     * How much vertical offset should applied to the paste
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  100000
     */
    public SeamlessCloneCompose setYoff(int value) throws ParameterOutOfRangeException
    {
		if(value > 100000)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 100000);
	}

        m_Yoff = value;
        setProperty("yoff", value);
        return this;
    }

    /** Offset Y
     *
     * How much vertical offset should applied to the paste
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  100000
     */
    public int getYoff()
    {
        return m_Yoff;
    }


    /** Error message
     *
     * An error message in case of a failure
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_ErrorMsg ;

    /** Error message
     *
     * An error message in case of a failure
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public SeamlessCloneCompose setErrorMsg(String value)
    {
	
        m_ErrorMsg = value;
        setProperty("error-msg", value);
        return this;
    }

    /** Error message
     *
     * An error message in case of a failure
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getErrorMsg()
    {
        return m_ErrorMsg;
    }

    @Override
    public InputPad Aux()
    {
        return new InputPad(this, "aux");
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

