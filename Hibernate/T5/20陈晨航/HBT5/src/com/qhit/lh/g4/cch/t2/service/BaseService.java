package com.qhit.lh.g4.djh.t2.service;

import java.util.List;

public interface BaseService {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object getObjectById(Class clazz,int id);
	public List<Object> queryAll(String tableName);
}
