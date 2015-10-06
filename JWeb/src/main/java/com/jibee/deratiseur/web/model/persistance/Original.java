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
public class Original extends IMongoObject{
	public Original(File file, Library library) {
		m_filePath=file.getAbsolutePath();
		m_name = file.getName();
		setLibrary(library);
	}
	
	@Property("library")
	private ObjectId m_library;
	
	@Property("filePath")
	private String m_filePath;

	@Property("name")
	private String m_name;

	public Library getLibrary() {
		return Factory.instance().getLibrary(m_library);
	}

	public void setLibrary(Library library) {
		m_library = IMongoObject.getIdFor(library);
		save();
	}

	public static boolean exists(File file, Library library) {
		return Factory.instance().getOriginals(library).field("filePath").equal(file.getAbsolutePath()).countAll()>0;
	}

	public void scheduleExifParsing() {
		// TODO create a deferred task
		
	}

	public String getName() {
		return m_name;
	}
}
