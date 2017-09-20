package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Lens Distortion
 *
 * Corrects barrel or pincushion lens distortion.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=true, categories={"distort"})
public class LensDistortion extends GeglFilter implements Filter
{
    /** Constructs a Lens Distortion.
     *
     * Corrects barrel or pincushion lens distortion.
     *
     * @param container container node
     */
    public LensDistortion(GeglNode container)
    {
        super(container, "gegl:lens-distortion");
    }
    /** Constructs a Lens Distortion.
     *
     * Corrects barrel or pincushion lens distortion.
     *
     * @param parent parent filter node
     */
    public LensDistortion(GeglFilter parent)
    {
        super(parent, "gegl:lens-distortion");
    }

    
    /** Main
     *
     * Amount of second-order distortion
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_Main  = 0.00;

    /** Main
     *
     * Amount of second-order distortion
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Main
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public LensDistortion setMain(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_Main = value;
        setProperty("main", value);
        return this;
    }

    /** Main
     *
     * Amount of second-order distortion
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Main
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getMain()
    {
        return m_Main;
    }


    /** Edge
     *
     * Amount of fourth-order distortion
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_Edge  = 0.00;

    /** Edge
     *
     * Amount of fourth-order distortion
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Edge
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public LensDistortion setEdge(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_Edge = value;
        setProperty("edge", value);
        return this;
    }

    /** Edge
     *
     * Amount of fourth-order distortion
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Edge
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getEdge()
    {
        return m_Edge;
    }


    /** Zoom
     *
     * Rescale overall image size
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_Zoom  = 0.00;

    /** Zoom
     *
     * Rescale overall image size
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Zoom
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public LensDistortion setZoom(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_Zoom = value;
        setProperty("zoom", value);
        return this;
    }

    /** Zoom
     *
     * Rescale overall image size
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Zoom
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getZoom()
    {
        return m_Zoom;
    }


    /** Shift X
     *
     * Effect centre offset in X
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_XShift  = 0.00;

    /** Shift X
     *
     * Effect centre offset in X
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Shift X
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public LensDistortion setXShift(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_XShift = value;
        setProperty("x-shift", value);
        return this;
    }

    /** Shift X
     *
     * Effect centre offset in X
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Shift X
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getXShift()
    {
        return m_XShift;
    }


    /** Shift Y
     *
     * Effect centre offset in Y
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_YShift  = 0.00;

    /** Shift Y
     *
     * Effect centre offset in Y
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Shift Y
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public LensDistortion setYShift(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_YShift = value;
        setProperty("y-shift", value);
        return this;
    }

    /** Shift Y
     *
     * Effect centre offset in Y
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Shift Y
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getYShift()
    {
        return m_YShift;
    }


    /** Brighten
     *
     * Adjust brightness in corners
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     * */
    private double m_Brighten  = 0.00;

    /** Brighten
     *
     * Adjust brightness in corners
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @param value new value for Brighten
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public LensDistortion setBrighten(double value) throws ParameterOutOfRangeException
    {
		if(value > 100.00 || value < -100.00)
	    {
	        throw new ParameterOutOfRangeException(value, -100.00, 100.00);
	    }

        m_Brighten = value;
        setProperty("brighten", value);
        return this;
    }

    /** Brighten
     *
     * Adjust brightness in corners
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -100.00 100.00
     *
     * @return value of Brighten
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getBrighten()
    {
        return m_Brighten;
    }


    /** Background color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Background  = makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)");

    /** Background color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Background color
     * @return this filter (for chaining operations)
     * 
     */
    public LensDistortion setBackground(GeglColor value)
    {
	
        m_Background = value;
        setProperty("background", value);
        return this;
    }

    /** Background color
     *
     * 
     *
     * Unit: 
     * Default value: makeColor("rgba(0.0000, 0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     *
     * @return value of Background color
     * 
     */
    public GeglColor getBackground()
    {
        return m_Background;
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

