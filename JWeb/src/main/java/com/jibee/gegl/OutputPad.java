package com.jibee.gegl;

public class OutputPad extends Pad{

	public OutputPad(GeglFilter source, String padName)
	{
		super(source, padName);
	}
	public GeglFilter connectTo(InputPad sink)
	{
		return getFilter().connectTo(getName(), sink);
	}
}
