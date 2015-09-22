package com.jibee.deratiseur.web.model.persistance;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.MongoClient;

public class Factory {
	
	private static final Factory s_instance = new Factory();
	private static final Logger logger = LoggerFactory.getLogger(Factory.class);

	public static Factory instance()
	{
		return s_instance;
	}

	private Datastore m_datastore;
	
	private Factory()
	{
		/** We are connecting to this host.
		 * TODO specify this in a configuration file.
		 */
		String hostname = "localhost";
		/** Open the connection to the mongo database */
		MongoClient mongo_connection;
		try {
			mongo_connection = new MongoClient(hostname);
		} catch (Exception e) {
			logger.error("Cannot connect to Mongo on "+hostname);
			throw new Error("Cannot connecto to Mongo on "+hostname);
		}
		/** Initialise the object mapper. */
		Morphia morphia = new Morphia();
		/* Force the initialisation of the various mapped class now. This also
		 * create / update the collection indices as described in the mapped
		 * classes annotations.
		 */
		morphia.map(
				Library.class, Image.class, ImagePreview.class, ImageRevision.class, LibraryFolder.class, Original.class
				);
		m_datastore = morphia.createDatastore(mongo_connection, "Deratiseur");
		m_datastore.ensureIndexes();
	}
	
	public Query<Library> getLibraries() {
		return m_datastore.createQuery(Library.class);
	}

	public Query<Original> getOriginals() {
		return m_datastore.createQuery(Original.class);
	}

	public Query<Original> getOriginals(Library library) {
		return getOriginals().field("library").equal(library);
	}

	public Query<LibraryFolder> getFolders()
	{
		return m_datastore.createQuery(LibraryFolder.class);
	}
	public Query<LibraryFolder> getFolders(LibraryFolder parent) {
		return getFolders().field("parent").equal(parent);
	}

	public Query<ImageRevision> getRevisions() {
		return m_datastore.createQuery(ImageRevision.class);
	}
	public Query<ImageRevision> getRevisions(Image image) {
		return getRevisions().field("image").equal(image);
	}

	public Original getOriginal(ObjectId original) {
		return getOriginals().field("_id").equal(original).get();
	}

	public LibraryFolder getFolder(ObjectId folder) {
		return getFolders().field("_id").equal(folder).get();
	}

	public ImageRevision getImageRevision(ObjectId activeRevision) {
		return getRevisions().field("_id").equal(activeRevision).get();
	}

	public Image getImage(ObjectId id) {
		return getImages().field("_id").equal(id).get();
	}

	private Query<Image> getImages() {
		return m_datastore.createQuery(Image.class);
	}

	public Library getLibrary(ObjectId id) {
		return getLibraries().field("_id").equal(id).get();
	}

}
