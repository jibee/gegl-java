package com.jibee.deratiseur.web;

import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WLength;
import eu.webtoolkit.jwt.WLength.Unit;
import eu.webtoolkit.jwt.WMenu;
import eu.webtoolkit.jwt.WNavigationBar;

public class MenuBar extends WNavigationBar {

	public MenuBar(WContainerWidget root) {
		super(root);
		WMenu leftMenu = new WMenu();
		addMenu(leftMenu);
		leftMenu.addItem("File");
		leftMenu.addItem("Edit");
		leftMenu.addItem("View");
		leftMenu.addItem("Images");
		leftMenu.addItem("Stack");
		leftMenu.addItem("Metadata");
		
		setHeight(new WLength(25, Unit.Pixel));
		
	}

	public MenuBar() {
		this(null);
	}

}
