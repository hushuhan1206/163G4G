package com.qhit.lh.g4.zhy.T3.dao;

import java.util.List;

/**
 * @author 张宏远
 * 2017年12月13日下午9:03:45
 * TODO
 */
public interface UserDao {
	
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> queryAll(String fromStr);
	
	public Object getObjectById(Class clazz,int id);
}
