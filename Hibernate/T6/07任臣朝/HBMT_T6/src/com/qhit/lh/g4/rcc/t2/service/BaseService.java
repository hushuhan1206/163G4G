package com.qhit.lh.g4.rcc.t2.service;

import java.io.Serializable;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.catalina.User;

import com.qhit.lh.g4.rcc.t2.bean.Emp;
import com.qhit.lh.g4.rcc.t2.bean.Role;

public interface BaseService {
	public void add(Object obj);
	public void update(Object obj);
	public void delete(Object obj);

	public List<Object> queryall(String tableName);
	public Object getObjectById(Class clazz, int id);

}
