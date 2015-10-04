package com.jibee.deratiseur.web;

import com.jibee.deratiseur.web.model.ISelectableImageCollectionModel;
import com.jibee.deratiseur.web.model.ImageCollection;
import com.jibee.deratiseur.web.model.MemorySelectableCollectionProxy;
import com.jibee.deratiseur.web.model.UserLibrary;
import com.jibee.deratiseur.web.model.iFolder;

import eu.webtoolkit.jwt.Signal1;
import eu.webtoolkit.jwt.Signal1.Listener;
import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WTabWidget;

public class InspectorPanel extends WTabWidget {

	private Signal1<ISelectableImageCollectionModel> m_collectionSelected;
	private LibraryPanel m_lp;
	private InfosPanel m_ip;
	private AdjustementsPanel m_ap;

	public InspectorPanel(WContainerWidget root) {
		super(root);
		m_lp = new LibraryPanel();
		addTab(m_lp, "Library", LoadPolicy.LazyLoading);
		m_ip = new InfosPanel();
		addTab(m_ip, "Infos", LoadPolicy.LazyLoading);
		m_ap = new AdjustementsPanel();
		addTab(m_ap, "Adjustments", LoadPolicy.LazyLoading);
		
	}

	public InspectorPanel() {
		this(null);
	}

	public void openLibrary(UserLibrary userLibrary) {
		m_lp.openLibrary(userLibrary);
		m_lp.folderSelected().addListener(this, new Listener<iFolder>() {

			@Override
			public void trigger(iFolder arg) {
				collectionSelected().trigger(new MemorySelectableCollectionProxy(new ImageCollection(arg)));
			}
		});
		collectionSelected().trigger(new MemorySelectableCollectionProxy(new ImageCollection()));
		
	}

	public Signal1<ISelectableImageCollectionModel> collectionSelected() {
		if(null==m_collectionSelected)
			m_collectionSelected=new Signal1<ISelectableImageCollectionModel>();
		return m_collectionSelected;
	}

	public UserLibrary getLibrary() {
		return m_lp.getLibrary();
	}

}
