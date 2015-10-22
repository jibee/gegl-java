package com.jibee.deratiseur.web.model.persistance;

import java.util.List;
import java.util.Vector;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Property;

import com.jibee.deratiseur.web.model.FileBackedImage;
import com.jibee.deratiseur.web.model.IImage;
import com.jibee.deratiseur.web.model.iFolder;

import eu.webtoolkit.jwt.ItemDataRole;

@Entity("folder")
public class LibraryFolder extends IMongoObject implements iFolder {

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
	
	/** Constructor for mongo and reflection 
	 * 
	 */
	@SuppressWarnings("unused")
	private LibraryFolder()
	{
		
	}

	public LibraryFolder(String name, Library lib) {
		m_name = name;
		setLibrary(lib);
		save();
	}

	public LibraryFolder(String name, LibraryFolder parent) {
		this(name, parent.getLibrary());
		setParentFolder(parent);
		save();
	}

	@Override
	public List<? extends iFolder> subFolders() {
		List<? extends iFolder> retval = Factory.instance().getFolders(this).asList();
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
			if(!Original.exists(bi.getFile(), getLibrary()))
			{
				Original original = new Original(bi.getFile(), getLibrary());
				// TODO: create a deferred task to source the image meta data (exif)
				original.scheduleExifParsing();
				Image image = new Image(original,this);
				ImageRevision r = image.createRevision();
				// TODO: create a deferred task to create the miniature
				r.scheduleRender();
			}
		}
	}

	public Library getLibrary() {
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
	public List<IImage> getImages() {
		List<? extends IImage> retval = Factory.instance().getImagesInFolder(m_library, getId()).asList();
		return (List<IImage>) retval;
	}

}
