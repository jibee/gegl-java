package com.jibee.deratiseur.web.model.persistance;

import java.io.File;
import java.io.IOException;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.MetadataException;
import com.drew.metadata.exif.ExifIFD0Directory;

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
	private static final Logger logger = LoggerFactory.getLogger(Original.class);
	/** Constructor for Mongo and reflection
	 * 
	 */
	@SuppressWarnings("unused")
	private Original()
	{

	}
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

	@Property("w")
	private int m_width;
	@Property("h")
	private int m_height;
	@Property("orientation")
	private int m_orientation;

	public Library getLibrary() {
		return Factory.instance().getLibrary(m_library);
	}

	public void setLibrary(Library library) {
		m_library = IMongoObject.getIdFor(library);
		save();
	}

	public static boolean exists(File file, Library library) {
		return Factory.instance().originalIsInLibrary(library, file.getAbsolutePath());
	}

	public void scheduleExifParsing() {
		try {
			Metadata m = ImageMetadataReader.readMetadata(new File(m_filePath));
			ExifIFD0Directory ifd0 = m.getFirstDirectoryOfType(ExifIFD0Directory.class);
			m_height = ifd0.containsTag(ExifIFD0Directory.TAG_IMAGE_HEIGHT)?ifd0.getInt(ExifIFD0Directory.TAG_IMAGE_HEIGHT):0;
			m_width = ifd0.getInt(ExifIFD0Directory.TAG_IMAGE_WIDTH);
			m_orientation = ifd0.getInt(ExifIFD0Directory.TAG_ORIENTATION);
			logger.info("{}x{}", m_width, m_height);
			logger.info("Orientation: {}", m_orientation);
			for(Directory d: m.getDirectories())
			{
				logger.info("Found directory {}: {}", d.getName(), d.toString());
			}
		} catch (ImageProcessingException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO create a deferred task
		catch (MetadataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		save();
	}

	public String getName() {
		return m_name;
	}

	public String getPath() {
		return m_filePath;
	}
	public int getHeight() {
		if(8==m_orientation)
			return m_width;
		else
			return m_height;
	}
	public int getWidth() {
		if(8==m_orientation)
			return m_height;
		else
			return m_width;
	}
}
