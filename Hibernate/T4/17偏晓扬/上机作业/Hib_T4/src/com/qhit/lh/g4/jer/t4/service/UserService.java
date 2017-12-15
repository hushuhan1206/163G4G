package com.qhit.lh.g4.jer.t4.service;

import java.util.List;

/**
 * @author 偏晓扬
 * 2017年12月12日下午3:00:55
 * TODO
 */
public interface UserService {
	
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> queryAll(String fromStr);
	
	public Object getObjectById(Class clazz,int id);
}
