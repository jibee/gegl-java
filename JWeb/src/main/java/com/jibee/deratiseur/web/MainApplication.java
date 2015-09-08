package com.jibee.deratiseur.web;

import com.jibee.deratiseur.web.model.IImageCollectionModel;
import com.jibee.deratiseur.web.model.ISelectableImageCollectionModel;
import com.jibee.deratiseur.web.model.UserLibrary;

import eu.webtoolkit.jwt.PositionScheme;
import eu.webtoolkit.jwt.Side;
import eu.webtoolkit.jwt.Signal1;
import eu.webtoolkit.jwt.WApplication;
import eu.webtoolkit.jwt.WBootstrapTheme;
import eu.webtoolkit.jwt.WBorderLayout;
import eu.webtoolkit.jwt.WBorderLayout.Position;
import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WBootstrapTheme.Version;
import eu.webtoolkit.jwt.WEnvironment;
import eu.webtoolkit.jwt.WGridLayout;
import eu.webtoolkit.jwt.WHBoxLayout;
import eu.webtoolkit.jwt.WLayout;
import eu.webtoolkit.jwt.WLength;
import eu.webtoolkit.jwt.WLength.Unit;
import eu.webtoolkit.jwt.WLink;
import eu.webtoolkit.jwt.WVBoxLayout;

public class MainApplication extends WApplication {

	private MenuBar m_topMenu;
	private TopToolbar m_topTools;
	private InspectorPanel m_inspector;
	private MainView m_main;

	public MainApplication(WEnvironment env) {
		super(env);
		WBootstrapTheme theme = new WBootstrapTheme();
		theme.setVersion(Version.Version3);
		setTheme(theme);
		useStyleSheet(new WLink("assets/theme.min.css"));
		useStyleSheet(new WLink("assets/css/font-awesome.min.css"));
		getRoot().setHeight(new WLength(100, Unit.Percentage));
		WVBoxLayout layout = new WVBoxLayout(getRoot());
		layout.setContentsMargins(0, 0, 0, 0);
		m_topMenu = new MenuBar();
		m_topMenu.setMargin(0);
		layout.addWidget(m_topMenu);
		layout.setSpacing(0);
		m_topTools = new TopToolbar();
		layout.addWidget(m_topTools);
		
		WGridLayout sublayout = new WGridLayout();
		layout.addLayout(sublayout, 1);
		m_inspector = new InspectorPanel();
		sublayout.addWidget(m_inspector, 0, 0);
		m_main = new MainView();
		sublayout.addWidget(m_main, 0, 1);

		m_inspector.collectionSelected().addListener(this, new Signal1.Listener<ISelectableImageCollectionModel>() {
			public void trigger(ISelectableImageCollectionModel arg) {
				m_main.selectCollection(arg);
			}
		});

		sublayout.setColumnResizable(0, true, new WLength(20, Unit.Percentage));
		sublayout.setColumnStretch(1, 1);
		
		// Load the initial workspace
		loadInitialWorkspace();
	}

	private void loadInitialWorkspace() {
		m_inspector.openLibrary(new UserLibrary());		
	}

}
