package com.qhit.lh.g4.zs.t1.dao;

import java.util.List;

public interface BaseDao {

	void add(Object obj);

	void update(Object obj, int id);

	void delete(Object obj);

	List<Object> queryall(String fromStr);

}
