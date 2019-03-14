package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * Tile
 *
 * Infinitely repeats the input image.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: true
 */
@GeglFilterOp(license="", opencl=false, position_dependant=true, categories={"tile"})
public class Tile extends GeglFilter implements Filter
{
    /** Constructs a Tile.
     *
     * Infinitely repeats the input image.
     *
     * @param container container node
     */
    public Tile(GeglNode container)
    {
        super(container, "gegl:tile");
    }
    /** Constructs a Tile.
     *
     * Infinitely repeats the input image.
     *
     * @param parent parent filter node
     */
    public Tile(GeglFilter parent)
    {
        super(parent, "gegl:tile");
    }

    
    /** Horizontal offset
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_OffsetX ;

    /** Horizontal offset
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Horizontal offset
     * @return this filter (for chaining operations)
     * 
     */
    public Tile setOffsetX(int value)
    {
	
        m_OffsetX = value;
        setProperty("offset-x", value);
        return this;
    }

    /** Horizontal offset
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Horizontal offset
     * 
     */
    public int getOffsetX()
    {
        return m_OffsetX;
    }


    /** Vertical offset
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_OffsetY ;

    /** Vertical offset
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     *
     * @param value new value for Vertical offset
     * @return this filter (for chaining operations)
     * 
     */
    public Tile setOffsetY(int value)
    {
	
        m_OffsetY = value;
        setProperty("offset-y", value);
        return this;
    }

    /** Vertical offset
     *
     * 
     *
     * Unit: pixel-coordinate
     * Default value: 
     * Acceptable Range:  
     *
     * @return value of Vertical offset
     * 
     */
    public int getOffsetY()
    {
        return m_OffsetY;
    }

    @Override
    public InputPad<Tile> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<Tile> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

