package com.qhit.lh.g4.zzh.t6.service;

import java.util.List;

public interface BaseService {
	//挣
	public void add(Object obj);
	//删
	public void delete(Object obj);
	//改
	public void update(Object obj);
	public Object getObjectById(Class clazz,int id);
	//查
	public List<Object> queryAll(String fromStr);
}
