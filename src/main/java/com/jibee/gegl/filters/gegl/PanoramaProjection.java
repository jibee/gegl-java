package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Panorama Projection
 *
 * Perform an equilinear/gnomonic or little planet/stereographic projection of an equirectangular input image.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"map"})
public class PanoramaProjection extends GeglFilter implements Filter
{
    /** Constructs a Panorama Projection.
     *
     * Perform an equilinear/gnomonic or little planet/stereographic projection of an equirectangular input image.
     *
     * @param container container node
     */
    public PanoramaProjection(GeglNode container)
    {
        super(container, "gegl:panorama-projection");
    }
    /** Constructs a Panorama Projection.
     *
     * Perform an equilinear/gnomonic or little planet/stereographic projection of an equirectangular input image.
     *
     * @param parent parent filter node
     */
    public PanoramaProjection(GeglFilter parent)
    {
        super(parent, "gegl:panorama-projection");
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
    public PanoramaProjection setPan(double value) throws ParameterOutOfRangeException
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
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     * */
    private double m_Tilt  = 0.00;

    /** Tilt
     *
     * Vertical camera panning
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: -180.00 180.00
     *
     * @param value new value for Tilt
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public PanoramaProjection setTilt(double value) throws ParameterOutOfRangeException
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
     * Default value: 0.00
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
    public PanoramaProjection setSpin(double value) throws ParameterOutOfRangeException
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
    public PanoramaProjection setZoom(double value) throws ParameterOutOfRangeException
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
    public PanoramaProjection setWidth(int value) throws ParameterOutOfRangeException
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
    public PanoramaProjection setHeight(int value) throws ParameterOutOfRangeException
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


    /** Little planet
     *
     * Render a stereographic mapping, a tilt value of 90, which means looking at nadir provides a good default value.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     * */
    private boolean m_LittlePlanet  = false;

    /** Little planet
     *
     * Render a stereographic mapping, a tilt value of 90, which means looking at nadir provides a good default value.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @param value new value for Little planet
     * @return this filter (for chaining operations)
     * 
     */
    public PanoramaProjection setLittlePlanet(boolean value)
    {
	
        m_LittlePlanet = value;
        setProperty("little-planet", value);
        return this;
    }

    /** Little planet
     *
     * Render a stereographic mapping, a tilt value of 90, which means looking at nadir provides a good default value.
     *
     * Unit: 
     * Default value: false
     * Acceptable Range:  
     *
     * @return value of Little planet
     * 
     */
    public boolean getLittlePlanet()
    {
        return m_LittlePlanet;
    }


    /** Resampling method
     *
     * Image resampling method to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_SamplerType ;

    /** Resampling method
     *
     * Image resampling method to use
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Resampling method
     * @return this filter (for chaining operations)
     * 
     */
    public PanoramaProjection setSamplerType(String value)
    {
	
        m_SamplerType = value;
        setProperty("sampler-type", value);
        return this;
    }

    /** Resampling method
     *
     * Image resampling method to use
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

