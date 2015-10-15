package com.jibee.deratiseur.web.model;

import eu.webtoolkit.jwt.WLink;

public interface IImage {

	enum RenderSize
	{
		Thumbnail,
		FullResolution
	}

	String getFilename();

	WLink getResourceLink(RenderSize thumbnail);

}
