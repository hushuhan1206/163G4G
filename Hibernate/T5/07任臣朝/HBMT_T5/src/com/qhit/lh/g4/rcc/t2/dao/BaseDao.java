package com.qhit.lh.g4.rcc.t2.dao;

import java.io.Serializable;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.catalina.User;

public interface BaseDao {
	public void add(User user);
	public void update(User user);
	public void delete(Use user);

	@SuppressWarnings("rawtypes")
	public Object getObjectById(Class clazz,Serializable id);
	
	@SuppressWarnings("rawtypes")
	public List getObjects(String hql);
	void update(Object obj);
	void delete(Object obj);
	void delete(User user);
	
	
	@SuppressWarnings("rawtypes")
	public Object getObjectById(Class clazz, int id);
}
