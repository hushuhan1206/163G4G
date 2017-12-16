package com.qhit.lh.g4.wcx.t3.dao;

import java.util.List;

/**
 * @author 王城翔
 * 2017年12月14日下午3:01:01
 * TODO
 */
public interface UserDao {
	
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> queryAll(String fromStr);
	
	public Object getObjectById(Class clazz,int id);
}
