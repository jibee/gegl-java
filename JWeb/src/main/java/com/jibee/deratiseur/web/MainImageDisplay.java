package com.jibee.deratiseur.web;

import java.util.List;

import com.jibee.deratiseur.web.model.IImage;
import com.jibee.deratiseur.web.model.IImageCollectionModel;
import com.jibee.deratiseur.web.model.ISelectableImageCollectionModel;

import eu.webtoolkit.jwt.Signal1;
import eu.webtoolkit.jwt.Signal1.Listener;
import eu.webtoolkit.jwt.WContainerWidget;

public class MainImageDisplay extends WContainerWidget {
	public MainImageDisplay() {
		addStyleClass("well");
		setLayoutSizeAware(true);
	}

	public void setModel(ISelectableImageCollectionModel arg) {
		IImageCollectionModel display = arg.getSelection();
		setModel(display);
	}

	private void setModel(IImageCollectionModel display) {
		// TODO 
	}

	public void listenToSelectionChange(Signal1<List<IImage>> selectionUpdated) {
		selectionUpdated.addListener(this, new Listener<List<IImage>>() {

			@Override
			public void trigger(List<IImage> arg) {
				displayImages(arg);
			}
		});
	}

	protected void displayImages(List<IImage> arg) {
		clear();
		addWidget(new FullSizeImageDisplay(arg.get(0)));
	}
	
	@Override
	protected void layoutSizeChanged(int width, int height) {
		super.layoutSizeChanged(width, height);
		if(!getChildren().isEmpty())
		{
			getChildren().get(0).resize(width, height);
		}
	}
}
