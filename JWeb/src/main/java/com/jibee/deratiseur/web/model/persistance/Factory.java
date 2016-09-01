package com.jibee.deratiseur.web.model.persistance;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jibee.deratiseur.web.model.iFolder;
import com.jibee.deratiseur.web.model.IImage.RenderSize;
import com.jibee.deratiseur.web.model.persistance.Render.RenderStatus;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

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
				Library.class, Image.class, Render.class, ImageRevision.class, LibraryFolder.class, Original.class
				);
		m_datastore = morphia.createDatastore(mongo_connection, "Deratiseur");
		m_datastore.ensureIndexes();
	}
	
	private Query<Library> getLibraries() {
		return m_datastore.createQuery(Library.class);
	}
	
	public Library getLibrary(String username, String library)
	{
		return getLibraries().field("owner").equal("jibee").field("name").equal("default").get();
	}
	private Query<Original> getOriginals() {
		return m_datastore.createQuery(Original.class);
	}

	private Query<Original> getOriginals(Library library) {
		return getOriginals(IMongoObject.getIdFor(library));
	}
	private Query<Original> getOriginals(ObjectId library) {
		return getOriginals().field("library").equal(library);
	}

	private Query<LibraryFolder> getFolders()
	{
		return m_datastore.createQuery(LibraryFolder.class);
	}
	public List<? extends iFolder> getFolders(LibraryFolder parent) {
		return getFolders(IMongoObject.getIdFor(parent)).asList();
	}
	private Query<LibraryFolder> getFolders(ObjectId parent) {
		return getFolders().field("parent").equal(parent);
	}

	private Query<ImageRevision> getRevisions() {
		return m_datastore.createQuery(ImageRevision.class);
	}
	public List<ImageRevision> getRevisions(Image image) {
		return getRevisions().field("image").equal(IMongoObject.getIdFor(image)).asList();
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

	public void save(IMongoObject o) {
		m_datastore.save(o);
	}

	public List<Image> getImagesInFolder(ObjectId library, ObjectId folder) {
		return getImages().field("library").equal(library).field("folder").equal(folder).asList();
	}

	public Query<Render> getRender()
	{
		return m_datastore.createQuery(Render.class);
	}
	public Render getRenderByPublicHash(String path) {
		return getRender().field("key").equal(path).get();
	}

	public Render getRenderByID(ObjectId id) {
		return getRender().field("_id").equal(id).get();
	}

	public List<Render> getRenders(ImageRevision imageRevision) {
		return getRender().field("imageRevision").equal(IMongoObject.getIdFor(imageRevision)).asList();
	}

	public Render getRender(ImageRevision imageRevision, RenderSize size) {
		return getRender()
				.field("imageRevision").equal(IMongoObject.getIdFor(imageRevision))
				.field("profile").equal(size)
				.get();
	}

	public boolean originalIsInLibrary(Library library, String absolutePath) {
		return getOriginals(library).field("filePath").equal(absolutePath).countAll()>0;
	}

	public boolean takeRenderLock(ObjectId id) {
		DBObject query = new BasicDBObject("_id", id).append("status", RenderStatus.Pending.toString());
		DBObject update = new BasicDBObject("$set", new BasicDBObject("status", RenderStatus.InProgress.toString()));

		WriteResult result = Factory.instance().getRender().getCollection().update(query, update);
		return 1==result.getN();
	}

}
