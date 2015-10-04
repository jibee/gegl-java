package com.jibee.deratiseur.web.model;

import java.io.File;
import java.util.List;

import eu.webtoolkit.jwt.ItemDataRole;
import eu.webtoolkit.jwt.Orientation;
import eu.webtoolkit.jwt.WAbstractItemModel;
import eu.webtoolkit.jwt.WModelIndex;

public interface iFolder  {
	/** Lists the subfolders in the folder */
	List<? extends iFolder> subFolders();
	/**
	 * Return data for a given role.
	 * <p>
	 * You should check the <code>role</code> to decide what data to return.
	 * Usually a View class will ask for data for several roles which affect not
	 * only the contents ({@link ItemDataRole#DisplayRole}) but also icons (
	 * {@link ItemDataRole#DecorationRole}), URLs ({@link ItemDataRole#LinkRole}
	 * ), and other visual aspects. If your item does not specify data for a
	 * particular role, it should simply return null.
	 * <p>
	 * 
	 * @see WAbstractItemModel#getFlags(WModelIndex index)
	 * @see WAbstractItemModel#getHeaderData(int section, Orientation
	 *      orientation, int role)
	 * @see WAbstractItemModel#setData(WModelIndex index, Object value, int
	 *      role)
	 */
	Object getData(int role);
	/** Obtains all images including those comprising sub-folders 
	 * 
	 * @return
	 */
	List<IImage> getAllImages();
	/** Obtains all images excluding those comprising sub-folders 
	 * 
	 * @return
	 */
	List<? extends IImage> getImages();
	
	String getName();
	iFolder newFolder(String f_name);
	void importImages(List<? extends IImage> list);


}
