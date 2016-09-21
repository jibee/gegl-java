package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Sink;
import com.jibee.gegl.Source;

/**
 * Ink Simulator
 *
 * Spectral ink and paint simulator, for softproofing/simulating physical color mixing and interactions.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"misc"})
public class InkSimulator extends GeglFilter implements Source, Sink
{
    /** Constructs a Ink Simulator.
     *
     * Spectral ink and paint simulator, for softproofing/simulating physical color mixing and interactions.
     */
    public InkSimulator(GeglNode container)
    {
        super(container, "gegl:ink-simulator");
    }
    /** Constructs a Ink Simulator.
     *
     * Spectral ink and paint simulator, for softproofing/simulating physical color mixing and interactions.
     */
    public InkSimulator(GeglFilter parent)
    {
        super(parent, "gegl:ink-simulator");
    }

    
    /** Ink configuration
     *
     * Textual desciption of inks used for simulated print-job
     *
     * Unit: 
     * Default value: "\n"+
"substrate=white\n"+
"black=rgb 0 0 0\n"+
"ink1=black\n"+
"ink2=red\n"+
"ink2.black=black\n"+
"\n"+
""
     * Acceptable Range:  
     * */
    private String m_Config  = "\n"+
"substrate=white\n"+
"black=rgb 0 0 0\n"+
"ink1=black\n"+
"ink2=red\n"+
"ink2.black=black\n"+
"\n"+
"";

    /** Ink configuration
     *
     * Textual desciption of inks used for simulated print-job
     *
     * Unit: 
     * Default value: "\n"+
"substrate=white\n"+
"black=rgb 0 0 0\n"+
"ink1=black\n"+
"ink2=red\n"+
"ink2.black=black\n"+
"\n"+
""
     * Acceptable Range:  
     */
    public InkSimulator setConfig(String value)
    {
	
        m_Config = value;
        setProperty("config", value);
        return this;
    }

    /** Ink configuration
     *
     * Textual desciption of inks used for simulated print-job
     *
     * Unit: 
     * Default value: "\n"+
"substrate=white\n"+
"black=rgb 0 0 0\n"+
"ink1=black\n"+
"ink2=red\n"+
"ink2.black=black\n"+
"\n"+
""
     * Acceptable Range:  
     */
    public String getConfig()
    {
        return m_Config;
    }


    /** Mode
     *
     * how the ink simulator is used
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Mode ;

    /** Mode
     *
     * how the ink simulator is used
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public InkSimulator setMode(String value)
    {
	
        m_Mode = value;
        setProperty("mode", value);
        return this;
    }

    /** Mode
     *
     * how the ink simulator is used
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getMode()
    {
        return m_Mode;
    }


    /** Debug width
     *
     * how wide peel off bands for ink order vis
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  150
     * */
    private int m_DebugWidth ;

    /** Debug width
     *
     * how wide peel off bands for ink order vis
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  150
     */
    public InkSimulator setDebugWidth(int value) throws ParameterOutOfRangeException
    {
		if(value > 150)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, 150);
	}

        m_DebugWidth = value;
        setProperty("debug-width", value);
        return this;
    }

    /** Debug width
     *
     * how wide peel off bands for ink order vis
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  150
     */
    public int getDebugWidth()
    {
        return m_DebugWidth;
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

