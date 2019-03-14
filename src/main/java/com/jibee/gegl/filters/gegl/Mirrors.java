package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Kaleidoscopic Mirroring
 *
 * Create a kaleidoscope like effect.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"blur"})
public class Mirrors extends GeglFilter implements Filter
{
    /** Constructs a Kaleidoscopic Mirroring.
     *
     * Create a kaleidoscope like effect.
     *
     * @param container container node
     */
    public Mirrors(GeglNode container)
    {
        super(container, "gegl:mirrors");
    }
    /** Constructs a Kaleidoscopic Mirroring.
     *
     * Create a kaleidoscope like effect.
     *
     * @param parent parent filter node
     */
    public Mirrors(GeglFilter parent)
    {
        super(parent, "gegl:mirrors");
    }

    
    /** Mirror rotation
     *
     * Rotation applied to the mirrors
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 180.00
     * */
    private double m_MAngle  = 0.00;

    /** Mirror rotation
     *
     * Rotation applied to the mirrors
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 180.00
     *
     * @param value new value for Mirror rotation
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setMAngle(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 180.00);
	    }

        m_MAngle = value;
        setProperty("m-angle", value);
        return this;
    }

    /** Mirror rotation
     *
     * Rotation applied to the mirrors
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 180.00
     *
     * @return value of Mirror rotation
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getMAngle()
    {
        return m_MAngle;
    }


    /** Result rotation
     *
     * Rotation applied to the result
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_RAngle  = 0.00;

    /** Result rotation
     *
     * Rotation applied to the result
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @param value new value for Result rotation
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setRAngle(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	    }

        m_RAngle = value;
        setProperty("r-angle", value);
        return this;
    }

    /** Result rotation
     *
     * Rotation applied to the result
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     *
     * @return value of Result rotation
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getRAngle()
    {
        return m_RAngle;
    }


    /** Mirrors
     *
     * Number of mirrors to use
     *
     * Unit: 
     * Default value: 6
     * Acceptable Range: 2 24
     * */
    private int m_NSegs  = 6;

    /** Mirrors
     *
     * Number of mirrors to use
     *
     * Unit: 
     * Default value: 6
     * Acceptable Range: 2 24
     *
     * @param value new value for Mirrors
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setNSegs(int value) throws ParameterOutOfRangeException
    {
		if(value > 24 || value < 2)
	    {
	        throw new ParameterOutOfRangeException(value, 2, 24);
	    }

        m_NSegs = value;
        setProperty("n-segs", value);
        return this;
    }

    /** Mirrors
     *
     * Number of mirrors to use
     *
     * Unit: 
     * Default value: 6
     * Acceptable Range: 2 24
     *
     * @return value of Mirrors
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getNSegs()
    {
        return m_NSegs;
    }


    /** Offset X
     *
     * position of symmetry center in output
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     * */
    private double m_CX  = 0.50;

    /** Offset X
     *
     * position of symmetry center in output
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Offset X
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setCX(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_CX = value;
        setProperty("c-x", value);
        return this;
    }

    /** Offset X
     *
     * position of symmetry center in output
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Offset X
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCX()
    {
        return m_CX;
    }


    /** Offset Y
     *
     * position of symmetry center in output
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     * */
    private double m_CY  = 0.50;

    /** Offset Y
     *
     * position of symmetry center in output
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     *
     * @param value new value for Offset Y
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setCY(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	    }

        m_CY = value;
        setProperty("c-y", value);
        return this;
    }

    /** Offset Y
     *
     * position of symmetry center in output
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range: 0.00 1.00
     *
     * @return value of Offset Y
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getCY()
    {
        return m_CY;
    }


    /** Center X
     *
     * X axis ratio for the center of mirroring
     *
     * Unit: relative-coordinate
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_OX  = 0.00;

    /** Center X
     *
     * X axis ratio for the center of mirroring
     *
     * Unit: relative-coordinate
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     *
     * @param value new value for Center X
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setOX(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	    {
	        throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	    }

        m_OX = value;
        setProperty("o-x", value);
        return this;
    }

    /** Center X
     *
     * X axis ratio for the center of mirroring
     *
     * Unit: relative-coordinate
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     *
     * @return value of Center X
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getOX()
    {
        return m_OX;
    }


    /** Center Y
     *
     * Y axis ratio for the center of mirroring
     *
     * Unit: relative-coordinate
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_OY  = 0.00;

    /** Center Y
     *
     * Y axis ratio for the center of mirroring
     *
     * Unit: relative-coordinate
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     *
     * @param value new value for Center Y
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setOY(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	    {
	        throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	    }

        m_OY = value;
        setProperty("o-y", value);
        return this;
    }

    /** Center Y
     *
     * Y axis ratio for the center of mirroring
     *
     * Unit: relative-coordinate
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     *
     * @return value of Center Y
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getOY()
    {
        return m_OY;
    }


    /** Trim X
     *
     * X axis ratio for trimming mirror expanse
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 0.50
     * */
    private double m_TrimX  = 0.00;

