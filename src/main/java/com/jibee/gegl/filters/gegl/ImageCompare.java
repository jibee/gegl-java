package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.CombiningFilter;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.annotations.GeglFilterOp;

/**
 * 
 *
 * Compares if input and aux buffers are different. Global statistics are saved in the properties and a visual difference image is produced as a visual result. 
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@GeglFilterOp(license="", opencl=false, position_dependant=false, categories={"programming"})
public class ImageCompare extends GeglFilter implements CombiningFilter
{
    /** Constructs a .
     *
     * Compares if input and aux buffers are different. Global statistics are saved in the properties and a visual difference image is produced as a visual result. 
     *
     * @param container container node
     */
    public ImageCompare(GeglNode container)
    {
        super(container, "gegl:image-compare");
    }
    /** Constructs a .
     *
     * Compares if input and aux buffers are different. Global statistics are saved in the properties and a visual difference image is produced as a visual result. 
     *
     * @param parent parent filter node
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
     *
     * @param value new value for Wrong pixels
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Wrong pixels
     * 
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
     *
     * @param value new value for Maximum difference
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Maximum difference
     * 
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
     *
     * @param value new value for Average difference (wrong)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Average difference (wrong)
     * 
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
     *
     * @param value new value for Average difference (total)
     * @return this filter (for chaining operations)
     * 
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
     *
     * @return value of Average difference (total)
     * 
     */
    public double getAvgDiffTotal()
    {
        return m_AvgDiffTotal;
    }

    @Override
    public InputPad<ImageCompare> Aux()
    {
        return new InputPad<>(this, "aux");
    }

    @Override
    public InputPad<ImageCompare> Input()
    {
        return new InputPad<>(this, "input");
    }
    @Override
    public OutputPad<ImageCompare> Output()
    {
        return new OutputPad<>(this, "output");
    }

}

