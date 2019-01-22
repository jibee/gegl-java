package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Little Planet
 *
 * Do a stereographic/little planet transform of an equirectangular image.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"map"})
public class StereographicProjection extends GeglFilter implements Filter
{
    /** Constructs a Little Planet.
     *
     * Do a stereographic/little planet transform of an equirectangular image.
     *
     * @param container container node
     */
    public StereographicProjection(GeglNode container)
    {
        super(container, "gegl:stereographic-projection");
    }
    /** Constructs a Little Planet.
     *
     * Do a stereographic/little planet transform of an equirectangular image.
     *
     * @param parent parent filter node
     */
    public StereographicProjection(GeglFilter parent)
    {
        super(parent, "gegl:stereographic-projection");
    }

    
    /** Pan
     *
     * Horizontal camera panning
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -360.00 360.00
     * */
    private double m_Pan  = 0.00;

    /** Pan
     *
     * Horizontal camera panning
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -360.00 360.00
     *
     * @param value new value for Pan
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public StereographicProjection setPan(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < -360.00)
	    {
	        throw new ParameterOutOfRangeException(value, -360.00, 360.00);
	    }

        m_Pan = value;
        setProperty("pan", value);
        return this;
    }

    /** Pan
     *
     * Horizontal camera panning
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -360.00 360.00
     *
     * @return value of Pan
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getPan()
    {
        return m_Pan;
    }


    /** Tilt
     *
     * Vertical camera panning
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Tilt  = 90.00;

    /** Tilt
     *
     * Vertical camera panning
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range: -180.00 180.00
     *
     * @param value new value for Tilt
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public StereographicProjection setTilt(double value) throws ParameterOutOfRangeException
    {
		if(value > 180.00 || value < -180.00)
	    {
	        throw new ParameterOutOfRangeException(value, -180.00, 180.00);
	    }

        m_Tilt = value;
        setProperty("tilt", value);
        return this;
    }

    /** Tilt
     *
     * Vertical camera panning
     *
     * Unit: degree
     * Default value: 90.00
     * Acceptable Range: -180.00 180.00
     *
     * @return value of Tilt
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getTilt()
    {
        return m_Tilt;
    }


    /** Spin
     *
     * Spin angle around camera axis
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -360.00 360.00
     * */
    private double m_Spin  = 0.00;

    /** Spin
     *
     * Spin angle around camera axis
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -360.00 360.00
     *
     * @param value new value for Spin
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public StereographicProjection setSpin(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < -360.00)
	    {
	        throw new ParameterOutOfRangeException(value, -360.00, 360.00);
	    }

        m_Spin = value;
        setProperty("spin", value);
        return this;
    }

    /** Spin
     *
     * Spin angle around camera axis
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -360.00 360.00
     *
     * @return value of Spin
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getSpin()
    {
        return m_Spin;
    }


    /** Zoom
     *
     * Zoom level
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.01 1000.00
     * */
    private double m_Zoom  = 100.00;

    /** Zoom
     *
     * Zoom level
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.01 1000.00
     *
     * @param value new value for Zoom
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public StereographicProjection setZoom(double value) throws ParameterOutOfRangeException
    {
		if(value > 1000.00 || value < 0.01)
	    {
	        throw new ParameterOutOfRangeException(value, 0.01, 1000.00);
	    }

        m_Zoom = value;
        setProperty("zoom", value);
        return this;
    }

    /** Zoom
     *
     * Zoom level
     *
     * Unit: 
     * Default value: 100.00
     * Acceptable Range: 0.01 1000.00
     *
     * @return value of Zoom
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public double getZoom()
    {
        return m_Zoom;
    }


    /** Width
     *
     * output/rendering width in pixels, -1 for input width
     *
     * Unit: 
     * Default value: -1
     * Acceptable Range: -1 10000
     * */
    private int m_Width  = -1;

    /** Width
     *
     * output/rendering width in pixels, -1 for input width
     *
     * Unit: 
     * Default value: -1
     * Acceptable Range: -1 10000
     *
     * @param value new value for Width
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public StereographicProjection setWidth(int value) throws ParameterOutOfRangeException
    {
		if(value > 10000 || value < -1)
	    {
	        throw new ParameterOutOfRangeException(value, -1, 10000);
	    }

        m_Width = value;
        setProperty("width", value);
        return this;
    }

    /** Width
     *
     * output/rendering width in pixels, -1 for input width
     *
     * Unit: 
     * Default value: -1
     * Acceptable Range: -1 10000
     *
     * @return value of Width
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getWidth()
    {
        return m_Width;
    }


    /** Height
     *
     * output/rendering height in pixels, -1 for input height
     *
     * Unit: 
     * Default value: -1
     * Acceptable Range: -1 10000
     * */
    private int m_Height  = -1;

    /** Height
     *
     * output/rendering height in pixels, -1 for input height
     *
     * Unit: 
     * Default value: -1
     * Acceptable Range: -1 10000
     *
     * @param value new value for Height
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public StereographicProjection setHeight(int value) throws ParameterOutOfRangeException
    {
		if(value > 10000 || value < -1)
	    {
	        throw new ParameterOutOfRangeException(value, -1, 10000);
	    }

        m_Height = value;
        setProperty("height", value);
        return this;
    }

    /** Height
     *
     * output/rendering height in pixels, -1 for input height
     *
     * Unit: 
     * Default value: -1
     * Acceptable Range: -1 10000
     *
     * @return value of Height
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getHeight()
    {
        return m_Height;
    }


    /** Inverse transform
     *
     * Do the inverse mapping, useful for touching up zenith, nadir or other parts of panorama.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_Inverse  = false;

    /** Inverse transform
     *
     * Do the inverse mapping, useful for touching up zenith, nadir or other parts of panorama.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Inverse transform
     * @return this filter (for chaining operations)
     * 
     */
    public StereographicProjection setInverse(boolean value)
    {
	
        m_Inverse = value;
        setProperty("inverse", value);
        return this;
    }

    /** Inverse transform
     *
     * Do the inverse mapping, useful for touching up zenith, nadir or other parts of panorama.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Inverse transform
     * 
     */
    public boolean getInverse()
    {
        return m_Inverse;
    }


    /** Resampling method
     *
     * Image resampling method to use, for good results with double resampling when retouching panoramas, use nearest to generate the view and cubic or better for the inverse transform back to panorama.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_SamplerType ;

    /** Resampling method
     *
     * Image resampling method to use, for good results with double resampling when retouching panoramas, use nearest to generate the view and cubic or better for the inverse transform back to panorama.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Resampling method
     * @return this filter (for chaining operations)
     * 
     */
    public StereographicProjection setSamplerType(String value)
    {
	
        m_SamplerType = value;
        setProperty("sampler-type", value);
        return this;
    }

    /** Resampling method
     *
     * Image resampling method to use, for good results with double resampling when retouching panoramas, use nearest to generate the view and cubic or better for the inverse transform back to panorama.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Resampling method
     * 
     */
    public String getSamplerType()
    {
        return m_SamplerType;
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

