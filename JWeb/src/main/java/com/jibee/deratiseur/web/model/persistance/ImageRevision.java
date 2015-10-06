package com.jibee.deratiseur.web.model.persistance;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;

/** This class represents a revision of an {@link Image}. The {@link Image} has
 * one active revision at a time.
 * 
 * This intermediate class is used to ensure smooth update of the previews as
 * an {@link Image} is modified.
 * 
 * @author jibee
 *
 */
@Entity("imageRevision")
public class ImageRevision extends  IMongoObject {

	@Property("image")
	private ObjectId m_image;

	public ImageRevision(Image image) {
		setImage(image);
	}

	public void discard() {
		// TODO Auto-generated method stub
		
	}

	public Image getImage() {
		return Factory.instance().getImage(m_image);
	}

	public void setImage(Image image) {
		m_image = IMongoObject.getIdFor(image);
	}

	public void scheduleRender() {
		// TODO: create a deferred task to create the miniature
	
	}
}
