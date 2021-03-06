package com.jibee.gegl;

import com.jibee.gegl.priv.GeglRectangle;
import com.sun.jna.Pointer;

import lombok.extern.slf4j.Slf4j;

/** Representation of a GEGL filter
 * 
 * @author jibee
 *
 */
@Slf4j
public class GeglFilter implements iFilter {
	private GeglNode m_implementation;
	
	@Override
	public String toString() {
		return this.asXML();
	}
	/** Constructor
	 * 
	 * @param container Container node
	 * @param filterClass Gegl filter name
	 */
	protected GeglFilter(GeglNode container, String filterClass) {
		m_implementation = com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_create_child(container, filterClass);

		String operation = com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_get_operation(m_implementation);
		log.debug(operation);
	}
	/** Constructor
	 * 
	 * @param parent Sibling filter in the same container
	 * @param filterClass Gegl filter name
	 */
	protected GeglFilter(GeglFilter parent, String filterClass) {
		this(parent.getImplementation(), filterClass);
	}
	/** Gets the node containing this filter
	 * 
	 * @return
	 */
	protected GeglNode getImplementation() {
		return m_implementation;
	}
	/** Sets a property of type Vector
	 * 
	 * @param propertyName name of the filter property
	 * @param value value of the filter property
	 */
	protected void setProperty(String propertyName, GeglVector value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	
	/** Sets a property of type Curve
	 * 
	 * @param propertyName name of the filter property
	 * @param value value of the filter property
	 */
	protected void setProperty(String propertyName, GeglCurve value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}

	/** Sets a property of type Color
	 * 
	 * @param propertyName name of the filter property
	 * @param value value of the filter property
	 */
	protected void setProperty(String propertyName, GeglColor value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}

	/** Sets a property of type Data Buffer.
	 * 
	 * @param propertyName name of the filter property
	 * @param value value of the filter property
	 */
	protected void setProperty(String propertyName, GeglBuffer value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}

	/** Sets a property of type Pointer.
	 * 
	 * @param propertyName name of the filter property
	 * @param value value of the filter property
	 */
	protected void setProperty(String propertyName, Pointer value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	/** Sets a property of type Babl color space
	 * @param <T>
	 * 
	 * @param propertyName name of the filter property
	 * @param value value of the filter property
	 */
	protected void setProperty(String propertyName, Babl<?> value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	/** Sets a property of type int.
	 * 
	 * @param propertyName name of the filter property
	 * @param value value of the filter property
	 */
	protected void setProperty(String propertyName, int value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}

	/** Sets a property of type boolean.
	 * 
	 * @param propertyName name of the filter property
	 * @param value value of the filter property
	 */
	protected void setProperty(String propertyName, boolean value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	/** Sets a property of type double.
	 * 
	 * @param propertyName name of the filter property
	 * @param value value of the filter property
	 */
	protected void setProperty(String propertyName, double value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	/** Sets a property of type String.
	 * 
	 * @param propertyName name of the filter property
	 * @param value value of the filter property
	 */
	protected void setProperty(String propertyName, String value) {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_set(m_implementation, propertyName, value);
	}
	/** Creates a color object from a color string such as a RGB triplet
	 * 
	 * @param string
	 * @return
	 */
	protected static GeglColor makeColor(String string) {
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_color_new(string);
	}
	/** Connects this filter's output to the receiver's input
	 * 
	 * @param receiver
	 * @return the receiver filter
	 */
	@Override
	public <T extends iFilter> 
	T connectTo(T receiver) {
		assert receiver instanceof GeglFilter;
		GeglFilter r = (GeglFilter)receiver;
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_link(getImplementation(), r.getImplementation());
		return receiver;
	}
	/** Connects this filter's designated output to the receiver's designated input
	 * 
	 * @param receiver receiving filter
	 * @param outputPadName name of the output pad in the filter
	 * @param inputPadName name of the input pad in the receiving filter
	 * @return the receiver filter
	 */
	@Override
	public <T extends iFilter> 
	T connectTo(T receiver, String outputPadName, String inputPadName) {
		assert receiver instanceof GeglFilter;
		GeglFilter r = (GeglFilter)receiver;
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_connect_to(
				getImplementation(), outputPadName,  
				r.getImplementation(), inputPadName
				);
		return receiver;
	}
	/** Connects this filter's designated output to the input pad
	 * 
	 * @param outputPadName name of the output pad in the filter
	 * @param pad input pad in the receiving filter
	 * @return the receiver filter
	 */
	@Override
	public GeglFilter connectTo(String outputPadName, InputPad<?> pad)
	{
		connectTo(pad.getFilter(), outputPadName, pad.getName());
		return pad.getFilter();
	}
	/** Processes the filter chain until this filter. For example, for a Save
	 * type of filter this will process the filter chain and save the resulting
	 * image
	 */
	@Override
	public void process() {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_process(getImplementation());
	}
	/** Processes the filter chain until this filter and returns the image as a
	 * data array.
	 * @return resulting image as a data array
	 */
	@Override
	public byte[] blit()
	{
		return getImplementation().blit();
	}
	@Override
	public byte[] blit(String format_str)
	{
		return getImplementation().blit(format_str);
	}
	@Override
	public float[] blit_float()
	{
		return getImplementation().blit_float();
	}
	@Override
	public float[] blit_float(String format_str)
	{
		return getImplementation().blit_float(format_str);
	}
	@Override
	public short[] blit_short()
	{
		return getImplementation().blit_short();
	}
	@Override
	public short[] blit_short(String format_str)
	{
		return getImplementation().blit_short(format_str);
	}
	
	/** Describes the filter chain as an XML string, assuming all paths are absolute
	 * @return the filter chain as an XML string
	 */
	public String asXML()
	{
		return getImplementation().asXML();
	}
	/** Describes the filter chain as an XML string, expressing paths relative to the base_path
	 * @param base_path base path for file paths
	 * @return the filter chain as an XML string 
	 */
	public String asXML(String base_path)
	{
		return getImplementation().asXML(base_path);
	}
	/**
	 * gegl_node_disconnect:
	 * @param input_pad the input pad to disconnect.
	 *
	 * Disconnects node connected to @input_pad of @node (if any).
	 *
	 * @return Returns TRUE if a connection was broken.
	 */
	public boolean disconnect(String input_pad)
	{
		return getImplementation().disconnect(input_pad);
	}
	
	@Override
	public GeglRectangle getBoundingBox()
	{
		return getImplementation().getBoundingBox();
	}

}
