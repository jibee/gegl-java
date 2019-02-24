package com.jibee.gegl;

public class InputPad  extends Pad{

	public InputPad(GeglFilter sink, String padName) {
		super(sink, padName);
	}

	public void disconnect()
	{
		getFilter().disconnect(this.getName());
	}
}
