package com.jibee.deratiseur.web;

import com.jibee.deratiseur.web.model.IImageCollectionModel;
import com.jibee.deratiseur.web.model.ISelectableImageCollectionModel;

import eu.webtoolkit.jwt.WContainerWidget;

public class MainImageDisplay extends WContainerWidget {
	public MainImageDisplay() {
		addStyleClass("well");
	}

	public void setModel(ISelectableImageCollectionModel arg) {
		IImageCollectionModel display = arg.getSelection();
		setModel(display);
	}

	private void setModel(IImageCollectionModel display) {
		// TODO 
	}
}
