package com.jibee.deratiseur.web.model.persistance;

import com.jibee.deratiseur.processor.ImageRenderer;
import com.jibee.deratiseur.web.model.IImage.RenderSize;
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
	int m_width;

	@Property("h")
	int m_height;

	@Indexed
	@Property("profile")
	RenderSize m_renderProfile;

	@Indexed
	@Property("status")
	RenderStatus m_status;

	@Property("storage")
	StorageEngine m_storage;

	@Property("address")
	private
	String m_localAddress;
	
	@Property("type")
	private String m_mimeType;

	@SuppressWarnings("unused")
	private Render()
	{
	}

	public Render(ImageRevision imageRevision, RenderSize size)
	{
		m_renderProfile = size;
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
			if(Factory.instance().takeRenderLock(getId()))
			{
				// Reflect the updated render status
				m_status = RenderStatus.InProgress;
				return RenderStatus.Pending;
			}
			else
			{
				// Status was changed by another process, let's update
				Render r = Factory.instance().getRenderByID(getId());
				m_status = r.m_status;
				m_storage = r.m_storage;
				setLocalAddress(r.getLocalAddress());
				return m_status;
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
		return m_mimeType;
	}
	public void setMimeType(String s) {
		m_mimeType=s;
	}

	public WLink getLink() {
		return new WLink("/img/"+m_key);
	}

	public void calculateTargetDimensions() {
		Original o = getImage().getImage().getOriginal();
		
		switch(m_renderProfile)
		{
		case FullResolution:
			m_height = o.getHeight();
			m_width = o.getWidth();
			break;
		case Thumbnail:
			calculateTargetDimensions(o, 320, 320);
			break;
		}
	}

	private void calculateTargetDimensions(Original o, int maxHeight, int maxWidth) {
		double h_ratio = (1.0 * o.getHeight() ) / (1.0 * maxHeight);
		double w_ratio = (1.0 * o.getWidth() ) / (1.0 * maxWidth);
		
		double ratio = h_ratio>w_ratio?h_ratio:w_ratio;
		
		if(ratio < 1)
			ratio = 1;
		
		m_height = (int) (o.getHeight() / ratio);
		m_width = (int) (o.getWidth() / ratio);
		save();
	}

	public int getWidth() {
		return m_width;
	}

	public int getHeight() {
		return m_height;
	}
}
