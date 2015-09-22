package com.jibee.deratiseur.web.model;

import java.util.List;

import com.jibee.deratiseur.web.model.persistance.Factory;
import com.jibee.deratiseur.web.model.persistance.Library;

import eu.webtoolkit.jwt.ItemDataRole;
import eu.webtoolkit.jwt.WItemModel;
import eu.webtoolkit.jwt.WModelIndex;

/** List of folders and views in a User Library
 * 
 * TODO add data model and persistence layer for the following features:
 * - Miniatures
 * - Views (places etc)
 * - Versions of an image
 * - Adjustments
 * 
 * 
 * @author jibee
 *
 */
public class UserLibrary extends WItemModel<iFolder>{
/** Data role to use to obtain the actual iFolder backing a given item in the library
 * 
 */
	public static final int ObjectRole = ItemDataRole.UserRole+49;
	private iFolder m_root;
/** Constructor
 * 
 * TODO add path parameter to allow opening any library
 * TODO add abstraction layers away from the drive model (cloud-like setup)
 */
	public UserLibrary() {
		Library def = Factory.instance().getLibraries().field("owner").equal("jibee").field("name").equal("default").get();
		if(null==def)
			def = new Library("jibee", "default");
		m_root=def;
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
			return (List<iFolder>) parent.subFolders();
		else
			return (List<iFolder>) parent.subFolders().subList(from, from+count);
	}


}
