package com.qhit.lh.g4.perfact.t04.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> queryAll(String sql);
}
