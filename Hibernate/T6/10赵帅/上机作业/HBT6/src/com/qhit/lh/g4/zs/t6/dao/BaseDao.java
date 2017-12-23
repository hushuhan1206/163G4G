package com.qhit.lh.g4.zs.t6.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao {

	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> queryAll(String sql);
}
