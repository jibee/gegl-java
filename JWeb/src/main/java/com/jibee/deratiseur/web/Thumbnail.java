package com.jibee.deratiseur.web;

import com.jibee.deratiseur.web.model.IImage;

import eu.webtoolkit.jwt.WCompositeWidget;
import eu.webtoolkit.jwt.WFileResource;
import eu.webtoolkit.jwt.WImage;
import eu.webtoolkit.jwt.WText;

public class Thumbnail extends WCompositeWidget {

	public Thumbnail(IImage image) {
		setImplementation(new WText(image.getFilename()));
	}

}
