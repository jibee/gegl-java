package com.jibee.gegl;

public interface iFilter {
	/** Connects this filter's output to the receiver's input
	 * 
	 * @param receiver
	 * @return the receiver filter
	 */
	public <T extends iFilter> T connectTo(T receiver);
	/** Connects this filter's designated output to the receiver's designated input
	 * 
	 * @param receiver receiving filter
	 * @param outputPadName name of the output pad in the filter
	 * @param inputPadName name of the input pad in the receiving filter
	 * @return the receiver filter
	 */
	public <T extends iFilter> T connectTo(T receiver, String outputPadName, String inputPadName);
	/** Connects this filter's designated output to the input pad
	 * 
	 * @param outputPadName name of the output pad in the filter
	 * @param pad input pad in the receiving filter
	 * @return the receiver filter
	 */
	public iFilter connectTo(String outputPadName, InputPad pad);
	/** Processes the filter chain until this filter. For example, for a Save
	 * type of filter this will process the filter chain and save the resulting
	 * image
	 */
	public void process();
	/** Processes the filter chain until this filter and returns the image as a
	 * data array.
	 * @return resulting image as a data array
	 */
	public byte[] blit();
}
