package com.jibee.gegl.filters.gegl;

import com.jibee.gegl.OutputPad;
import com.jibee.gegl.ParameterOutOfRangeException;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.InputPad;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * 
 *
 * Copies image performing lens distortion correction.
 * 
 * License: 
 * Supports OpenCL: false
 * Position Dependant: false
 */
@Filter(license="", opencl=false, position_dependant=false, categories={"blur"})
public class LensCorrect extends GeglFilter
{
    /** Constructs a .
     *
     * Copies image performing lens distortion correction.
     */
    public LensCorrect(GeglNode container)
    {
        super(container, "gegl:lens-correct");
    }
    /** Constructs a .
     *
     * Copies image performing lens distortion correction.
     */
    public LensCorrect(GeglFilter parent)
    {
        super(parent, "gegl:lens-correct");
    }

    
    /** Maker
     *
     * Write lens maker correctly
     *
     * Unit: 
     * Default value: "none"
     * Acceptable Range:  
     * */
    private String m_Maker  = "none";

    /** Maker
     *
     * Write lens maker correctly
     *
     * Unit: 
     * Default value: "none"
     * Acceptable Range:  
     */
    public LensCorrect setMaker(String value)
    {
	
        m_Maker = value;
        setProperty("maker", value);
        return this;
    }

    /** Maker
     *
     * Write lens maker correctly
     *
     * Unit: 
     * Default value: "none"
     * Acceptable Range:  
     */
    public String getMaker()
    {
        return m_Maker;
    }


    /** Camera
     *
     * Write camera name correctly
     *
     * Unit: 
     * Default value: "none"
     * Acceptable Range:  
     * */
    private String m_Camera  = "none";

    /** Camera
     *
     * Write camera name correctly
     *
     * Unit: 
     * Default value: "none"
     * Acceptable Range:  
     */
    public LensCorrect setCamera(String value)
    {
	
        m_Camera = value;
        setProperty("Camera", value);
        return this;
    }

    /** Camera
     *
     * Write camera name correctly
     *
     * Unit: 
     * Default value: "none"
     * Acceptable Range:  
     */
    public String getCamera()
    {
        return m_Camera;
    }


    /** Lens
     *
     * Write your lens model with uppercase letters
     *
     * Unit: 
     * Default value: "none"
     * Acceptable Range:  
     * */
    private String m_Lens  = "none";

    /** Lens
     *
     * Write your lens model with uppercase letters
     *
     * Unit: 
     * Default value: "none"
     * Acceptable Range:  
     */
    public LensCorrect setLens(String value)
    {
	
        m_Lens = value;
        setProperty("Lens", value);
        return this;
    }

    /** Lens
     *
     * Write your lens model with uppercase letters
     *
     * Unit: 
     * Default value: "none"
     * Acceptable Range:  
     */
    public String getLens()
    {
        return m_Lens;
    }


    /** Focal of the camera
     *
     * Calculate b value from focal
     *
     * Unit: 
     * Default value: 20.00
     * Acceptable Range: 0.00 300.00
     * */
    private double m_Focal  = 20.00;

    /** Focal of the camera
     *
     * Calculate b value from focal
     *
     * Unit: 
     * Default value: 20.00
     * Acceptable Range: 0.00 300.00
     */
    public LensCorrect setFocal(double value) throws ParameterOutOfRangeException
    {
		if(value > 300.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 300.00);
	}

