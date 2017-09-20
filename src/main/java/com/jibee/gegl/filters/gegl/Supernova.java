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
 * Supernova
 *
 * This plug-in produces an effect like a supernova burst. The amount of the light effect is approximately in proportion to 1/r, where r is the distance from the center of the star.
 * 
 * License: GPL3+
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="GPL3+", opencl=false, position_dependant=false, categories={"light"})
public class Supernova extends GeglFilter implements Filter
{
    /** Constructs a Supernova.
     *
     * This plug-in produces an effect like a supernova burst. The amount of the light effect is approximately in proportion to 1/r, where r is the distance from the center of the star.
     *
     * @param container container node
     */
    public Supernova(GeglNode container)
    {
        super(container, "gegl:supernova");
    }
    /** Constructs a Supernova.
     *
     * This plug-in produces an effect like a supernova burst. The amount of the light effect is approximately in proportion to 1/r, where r is the distance from the center of the star.
     *
     * @param parent parent filter node
     */
    public Supernova(GeglFilter parent)
    {
        super(parent, "gegl:supernova");
    }

    
    /** Center X
     *
     * X coordinates of the center of supernova
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_CenterX  = 0.50;

    /** Center X
     *
     * X coordinates of the center of supernova
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @param value new value for Center X
     * @return this filter (for chaining operations)
     * 
     */
    public Supernova setCenterX(double value)
    {
	
        m_CenterX = value;
        setProperty("center-x", value);
        return this;
    }

    /** Center X
     *
     * X coordinates of the center of supernova
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @return value of Center X
     * 
     */
    public double getCenterX()
    {
        return m_CenterX;
    }


    /** Center Y
     *
     * Y coordinates of the center of supernova
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     * */
    private double m_CenterY  = 0.50;

    /** Center Y
     *
     * Y coordinates of the center of supernova
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @param value new value for Center Y
     * @return this filter (for chaining operations)
     * 
     */
    public Supernova setCenterY(double value)
    {
	
        m_CenterY = value;
        setProperty("center-y", value);
        return this;
    }

    /** Center Y
     *
     * Y coordinates of the center of supernova
     *
     * Unit: relative-coordinate
     * Default value: 0.50
     * Acceptable Range:  
     *
     * @return value of Center Y
     * 
     */
    public double getCenterY()
    {
        return m_CenterY;
    }


    /** Radius
     *
     * Radius of supernova
     *
     * Unit: pixel-distance
     * Default value: 20
     * Acceptable Range: 1 20000
     * */
    private int m_Radius  = 20;

    /** Radius
     *
     * Radius of supernova
     *
     * Unit: pixel-distance
     * Default value: 20
     * Acceptable Range: 1 20000
     *
     * @param value new value for Radius
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Supernova setRadius(int value) throws ParameterOutOfRangeException
    {
		if(value > 20000 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 20000);
	    }

        m_Radius = value;
        setProperty("radius", value);
        return this;
    }

    /** Radius
     *
     * Radius of supernova
     *
     * Unit: pixel-distance
     * Default value: 20
     * Acceptable Range: 1 20000
     *
     * @return value of Radius
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getRadius()
    {
        return m_Radius;
    }


    /** Number of spokes
     *
     * Number of spokes
     *
     * Unit: 
     * Default value: 100
     * Acceptable Range: 1 1024
     * */
    private int m_SpokesCount  = 100;

    /** Number of spokes
     *
     * Number of spokes
     *
     * Unit: 
     * Default value: 100
     * Acceptable Range: 1 1024
     *
     * @param value new value for Number of spokes
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Supernova setSpokesCount(int value) throws ParameterOutOfRangeException
    {
		if(value > 1024 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 1024);
	    }

        m_SpokesCount = value;
        setProperty("spokes-count", value);
        return this;
    }

    /** Number of spokes
     *
     * Number of spokes
     *
     * Unit: 
     * Default value: 100
     * Acceptable Range: 1 1024
     *
     * @return value of Number of spokes
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getSpokesCount()
    {
        return m_SpokesCount;
    }


    /** Random hue
     *
     * Random hue
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  360
     * */
    private int m_RandomHue ;

    /** Random hue
     *
     * Random hue
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  360
     *
     * @param value new value for Random hue
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public Supernova setRandomHue(int value) throws ParameterOutOfRangeException
    {
		if(value > 360)
	    {
	        throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 360);
	    }

        m_RandomHue = value;
        setProperty("random-hue", value);
        return this;
    }

    /** Random hue
     *
     * Random hue
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  360
     *
     * @return value of Random hue
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getRandomHue()
    {
        return m_RandomHue;
    }


    /** Color
     *
     * The color of supernova.
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     * */
    private GeglColor m_Color  = makeColor("rgb(0.0000, 0.0000, 1.0000)");

    /** Color
     *
     * The color of supernova.
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @param value new value for Color
     * @return this filter (for chaining operations)
     * 
     */
    public Supernova setColor(GeglColor value)
    {
	
        m_Color = value;
        setProperty("color", value);
        return this;
    }

    /** Color
     *
     * The color of supernova.
     *
     * Unit: 
     * Default value: makeColor("rgb(0.0000, 0.0000, 1.0000)")
     * Acceptable Range:  
     *
     * @return value of Color
     * 
     */
    public GeglColor getColor()
    {
        return m_Color;
    }


    /** Random seed
     *
     * The random seed for spokes and random hue
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Seed ;

    /** Random seed
     *
     * The random seed for spokes and random hue
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Random seed
     * @return this filter (for chaining operations)
     * 
     */
    public Supernova setSeed(int value)
    {
	
        m_Seed = value;
        setProperty("seed", value);
        return this;
    }

    /** Random seed
     *
     * The random seed for spokes and random hue
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

