package com.jibee.gegl.priv;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

/** Rectangle
 * 
 *
 */
public class GeglRectangle extends Structure{
	/** By Value call convention.
	 * 
	 * @author jibee
	 *
	 */
	public static class ByValue extends GeglRectangle implements Structure.ByValue { }
	/** Constructor
	 * 
	 */
	public GeglRectangle()
	{
		this(0,0);
	}
	/** Constructor
	 * 
	 * @param width Width of the rectangle
	 * @param height Height of the rectangle
	 * @param x x-position of the rectangle
	 * @param y y-position of the rectangle
	 */
	@SuppressWarnings("hiding")
	public GeglRectangle(int width, int height, int x, int y)
	{
		this.height=height;
		this.width=width;
		this.x=x;
		this.y=y;
	}
	/** Constructor
	 * 
	 * @param width Width of the rectangle
	 * @param height Height of the rectangle
	 * */
	@SuppressWarnings("hiding")
	public GeglRectangle(int width, int height)
	{
		this(width, height, 0,0);
	}
	/** X position
	 * 
	 */
	public int x;
	/** Y position
	 * 
	 */
	public int y;
	/** width
	 * 
	 */
	public int width;
	/** height
	 * 
	 */
	public int height;
	
	@Override
	protected List getFieldOrder() {
		return Arrays.asList(new String[] {"x","y", "width", "height"});
	}
}
