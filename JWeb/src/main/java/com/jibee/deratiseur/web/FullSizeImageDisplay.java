package com.jibee.deratiseur.web;

import com.jibee.deratiseur.web.model.IImage;

import eu.webtoolkit.jwt.WCompositeWidget;
import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WImage;
import eu.webtoolkit.jwt.WLength;
import eu.webtoolkit.jwt.WLength.Unit;
import eu.webtoolkit.jwt.WLink;

public class FullSizeImageDisplay extends WContainerWidget {

	private WImage m_img;

	public FullSizeImageDisplay(IImage image) {
		setPadding(new WLength(0));
		setMargin(0);
		WLink link = image.getResourceLink(IImage.RenderSize.FullResolution);
		m_img = new WImage(link, image.getFilename());
		addWidget(m_img);
	}
	@Override
	public void resize(WLength width, WLength height) {
		super.resize(width, height);
		m_img.setMaximumSize(width, height);
	}
}
