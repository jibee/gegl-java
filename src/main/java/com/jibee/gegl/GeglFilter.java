package com.jibee.gegl;

import com.sun.jna.Pointer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeglFilter {
	private GeglNode m_implementation;

	public GeglFilter(GeglNode container, String filterClass) {
		m_implementation = com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_create_child(container, filterClass);
		
		String operation = com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_get_operation(m_implementation);
		log.debug(operation);
	}
	public GeglFilter(GeglFilter parent, String filterClass) {
		this(parent.getImplementation(), filterClass);
	}
	private GeglNode getImplementation() {
		return m_implementation;
	}
	protected void setProperty(String propertyName, GeglVector value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	protected void setProperty(String propertyName, GeglCurve value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}

	protected void setProperty(String propertyName, GeglColor value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}

	protected void setProperty(String propertyName, GeglBuffer value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}

	protected void setProperty(String propertyName, Pointer value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	protected void setProperty(String propertyName, Babl value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	protected void setProperty(String propertyName, int value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}

	protected void setProperty(String propertyName, boolean value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	protected void setProperty(String propertyName, double value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	protected void setProperty(String propertyName, String value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	protected GeglColor makeColor(String string) {
		return Gegl.makeColor(string);
	}
	public GeglFilter connectTo(GeglFilter receiver) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_link(getImplementation(), receiver.getImplementation());
		return receiver;
	}
	public GeglFilter connectTo(GeglFilter receiver, String outputPadName, String inputPadName) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_connect_to(
				getImplementation(), outputPadName,  
				receiver.getImplementation(), inputPadName);
		return receiver;
		
	}
	public GeglFilter connectTo(String outputPadName, InputPad pad)
	{
		connectTo(pad.getFilter(), outputPadName, pad.getName());
		return pad.getFilter();
	}
	public void process() {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_process(getImplementation());
	}
	public byte[] blit()
	{
		return m_implementation.blit();
	}

}
