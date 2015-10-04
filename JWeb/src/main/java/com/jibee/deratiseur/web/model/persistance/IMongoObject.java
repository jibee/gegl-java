package com.jibee.deratiseur.web.model.persistance;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

public class IMongoObject {
	/**  Backend object ID 
	 * 
	 */
	@Id
	private ObjectId m_id;

	public final ObjectId getId()
	{
		return m_id;
	}
	public void save()
	{
		save(this);
	}

	public static ObjectId getIdFor(IMongoObject o)
	{
		if(null==o)
			return null;
		else
			return o.getId();
	}
	public static void save(IMongoObject o)
	{
		Factory.instance().save(o);
	}

}
