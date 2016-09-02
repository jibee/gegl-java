package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.Filter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;

/**
 * 
 *
 * Compares if input and aux buffers are different. Results are saved in the properties.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"programming"})
public class ImageCompare extends GeglFilter
{
    /** Constructs a .
     *
     * Compares if input and aux buffers are different. Results are saved in the properties.
     */
    public ImageCompare(GeglNode container)
    {
        super(container, "gegl:image-compare");
    }
    /** Constructs a .
     *
     * Compares if input and aux buffers are different. Results are saved in the properties.
     */
    public ImageCompare(GeglFilter parent)
    {
        super(parent, "gegl:image-compare");
    }

    
    /** Wrong pixels
     *
     * Number of differing pixels.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_WrongPixels ;

    /** Wrong pixels
     *
     * Number of differing pixels.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public ImageCompare setWrongPixels(int value)
    {
	
        m_WrongPixels = value;
        setProperty("wrong-pixels", value);
        return this;
    }

    /** Wrong pixels
     *
     * Number of differing pixels.
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public int getWrongPixels()
    {
        return m_WrongPixels;
    }


    /** Maximum difference
     *
     * Maximum difference between two pixels.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_MaxDiff  = 0.00;

    /** Maximum difference
     *
     * Maximum difference between two pixels.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ImageCompare setMaxDiff(double value)
    {
	
        m_MaxDiff = value;
        setProperty("max-diff", value);
        return this;
    }

    /** Maximum difference
     *
     * Maximum difference between two pixels.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getMaxDiff()
    {
        return m_MaxDiff;
    }


    /** Average difference (wrong)
     *
     * Average difference between wrong pixels.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_AvgDiffWrong  = 0.00;

    /** Average difference (wrong)
     *
     * Average difference between wrong pixels.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ImageCompare setAvgDiffWrong(double value)
    {
	
        m_AvgDiffWrong = value;
        setProperty("avg-diff-wrong", value);
        return this;
    }

    /** Average difference (wrong)
     *
     * Average difference between wrong pixels.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getAvgDiffWrong()
    {
        return m_AvgDiffWrong;
    }


    /** Average difference (total)
     *
     * Average difference between all pixels.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     * */
    private double m_AvgDiffTotal  = 0.00;

    /** Average difference (total)
     *
     * Average difference between all pixels.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public ImageCompare setAvgDiffTotal(double value)
    {
	
        m_AvgDiffTotal = value;
        setProperty("avg-diff-total", value);
        return this;
    }

    /** Average difference (total)
     *
     * Average difference between all pixels.
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range:  
     */
    public double getAvgDiffTotal()
    {
        return m_AvgDiffTotal;
    }

    public InputPad Aux()
    {
        return new InputPad(this, "aux");
    }

    public InputPad Input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad Output()
    {
        return new OutputPad(this, "output");
    }

}

