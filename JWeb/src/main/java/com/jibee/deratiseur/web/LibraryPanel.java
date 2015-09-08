package com.jibee.deratiseur.web;

import com.jibee.deratiseur.web.model.UserLibrary;
import com.jibee.deratiseur.web.model.iFolder;

import eu.webtoolkit.jwt.Signal1;
import eu.webtoolkit.jwt.Signal2.Listener;
import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WModelIndex;
import eu.webtoolkit.jwt.WMouseEvent;
import eu.webtoolkit.jwt.WTreeView;

/** Library browsing panel (left hand side) */
public class LibraryPanel extends WContainerWidget {
	
	private WTreeView m_treeView;
	private Signal1<iFolder> m_folderSelected;

	public LibraryPanel()
	{
		this(null);
	}
	public LibraryPanel(WContainerWidget parent)
	{
		super(parent);
		m_treeView = new WTreeView(this);
		m_treeView.setSortingEnabled(false);
		m_treeView.clicked().addListener(this,new Listener<WModelIndex, WMouseEvent>() {

			@Override
			public void trigger(WModelIndex arg1, WMouseEvent arg2) {
				notifySelectionChange((iFolder)arg1.getData(UserLibrary.ObjectRole));
			}
		});
	}
	
	public Signal1<iFolder> folderSelected(){
		if(null==m_folderSelected)
			m_folderSelected = new Signal1<iFolder>();
		return m_folderSelected;
	}

	protected void notifySelectionChange(iFolder f) {
		folderSelected().trigger(f);		
	}
	public void openLibrary(UserLibrary userLibrary) {
		m_treeView.setModel(userLibrary);
		
	}

}
