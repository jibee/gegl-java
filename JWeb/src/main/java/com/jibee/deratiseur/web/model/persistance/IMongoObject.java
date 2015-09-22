package com.jibee.deratiseur.web.model.persistance;

import org.bson.types.ObjectId;

public interface IMongoObject {

	ObjectId getId();

	public static ObjectId getIdFor(IMongoObject o)
	{
		if(null==o)
			return null;
		else
			return o.getId();
	}

}
