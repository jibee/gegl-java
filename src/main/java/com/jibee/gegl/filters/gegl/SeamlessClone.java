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
 * Seamless cloning operation
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="GPL3+", opencl=false, position_dependant=false, categories={"blend"})
public class SeamlessClone extends GeglFilter implements Source, DualSink
{
    /** Constructs a .
     *
     * Seamless cloning operation
     *
     * @param container container node
     */
    public SeamlessClone(GeglNode container)
    {
        super(container, "gegl:seamless-clone");
    }
    /** Constructs a .
     *
     * Seamless cloning operation
     *
     * @param parent parent filter node
     */
    public SeamlessClone(GeglFilter parent)
    {
        super(parent, "gegl:seamless-clone");
    }

    
    /** Refinement scale
     *
     * Maximal scale of refinement points to be used for the interpolation mesh
     *
     * Unit: 
     * Default value: 5
     * Acceptable Range:  100000
     * */
    private int m_MaxRefineScale  = 5;

    /** Refinement scale
     *
     * Maximal scale of refinement points to be used for the interpolation mesh
     *
     * Unit: 
     * Default value: 5
     * Acceptable Range:  100000
     *
     * @param value new value for Refinement scale
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public SeamlessClone setMaxRefineScale(int value) throws ParameterOutOfRangeException
    {
		if(value > 100000)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 100000);
	    }

        m_MaxRefineScale = value;
        setProperty("max-refine-scale", value);
        return this;
    }

    /** Refinement scale
     *
     * Maximal scale of refinement points to be used for the interpolation mesh
     *
     * Unit: 
     * Default value: 5
     * Acceptable Range:  100000
     *
     * @return value of Refinement scale
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
     * Acceptable Range: -100000 100000
     * */
    private int m_Xoff ;

    /** Offset X
     *
     * How much horizontal offset should applied to the paste
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range: -100000 100000
     *
     * @param value new value for Offset X
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public SeamlessClone setXoff(int value) throws ParameterOutOfRangeException
    {
		if(value > 100000 || value < -100000)
	    {
	        throw new ParameterOutOfRangeException(value, -100000, 100000);
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
     * Acceptable Range: -100000 100000
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
     * How much horizontal offset should applied to the paste
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range: -100000 100000
     * */
    private int m_Yoff ;

    /** Offset Y
     *
     * How much horizontal offset should applied to the paste
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range: -100000 100000
     *
     * @param value new value for Offset Y
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public SeamlessClone setYoff(int value) throws ParameterOutOfRangeException
    {
		if(value > 100000 || value < -100000)
	    {
	        throw new ParameterOutOfRangeException(value, -100000, 100000);
	    }

        m_Yoff = value;
        setProperty("yoff", value);
        return this;
    }

    /** Offset Y
     *
     * How much horizontal offset should applied to the paste
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range: -100000 100000
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
    public SeamlessClone setErrorMsg(String value)
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

