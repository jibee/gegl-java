package com.jibee.deratiseur.web.model.persistance;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.query.Query;

import com.jibee.deratiseur.web.model.IImage;

public class Image extends IMongoObject implements IImage{
	
	@Property("original")
	private ObjectId m_original;
	
	@Property("library")
	private ObjectId m_library;

	@Property("active_rev")
	private ObjectId m_activeRevision;
	
	@Property("folder")
	private ObjectId m_folder;
	
	@Property("name")
	private String m_name;
	
	public Image(Original original, LibraryFolder libraryFolder) {
		setOriginal(original);
		setFolder(libraryFolder, libraryFolder.getLibrary());
	}
	public Query<ImageRevision> getRevisions()
	{
		return Factory.instance().getRevisions(this);
	}
	@Override
	public String getFilename() {
		return m_name;
	}
	public ImageRevision createRevision() {
		ImageRevision revision=new ImageRevision(this);
		ImageRevision active = getActiveRevision();
		if(null!=active)
			active.discard();
		setActiveRevision(revision);
		return revision;
	}
	private Original getOriginal() {
		return Factory.instance().getOriginal(m_original);
	}
	private void setOriginal(Original original) {
		m_original = IMongoObject.getIdFor(original);
		save();
	}
	public ImageRevision getActiveRevision()
	{
		return Factory.instance().getImageRevision(m_activeRevision);
	}
	private void setActiveRevision(ImageRevision activeRevision) {
		m_activeRevision = IMongoObject.getIdFor(activeRevision);
		save();
	}
	private LibraryFolder getFolder() {
		return Factory.instance().getFolder(m_folder);
	}
	private void setFolder(LibraryFolder folder, Library library) {
		m_folder = IMongoObject.getIdFor(folder);
		m_library = IMongoObject.getIdFor(library);
		save();
	}
}
