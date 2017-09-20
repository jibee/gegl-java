package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Texturize Canvas
 *
 * Textures the image as if it were an artist's canvas.
 * 
 * License: GPL3+
 * Supports OpenCL: true
 * Position Dependant: true
 */
@GeglFilterOp(license="GPL3+", opencl=true, position_dependant=true, categories={"artistic"})
public class TexturizeCanvas extends GeglFilter implements Filter
{
    /** Constructs a Texturize Canvas.
     *
     * Textures the image as if it were an artist's canvas.
     *
     * @param container container node
     */
    public TexturizeCanvas(GeglNode container)
    {
        super(container, "gegl:texturize-canvas");
    }
    /** Constructs a Texturize Canvas.
     *
     * Textures the image as if it were an artist's canvas.
     *
     * @param parent parent filter node
     */
    public TexturizeCanvas(GeglFilter parent)
    {
        super(parent, "gegl:texturize-canvas");
    }

    
    /** Direction
     *
     * Position of the light source which lightens the canvas: Top-right, Top-left, Bottom-left or Bottom-right
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Direction ;

    /** Direction
     *
     * Position of the light source which lightens the canvas: Top-right, Top-left, Bottom-left or Bottom-right
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Direction
     * @return this filter (for chaining operations)
     * 
     */
    public TexturizeCanvas setDirection(String value)
    {
	
        m_Direction = value;
        setProperty("direction", value);
        return this;
    }

    /** Direction
     *
     * Position of the light source which lightens the canvas: Top-right, Top-left, Bottom-left or Bottom-right
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Direction
     * 
     */
    public String getDirection()
    {
        return m_Direction;
    }


    /** Depth
     *
     * Apparent depth of the rendered canvas effect; from 1 (very flat) to 50 (very deep)
     *
     * Unit: 
     * Default value: 4
     * Acceptable Range: 1 50
     * */
    private int m_Depth  = 4;

    /** Depth
     *
     * Apparent depth of the rendered canvas effect; from 1 (very flat) to 50 (very deep)
     *
     * Unit: 
     * Default value: 4
     * Acceptable Range: 1 50
     *
     * @param value new value for Depth
     * @return this filter (for chaining operations)
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public TexturizeCanvas setDepth(int value) throws ParameterOutOfRangeException
    {
		if(value > 50 || value < 1)
	    {
	        throw new ParameterOutOfRangeException(value, 1, 50);
	    }

        m_Depth = value;
        setProperty("depth", value);
        return this;
    }

    /** Depth
     *
     * Apparent depth of the rendered canvas effect; from 1 (very flat) to 50 (very deep)
     *
     * Unit: 
     * Default value: 4
     * Acceptable Range: 1 50
     *
     * @return value of Depth
     * @throws ParameterOutOfRangeException value is outside the acceptable range.
     */
    public int getDepth()
    {
        return m_Depth;
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

