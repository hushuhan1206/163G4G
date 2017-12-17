package com.qhit.lh.g4.rcc.t2.service;

import java.io.Serializable;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.catalina.User;

import com.qhit.lh.g4.rcc.t2.bean.Emp;

public interface BaseService {
	public void add(Emp emp);
	public void update(User user);
	public void delete(Use user);

	@SuppressWarnings("rawtypes")
	public Object getObjectById(Class clazz,Serializable id);
	
	@SuppressWarnings("rawtypes")
	public List getObjects(String hql);
	void update(Object obj);
	void delete(Object obj);
	void delete(User user);
	void add(User user);
	public List<Object> queryAll(String string);

}
