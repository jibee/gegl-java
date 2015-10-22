package com.jibee.deratiseur.web;

import com.jibee.deratiseur.web.model.IImage;

import eu.webtoolkit.jwt.WCompositeWidget;
import eu.webtoolkit.jwt.WImage;
import eu.webtoolkit.jwt.WLink;

public class Thumbnail extends WCompositeWidget {

	public Thumbnail(IImage image) {
		WLink link = image.getResourceLink(IImage.RenderSize.Thumbnail);
		WImage img = new WImage(link, image.getFilename());
		setImplementation(img);
	}

}
