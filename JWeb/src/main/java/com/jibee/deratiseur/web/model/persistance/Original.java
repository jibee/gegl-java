package com.jibee.deratiseur.web.model.persistance;

import java.io.File;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;

/** 
 * Original image reference.
 * 
 * Many {@link Image} may refer to a single Original, applying different sets
 * of adjustments.
 * 
 * This object belongs to the {@link Library}, not a 
 * {@link LibraryFolder} or a {@link Image}
 * 
 * @author jibee
 *
 */
@Entity("Original")
public class Original implements IMongoObject{
	public Original(File file, Library library) {
		setLibrary(library);
		m_filePath=file.getAbsolutePath();
	}

	@Id
	private ObjectId m_id;
	
	@Property("library")
	private ObjectId m_library;
	
	@Property("filePath")
	private String m_filePath;

	@Override
	public ObjectId getId() {
		return m_id;
	}

	public Library getLibrary() {
		return Factory.instance().getLibrary(m_library);
	}

	public void setLibrary(Library library) {
		m_library = IMongoObject.getIdFor(library);
	}
}
