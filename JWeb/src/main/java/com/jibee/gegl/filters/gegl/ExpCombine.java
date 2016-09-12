package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.Source;

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
public class ExpCombine extends GeglFilter implements Source
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

    public InputPad Exposure99()
    {
        return new InputPad(this, "exposure-99");
    }

    public InputPad Exposure98()
    {
        return new InputPad(this, "exposure-98");
    }

    public InputPad Exposure97()
    {
        return new InputPad(this, "exposure-97");
    }

    public InputPad Exposure96()
    {
        return new InputPad(this, "exposure-96");
    }

    public InputPad Exposure95()
    {
        return new InputPad(this, "exposure-95");
    }

    public InputPad Exposure94()
    {
        return new InputPad(this, "exposure-94");
    }

    public InputPad Exposure93()
    {
        return new InputPad(this, "exposure-93");
    }

    public InputPad Exposure92()
    {
        return new InputPad(this, "exposure-92");
    }

    public InputPad Exposure91()
    {
        return new InputPad(this, "exposure-91");
    }

    public InputPad Exposure90()
    {
        return new InputPad(this, "exposure-90");
    }

    public InputPad Exposure89()
    {
        return new InputPad(this, "exposure-89");
    }

    public InputPad Exposure88()
    {
        return new InputPad(this, "exposure-88");
    }

    public InputPad Exposure87()
    {
        return new InputPad(this, "exposure-87");
    }

    public InputPad Exposure86()
    {
        return new InputPad(this, "exposure-86");
    }

    public InputPad Exposure85()
    {
        return new InputPad(this, "exposure-85");
    }

    public InputPad Exposure84()
    {
        return new InputPad(this, "exposure-84");
    }

    public InputPad Exposure83()
    {
        return new InputPad(this, "exposure-83");
    }

    public InputPad Exposure82()
    {
        return new InputPad(this, "exposure-82");
    }

    public InputPad Exposure81()
    {
        return new InputPad(this, "exposure-81");
    }

    public InputPad Exposure80()
    {
        return new InputPad(this, "exposure-80");
    }

    public InputPad Exposure79()
    {
        return new InputPad(this, "exposure-79");
    }

    public InputPad Exposure78()
    {
        return new InputPad(this, "exposure-78");
    }

    public InputPad Exposure77()
    {
        return new InputPad(this, "exposure-77");
    }

    public InputPad Exposure76()
    {
        return new InputPad(this, "exposure-76");
    }

    public InputPad Exposure75()
    {
        return new InputPad(this, "exposure-75");
    }

    public InputPad Exposure74()
    {
        return new InputPad(this, "exposure-74");
    }

    public InputPad Exposure73()
    {
        return new InputPad(this, "exposure-73");
    }

    public InputPad Exposure72()
    {
        return new InputPad(this, "exposure-72");
    }

    public InputPad Exposure71()
    {
        return new InputPad(this, "exposure-71");
    }

    public InputPad Exposure70()
    {
        return new InputPad(this, "exposure-70");
    }

    public InputPad Exposure69()
    {
        return new InputPad(this, "exposure-69");
    }

    public InputPad Exposure68()
    {
        return new InputPad(this, "exposure-68");
    }

    public InputPad Exposure67()
    {
        return new InputPad(this, "exposure-67");
    }

    public InputPad Exposure66()
    {
        return new InputPad(this, "exposure-66");
    }

    public InputPad Exposure65()
    {
        return new InputPad(this, "exposure-65");
    }

    public InputPad Exposure64()
    {
        return new InputPad(this, "exposure-64");
    }

    public InputPad Exposure63()
    {
        return new InputPad(this, "exposure-63");
    }

    public InputPad Exposure62()
    {
        return new InputPad(this, "exposure-62");
    }

    public InputPad Exposure61()
    {
        return new InputPad(this, "exposure-61");
    }

    public InputPad Exposure60()
    {
        return new InputPad(this, "exposure-60");
    }

    public InputPad Exposure59()
    {
        return new InputPad(this, "exposure-59");
    }

    public InputPad Exposure58()
    {
        return new InputPad(this, "exposure-58");
    }

    public InputPad Exposure57()
    {
        return new InputPad(this, "exposure-57");
    }

    public InputPad Exposure56()
    {
        return new InputPad(this, "exposure-56");
    }

    public InputPad Exposure55()
    {
        return new InputPad(this, "exposure-55");
    }

    public InputPad Exposure54()
    {
        return new InputPad(this, "exposure-54");
    }

    public InputPad Exposure53()
    {
        return new InputPad(this, "exposure-53");
    }

    public InputPad Exposure52()
    {
        return new InputPad(this, "exposure-52");
    }

    public InputPad Exposure51()
    {
        return new InputPad(this, "exposure-51");
    }

    public InputPad Exposure50()
    {
        return new InputPad(this, "exposure-50");
    }

    public InputPad Exposure49()
    {
        return new InputPad(this, "exposure-49");
    }

    public InputPad Exposure48()
    {
        return new InputPad(this, "exposure-48");
    }

    public InputPad Exposure47()
    {
        return new InputPad(this, "exposure-47");
    }

    public InputPad Exposure46()
    {
        return new InputPad(this, "exposure-46");
    }

    public InputPad Exposure45()
    {
        return new InputPad(this, "exposure-45");
    }

    public InputPad Exposure44()
    {
        return new InputPad(this, "exposure-44");
    }

    public InputPad Exposure43()
    {
        return new InputPad(this, "exposure-43");
    }

    public InputPad Exposure42()
    {
        return new InputPad(this, "exposure-42");
    }

    public InputPad Exposure41()
    {
        return new InputPad(this, "exposure-41");
    }

    public InputPad Exposure40()
    {
        return new InputPad(this, "exposure-40");
    }

    public InputPad Exposure39()
    {
        return new InputPad(this, "exposure-39");
    }

    public InputPad Exposure38()
    {
        return new InputPad(this, "exposure-38");
    }

    public InputPad Exposure37()
    {
        return new InputPad(this, "exposure-37");
    }

    public InputPad Exposure36()
    {
        return new InputPad(this, "exposure-36");
    }

    public InputPad Exposure35()
    {
        return new InputPad(this, "exposure-35");
    }

    public InputPad Exposure34()
    {
        return new InputPad(this, "exposure-34");
    }

    public InputPad Exposure33()
    {
        return new InputPad(this, "exposure-33");
    }

    public InputPad Exposure32()
    {
        return new InputPad(this, "exposure-32");
    }

    public InputPad Exposure31()
    {
        return new InputPad(this, "exposure-31");
    }

    public InputPad Exposure30()
    {
        return new InputPad(this, "exposure-30");
    }

    public InputPad Exposure29()
    {
        return new InputPad(this, "exposure-29");
    }

    public InputPad Exposure28()
    {
        return new InputPad(this, "exposure-28");
    }

    public InputPad Exposure27()
    {
        return new InputPad(this, "exposure-27");
    }

    public InputPad Exposure26()
    {
        return new InputPad(this, "exposure-26");
    }

    public InputPad Exposure25()
    {
        return new InputPad(this, "exposure-25");
    }

    public InputPad Exposure24()
    {
        return new InputPad(this, "exposure-24");
    }

    public InputPad Exposure23()
    {
        return new InputPad(this, "exposure-23");
    }

    public InputPad Exposure22()
    {
        return new InputPad(this, "exposure-22");
    }

    public InputPad Exposure21()
    {
        return new InputPad(this, "exposure-21");
    }

    public InputPad Exposure20()
    {
        return new InputPad(this, "exposure-20");
    }

    public InputPad Exposure19()
    {
        return new InputPad(this, "exposure-19");
    }

    public InputPad Exposure18()
    {
        return new InputPad(this, "exposure-18");
    }

    public InputPad Exposure17()
    {
        return new InputPad(this, "exposure-17");
    }

    public InputPad Exposure16()
    {
        return new InputPad(this, "exposure-16");
    }

    public InputPad Exposure15()
    {
        return new InputPad(this, "exposure-15");
    }

    public InputPad Exposure14()
    {
        return new InputPad(this, "exposure-14");
    }

    public InputPad Exposure13()
    {
        return new InputPad(this, "exposure-13");
    }

    public InputPad Exposure12()
    {
        return new InputPad(this, "exposure-12");
    }

    public InputPad Exposure11()
    {
        return new InputPad(this, "exposure-11");
    }

    public InputPad Exposure10()
    {
        return new InputPad(this, "exposure-10");
    }

    public InputPad Exposure9()
    {
        return new InputPad(this, "exposure-9");
    }

    public InputPad Exposure8()
    {
        return new InputPad(this, "exposure-8");
    }

    public InputPad Exposure7()
    {
        return new InputPad(this, "exposure-7");
    }

    public InputPad Exposure6()
    {
        return new InputPad(this, "exposure-6");
    }

    public InputPad Exposure5()
    {
        return new InputPad(this, "exposure-5");
    }

    public InputPad Exposure4()
    {
        return new InputPad(this, "exposure-4");
    }

    public InputPad Exposure3()
    {
        return new InputPad(this, "exposure-3");
    }

    public InputPad Exposure2()
    {
        return new InputPad(this, "exposure-2");
    }

    public InputPad Exposure1()
    {
        return new InputPad(this, "exposure-1");
    }

    public InputPad Exposure0()
    {
        return new InputPad(this, "exposure-0");
    }
    @Override
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

