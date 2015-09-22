package com.jibee.deratiseur.web.model.persistance;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("preview")
public class ImagePreview {
	@Id
	private ObjectId m_id;
	
	@Property("image")
	private ObjectId m_image;
	
	@Property("w")
	double m_width;
	
	@Property("h")
	double m_height;

	public Image getImage() {
		return Factory.instance().getImage(m_image);
	}

	public void setImage(Image image) {
		m_image = IMongoObject.getIdFor(image);
	}
}
