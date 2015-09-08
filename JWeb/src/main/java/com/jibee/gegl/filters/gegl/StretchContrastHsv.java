package com.jibee.gegl.filters.gegl;
import com.jibee.gegl.GeglFilter;
import com.jibee.gegl.GeglNode;

/**
Stretch Contrast HSV

Scales the components of the buffer to be in the 0.0-1.0 range. This improves images that make poor use of the available contrast (little contrast, very dark, or very bright images). This version differs from Contrast Autostretch in that it works in HSV scpace, and preserves hue.

License: 
Supports OpenCL: 
Position Dependant: 
*/
public class StretchContrastHsv extends GeglFilter
{
/** Constructs a Stretch Contrast HSV.

Scales the components of the buffer to be in the 0.0-1.0 range. This improves images that make poor use of the available contrast (little contrast, very dark, or very bright images). This version differs from Contrast Autostretch in that it works in HSV scpace, and preserves hue.
*/
    public StretchContrastHsv(GeglNode container)
    {
        super(container, "gegl:stretch-contrast-hsv");
    }
/** Constructs a Stretch Contrast HSV.

Scales the components of the buffer to be in the 0.0-1.0 range. This improves images that make poor use of the available contrast (little contrast, very dark, or very bright images). This version differs from Contrast Autostretch in that it works in HSV scpace, and preserves hue.
*/
    public StretchContrastHsv(GeglFilter parent)
    {
        super(parent, "gegl:stretch-contrast-hsv");
    }

    
}

