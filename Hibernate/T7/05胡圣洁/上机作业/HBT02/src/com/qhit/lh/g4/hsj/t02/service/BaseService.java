package com.qhit.lh.g4.hsj.t02.service;

import java.util.List;

import com.qhit.lh.g4.hsj.t02.bean.Emp;
import com.qhit.lh.g4.hsj.t02.bean.UserInfo;

public interface BaseService {
	/**
	 * @param user
	 */
	public List<UserInfo> login(UserInfo user);
	
	/**
	 * @param user
	 */
	public List<Emp> getEmpByName(String name);
	/**
	 * @param user
	 */
	public void add(Object obj);

	/**
	 * @param user
	 * @param i
	 */
	public void update(Object obj);

	/**
	 * @param user
	 */
	public void delete(Object obj);

	/**
	 * @param string
	 */
	public List<Object> queryAll(String fromStr);   
	
	/**
	 * @param string
	 */
	public Object getObjectById(Class clazz,int id);   
}
