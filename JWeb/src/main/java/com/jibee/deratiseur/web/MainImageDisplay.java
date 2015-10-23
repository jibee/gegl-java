package com.jibee.deratiseur.web;

import java.util.List;

import com.jibee.deratiseur.web.model.IImage;
import com.jibee.deratiseur.web.model.IImageCollectionModel;
import com.jibee.deratiseur.web.model.ISelectableImageCollectionModel;

import eu.webtoolkit.jwt.AlignmentFlag;
import eu.webtoolkit.jwt.Signal1;
import eu.webtoolkit.jwt.Signal1.Listener;
import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WLength;

public class MainImageDisplay extends WContainerWidget {
	private int m_actual_width;
	private int m_actual_height;

	public MainImageDisplay() {
		addStyleClass("well");
		setLayoutSizeAware(true);
		setMargin(0);
		setPadding(new WLength(0));
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
		setContentAlignment(AlignmentFlag.AlignCenter);
		FullSizeImageDisplay img = new FullSizeImageDisplay(arg.get(0));
		addWidget(img);
		img.resize(m_actual_width, m_actual_height);
	}
	
	@Override
	protected void layoutSizeChanged(int width, int height) {
		super.layoutSizeChanged(width, height);
		m_actual_width = width;
		m_actual_height = height;
		if(!getChildren().isEmpty())
		{
			getChildren().get(0).resize(m_actual_width, m_actual_height);
		}
	}
}
