package cn.net.gracefully.repository.dao;

import java.net.UnknownHostException;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class MongoDao {
	private static Datastore ds = null;
	public static Datastore getInstance(){
		if(ds == null){
			Mongo mongo;
			try {
				mongo = new Mongo();
				ds = new Morphia().createDatastore(mongo, "jg");
				ds.ensureIndexes();
				ds.ensureCaps();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MongoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ds;
	}
}
