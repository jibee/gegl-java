package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * Combine Exposures
 *
 * Combine multiple scene exposures into one high dynamic range image.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"compositors"})
public class ExpCombine extends GeglFilter
{
    /** Constructs a Combine Exposures.
     *
     * Combine multiple scene exposures into one high dynamic range image.
     */
    public ExpCombine(GeglNode container)
    {
        super(container, "gegl:exp-combine");
    }
    /** Constructs a Combine Exposures.
     *
     * Combine multiple scene exposures into one high dynamic range image.
     */
    public ExpCombine(GeglFilter parent)
    {
        super(parent, "gegl:exp-combine");
    }

    
    /** Exposure values
     *
     * Relative brightness of each exposure in EV
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private String m_Exposures ;

    /** Exposure values
     *
     * Relative brightness of each exposure in EV
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public ExpCombine setExposures(String value)
    {
	
        m_Exposures = value;
        setProperty("exposures", value);
        return this;
    }

    /** Exposure values
     *
     * Relative brightness of each exposure in EV
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public String getExposures()
    {
        return m_Exposures;
    }


    /** Discretization bits
     *
     * Log2 of source's discretization steps
     *
     * Unit: 
     * Default value: 13
     * Acceptable Range: 8 32
     * */
    private int m_Steps  = 13;

    /** Discretization bits
     *
     * Log2 of source's discretization steps
     *
     * Unit: 
     * Default value: 13
     * Acceptable Range: 8 32
     */
    public ExpCombine setSteps(int value) throws ParameterOutOfRangeException
    {
		if(value > 32 || value < 8)
	{
	    throw new ParameterOutOfRangeException(value, 8, 32);
	}

        m_Steps = value;
        setProperty("steps", value);
        return this;
    }

    /** Discretization bits
     *
     * Log2 of source's discretization steps
     *
     * Unit: 
     * Default value: 13
     * Acceptable Range: 8 32
     */
    public int getSteps()
    {
        return m_Steps;
    }


    /** Weight sigma
     *
     * Weight distribution sigma controlling response contributions
     *
     * Unit: 
     * Default value: 8.00
     * Acceptable Range: 0.00 32.00
     * */
    private double m_Sigma  = 8.00;

    /** Weight sigma
     *
     * Weight distribution sigma controlling response contributions
     *
     * Unit: 
     * Default value: 8.00
     * Acceptable Range: 0.00 32.00
     */
    public ExpCombine setSigma(double value) throws ParameterOutOfRangeException
    {
		if(value > 32.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 32.00);
	}

