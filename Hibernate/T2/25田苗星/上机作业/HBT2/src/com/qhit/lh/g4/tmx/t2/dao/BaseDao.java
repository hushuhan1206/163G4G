package com.qhit.lh.g4.tmx.t2.dao;

import java.util.List;

public interface BaseDao {

	void add(Object obj);

	void delete(Object obj);

	void update(Object obj);

	List<Object> queryAll(String formStr);

}
