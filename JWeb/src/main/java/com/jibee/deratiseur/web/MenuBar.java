package com.jibee.deratiseur.web;

import eu.webtoolkit.jwt.Signal;
import eu.webtoolkit.jwt.Signal2;

import java.io.File;

import com.jibee.deratiseur.web.MenuBar.DirectoryImportOptions;

import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WLength;
import eu.webtoolkit.jwt.WLength.Unit;
import eu.webtoolkit.jwt.WMenu;
import eu.webtoolkit.jwt.WMenuItem;
import eu.webtoolkit.jwt.WNavigationBar;

public class MenuBar extends WNavigationBar {

	public class DirectoryImportOptions {

		private boolean m_recursive;

		public void setRecursive(boolean b) {
			m_recursive = b;
		}

		public boolean isRecursive() {
			return m_recursive;
		}

	}

	private Signal2<File, DirectoryImportOptions> m_importDirectory;

	public MenuBar(WContainerWidget root) {
		super(root);
		WMenu leftMenu = new WMenu();
		addMenu(leftMenu);
		populateFileMenu(leftMenu);
		leftMenu.addItem("Edit");
		leftMenu.addItem("View");
		leftMenu.addItem("Images");
		leftMenu.addItem("Stack");
		leftMenu.addItem("Metadata");

		setHeight(new WLength(25, Unit.Pixel));

	}

	private void populateFileMenu(WMenu leftMenu) {
		WMenuItem mainMenu = leftMenu.addItem("File");
		mainMenu.setMenu(new WMenu());
		WMenuItem importDirectory = mainMenu.getMenu().addItem("Import directory...");
		importDirectory.clicked().addListener(this,  new Signal.Listener() {
			@Override
			public void trigger() {
				importDirectoryMenuClicked();
			}
		});
	}

	protected void importDirectoryMenuClicked() {
		DirectoryImportOptions options = new DirectoryImportOptions();
		options.setRecursive(true);
		importDirectory().trigger(new File("/home/jibee/Images"), options);
	}
	/** Signal triggered when the user selected a directory for import into the active project
	 * 
	 * @return
	 */
	public Signal2<File, DirectoryImportOptions> importDirectory()
	{
		if(null==m_importDirectory)
			m_importDirectory=new Signal2<>();
		return m_importDirectory;	
	}

	public MenuBar() {
		this(null);
	}

}
