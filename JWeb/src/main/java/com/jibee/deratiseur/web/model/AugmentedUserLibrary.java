package com.jibee.deratiseur.web.model;

import java.util.List;
import java.util.Vector;

import eu.webtoolkit.jwt.WAbstractItemModel;
import eu.webtoolkit.jwt.WModelIndex;

/** Augmented User Library is a user Library with the additional virtual views:
 * 
 * Places - shows locations
 * Events - shows timespans
 * Faces - people
 * 
 * @author jibee
 *
 * @deprecated add the virtual folders to the UserLibrary instead?
 */
public class AugmentedUserLibrary extends WAbstractItemModel{

	private List<iFolder> m_projects;
	private UserLibrary m_baseLibrary;
	
	/** Constructor
	 * 
	 * @param baseLibrary
	 */
	public AugmentedUserLibrary(UserLibrary baseLibrary) {
		m_baseLibrary=baseLibrary;
		m_projects = new Vector<iFolder>();
		/*
		m_projects.add(new PlacesVirtualFolder());
		m_projects.add(new EventsVirtualFolder());
		m_projects.add(new FacesVirtualFolder());
		*/
	}

	@Override
	public int getColumnCount(WModelIndex parent) {
		return 1;
	}

	@Override
	public int getRowCount(WModelIndex parent) {
		if(null==parent)
		{
			return m_projects.size();
		}
		else
		{
			if(null==parent.getParent())
			{
				switch(parent.getRow())
				{
				case 0:
					// places
				case 1:
					// events
				case 2:
					// faces / people
					/// TODO 
					return 0;
				default:
					iFolder f = (iFolder)parent.getInternalPointer();
					return f.subFolders().size();
				}
			}
		}
		return 0;
	}

	@Override
	public WModelIndex getParent(WModelIndex index) {
		return null;
	}

	@Override
	public Object getData(WModelIndex index, int role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WModelIndex getIndex(int row, int column, WModelIndex parent) {
		if(null==parent)
		{
			return createIndex(row, column, null);
		}
		else
		{
			if(null==parent.getParent())
			{
				switch(parent.getRow())
				{
				case 0:
					// places
				case 1:
					// events
				case 2:
					// faces / people
					/// TODO 
					WModelIndex index = createIndex(row, column, parent);
				default:
					iFolder f = (iFolder)parent.getInternalPointer();
				}
				
			}
		}
		return null;
	}

}
