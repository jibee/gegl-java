package com.jibee.deratiseur.web.model.persistance;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Transient;
import org.mongodb.morphia.query.Query;

import com.jibee.deratiseur.web.model.IImage;
import com.jibee.deratiseur.web.model.iFolder;

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
public class Library implements iFolder, IMongoObject {
	/**
	 * Library ID
	 */
	@Id
	ObjectId m_id;
	
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
	}
	
	void importImages(List<IImage> toImport, String[] destinationPath)
	{
		iFolder destination = this;
		for(String f_name: destinationPath)
		{
			List<? extends iFolder> subs = null;
			subs=destination.subFolders();
			iFolder found = null;
			for(iFolder f: subs)
			{
				if(f.getName().equals(f_name))
				{
					found = f;
					break;
				}
			}
			if(null==found)
				found=destination.newFolder(f_name);
			destination = found;
		}
		destination.importImages(toImport);
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
		return Factory.instance().getFolders(null).asList();
	}

	@Override
	public Object getData(int role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IImage> getAllImages() {
		// TODO Auto-generated method stub
		return null;
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
	public ObjectId getId() {
		return m_id;
	}

	@Override
	public void importImages(List<IImage> toImport) {
		// TODO Auto-generated method stub
		
	}
}