        m_Focal = value;
        setProperty("focal", value);
        return this;
    }

    /** Focal of the camera
     *
     * Calculate b value from focal
     *
     * Unit: 
     * Default value: 20.00
     * Acceptable Range: 0.00 300.00
     */
    public double getFocal()
    {
        return m_Focal;
    }


    /** Center
     *
     * If you want center
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Center  = true;

    /** Center
     *
     * If you want center
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public LensCorrect setCenter(boolean value)
    {
	
        m_Center = value;
        setProperty("center", value);
        return this;
    }

    /** Center
     *
     * If you want center
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getCenter()
    {
        return m_Center;
    }


    /** Lens center X
     *
     * Coordinates of lens center
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Cx ;

    /** Lens center X
     *
     * Coordinates of lens center
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public LensCorrect setCx(int value)
    {
	
        m_Cx = value;
        setProperty("cx", value);
        return this;
    }

    /** Lens center X
     *
     * Coordinates of lens center
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public int getCx()
    {
        return m_Cx;
    }


    /** Lens center Y
     *
     * Coordinates of lens center
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     * */
    private int m_Cy ;

    /** Lens center Y
     *
     * Coordinates of lens center
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public LensCorrect setCy(int value)
    {
	
        m_Cy = value;
        setProperty("cy", value);
        return this;
    }

    /** Lens center Y
     *
     * Coordinates of lens center
     *
     * Unit: 
     * Default value: 
     * Acceptable Range:  
     */
    public int getCy()
    {
        return m_Cy;
    }


    /** Scale
     *
     * Scale of the image
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 10.00
     * */
    private double m_Rscale  = 0.50;

    /** Scale
     *
     * Scale of the image
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 10.00
     */
    public LensCorrect setRscale(double value) throws ParameterOutOfRangeException
    {
		if(value > 10.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 10.00);
	}

        m_Rscale = value;
        setProperty("rscale", value);
        return this;
    }

    /** Scale
     *
     * Scale of the image
     *
     * Unit: 
     * Default value: 0.50
     * Acceptable Range: 0.00 10.00
     */
    public double getRscale()
    {
        return m_Rscale;
    }


    /** Autocorrect d values
     *
     * Autocorrect D values for lens correction models.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     * */
    private boolean m_Correct  = true;

    /** Autocorrect d values
     *
     * Autocorrect D values for lens correction models.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public LensCorrect setCorrect(boolean value)
    {
	
        m_Correct = value;
        setProperty("correct", value);
        return this;
    }

    /** Autocorrect d values
     *
     * Autocorrect D values for lens correction models.
     *
     * Unit: 
     * Default value: true
     * Acceptable Range:  
     */
    public boolean getCorrect()
    {
        return m_Correct;
    }


    /** Model red a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_RedA  = 0.00;

    /** Model red a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setRedA(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_RedA = value;
        setProperty("red-a", value);
        return this;
    }

    /** Model red a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getRedA()
    {
        return m_RedA;
    }


    /** Model red b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_RedB  = 0.00;

    /** Model red b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setRedB(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_RedB = value;
        setProperty("red-b", value);
        return this;
    }

    /** Model red b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getRedB()
    {
        return m_RedB;
    }


    /** Model red c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_RedC  = 0.00;

    /** Model red c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setRedC(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_RedC = value;
        setProperty("red-c", value);
        return this;
    }

    /** Model red c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getRedC()
    {
        return m_RedC;
    }


    /** Model red d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     * */
    private double m_RedD  = 1.00;

    /** Model red d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public LensCorrect setRedD(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 2.00);
	}

        m_RedD = value;
        setProperty("red-d", value);
        return this;
    }

    /** Model red d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public double getRedD()
    {
        return m_RedD;
    }


    /** Model green a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_GreenA  = 0.00;

    /** Model green a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setGreenA(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_GreenA = value;
        setProperty("green-a", value);
        return this;
    }

    /** Model green a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getGreenA()
    {
        return m_GreenA;
    }


    /** Model green b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_GreenB  = 0.00;

    /** Model green b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setGreenB(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_GreenB = value;
        setProperty("green-b", value);
        return this;
    }

    /** Model green b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getGreenB()
    {
        return m_GreenB;
    }


    /** Model green c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_GreenC  = 0.00;

    /** Model green c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setGreenC(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_GreenC = value;
        setProperty("green-c", value);
        return this;
    }

    /** Model green c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getGreenC()
    {
        return m_GreenC;
    }


    /** Model green d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     * */
    private double m_GreenD  = 1.00;

    /** Model green d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public LensCorrect setGreenD(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 2.00);
	}

        m_GreenD = value;
        setProperty("green-d", value);
        return this;
    }

    /** Model green d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public double getGreenD()
    {
        return m_GreenD;
    }


    /** Model blue a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_BlueA  = 0.00;

    /** Model blue a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setBlueA(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_BlueA = value;
        setProperty("blue-a", value);
        return this;
    }

    /** Model blue a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getBlueA()
    {
        return m_BlueA;
    }


    /** Model blue b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_BlueB  = 0.00;

    /** Model blue b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setBlueB(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_BlueB = value;
        setProperty("blue-b", value);
        return this;
    }

    /** Model blue b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getBlueB()
    {
        return m_BlueB;
    }


    /** Model blue c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_BlueC  = 0.00;

    /** Model blue c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setBlueC(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_BlueC = value;
        setProperty("blue-c", value);
        return this;
    }

    /** Model blue c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getBlueC()
    {
        return m_BlueC;
    }


    /** Model blue d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     * */
    private double m_BlueD  = 1.00;

    /** Model blue d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public LensCorrect setBlueD(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 2.00);
	}

        m_BlueD = value;
        setProperty("blue-d", value);
        return this;
    }

    /** Model blue d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public double getBlueD()
    {
        return m_BlueD;
    }


    /** Model alpha a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_AlphaA  = 0.00;

    /** Model alpha a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setAlphaA(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_AlphaA = value;
        setProperty("alpha-a", value);
        return this;
    }

    /** Model alpha a
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getAlphaA()
    {
        return m_AlphaA;
    }


    /** Model alpha b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_AlphaB  = 0.00;

    /** Model alpha b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setAlphaB(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_AlphaB = value;
        setProperty("alpha-b", value);
        return this;
    }

    /** Model alpha b
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getAlphaB()
    {
        return m_AlphaB;
    }


    /** Model alpha c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     * */
    private double m_AlphaC  = 0.00;

    /** Model alpha c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public LensCorrect setAlphaC(double value) throws ParameterOutOfRangeException
    {
		if(value > 1.00 || value < -1.00)
	{
	    throw new ParameterOutOfRangeException(value, -1.00, 1.00);
	}

        m_AlphaC = value;
        setProperty("alpha-c", value);
        return this;
    }

    /** Model alpha c
     *
     * 
     *
     * Unit: 
     * Default value: 0.00
     * Acceptable Range: -1.00 1.00
     */
    public double getAlphaC()
    {
        return m_AlphaC;
    }


    /** Model alpha d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     * */
    private double m_AlphaD  = 1.00;

    /** Model alpha d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public LensCorrect setAlphaD(double value) throws ParameterOutOfRangeException
    {
		if(value > 2.00 || value < 0.00)
	{
	    throw new ParameterOutOfRangeException(value, 0.00, 2.00);
	}

        m_AlphaD = value;
        setProperty("alpha-d", value);
        return this;
    }

    /** Model alpha d
     *
     * 
     *
     * Unit: 
     * Default value: 1.00
     * Acceptable Range: 0.00 2.00
     */
    public double getAlphaD()
    {
        return m_AlphaD;
    }

    public InputPad input()
    {
        return new InputPad(this, "input");
    }
    public OutputPad output()
    {
        return new OutputPad(this, "output");
    }

}

