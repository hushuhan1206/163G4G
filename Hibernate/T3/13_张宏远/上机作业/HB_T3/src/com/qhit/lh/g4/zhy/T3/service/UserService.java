package com.qhit.lh.g4.zhy.T3.service;

import java.util.List;

/**
 * @author 张宏远
 * 2017年12月13日下午9:35:43
 * TODO
 */
public interface UserService {
	
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> queryAll(String fromStr);
	
	public Object getObjectById(Class clazz,int id);
}
