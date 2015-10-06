package com.jibee.deratiseur.web.model.persistance;

import java.util.List;
import java.util.Vector;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Transient;
import org.mongodb.morphia.query.Query;

import com.jibee.deratiseur.web.model.IImage;
import com.jibee.deratiseur.web.model.iFolder;

import eu.webtoolkit.jwt.ItemDataRole;

/** 
 * Model backend for a library with local storage.
 * 
 * This is the root folder for the data model with local storage. It has the 
 * responsibility for creating the iFolder submodels from their internal path
 * names
 * 
 * @author jibee
 *
 */
@Entity("library")
public class Library extends IMongoObject implements iFolder {	
	/**
	 * Library name as set by the user and for display purposes
	 */
	@Property("name")
	String m_name;

	/** Owner login 
	 * 
	 */
	@Property("owner")
	String m_owner_login;

	public Library(String owner, String name) {
		m_owner_login = owner;
		m_name = name;
		save();
	}
	
	Library()
	{
		
	}


	LibraryFolder getFolderByName(String folderName)
	{
		throw new Error("Implementation missing");
	}


	@Override
	public List<? extends iFolder> subFolders() {
		List<? extends iFolder> retval = Factory.instance().getFolders((ObjectId)null).asList();
		if(null==retval)
		{
			return new Vector<>();
		}
		else
			return retval;
	}

	@Override
	public Object getData(int role) {
		if(ItemDataRole.DisplayRole == role)
			return getName();
		return null;
	}

	@Override
	public List<IImage> getAllImages() {
		List<IImage> retval = getImages();
		for(iFolder f: subFolders())
		{
			retval.addAll(f.getAllImages());
		}
		return retval;
	}
	
	Query<Original> getOriginals()
	{
		return Factory.instance().getOriginals(this);	
	}

	@Override
	public String getName() {
		return m_name;
	}

	@Override
	public iFolder newFolder(String f_name) {
		LibraryFolder retval = new LibraryFolder(f_name, this);
		return retval;
	}

	@Override
	public void importImages(List<? extends IImage> toImport) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IImage> getImages() {
		List<? extends IImage> retval = Factory.instance().getImagesInFolder(this.getId(), null).asList();
		return (List<IImage>) retval;
	}
}
