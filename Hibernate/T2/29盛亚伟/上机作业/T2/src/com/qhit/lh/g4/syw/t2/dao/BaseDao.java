package com.qhit.lh.g4.syw.t2.dao;

import java.util.List;

public interface BaseDao {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String tableName);
}
