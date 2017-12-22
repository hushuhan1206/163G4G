package com.qhit.lh.g4.rcc.t2.dao;

import java.util.List;


public interface BaseDao {
	public void add(Object obj);
	public void update(Object obj);
	public void delete(Object obj);
	public List<Object> queryall(String tableName);

	public Object getObjectById(Class clazz, int id);
}
