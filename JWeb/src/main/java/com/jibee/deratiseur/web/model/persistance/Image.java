package com.jibee.deratiseur.web.model.persistance;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.query.Query;

import com.jibee.deratiseur.web.model.IImage;

public class Image implements IImage, IMongoObject{
	@Id
	private ObjectId m_id;
	
	@Property("original")
	private ObjectId m_original;
	
	@Property("active_rev")
	private ObjectId m_activeRevision;
	
	@Property("folder")
	private ObjectId m_folder;
	
	@Property("name")
	private String m_name;
	
	public Image(Original original, LibraryFolder libraryFolder) {
		setOriginal(original);
		setFolder(libraryFolder);
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
		getActiveRevision().discard();
		setActiveRevision(revision);
		return revision;
	}
	private Original getOriginal() {
		return Factory.instance().getOriginal(m_original);
	}
	private void setOriginal(Original original) {
		m_original = IMongoObject.getIdFor(original);
	}
	public ImageRevision getActiveRevision()
	{
		return Factory.instance().getImageRevision(m_activeRevision);
	}
	private void setActiveRevision(ImageRevision activeRevision) {
		m_activeRevision = IMongoObject.getIdFor(activeRevision);
	}
	private LibraryFolder getFolder() {
		return Factory.instance().getFolder(m_folder);
	}
	private void setFolder(LibraryFolder folder) {
		m_folder = IMongoObject.getIdFor(folder);
	}
	@Override
	public ObjectId getId() {
		return m_id;
	}
}
