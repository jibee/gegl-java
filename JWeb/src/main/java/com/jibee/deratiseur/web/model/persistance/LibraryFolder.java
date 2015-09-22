package com.jibee.deratiseur.web.model.persistance;

import java.io.File;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Property;

import com.jibee.deratiseur.web.model.FileBackedImage;
import com.jibee.deratiseur.web.model.IImage;
import com.jibee.deratiseur.web.model.iFolder;

@Entity("folder")
public class LibraryFolder implements iFolder, IMongoObject{
	/**  Backend object ID 
	 * 
	 */
	@Id
	private ObjectId m_id;

	/** Library this folder belongs to 
	 * 
	 */
	@Property("library")
	@Indexed
	private ObjectId m_library;

	/** Parent folder
	 * 
	 */
	@Property("parent")
	@Indexed
	private ObjectId m_parentFolder;

	/** Folder local name
	 * 
	 */
	@Property("name")
	private String m_name;

	public LibraryFolder(String name, Library lib) {
		m_name = name;
		setLibrary(lib);
	}

	public LibraryFolder(String name, LibraryFolder parent) {
		this(name, parent.getLibrary());
		setParentFolder(parent);
	}

	@Override
	public List<iFolder> subFolders() {
		// TODO Auto-generated method stub
		return null;
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
	public void importImages(List<IImage> toImport) {
		for(IImage i: toImport)
		{
			importImage(i);
		}
	}

	private void importImage(IImage i)
	{
		if(FileBackedImage.class.isInstance(i))
		{
			// Import as original
			FileBackedImage bi = (FileBackedImage)i;
			Original original = new Original(bi.getFile(), getLibrary());
			Image image = new Image(original,this);
			image.createRevision();
		}
	}

	private Library getLibrary() {
		return Factory.instance().getLibrary(m_library);
	}

	private void setLibrary(Library library) {
		m_library = IMongoObject.getIdFor(library);
	}

	private LibraryFolder getParentFolder() {
		return Factory.instance().getFolder(m_parentFolder);
	}

	private void setParentFolder(LibraryFolder parentFolder) {
		m_parentFolder = IMongoObject.getIdFor(parentFolder);
	}

	@Override
	public ObjectId getId() {
		return m_id;
	}

}
