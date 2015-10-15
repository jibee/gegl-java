package com.jibee.deratiseur.web.model.persistance;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;

import eu.webtoolkit.jwt.WLink;
import com.jibee.deratiseur.web.model.IImage.RenderSize;

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
	
	private ImageRevision()
	{
		
	}

	public ImageRevision(Image image) {
		setImage(image);
	}
	
	public List<Render> getRenders()
	{
		return Factory.instance().getRenders(this);
	}

	public void discard() {
		// TODO Auto-generated method stub
		
	}

	public Image getImage() {
		return Factory.instance().getImage(m_image);
	}

	public void setImage(Image image) {
		m_image = IMongoObject.getIdFor(image);
		save();
	}

	public void scheduleRender()
	{
		
		// TODO: create a deferred task to create the miniature
	
	}

	public WLink getResourceLink(RenderSize size) {
		Render r = getRender(size);
		return r.getLink();
	}

	private Render getRender(RenderSize size)
	{
		Render r = Factory.instance().getRender(this, size);
		if(null==r)
		{
			r = new Render(this, size);
		}
		return r;
	}
}
