package com.qhit.lh.g4.hsj.t05.dao;

import java.util.List;

public interface BaseDao {

	/**
	 * @param user
	 */
	public void addUser(Object obj);

	/**
	 * @param user
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