        m_Sigma = value;
        setProperty("sigma", value);
        return this;
    }

    /** Weight sigma
     *
     * Weight distribution sigma controlling response contributions
     *
     * Unit: 
     * Default value: 8.00
     * Acceptable Range: 0.00 32.00
     */
    public double getSigma()
    {
        return m_Sigma;
    }

    public InputPad exposure-99()
    {
        return new InputPad(this, "exposure-99");
    }

    public InputPad exposure-98()
    {
        return new InputPad(this, "exposure-98");
    }

    public InputPad exposure-97()
    {
        return new InputPad(this, "exposure-97");
    }

    public InputPad exposure-96()
    {
        return new InputPad(this, "exposure-96");
    }

    public InputPad exposure-95()
    {
        return new InputPad(this, "exposure-95");
    }

    public InputPad exposure-94()
    {
        return new InputPad(this, "exposure-94");
    }

    public InputPad exposure-93()
    {
        return new InputPad(this, "exposure-93");
    }

    public InputPad exposure-92()
    {
        return new InputPad(this, "exposure-92");
    }

    public InputPad exposure-91()
    {
        return new InputPad(this, "exposure-91");
    }

    public InputPad exposure-90()
    {
        return new InputPad(this, "exposure-90");
    }

    public InputPad exposure-89()
    {
        return new InputPad(this, "exposure-89");
    }

    public InputPad exposure-88()
    {
        return new InputPad(this, "exposure-88");
    }

    public InputPad exposure-87()
    {
        return new InputPad(this, "exposure-87");
    }

    public InputPad exposure-86()
    {
        return new InputPad(this, "exposure-86");
    }

    public InputPad exposure-85()
    {
        return new InputPad(this, "exposure-85");
    }

    public InputPad exposure-84()
    {
        return new InputPad(this, "exposure-84");
    }

    public InputPad exposure-83()
    {
        return new InputPad(this, "exposure-83");
    }

    public InputPad exposure-82()
    {
        return new InputPad(this, "exposure-82");
    }

    public InputPad exposure-81()
    {
        return new InputPad(this, "exposure-81");
    }

    public InputPad exposure-80()
    {
        return new InputPad(this, "exposure-80");
    }

    public InputPad exposure-79()
    {
        return new InputPad(this, "exposure-79");
    }

    public InputPad exposure-78()
    {
        return new InputPad(this, "exposure-78");
    }

    public InputPad exposure-77()
    {
        return new InputPad(this, "exposure-77");
    }

    public InputPad exposure-76()
    {
        return new InputPad(this, "exposure-76");
    }

    public InputPad exposure-75()
    {
        return new InputPad(this, "exposure-75");
    }

    public InputPad exposure-74()
    {
        return new InputPad(this, "exposure-74");
    }

    public InputPad exposure-73()
    {
        return new InputPad(this, "exposure-73");
    }

    public InputPad exposure-72()
    {
        return new InputPad(this, "exposure-72");
    }

    public InputPad exposure-71()
    {
        return new InputPad(this, "exposure-71");
    }

    public InputPad exposure-70()
    {
        return new InputPad(this, "exposure-70");
    }

    public InputPad exposure-69()
    {
        return new InputPad(this, "exposure-69");
    }

    public InputPad exposure-68()
    {
        return new InputPad(this, "exposure-68");
    }

    public InputPad exposure-67()
    {
        return new InputPad(this, "exposure-67");
    }

    public InputPad exposure-66()
    {
        return new InputPad(this, "exposure-66");
    }

    public InputPad exposure-65()
    {
        return new InputPad(this, "exposure-65");
    }

    public InputPad exposure-64()
    {
        return new InputPad(this, "exposure-64");
    }

    public InputPad exposure-63()
    {
        return new InputPad(this, "exposure-63");
    }

    public InputPad exposure-62()
    {
        return new InputPad(this, "exposure-62");
    }

    public InputPad exposure-61()
    {
        return new InputPad(this, "exposure-61");
    }

    public InputPad exposure-60()
    {
        return new InputPad(this, "exposure-60");
    }

    public InputPad exposure-59()
    {
        return new InputPad(this, "exposure-59");
    }

    public InputPad exposure-58()
    {
        return new InputPad(this, "exposure-58");
    }

    public InputPad exposure-57()
    {
        return new InputPad(this, "exposure-57");
    }

    public InputPad exposure-56()
    {
        return new InputPad(this, "exposure-56");
    }

    public InputPad exposure-55()
    {
        return new InputPad(this, "exposure-55");
    }

    public InputPad exposure-54()
    {
        return new InputPad(this, "exposure-54");
    }

    public InputPad exposure-53()
    {
        return new InputPad(this, "exposure-53");
    }

    public InputPad exposure-52()
    {
        return new InputPad(this, "exposure-52");
    }

    public InputPad exposure-51()
    {
        return new InputPad(this, "exposure-51");
    }

    public InputPad exposure-50()
    {
        return new InputPad(this, "exposure-50");
    }

    public InputPad exposure-49()
    {
        return new InputPad(this, "exposure-49");
    }

    public InputPad exposure-48()
    {
        return new InputPad(this, "exposure-48");
    }

    public InputPad exposure-47()
    {
        return new InputPad(this, "exposure-47");
    }

    public InputPad exposure-46()
    {
        return new InputPad(this, "exposure-46");
    }

    public InputPad exposure-45()
    {
        return new InputPad(this, "exposure-45");
    }

    public InputPad exposure-44()
    {
        return new InputPad(this, "exposure-44");
    }

    public InputPad exposure-43()
    {
        return new InputPad(this, "exposure-43");
    }

    public InputPad exposure-42()
    {
        return new InputPad(this, "exposure-42");
    }

    public InputPad exposure-41()
    {
        return new InputPad(this, "exposure-41");
    }

    public InputPad exposure-40()
    {
        return new InputPad(this, "exposure-40");
    }

    public InputPad exposure-39()
    {
        return new InputPad(this, "exposure-39");
    }

    public InputPad exposure-38()
    {
        return new InputPad(this, "exposure-38");
    }

    public InputPad exposure-37()
    {
        return new InputPad(this, "exposure-37");
    }

    public InputPad exposure-36()
    {
        return new InputPad(this, "exposure-36");
    }

    public InputPad exposure-35()
    {
        return new InputPad(this, "exposure-35");
    }

    public InputPad exposure-34()
    {
        return new InputPad(this, "exposure-34");
    }

    public InputPad exposure-33()
    {
        return new InputPad(this, "exposure-33");
    }

    public InputPad exposure-32()
    {
        return new InputPad(this, "exposure-32");
    }

    public InputPad exposure-31()
    {
        return new InputPad(this, "exposure-31");
    }

    public InputPad exposure-30()
    {
        return new InputPad(this, "exposure-30");
    }

    public InputPad exposure-29()
    {
        return new InputPad(this, "exposure-29");
    }

    public InputPad exposure-28()
    {
        return new InputPad(this, "exposure-28");
    }

    public InputPad exposure-27()
    {
        return new InputPad(this, "exposure-27");
    }

    public InputPad exposure-26()
    {
        return new InputPad(this, "exposure-26");
    }

    public InputPad exposure-25()
    {
        return new InputPad(this, "exposure-25");
    }

    public InputPad exposure-24()
    {
        return new InputPad(this, "exposure-24");
    }

    public InputPad exposure-23()
    {
        return new InputPad(this, "exposure-23");
    }

    public InputPad exposure-22()
    {
        return new InputPad(this, "exposure-22");
    }

    public InputPad exposure-21()
    {
        return new InputPad(this, "exposure-21");
    }

    public InputPad exposure-20()
    {
        return new InputPad(this, "exposure-20");
    }

    public InputPad exposure-19()
    {
        return new InputPad(this, "exposure-19");
    }

    public InputPad exposure-18()
    {
        return new InputPad(this, "exposure-18");
    }

    public InputPad exposure-17()
    {
        return new InputPad(this, "exposure-17");
    }

    public InputPad exposure-16()
    {
        return new InputPad(this, "exposure-16");
    }

    public InputPad exposure-15()
    {
        return new InputPad(this, "exposure-15");
    }

    public InputPad exposure-14()
    {
        return new InputPad(this, "exposure-14");
    }

    public InputPad exposure-13()
    {
        return new InputPad(this, "exposure-13");
    }

    public InputPad exposure-12()
    {
        return new InputPad(this, "exposure-12");
    }

    public InputPad exposure-11()
    {
        return new InputPad(this, "exposure-11");
    }

    public InputPad exposure-10()
    {
        return new InputPad(this, "exposure-10");
    }

    public InputPad exposure-9()
    {
        return new InputPad(this, "exposure-9");
    }

    public InputPad exposure-8()
    {
        return new InputPad(this, "exposure-8");
    }

    public InputPad exposure-7()
    {
        return new InputPad(this, "exposure-7");
    }

    public InputPad exposure-6()
    {
        return new InputPad(this, "exposure-6");
    }

    public InputPad exposure-5()
    {
        return new InputPad(this, "exposure-5");
    }

    public InputPad exposure-4()
    {
        return new InputPad(this, "exposure-4");
    }

    public InputPad exposure-3()
    {
        return new InputPad(this, "exposure-3");
    }

    public InputPad exposure-2()
    {
        return new InputPad(this, "exposure-2");
    }

    public InputPad exposure-1()
    {
        return new InputPad(this, "exposure-1");
    }

    public InputPad exposure-0()
    {
        return new InputPad(this, "exposure-0");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

