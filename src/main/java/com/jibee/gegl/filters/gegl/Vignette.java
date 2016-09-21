package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Vignette
 *
 * Applies a vignette to an image. Simulates the luminance fall off at the edge of exposed film, and some other fuzzier border effects that can naturally occur with analog photography
 * 
 * License: 
 * Supports OpenCL: true
 * Position Dependant: true
 */
@Filter(license="", opencl=true, position_dependant=true, categories={"render", "photo"})
public class Vignette extends GeglFilter implements Source, Sink
{
    /** Constructs a Vignette.
     *
     * Applies a vignette to an image. Simulates the luminance fall off at the edge of exposed film, and some other fuzzier border effects that can naturally occur with analog photography
     */
    public Vignette(GeglNode container)
    {
        super(container, "gegl:vignette");
    }
    /** Constructs a Vignette.
     *
     * Applies a vignette to an image. Simulates the luminance fall off at the edge of exposed film, and some other fuzzier border effects that can naturally occur with analog photography
     */
    public Vignette(GeglFilter parent)
    {
        super(parent, "gegl:vignette");
    }

    
    /** Vignette shape
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Shape ;

    /** Vignette shape
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public Vignette setShape(String value)
    {
	
        m_Shape = value;
        setProperty("shape", value);
        return this;
    }

    /** Vignette shape
     *
     * 
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getShape()
    {
        return m_Shape;
    }


    /** Color
     *
     * Defaults to 'black', you can use transparency here to erase portions of an image
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 0.0000)");

    /** Color
     *
     * Defaults to 'black', you can use transparency here to erase portions of an image
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public Vignette setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

    /** Color
     *
     * Defaults to 'black', you can use transparency here to erase portions of an image
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 0.0000)")
     * Acceptable Range:  
     */
    public GeglColor getColor()
    {
        return m_Color;
    }


    /** Radius
     *
     * How far out vignetting goes as portion of half image diagonal
     *
     * Unit: relative-distance
     * Default value: 1.20
     * Acceptable Range: 0.00 3.00
     * */
    private double m_Radius  = 1.20;

    /** Radius
     *
     * How far out vignetting goes as portion of half image diagonal
     *
     * Unit: relative-distance
     * Default value: 1.20
     * Acceptable Range: 0.00 3.00
     */
    public Vignette setRadius(double value) throws ParameterOutOfRangeException
    {
		if(value > 3.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 3.00);
	}

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * How far out vignetting goes as portion of half image diagonal
     *
     * Unit: relative-distance
     * Default value: 1.20
     * Acceptable Range: 0.00 3.00
     */
    public double getRadius()
    {
        return m_Radius;
    }


    /** Softness
     *
     * 
     *
     * Unit: 
     * Default value: 0.80
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Softness  = 0.80;

    /** Softness
     *
     * 
     *
     * Unit: 
     * Default value: 0.80
     * Acceptable Range: 0.00 1.00
     */
    public Vignette setSoftness(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Softness = value;
        setProperty("softness", value);
        return this;
    }

    /** Softness
     *
     * 
     *
     * Unit: 
     * Default value: 0.80
     * Acceptable Range: 0.00 1.00
     */
    public double getSoftness()
    {
        return m_Softness;
    }


    /** Gamma
     *
     * Falloff linearity
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 20.00
     * */
    private double m_Gamma  = 2.00;

    /** Gamma
     *
     * Falloff linearity
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 20.00
     */
    public Vignette setGamma(double value) throws ParameterOutOfRangeException
    {
		if(value > 20.00 || value < 1.00)
	{
	    throw new ParameterOutOfRangeException(value, 1.00, 20.00);
	}

        m_Gamma = value;
        setProperty("gamma", value);
        return this;
    }

    /** Gamma
     *
     * Falloff linearity
     *
     * Unit: 
     * Default value: 2.00
     * Acceptable Range: 1.00 20.00
     */
    public double getGamma()
    {
        return m_Gamma;
    }


    /** Proportion
     *
     * How close we are to image proportions
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     * */
    private double m_Proportion  = 1.00;

    /** Proportion
     *
     * How close we are to image proportions
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     */
    public Vignette setProportion(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 1.00);
	}

        m_Proportion = value;
        setProperty("proportion", value);
        return this;
    }

    /** Proportion
     *
     * How close we are to image proportions
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 1.00
     */
    public double getProportion()
    {
        return m_Proportion;
    }


    /** Squeeze
     *
     * Aspect ratio to use, -0.5 = 1:2, 0.0 = 1:1, 0.5 = 2:1, -1.0 = 1:inf 1.0 = inf:1, this is applied after proportion is taken into account, to directly use squeeze factor as proportions, set proportion to 0.0.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_Squeeze  = 0.00;

    /** Squeeze
     *
     * Aspect ratio to use, -0.5 = 1:2, 0.0 = 1:1, 0.5 = 2:1, -1.0 = 1:inf 1.0 = inf:1, this is applied after proportion is taken into account, to directly use squeeze factor as proportions, set proportion to 0.0.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public Vignette setSqueeze(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_Squeeze = value;
        setProperty("squeeze", value);
        return this;
    }

    /** Squeeze
     *
     * Aspect ratio to use, -0.5 = 1:2, 0.0 = 1:1, 0.5 = 2:1, -1.0 = 1:inf 1.0 = inf:1, this is applied after proportion is taken into account, to directly use squeeze factor as proportions, set proportion to 0.0.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getSqueeze()
    {
        return m_Squeeze;
    }


    /** Center X
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_X  = 0.50;

    /** Center X
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public Vignette setX(double value)
    {
	
        m_X = value;
        setProperty("x", value);
        return this;
    }

    /** Center X
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public double getX()
    {
        return m_X;
    }


    /** Center Y
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_Y  = 0.50;

    /** Center Y
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public Vignette setY(double value)
    {
	
        m_Y = value;
        setProperty("y", value);
        return this;
    }

    /** Center Y
     *
     * 
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     */
    public double getY()
    {
        return m_Y;
    }


    /** Rotation
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     * */
    private double m_Rotation  = 0.00;

    /** Rotation
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     */
    public Vignette setRotation(double value) throws ParameterOutOfRangeException
    {
		if(value > 360.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 360.00);
	}

        m_Rotation = value;
        setProperty("rotation", value);
        return this;
    }

    /** Rotation
     *
     * 
     *
     * Unit: degree
     * Default value: 0.00
     * Acceptable Range: 0.00 360.00
     */
    public double getRotation()
    {
        return m_Rotation;
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

