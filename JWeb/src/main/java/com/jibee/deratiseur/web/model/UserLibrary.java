package com.jibee.deratiseur.web.model;

import java.util.List;

import eu.webtoolkit.jwt.ItemDataRole;
import eu.webtoolkit.jwt.WItemModel;
import eu.webtoolkit.jwt.WModelIndex;

public class UserLibrary extends WItemModel<iFolder>{

	protected static final int ObjectRole = ItemDataRole.UserRole+49;
	private iFolder m_root;

	public UserLibrary() {
		m_root = new PhysicalFolder("/home/jibee/Images/");
	}

	@Override
	public int getColumnCount(WModelIndex parent) {
		return 1;
	}

	@Override
	public Object getData(WModelIndex index, int role) {
		iFolder f = getItem(index);
		if(role==ObjectRole)
			return f;
		if(null!=f)
			return f.getData(role);
		return null;
	}

	@Override
	public List<iFolder> getChildItems(iFolder parent, int from, int count) {
		if(null==parent)
		{
			parent = m_root;		
		}
		if(-1==count)
			return parent.subFolders();
		else
			return parent.subFolders().subList(from, from+count);
	}


}
