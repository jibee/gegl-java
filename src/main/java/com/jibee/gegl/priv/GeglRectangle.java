package com.jibee.gegl.priv;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

public class GeglRectangle extends Structure{
	public static class ByValue extends GeglRectangle implements Structure.ByValue { }
	public GeglRectangle()
	{
		this(0,0);
	}
	public GeglRectangle(int width, int height, int x, int y)
	{
		this.height=height;
		this.width=width;
		this.x=x;
		this.y=y;
	}
	public GeglRectangle(int width, int height)
	{
		this(width, height, 0,0);
	}
	public int x;
	public int y;
	public int width;
	public int height;
	
	@Override
	protected List getFieldOrder() {
		return Arrays.asList(new String[] {"x","y", "width", "height"});
	}
}
