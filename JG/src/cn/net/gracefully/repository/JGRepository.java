package cn.net.gracefully.repository;

import com.google.code.morphia.Datastore;

import cn.net.gracefully.repository.dao.MongoDao;

public interface JGRepository {
	Datastore ds = new MongoDao().getInstance();
}
