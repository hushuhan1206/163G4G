package com.qhit.lh.g4.rcc.t1.dao;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.rcc.t1.action.Dept;
import com.qhit.lh.g4.rcc.t1.bean.user;

public interface BaseDao {
	public void add(user user);
	public void update(user user);
	public void delete(user user);

	public Object getObjectById(Class clazz,Serializable id);
	
	public List getObjects(String hql);
	void update(Object obj);
	void delete(Object obj);
}
