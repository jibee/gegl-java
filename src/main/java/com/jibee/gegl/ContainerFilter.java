package com.jibee.gegl;

import java.util.ArrayDeque;
import java.util.Collections;

import com.jibee.gegl.priv.GeglRectangle;

/** Filter implemented through the use of other filter.
 * 
 * @author jibee
 *
 */
public class ContainerFilter implements Filter {

	private ArrayDeque<Filter> stack;

	/** Constructs an empty container. Add filters to the stack with append and appendAndConnect
	 * 
	 */
	public ContainerFilter() {
		this.stack = new ArrayDeque<>();
	}	
	/** Constructs container filled with the given filters
	 * 
	 * @param f
	 */

	public ContainerFilter(Filter ... f) {
		this();
		Collections.addAll(this.stack, f);
	}

	@Override
	public InputPad<?> Input() {
		return this.getFirst().Input();
	}
	/** Gets the first filter in the stack
	 * 
	 * @return
	 */
	public Filter getFirst() {
		return stack.getFirst();
	}

	@Override
	public <T extends iFilter> T connectTo(T receiver) {
		return this.getLast().connectTo(receiver);
	}

	/** Gets the last filter in the stack
	 * 
	 * @return
	 */
	private Filter getLast() {
		return stack.getLast();
	}
	/** Appends a filter to the stack and connects it to the penultimate filter
	 * 
	 * @param f
	 */
	public void appendAndConnect(Filter f)
	{
		this.connectTo(f);
		this.append(f);
	}
	/** Appends a filter to the stack but does not connect it to the penultimate filter
	 * 
	 * @param f
	 */
	public void append(Filter f)
	{
		stack.addLast(f);
	}

	@Override
	public <T extends iFilter> T connectTo(T receiver, String outputPadName, String inputPadName) {
		return this.getLast().connectTo(receiver, outputPadName, inputPadName);
	}

	@Override
	public iFilter connectTo(String outputPadName, InputPad<?> pad) {
		return this.getLast().connectTo(outputPadName, pad);
	}

	@Override
	public void process() {
		this.getLast().process();
	}

	@Override
	public byte[] blit() {
		return this.getLast().blit();
	}

	@Override
	public OutputPad<?> Output() {
		return this.getLast().Output();
	}
	@Override
	public byte[] blit(String format_str) {
		return this.getLast().blit(format_str);
	}
	@Override
	public float[] blit_float() {
		return this.getLast().blit_float();
	}
	@Override
	public float[] blit_float(String format_str) {
		return this.getLast().blit_float(format_str);
	}
	@Override
	public short[] blit_short() {
		return this.getLast().blit_short();
	}
	@Override
	public short[] blit_short(String format_str) {
		return this.getLast().blit_short(format_str);
	}
	@Override
	public GeglRectangle getBoundingBox() {
		return this.getLast().getBoundingBox();
	}

}
