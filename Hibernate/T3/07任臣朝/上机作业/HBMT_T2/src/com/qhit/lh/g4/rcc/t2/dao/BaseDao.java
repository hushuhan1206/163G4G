package com.qhit.lh.g4.rcc.t2.dao;

import java.io.Serializable;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.catalina.User;

public interface BaseDao {
	public void add(User user);
	public void update(User user);
	public void delete(Use user);

	public Object getObjectById(Class clazz,Serializable id);
	
	public List getObjects(String hql);
	void update(Object obj);
	void delete(Object obj);
	void delete(User user);
	
	
	public Object getObjectById(Class clazz, int id);
}
