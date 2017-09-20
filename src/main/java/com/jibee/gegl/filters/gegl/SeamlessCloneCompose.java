package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * 
 *
 * Seamless cloning composite operation
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"compositors", "meta", "blend"})
public class SeamlessCloneCompose extends GeglFilter implements CombiningFilter
{
    /** Constructs a .
     *
     * Seamless cloning composite operation
     *
     * @param container container node
     */
    public SeamlessCloneCompose(GeglNode container)
    {
        super(container, "gegl:seamless-clone-compose");
    }
    /** Constructs a .
     *
     * Seamless cloning composite operation
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Refinement steps
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Refinement steps
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Offset X
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Offset X
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Offset Y
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @return value of Offset Y
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
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
     *
     * @param value new value for Error message
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Error message
     * 
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

