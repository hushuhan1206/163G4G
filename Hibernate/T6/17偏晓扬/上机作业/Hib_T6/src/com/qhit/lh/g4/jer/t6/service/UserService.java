package com.qhit.lh.g4.jer.t6.service;

import java.util.List;

/**
 * @author 偏晓阳
 * 2017年12月20日下午5:14:01
 * TODO
 */
public interface UserService {
	
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> queryAll(String fromStr);
	
	public Object getObjectById(Class clazz,int id);
}
