package com.jibee.deratiseur.web;

import com.jibee.deratiseur.web.model.ISelectableImageCollectionModel;

import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WLength;
import eu.webtoolkit.jwt.WText;
import eu.webtoolkit.jwt.WVBoxLayout;
import eu.webtoolkit.jwt.WLength.Unit;

public class MainView extends WContainerWidget {

	private CollectionDisplay m_collectionDisplay;
	private MainImageDisplay m_mainImageDisplay;

	public MainView(WContainerWidget root) {
		super(root);
		addWidget(new WText("Main view"));
		WVBoxLayout layout = new WVBoxLayout();
		setLayout(layout);
		m_mainImageDisplay = new MainImageDisplay();
		layout.addWidget(m_mainImageDisplay);
		m_collectionDisplay = new CollectionDisplay();
		layout.addWidget(m_collectionDisplay);
		layout.setResizable(0, true, new WLength(80, Unit.Percentage));
		m_mainImageDisplay.listenToSelectionChange(m_collectionDisplay.selectionUpdated());
	}

	public MainView() {
		this(null);
	}

	public void selectCollection(ISelectableImageCollectionModel arg) {
		m_collectionDisplay.setModel(arg);
		m_mainImageDisplay.setModel(arg);
	}

}
