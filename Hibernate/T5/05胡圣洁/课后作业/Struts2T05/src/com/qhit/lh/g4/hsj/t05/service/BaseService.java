package com.qhit.lh.g4.hsj.t05.service;

import java.util.List;

public interface BaseService {
	/**
	 * @param user
	 */
	public void addUser(Object obj);

	/**
	 * @param user
	 * @param i
	 */
	public void updateUser(Object obj);

	/**
	 * @param user
	 */
	public void deleteUser(Object obj);

	/**
	 * @param string
	 */
	public List<Object> queryAllUser(String fromStr);   
	
	/**
	 * @param string
	 */
	public Object getObjectById(Class clazz,int id);   
}
