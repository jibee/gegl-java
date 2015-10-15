package com.jibee.deratiseur.web.model.persistance;

import java.util.Set;
import java.util.TreeSet;

import com.jibee.deratiseur.processor.ImageRenderer;
import com.jibee.deratiseur.web.model.IImage.RenderSize;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

import eu.webtoolkit.jwt.WLink;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Property;

/** Represents a rendering of an ImageRevision
 * 
 * @author jibee
 *
 */
@Entity("preview")
public class Render extends IMongoObject{
	/** Processing status
	 * 
	 * 
	 * @author jibee
	 *
	 */
	public enum RenderStatus
	{
		Pending,
		InProgress,
		Succeeded,
		Failed
	}
	public enum StorageEngine
	{
		Mongo,
		FileSystem
	}
	
	@Indexed(unique=true)
	@Property("key")
	private String m_key;

	@Indexed
	@Property("imageRevision")
	private ObjectId m_imageRevision;

	@Property("w")
	double m_width;

	@Property("h")
	double m_height;

	@Indexed
	@Property("profiles")
	Set<RenderSize> m_renderProfiles;

	@Indexed
	@Property("status")
	RenderStatus m_status;

	@Property("storage")
	StorageEngine m_storage;

	@Property("address")
	private
	String m_localAddress;

	@SuppressWarnings("unused")
	private Render()
	{
	}

	public Render(ImageRevision imageRevision, RenderSize size)
	{
		m_renderProfiles = new TreeSet<>();
		m_renderProfiles.add(size);
		m_status = RenderStatus.Pending;
		m_key=ImageRenderer.instance().getUniqueIdentifier();
		setImageRevision(imageRevision);
	}

	public ImageRevision getImage() {
		return Factory.instance().getImageRevision(m_imageRevision);
	}

	public void setImageRevision(ImageRevision image) {
		m_imageRevision = IMongoObject.getIdFor(image);
		save();
	}
	/** This method obtains atomically the rendering status.
	 * 
	 * If the stored status is read by this method as Pending it will be set as InProgress by this method.
	 * 
	 * This means the caller will have the obligation to further update its status to either Pending if the
	 * processor did not intend to render the image or had to abort the rendering to yield to another task,
	 * Failed if the rendering failed and Succeded if the rendering succeeded.
	 * 
	 */
	public RenderStatus atomicallyGetRenderStatus() {
		if(m_status == RenderStatus.Succeeded || m_status==RenderStatus.Failed)
			return m_status;
		if(m_status == RenderStatus.Pending)
		{
			DBObject query = new BasicDBObject("_id", getId()).append("status", RenderStatus.Pending.toString());
			DBObject update = new BasicDBObject("$set", new BasicDBObject("status", RenderStatus.InProgress.toString()));

			WriteResult result = Factory.instance().getRender().getCollection().update(query, update);
			if(0==result.getN())
			{
				// Status was changed by another process, let's update
				Render r = Factory.instance().getRenderByID(getId());
				m_status = r.m_status;
				m_storage = r.m_storage;
				setLocalAddress(r.getLocalAddress());
				return m_status;
			}
			else
			{
				// Reflect the updated render status
				m_status = RenderStatus.InProgress;
				return RenderStatus.Pending;
			}
		}
		return m_status;
	}

	public RenderStatus getStatus() {
		return m_status;
	}

	public StorageEngine getStorage() {
		return m_storage;
	}
	public void setStorage(StorageEngine e) {
		m_storage=e;
	}

	public String getLocalAddress() {
		return m_localAddress;
	}

	public void setLocalAddress(String localAddress) {
		m_localAddress = localAddress;
	}

	public void setStatus(RenderStatus status) {
		m_status = status;
		save();
	}

	public String getMimeType() {
		return "image/jpeg";
	}

	public WLink getLink() {
		return new WLink("/img/"+m_key);
	}
}