    /** Trim X
     *
     * X axis ratio for trimming mirror expanse
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 0.50
     *
     * @param value new value for Trim X
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setTrimX(double value) throws ParameterOutOfRangeException
    {
		if(value > 0.50 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 0.50);
	    }

        m_TrimX = value;
        setProperty("trim-x", value);
        return this;
    }

    /** Trim X
     *
     * X axis ratio for trimming mirror expanse
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 0.50
     *
     * @return value of Trim X
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getTrimX()
    {
        return m_TrimX;
    }


    /** Trim Y
     *
     * Y axis ratio for trimming mirror expanse
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 0.50
     * */
    private double m_TrimY  = 0.00;

    /** Trim Y
     *
     * Y axis ratio for trimming mirror expanse
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 0.50
     *
     * @param value new value for Trim Y
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setTrimY(double value) throws ParameterOutOfRangeException
    {
		if(value > 0.50 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 0.50);
	    }

        m_TrimY = value;
        setProperty("trim-y", value);
        return this;
    }

    /** Trim Y
     *
     * Y axis ratio for trimming mirror expanse
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: 0.00 0.50
     *
     * @return value of Trim Y
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getTrimY()
    {
        return m_TrimY;
    }


    /** Zoom
     *
     * Scale factor to make rendering size bigger
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.10 100.00
     * */
    private double m_InputScale  = 100.00;

    /** Zoom
     *
     * Scale factor to make rendering size bigger
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.10 100.00
     *
     * @param value new value for Zoom
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setInputScale(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.10)
	    {
	        throw new ParameterOutOfRangeException(value, 0.10, 100.00);
	    }

        m_InputScale = value;
        setProperty("input-scale", value);
        return this;
    }

    /** Zoom
     *
     * Scale factor to make rendering size bigger
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.10 100.00
     *
     * @return value of Zoom
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getInputScale()
    {
        return m_InputScale;
    }


    /** Expand
     *
     * Scale factor to make rendering size bigger
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 100.00
     * */
    private double m_OutputScale  = 1.00;

    /** Expand
     *
     * Scale factor to make rendering size bigger
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 100.00
     *
     * @param value new value for Expand
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Mirrors setOutputScale(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < 0.00)
	    {
	        throw new ParameterOutOfRangeException(value, 0.00, 100.00);
	    }

        m_OutputScale = value;
        setProperty("output-scale", value);
        return this;
    }

    /** Expand
     *
     * Scale factor to make rendering size bigger
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 100.00
     *
     * @return value of Expand
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getOutputScale()
    {
        return m_OutputScale;
    }


    /** Clip result to input size
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Clip  = true;

    /** Clip result to input size
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Clip result to input size
     * @return this filter (for chaining operations)
     * 
     */
    public Mirrors setClip(boolean value)
    {
	
        m_Clip = value;
        setProperty("clip", value);
        return this;
    }

    /** Clip result to input size
     *
     * 
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Clip result to input size
     * 
     */
    public boolean getClip()
    {
        return m_Clip;
    }


    /** Wrap input
     *
     * Fill full output area
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Warp  = true;

    /** Wrap input
     *
     * Fill full output area
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @param value new value for Wrap input
     * @return this filter (for chaining operations)
     * 
     */
    public Mirrors setWarp(boolean value)
    {
	
        m_Warp = value;
        setProperty("warp", value);
        return this;
    }

    /** Wrap input
     *
     * Fill full output area
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     *
     * @return value of Wrap input
     * 
     */
    public boolean getWarp()
    {
        return m_Warp;
    }

    @Override
    public InputPad<Mirrors> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Mirrors> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

